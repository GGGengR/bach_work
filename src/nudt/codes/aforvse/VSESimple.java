package nudt.codes.aforvse;

import me.lemire.compress.IntWrapper;
import me.lemire.compress.IntegerCODECByte;


public class VSESimple implements IntegerCODECByte{

	
	@Override
	public void compress(int[] in, IntWrapper inpos, int inlength, byte[] out, IntWrapper outpos) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void uncompress(byte[] output, IntWrapper inpos, int outputbyte, int[] outputput, IntWrapper outpos) {
		// TODO Auto-generated method stub
		
	}

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
		VSESimple sd = new VSESimple();
		sd.compress(input, inpos, input.length, output, outpos);
		outputbyte = outpos.get();
		// minus the number of the total list stored
		System.out.println("length " + outputbyte + " bytes for the sequence:");
		inpos.set(0);
		outpos.set(0);
		sd.uncompress(output, inpos, outputbyte, outputput, outpos);
		for (int i = 0; i < input.length; i++) {
			if(outputput[i]!=input[i]){
				System.out.print("error occured!");
				break;
			}
		}
	}
}
