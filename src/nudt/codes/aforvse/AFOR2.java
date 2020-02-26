package nudt.codes.aforvse;

import me.lemire.compress.IntWrapper;
import me.lemire.compress.IntegerCODECByte;
import me.lemire.compress.Util;
//byte-wise, fixed frame window 32
public final class AFOR2 implements IntegerCODECByte{

	final static int[][] frameconfig = new int[6][];
    // initialise the arrays that will host the 6 configurations
	public AFOR2() {
		frameconfig[0] = new int[4];// 8,8,8,8
		frameconfig[1] = new int[3];
		frameconfig[2] = new int[3];
		frameconfig[3] = new int[3];
		frameconfig[4] = new int[2];// 16,16
		frameconfig[5] = new int[1];// 32
	}
	@Override
    public void compress(int[] in, IntWrapper inpos, int inlength, byte[] out, IntWrapper outpos) {
		inlength = inlength / 128 * 128; // the number is rounded down
		if (inlength == 0)
			return;
		out[outpos.get()] = (byte) (inlength & 0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((inlength>>8)&0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((inlength>>16)&0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((inlength>>24)&0xff);
		outpos.increment();

		int[] bitframe = new int[4];// can be regrouped by compute maximum value
		int configure = 0;// default[8,8,8,8]
		int start=inpos.get();
		for (int s = start; s < start + inlength; s += 32) {
			bitframe[0] = Util.maxbits(in, s, 8);
			bitframe[1] = Util.maxbits(in, s + 8, 8);
			bitframe[2] = Util.maxbits(in, s + 2 * 8, 8);
			bitframe[3] = Util.maxbits(in, s + 3 * 8, 8);
			int bestSize = Integer.MAX_VALUE;// byte-wise
			
			for (int i = 0; i < 6; i++) {// for each configuration, compute the optimal case
				int curSize = estimatesize(bitframe, i);
				if (curSize <= bestSize) {
					configure = i;
					bestSize = curSize;
				}
			}
			
			for(int splitindex: frameconfig[configure]){//0: [32] 0bit
				out[outpos.get()] = (byte) splitindex;
				BytePacking98.fastpack(in, inpos, out, outpos, splitindex);
			}	
		}
    }
 
	public static int estimatesize(int[] bitframe, int configure){
		int outputOffset=0;
		int maxframe,maxframe2;
		switch(configure){
		case 0://8(66-98) 16(33-65) 32(0-32)
			outputOffset = (bitframe[0] + bitframe[1] + bitframe[2] + bitframe[3]) * 8;
			frameconfig[0][0] = bitframe[0] + 66;
			frameconfig[0][1] = bitframe[1] + 66;
			frameconfig[0][2] = bitframe[2] + 66;
			frameconfig[0][3] = bitframe[3] + 66;
			break;
		case 1:
			maxframe = Math.max(bitframe[2], bitframe[3]);
			outputOffset = (bitframe[0] + bitframe[1]) * 8 + maxframe * 16;
			frameconfig[1][0] = bitframe[0] + 66;
			frameconfig[1][1] = bitframe[1] + 66;
			frameconfig[1][2] = maxframe + 33;
			break;
		case 2:
			maxframe = Math.max(bitframe[1], bitframe[2]);
			outputOffset = (bitframe[0] + bitframe[3]) * 8 + maxframe * 16;
			frameconfig[2][0] = bitframe[0] + 66;
			frameconfig[2][1] = maxframe + 33;
			frameconfig[2][2] = bitframe[3] + 66;
			break;
		case 3:
			maxframe = Math.max(bitframe[0], bitframe[1]);
			outputOffset = (bitframe[2] + bitframe[3]) * 8 + maxframe * 16;
			frameconfig[3][0] = maxframe + 33;
			frameconfig[3][1] = bitframe[2] + 66;
			frameconfig[3][2] = bitframe[3] + 66;
			break;
		case 4:
			maxframe = Math.max(bitframe[0], bitframe[1]);
			maxframe2 = Math.max(bitframe[2], bitframe[3]);
			outputOffset = maxframe * 16 + maxframe2 * 16;
			frameconfig[4][0] = maxframe + 33;
			frameconfig[4][1] = maxframe2 + 33;
			break;
		case 5:
			maxframe = Math.max(Math.max(bitframe[0], bitframe[1]), Math.max(bitframe[2], bitframe[3]));
			outputOffset = maxframe * 32;
			frameconfig[5][0] = maxframe;
			break;
		}
		return outputOffset / 8 + conlength[configure];
	}

	@Override
	public void uncompress(byte[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos) {
		if (inlength == 0)
			return;
		int tmpinpos = inpos.get();
		final int outlength = (in[tmpinpos] & 0x000000FF) | ((in[tmpinpos+1] & 0x000000FF) << 8)
				| ((in[tmpinpos+2] & 0x000000FF) << 16) | ((in[tmpinpos+3] & 0x000000FF) << 24);
		inpos.add(4);
		while (outpos.get()< outlength) {
			final int index = in[inpos.get()] & 0x000000FF;
			BytePacking98.fastunpack(in, inpos, out, outpos, index);
		}
	}

    @Override
    public String toString() {
            return this.getClass().getSimpleName();
    }
    
	public static int[] conlength = { 4, 3, 3, 3, 2, 1 };

	public static void main(String args[]) {
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		int input[] = new int[128]; 
		for (int i = 0; i < 128; i++) {
			input[i] = 128 - i;
		}
		byte output[] = new byte[input.length*4];
		int outputput[] = new int[input.length];

		int outputbyte = 0;// the length of the output
		AFOR2 sd = new AFOR2();
		sd.compress(input, inpos, input.length, output, outpos);
		outputbyte = outpos.get();
		// minus the number of the total list stored
		System.out.println("length " + outputbyte + " bytes for the sequence:");
		inpos.set(0);
		outpos.set(0);
		sd.uncompress(output, inpos, outputbyte, outputput, outpos);
		for (int i = 0; i < input.length; i++) {
			if(outputput[i]!=input[i])
				System.out.print("error");
		}
	}


}
