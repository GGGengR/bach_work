package nudt.codes.aforvse;

import me.lemire.compress.IntWrapper;

/**
 * BytePacking routines for AFOR2
 * 
 * @author Kun Jiang
 * 
 */
public final class BytePacking98 {

	/**
	 * Unpack 32 integers
	 * 
	 * @param in
	 *            source array
	 * @param inpos
	 *            position in source array
	 * @param out
	 *            output array
	 * @param outpos
	 *            position in output array
	 * @param index
	 *            bit frame configuration index
	 */
	public static void fastpack(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos, final int index) {
		//int bytelength=0;
		switch (index) {
		case 0://blocksize 32 0bit-32bits
			fastpack0(in, inpos, out, outpos);
			break;
		case 1:
			fastpack1(in, inpos, out, outpos);
			break;
		case 2:
			fastpack2(in, inpos, out, outpos);
			break;
		case 3:
			fastpack3(in, inpos, out, outpos);
			break;
		case 4:
			fastpack4(in, inpos, out, outpos);
			break;
		case 5:
			fastpack5(in, inpos, out, outpos);
			break;
		case 6:
			fastpack6(in, inpos, out, outpos);
			break;
		case 7:
			fastpack7(in, inpos, out, outpos);
			break;
		case 8:
			fastpack8(in, inpos, out, outpos);
			break;
		case 9:
			fastpack9(in, inpos, out, outpos);
			break;
		case 10:
			fastpack10(in, inpos, out, outpos);
			break;
		case 11:
			fastpack11(in, inpos, out, outpos);
			break;
		case 12:
			fastpack12(in, inpos, out, outpos);
			break;
		case 13:
			fastpack13(in, inpos, out, outpos);
			break;
		case 14:
			fastpack14(in, inpos, out, outpos);
			break;
		case 15:
			fastpack15(in, inpos, out, outpos);
			break;
		case 16:
			fastpack16(in, inpos, out, outpos);
			break;
		case 17:
			fastpack17(in, inpos, out, outpos);
			break;
		case 18:
			fastpack18(in, inpos, out, outpos);
			break;
		case 19:
			fastpack19(in, inpos, out, outpos);
			break;
		case 20:
			fastpack20(in, inpos, out, outpos);
			break;
		case 21:
			fastpack21(in, inpos, out, outpos);
			break;
		case 22:
			fastpack22(in, inpos, out, outpos);
			break;
		case 23:
			fastpack23(in, inpos, out, outpos);
			break;
		case 24:
			fastpack24(in, inpos, out, outpos);
			break;
		case 25:
			fastpack25(in, inpos, out, outpos);
			break;
		case 26:
			fastpack26(in, inpos, out, outpos);
			break;
		case 27:
			fastpack27(in, inpos, out, outpos);
			break;
		case 28:
			fastpack28(in, inpos, out, outpos);
			break;
		case 29:
			fastpack29(in, inpos, out, outpos);
			break;
		case 30:
			fastpack30(in, inpos, out, outpos);
			break;
		case 31:
			fastpack31(in, inpos, out, outpos);
			break;
		case 32:
			fastpack32(in, inpos, out, outpos);
			break;
		case 33://blocksize 16 1bit-32bit
			fastpack33(in, inpos, out, outpos);
			break;
		case 34:
			fastpack34(in, inpos, out, outpos);
			break;
		case 35:
			fastpack35(in, inpos, out, outpos);
			break;
		case 36:
			fastpack36(in, inpos, out, outpos);
			break;
		case 37:
			fastpack37(in, inpos, out, outpos);
			break;
		case 38:
			fastpack38(in, inpos, out, outpos);
			break;
		case 39:
			fastpack39(in, inpos, out, outpos);
			break;
		case 40:
			fastpack40(in, inpos, out, outpos);
			break;
		case 41:
			fastpack41(in, inpos, out, outpos);
			break;
		case 42:
			fastpack42(in, inpos, out, outpos);
			break;
		case 43:
			fastpack43(in, inpos, out, outpos);
			break;
		case 44:
			fastpack44(in, inpos, out, outpos);
			break;
		case 45:
			fastpack45(in, inpos, out, outpos);
			break;
		case 46:
			fastpack46(in, inpos, out, outpos);
			break;
		case 47:
			fastpack47(in, inpos, out, outpos);
			break;
		case 48:
			fastpack48(in, inpos, out, outpos);
			break;
		case 49:
			fastpack49(in, inpos, out, outpos);
			break;
		case 50:
			fastpack50(in, inpos, out, outpos);
			break;
		case 51:
			fastpack51(in, inpos, out, outpos);
			break;
		case 52:
			fastpack52(in, inpos, out, outpos);
			break;
		case 53:
			fastpack53(in, inpos, out, outpos);
			break;
		case 54:
			fastpack54(in, inpos, out, outpos);
			break;
		case 55:
			fastpack55(in, inpos, out, outpos);
			break;
		case 56:
			fastpack56(in, inpos, out, outpos);
			break;
		case 57:
			fastpack57(in, inpos, out, outpos);
			break;
		case 58:
			fastpack58(in, inpos, out, outpos);
			break;
		case 59:
			fastpack59(in, inpos, out, outpos);
			break;
		case 60:
			fastpack60(in, inpos, out, outpos);
			break;
		case 61:
			fastpack61(in, inpos, out, outpos);
			break;
		case 62:
			fastpack62(in, inpos, out, outpos);
			break;
		case 63:
			fastpack63(in, inpos, out, outpos);
			break;
		case 64:
			fastpack64(in, inpos, out, outpos);
			break;
		case 65://blocksize 8
			fastpack65(in, inpos, out, outpos);
			break;
		case 66:
			fastpack66(in, inpos, out, outpos);
			break;
		case 67:
			fastpack67(in, inpos, out, outpos);
			break;
		case 68:
			fastpack68(in, inpos, out, outpos);
			break;
		case 69:
			fastpack69(in, inpos, out, outpos);
			break;
		case 70:
			fastpack70(in, inpos, out, outpos);
			break;
		case 71:
			fastpack71(in, inpos, out, outpos);
			break;
		case 72:
			fastpack72(in, inpos, out, outpos);
			break;
		case 73:
			fastpack73(in, inpos, out, outpos);
			break;
		case 74:
			fastpack74(in, inpos, out, outpos);
			break;
		case 75:
			fastpack75(in, inpos, out, outpos);
			break;
		case 76:
			fastpack76(in, inpos, out, outpos);
			break;
		case 77:
			fastpack77(in, inpos, out, outpos);
			break;
		case 78:
			fastpack78(in, inpos, out, outpos);
			break;
		case 79:
			fastpack79(in, inpos, out, outpos);
			break;
		case 80:
			fastpack80(in, inpos, out, outpos);
			break;
		case 81:
			fastpack81(in, inpos, out, outpos);
			break;
		case 82:
			fastpack82(in, inpos, out, outpos);
			break;
		case 83:
			fastpack83(in, inpos, out, outpos);
			break;
		case 84:
			fastpack84(in, inpos, out, outpos);
			break;
		case 85:
			fastpack85(in, inpos, out, outpos);
			break;
		case 86:
			fastpack86(in, inpos, out, outpos);
			break;
		case 87:
			fastpack87(in, inpos, out, outpos);
			break;
		case 88:
			fastpack88(in, inpos, out, outpos);
			break;
		case 89:
			fastpack89(in, inpos, out, outpos);
			break;
		case 90:
			fastpack90(in, inpos, out, outpos);
			break;
		case 91:
			fastpack91(in, inpos, out, outpos);
			break;
		case 92:
			fastpack92(in, inpos, out, outpos);
			break;
		case 93:
			fastpack93(in, inpos, out, outpos);
			break;
		case 94:
			fastpack94(in, inpos, out, outpos);
			break;
		case 95:
			fastpack95(in, inpos, out, outpos);
			break;
		case 96:
			fastpack96(in, inpos, out, outpos);
			break;

		default:
			throw new IllegalArgumentException("Unsupported bit width.");
		}
	}

	//32 0bit
	protected static void fastpack0(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(32);
		outpos.add(1);
	}
	
	protected static void fastpack1(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {      
	      final int outputOffset = outpos.get() + 1;
	      final int offset = inpos.get();
	      
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
	                                                | ((intValues1 & 1) << 6)
	                                                | ((intValues2 & 1) << 5)
	                                                | ((intValues3 & 1) << 4)
	                                                | ((intValues4 & 1) << 3)
	                                                | ((intValues5 & 1) << 2)
	                                                | ((intValues6 & 1) << 1)
	                                                | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
	                                                | ((intValues9 & 1) << 6)
	                                                | ((intValues10 & 1) << 5)
	                                                | ((intValues11 & 1) << 4)
	                                                | ((intValues12 & 1) << 3)
	                                                | ((intValues13 & 1) << 2)
	                                                | ((intValues14 & 1) << 1)
	                                                | (intValues15 & 1));
	      out[outputOffset + 2] = (byte) (((intValues16 & 1) << 7)
	                                                | ((intValues17 & 1) << 6)
	                                                | ((intValues18 & 1) << 5)
	                                                | ((intValues19 & 1) << 4)
	                                                | ((intValues20 & 1) << 3)
	                                                | ((intValues21 & 1) << 2)
	                                                | ((intValues22 & 1) << 1)
	                                                | (intValues23 & 1));
	      out[outputOffset + 3] = (byte) (((intValues24 & 1) << 7)
	                                                | ((intValues25 & 1) << 6)
	                                                | ((intValues26 & 1) << 5)
	                                                | ((intValues27 & 1) << 4)
	                                                | ((intValues28 & 1) << 3)
	                                                | ((intValues29 & 1) << 2)
	                                                | ((intValues30 & 1) << 1)
	                                                | (intValues31 & 1));
				
		inpos.add(32);
		outpos.add(5);
	}

	protected static void fastpack2(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {	      
		  final int outputOffset = outpos.get() + 1;
		  final int offset = inpos.get();
		  
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
		  final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
		  final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
		  final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
		  final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
		  final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
		  final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
		  final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
		  final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
		  final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
		  final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
		  final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
		  final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
		  final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
		  final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
		  final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
		
		  out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
		                                            | ((intValues1 & 3) << 4)
		                                            | ((intValues2 & 3) << 2)
		                                            | (intValues3 & 3));
		  out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
		                                            | ((intValues5 & 3) << 4)
		                                            | ((intValues6 & 3) << 2)
		                                            | (intValues7 & 3));
		  out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
		                                            | ((intValues9 & 3) << 4)
		                                            | ((intValues10 & 3) << 2)
		                                            | (intValues11 & 3));
		  out[outputOffset + 3] = (byte) (((intValues12 & 3) << 6)
		                                            | ((intValues13 & 3) << 4)
		                                            | ((intValues14 & 3) << 2)
		                                            | (intValues15 & 3));
		  out[outputOffset + 4] = (byte) (((intValues16 & 3) << 6)
		                                            | ((intValues17 & 3) << 4)
		                                            | ((intValues18 & 3) << 2)
		                                            | (intValues19 & 3));
		  out[outputOffset + 5] = (byte) (((intValues20 & 3) << 6)
		                                            | ((intValues21 & 3) << 4)
		                                            | ((intValues22 & 3) << 2)
		                                            | (intValues23 & 3));
		  out[outputOffset + 6] = (byte) (((intValues24 & 3) << 6)
		                                            | ((intValues25 & 3) << 4)
		                                            | ((intValues26 & 3) << 2)
		                                            | (intValues27 & 3));
		  out[outputOffset + 7] = (byte) (((intValues28 & 3) << 6)
		                                            | ((intValues29 & 3) << 4)
		                                            | ((intValues30 & 3) << 2)
		                                            | (intValues31 & 3));
	    inpos.add(32);
		outpos.add(9);
	}

	protected static void fastpack3(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
		out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
		out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
		out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
		out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                  | ((intValues9 & 7) << 2)
                  | ((intValues10 >>> 1) & 0xFF));
		out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7)
                  | ((intValues11 & 7) << 4)
                  | ((intValues12 & 7) << 1)
                  | ((intValues13 >>> 2) & 0xFF));
		out[outputOffset + 5] = (byte) (((intValues13 & 3) << 6)
                  | ((intValues14 & 7) << 3)
                  | (intValues15 & 7));
		out[outputOffset + 6] = (byte) (((intValues16 & 7) << 5)
                  | ((intValues17 & 7) << 2)
                  | ((intValues18 >>> 1) & 0xFF));
		out[outputOffset + 7] = (byte) (((intValues18 & 1) << 7)
                  | ((intValues19 & 7) << 4)
                  | ((intValues20 & 7) << 1)
                  | ((intValues21 >>> 2) & 0xFF));
		out[outputOffset + 8] = (byte) (((intValues21 & 3) << 6)
                  | ((intValues22 & 7) << 3)
                  | (intValues23 & 7));
		out[outputOffset + 9] = (byte) (((intValues24 & 7) << 5)
                  | ((intValues25 & 7) << 2)
                  | ((intValues26 >>> 1) & 0xFF));
		out[outputOffset + 10] = (byte) (((intValues26 & 1) << 7)
                  | ((intValues27 & 7) << 4)
                  | ((intValues28 & 7) << 1)
                  | ((intValues29 >>> 2) & 0xFF));
		out[outputOffset + 11] = (byte) (((intValues29 & 3) << 6)
                  | ((intValues30 & 7) << 3)
                  | (intValues31 & 7));
		inpos.add(32);
		outpos.add(13);
	}

	protected static void fastpack4(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
	                                                | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
	                                                | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
	                                                | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
	                                                | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
	                                                | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4)
	                                                | (intValues11 & 15));
	      out[outputOffset + 6] = (byte) (((intValues12 & 15) << 4)
	                                                | (intValues13 & 15));
	      out[outputOffset + 7] = (byte) (((intValues14 & 15) << 4)
	                                                | (intValues15 & 15));
	      out[outputOffset + 8] = (byte) (((intValues16 & 15) << 4)
	                                                | (intValues17 & 15));
	      out[outputOffset + 9] = (byte) (((intValues18 & 15) << 4)
	                                                | (intValues19 & 15));
	      out[outputOffset + 10] = (byte) (((intValues20 & 15) << 4)
	                                                | (intValues21 & 15));
	      out[outputOffset + 11] = (byte) (((intValues22 & 15) << 4)
	                                                | (intValues23 & 15));
	      out[outputOffset + 12] = (byte) (((intValues24 & 15) << 4)
	                                                | (intValues25 & 15));
	      out[outputOffset + 13] = (byte) (((intValues26 & 15) << 4)
	                                                | (intValues27 & 15));
	      out[outputOffset + 14] = (byte) (((intValues28 & 15) << 4)
	                                                | (intValues29 & 15));
	      out[outputOffset + 15] = (byte) (((intValues30 & 15) << 4)
	                                                | (intValues31 & 15));
		inpos.add(32);
		outpos.add(17);
	}

	protected static void fastpack5(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 1) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues12 & 1) << 7)
	                                                | ((intValues13 & 31) << 2)
	                                                | ((intValues14 >>> 3) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues14 & 7) << 5)
	                                                | (intValues15 & 31));
	      out[outputOffset + 10] = (byte) (((intValues16 & 31) << 3)
	                                                | ((intValues17 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues17 & 3) << 6)
	                                                | ((intValues18 & 31) << 1)
	                                                | ((intValues19 >>> 4) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues19 & 15) << 4)
	                                                | ((intValues20 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues20 & 1) << 7)
	                                                | ((intValues21 & 31) << 2)
	                                                | ((intValues22 >>> 3) & 0xFF));
	      out[outputOffset + 14] = (byte) (((intValues22 & 7) << 5)
	                                                | (intValues23 & 31));
	      out[outputOffset + 15] = (byte) (((intValues24 & 31) << 3)
	                                                | ((intValues25 >>> 2) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues25 & 3) << 6)
	                                                | ((intValues26 & 31) << 1)
	                                                | ((intValues27 >>> 4) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues27 & 15) << 4)
	                                                | ((intValues28 >>> 1) & 0xFF));
	      out[outputOffset + 18] = (byte) (((intValues28 & 1) << 7)
	                                                | ((intValues29 & 31) << 2)
	                                                | ((intValues30 >>> 3) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues30 & 7) << 5)
	                                                | (intValues31 & 31));
		inpos.add(32);
		outpos.add(21);
	}

	protected static void fastpack6(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6)
	                                                | (intValues11 & 63));
	      out[outputOffset + 9] = (byte) (((intValues12 & 63) << 2)
	                                                | ((intValues13 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues13 & 15) << 4)
	                                                | ((intValues14 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues14 & 3) << 6)
	                                                | (intValues15 & 63));
	      out[outputOffset + 12] = (byte) (((intValues16 & 63) << 2)
	                                                | ((intValues17 >>> 4) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues17 & 15) << 4)
	                                                | ((intValues18 >>> 2) & 0xFF));
	      out[outputOffset + 14] = (byte) (((intValues18 & 3) << 6)
	                                                | (intValues19 & 63));
	      out[outputOffset + 15] = (byte) (((intValues20 & 63) << 2)
	                                                | ((intValues21 >>> 4) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues21 & 15) << 4)
	                                                | ((intValues22 >>> 2) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues22 & 3) << 6)
	                                                | (intValues23 & 63));
	      out[outputOffset + 18] = (byte) (((intValues24 & 63) << 2)
	                                                | ((intValues25 >>> 4) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues25 & 15) << 4)
	                                                | ((intValues26 >>> 2) & 0xFF));
	      out[outputOffset + 20] = (byte) (((intValues26 & 3) << 6)
	                                                | (intValues27 & 63));
	      out[outputOffset + 21] = (byte) (((intValues28 & 63) << 2)
	                                                | ((intValues29 >>> 4) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues29 & 15) << 4)
	                                                | ((intValues30 >>> 2) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues30 & 3) << 6)
	                                                | (intValues31 & 63));
		inpos.add(32);
		outpos.add(25);
	}

	protected static void fastpack7(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 3) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues12 & 7) << 5)
	                                                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues13 & 3) << 6)
	                                                | ((intValues14 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues14 & 1) << 7)
	                                                | (intValues15 & 127));
	      out[outputOffset + 14] = (byte) (((intValues16 & 127) << 1)
	                                                | ((intValues17 >>> 6) & 0xFF));
	      out[outputOffset + 15] = (byte) (((intValues17 & 63) << 2)
	                                                | ((intValues18 >>> 5) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues18 & 31) << 3)
	                                                | ((intValues19 >>> 4) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues19 & 15) << 4)
	                                                | ((intValues20 >>> 3) & 0xFF));
	      out[outputOffset + 18] = (byte) (((intValues20 & 7) << 5)
	                                                | ((intValues21 >>> 2) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues21 & 3) << 6)
	                                                | ((intValues22 >>> 1) & 0xFF));
	      out[outputOffset + 20] = (byte) (((intValues22 & 1) << 7)
	                                                | (intValues23 & 127));
	      out[outputOffset + 21] = (byte) (((intValues24 & 127) << 1)
	                                                | ((intValues25 >>> 6) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues25 & 63) << 2)
	                                                | ((intValues26 >>> 5) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues26 & 31) << 3)
	                                                | ((intValues27 >>> 4) & 0xFF));
	      out[outputOffset + 24] = (byte) (((intValues27 & 15) << 4)
	                                                | ((intValues28 >>> 3) & 0xFF));
	      out[outputOffset + 25] = (byte) (((intValues28 & 7) << 5)
	                                                | ((intValues29 >>> 2) & 0xFF));
	      out[outputOffset + 26] = (byte) (((intValues29 & 3) << 6)
	                                                | ((intValues30 >>> 1) & 0xFF));
	      out[outputOffset + 27] = (byte) (((intValues30 & 1) << 7)
	                                                | (intValues31 & 127));
		inpos.add(32);
		outpos.add(29);
	}

	protected static void fastpack8(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
	      out[outputOffset + 11] = (byte) ((intValues11 & 255));
	      out[outputOffset + 12] = (byte) ((intValues12 & 255));
	      out[outputOffset + 13] = (byte) ((intValues13 & 255));
	      out[outputOffset + 14] = (byte) ((intValues14 & 255));
	      out[outputOffset + 15] = (byte) ((intValues15 & 255));
	      out[outputOffset + 16] = (byte) ((intValues16 & 255));
	      out[outputOffset + 17] = (byte) ((intValues17 & 255));
	      out[outputOffset + 18] = (byte) ((intValues18 & 255));
	      out[outputOffset + 19] = (byte) ((intValues19 & 255));
	      out[outputOffset + 20] = (byte) ((intValues20 & 255));
	      out[outputOffset + 21] = (byte) ((intValues21 & 255));
	      out[outputOffset + 22] = (byte) ((intValues22 & 255));
	      out[outputOffset + 23] = (byte) ((intValues23 & 255));
	      out[outputOffset + 24] = (byte) ((intValues24 & 255));
	      out[outputOffset + 25] = (byte) ((intValues25 & 255));
	      out[outputOffset + 26] = (byte) ((intValues26 & 255));
	      out[outputOffset + 27] = (byte) ((intValues27 & 255));
	      out[outputOffset + 28] = (byte) ((intValues28 & 255));
	      out[outputOffset + 29] = (byte) ((intValues29 & 255));
	      out[outputOffset + 30] = (byte) ((intValues30 & 255));
	      out[outputOffset + 31] = (byte) ((intValues31 & 255));
		inpos.add(32);
		outpos.add(33);
	}

	protected static void fastpack9(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues16 >>> 1) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues16 & 1) << 7
	                                                | (intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 3) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues18 & 7) << 5
	                                                | (intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues20 & 31) << 3
	                                                | (intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 7) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues22 & 127) << 1
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues24 >>> 1) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues24 & 1) << 7
	                                                | (intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 3) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues26 & 7) << 5
	                                                | (intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 5) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues28 & 31) << 3
	                                                | (intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 7) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues30 & 127) << 1
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(37);
	}

	protected static void fastpack10(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues16 >>> 2) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues16 & 3) << 6
	                                                | (intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 6) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues18 & 63) << 2
	                                                | (intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues20 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues20 & 3) << 6
	                                                | (intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 6) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues22 & 63) << 2
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues24 >>> 2) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues24 & 3) << 6
	                                                | (intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues26 & 63) << 2
	                                                | (intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues28 >>> 2) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues28 & 3) << 6
	                                                | (intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 6) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues30 & 63) << 2
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(41);
	}

	protected static void fastpack11(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues16 >>> 3) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues16 & 7) << 5
	                                                | (intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 9) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues18 >>> 1) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues18 & 1) << 7
	                                                | (intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 7) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues20 & 127) << 1
	                                                | (intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 5) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues22 & 31) << 3
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues24 >>> 3) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues24 & 7) << 5
	                                                | (intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 9) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues26 >>> 1) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues26 & 1) << 7
	                                                | (intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 7) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues28 & 127) << 1
	                                                | (intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 5) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues30 & 31) << 3
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(45);
	}

	protected static void fastpack12(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues16 >>> 4) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues16 & 15) << 4
	                                                | (intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues18 >>> 4) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues18 & 15) << 4
	                                                | (intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues20 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues20 & 15) << 4
	                                                | (intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues22 >>> 4) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues22 & 15) << 4
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues24 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues24 & 15) << 4
	                                                | (intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues26 >>> 4) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues26 & 15) << 4
	                                                | (intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues28 >>> 4) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues28 & 15) << 4
	                                                | (intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues30 >>> 4) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues30 & 15) << 4
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(49);
	}

	protected static void fastpack13(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 12] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues8 & 31) << 3
	                                                | (intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues10 & 127) << 1
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 9) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues12 >>> 1) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues12 & 1) << 7
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 11) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues14 >>> 3) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues14 & 7) << 5
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues16 >>> 5) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues16 & 31) << 3
	                                                | (intValues17 >>> 10) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 7) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues18 & 127) << 1
	                                                | (intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 9) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues20 >>> 1) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues20 & 1) << 7
	                                                | (intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 11) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues22 >>> 3) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues22 & 7) << 5
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues24 >>> 5) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues24 & 31) << 3
	                                                | (intValues25 >>> 10) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 7) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues26 & 127) << 1
	                                                | (intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 9) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues28 >>> 1) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues28 & 1) << 7
	                                                | (intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 11) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues30 >>> 3) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues30 & 7) << 5
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(53);
	}

	protected static void fastpack14(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 6] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues8 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues8 & 63) << 2
	                                                | (intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues10 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues10 & 3) << 6
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues12 >>> 6) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues12 & 63) << 2
	                                                | (intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues14 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues14 & 3) << 6
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues16 >>> 6) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues16 & 63) << 2
	                                                | (intValues17 >>> 12) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 10) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues18 >>> 2) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues18 & 3) << 6
	                                                | (intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues20 >>> 6) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues20 & 63) << 2
	                                                | (intValues21 >>> 12) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 10) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues22 >>> 2) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues22 & 3) << 6
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues24 >>> 6) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues24 & 63) << 2
	                                                | (intValues25 >>> 12) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 10) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues26 >>> 2) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues26 & 3) << 6
	                                                | (intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 48] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues28 >>> 6) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues28 & 63) << 2
	                                                | (intValues29 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 10) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues30 >>> 2) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues30 & 3) << 6
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(57);
	}

	protected static void fastpack15(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues8 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 & 127) << 1
	                                                | (intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 13) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues10 >>> 5) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 & 31) << 3
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 11) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues12 >>> 3) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 & 7) << 5
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 9) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues14 >>> 1) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues14 & 1) << 7
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues16 >>> 7) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues16 & 127) << 1
	                                                | (intValues17 >>> 14) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 13) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues18 >>> 5) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues18 & 31) << 3
	                                                | (intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 11) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues20 >>> 3) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues20 & 7) << 5
	                                                | (intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 9) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues22 >>> 1) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues22 & 1) << 7
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues24 >>> 7) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues24 & 127) << 1
	                                                | (intValues25 >>> 14) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 13) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues26 >>> 5) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues26 & 31) << 3
	                                                | (intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 11) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues28 >>> 3) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues28 & 7) << 5
	                                                | (intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 9) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues30 >>> 1) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues30 & 1) << 7
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(61);
	}

	protected static void fastpack16(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues16 >>> 8) & 0xFF);
	      out[outputOffset + 33] = (byte) (intValues16 & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues18 >>> 8) & 0xFF);
	      out[outputOffset + 37] = (byte) (intValues18 & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues20 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues20 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues22 >>> 8) & 0xFF);
	      out[outputOffset + 45] = (byte) (intValues22 & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues24 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues24 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues26 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues26 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues28 >>> 8) & 0xFF);
	      out[outputOffset + 57] = (byte) (intValues28 & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues30 >>> 8) & 0xFF);
	      out[outputOffset + 61] = (byte) (intValues30 & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(65);
	}

	protected static void fastpack17(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 9) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 11) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 13) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 15) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 16] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues8 >>> 9) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 11) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 13) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 15) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 33] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues16 >>> 9) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues16 >>> 1) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues16 & 1) << 7
	                                                | (intValues17 >>> 10) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 11) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues18 >>> 3) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues18 & 7) << 5
	                                                | (intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 13) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues20 >>> 5) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues20 & 31) << 3
	                                                | (intValues21 >>> 14) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 15) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues22 >>> 7) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues22 & 127) << 1
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 50] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues24 >>> 9) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues24 >>> 1) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues24 & 1) << 7
	                                                | (intValues25 >>> 10) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 11) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues26 >>> 3) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues26 & 7) << 5
	                                                | (intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 13) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues28 >>> 5) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues28 & 31) << 3
	                                                | (intValues29 >>> 14) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 15) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues30 >>> 7) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues30 & 127) << 1
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 67] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(69);
	}

	protected static void fastpack18(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 10) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 14) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 14) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues8 >>> 10) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 14) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues12 >>> 10) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 14) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues16 >>> 10) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues16 >>> 2) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues16 & 3) << 6
	                                                | (intValues17 >>> 12) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 14) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues18 >>> 6) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues18 & 63) << 2
	                                                | (intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues20 >>> 10) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues20 >>> 2) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues20 & 3) << 6
	                                                | (intValues21 >>> 12) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 14) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues22 >>> 6) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues22 & 63) << 2
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues24 >>> 10) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues24 >>> 2) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues24 & 3) << 6
	                                                | (intValues25 >>> 12) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 14) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues26 >>> 6) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues26 & 63) << 2
	                                                | (intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 62] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues28 >>> 10) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues28 >>> 2) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues28 & 3) << 6
	                                                | (intValues29 >>> 12) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 14) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues30 >>> 6) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues30 & 63) << 2
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(73);
	}

	protected static void fastpack19(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 11) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 17) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 15) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 13) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 18] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues8 >>> 11) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 17) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 15) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 13) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 37] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues16 >>> 11) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues16 >>> 3) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues16 & 7) << 5
	                                                | (intValues17 >>> 14) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 17) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues18 >>> 9) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues18 >>> 1) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues18 & 1) << 7
	                                                | (intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 15) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues20 >>> 7) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues20 & 127) << 1
	                                                | (intValues21 >>> 18) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 13) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues22 >>> 5) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues22 & 31) << 3
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 56] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues24 >>> 11) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues24 >>> 3) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues24 & 7) << 5
	                                                | (intValues25 >>> 14) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 17) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues26 >>> 9) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues26 >>> 1) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues26 & 1) << 7
	                                                | (intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 15) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues28 >>> 7) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues28 & 127) << 1
	                                                | (intValues29 >>> 18) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 13) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues30 >>> 5) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues30 & 31) << 3
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 75] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(77);
	}

	protected static void fastpack20(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues14 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues16 >>> 12) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues16 >>> 4) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues16 & 15) << 4
	                                                | (intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues18 >>> 12) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues18 >>> 4) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues18 & 15) << 4
	                                                | (intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues20 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues20 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues20 & 15) << 4
	                                                | (intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 54] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues22 >>> 12) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues22 >>> 4) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues22 & 15) << 4
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues24 >>> 12) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues24 >>> 4) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues24 & 15) << 4
	                                                | (intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 64] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues26 >>> 12) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues26 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues26 & 15) << 4
	                                                | (intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 69] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues28 >>> 12) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues28 >>> 4) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues28 & 15) << 4
	                                                | (intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues30 >>> 12) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues30 >>> 4) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues30 & 15) << 4
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(81);
	}

	protected static void fastpack21(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 13) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 15) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 17) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 19) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 13) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues8 & 31) << 3
	                                                | (intValues9 >>> 18) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 15) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 >>> 7) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues10 & 127) << 1
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 17) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 >>> 9) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues12 >>> 1) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues12 & 1) << 7
	                                                | (intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 19) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues14 >>> 11) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues14 >>> 3) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues14 & 7) << 5
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues16 >>> 13) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues16 >>> 5) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues16 & 31) << 3
	                                                | (intValues17 >>> 18) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues17 >>> 10) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 15) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues18 >>> 7) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues18 & 127) << 1
	                                                | (intValues19 >>> 20) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 17) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues20 >>> 9) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues20 >>> 1) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues20 & 1) << 7
	                                                | (intValues21 >>> 14) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 19) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues22 >>> 11) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues22 >>> 3) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues22 & 7) << 5
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 62] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues24 >>> 13) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues24 >>> 5) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues24 & 31) << 3
	                                                | (intValues25 >>> 18) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues25 >>> 10) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 15) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues26 >>> 7) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues26 & 127) << 1
	                                                | (intValues27 >>> 20) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 17) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues28 >>> 9) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues28 >>> 1) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues28 & 1) << 7
	                                                | (intValues29 >>> 14) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 19) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues30 >>> 11) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues30 >>> 3) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues30 & 7) << 5
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(85);
	}

	protected static void fastpack22(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 14) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 18) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 14) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 18) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 >>> 14) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues8 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues8 & 63) << 2
	                                                | (intValues9 >>> 20) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 18) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues10 >>> 10) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues10 >>> 2) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues10 & 3) << 6
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues12 >>> 14) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues12 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues12 & 63) << 2
	                                                | (intValues13 >>> 20) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 18) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues14 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues14 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues14 & 3) << 6
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues16 >>> 14) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues16 >>> 6) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues16 & 63) << 2
	                                                | (intValues17 >>> 20) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues17 >>> 12) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 18) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues18 >>> 10) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues18 >>> 2) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues18 & 3) << 6
	                                                | (intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 54] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues20 >>> 14) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues20 >>> 6) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues20 & 63) << 2
	                                                | (intValues21 >>> 20) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues21 >>> 12) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 18) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues22 >>> 10) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues22 >>> 2) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues22 & 3) << 6
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 65] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues24 >>> 14) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues24 >>> 6) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues24 & 63) << 2
	                                                | (intValues25 >>> 20) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues25 >>> 12) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 18) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues26 >>> 10) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues26 >>> 2) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues26 & 3) << 6
	                                                | (intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 76] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues28 >>> 14) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues28 >>> 6) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues28 & 63) << 2
	                                                | (intValues29 >>> 20) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues29 >>> 12) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 18) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues30 >>> 10) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues30 >>> 2) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues30 & 3) << 6
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 87] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(89);
	}

	protected static void fastpack23(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 15) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 21) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 19) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 17) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 22] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues8 >>> 15) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues8 >>> 7) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues8 & 127) << 1
	                                                | (intValues9 >>> 22) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 21) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues10 >>> 13) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues10 >>> 5) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues10 & 31) << 3
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 19) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues12 >>> 11) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues12 >>> 3) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues12 & 7) << 5
	                                                | (intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 17) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues14 >>> 9) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues14 >>> 1) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues14 & 1) << 7
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 45] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues16 >>> 15) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues16 >>> 7) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues16 & 127) << 1
	                                                | (intValues17 >>> 22) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues17 >>> 14) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 21) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues18 >>> 13) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues18 >>> 5) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues18 & 31) << 3
	                                                | (intValues19 >>> 20) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 19) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues20 >>> 11) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues20 >>> 3) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues20 & 7) << 5
	                                                | (intValues21 >>> 18) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 17) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues22 >>> 9) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues22 >>> 1) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues22 & 1) << 7
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 68] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues24 >>> 15) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues24 >>> 7) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues24 & 127) << 1
	                                                | (intValues25 >>> 22) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues25 >>> 14) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 21) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues26 >>> 13) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues26 >>> 5) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues26 & 31) << 3
	                                                | (intValues27 >>> 20) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 19) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues28 >>> 11) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues28 >>> 3) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues28 & 7) << 5
	                                                | (intValues29 >>> 18) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 17) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues30 >>> 9) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues30 >>> 1) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues30 & 1) << 7
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 91] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(93);
	}

	protected static void fastpack24(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues14 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues16 >>> 16) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues16 >>> 8) & 0xFF);
	      out[outputOffset + 50] = (byte) (intValues16 & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues18 >>> 16) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues18 >>> 8) & 0xFF);
	      out[outputOffset + 56] = (byte) (intValues18 & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues20 >>> 16) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues20 >>> 8) & 0xFF);
	      out[outputOffset + 62] = (byte) (intValues20 & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 65] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues22 >>> 16) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues22 >>> 8) & 0xFF);
	      out[outputOffset + 68] = (byte) (intValues22 & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues24 >>> 16) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues24 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues24 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 77] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues26 >>> 16) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues26 >>> 8) & 0xFF);
	      out[outputOffset + 80] = (byte) (intValues26 & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues28 >>> 16) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues28 >>> 8) & 0xFF);
	      out[outputOffset + 86] = (byte) (intValues28 & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 89] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues30 >>> 16) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues30 >>> 8) & 0xFF);
	      out[outputOffset + 92] = (byte) (intValues30 & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 95] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(97);
	}

	protected static void fastpack25(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 17) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 9) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 19) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 11) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 21) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 13) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 22) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 23) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 15) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues8 >>> 17) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues8 >>> 9) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 18) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 19) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues10 >>> 11) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 21) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues12 >>> 13) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 22) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 23) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues14 >>> 15) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues16 >>> 17) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues16 >>> 9) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues16 >>> 1) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues16 & 1) << 7
	                                                | (intValues17 >>> 18) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues17 >>> 10) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 19) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues18 >>> 11) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues18 >>> 3) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues18 & 7) << 5
	                                                | (intValues19 >>> 20) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 21) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues20 >>> 13) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues20 >>> 5) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues20 & 31) << 3
	                                                | (intValues21 >>> 22) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues21 >>> 14) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 23) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues22 >>> 15) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues22 >>> 7) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues22 & 127) << 1
	                                                | (intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues24 >>> 17) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues24 >>> 9) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues24 >>> 1) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues24 & 1) << 7
	                                                | (intValues25 >>> 18) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues25 >>> 10) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 19) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues26 >>> 11) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues26 >>> 3) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues26 & 7) << 5
	                                                | (intValues27 >>> 20) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 21) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues28 >>> 13) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues28 >>> 5) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues28 & 31) << 3
	                                                | (intValues29 >>> 22) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues29 >>> 14) & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 23) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues30 >>> 15) & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues30 >>> 7) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues30 & 127) << 1
	                                                | (intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 99] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(101);
	}

	protected static void fastpack26(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 18) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 10) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 22) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 14) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 12] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 18) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 10) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 22) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 >>> 14) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues8 >>> 18) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues8 >>> 10) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 20) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 22) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues10 >>> 14) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues12 >>> 18) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues12 >>> 10) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 20) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 22) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues14 >>> 14) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues16 >>> 18) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues16 >>> 10) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues16 >>> 2) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues16 & 3) << 6
	                                                | (intValues17 >>> 20) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues17 >>> 12) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 22) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues18 >>> 14) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues18 >>> 6) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues18 & 63) << 2
	                                                | (intValues19 >>> 24) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 64] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues20 >>> 18) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues20 >>> 10) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues20 >>> 2) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues20 & 3) << 6
	                                                | (intValues21 >>> 20) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues21 >>> 12) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 22) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues22 >>> 14) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues22 >>> 6) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues22 & 63) << 2
	                                                | (intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 77] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues24 >>> 18) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues24 >>> 10) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues24 >>> 2) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues24 & 3) << 6
	                                                | (intValues25 >>> 20) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues25 >>> 12) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 22) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues26 >>> 14) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues26 >>> 6) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues26 & 63) << 2
	                                                | (intValues27 >>> 24) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 90] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues28 >>> 18) & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues28 >>> 10) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues28 >>> 2) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues28 & 3) << 6
	                                                | (intValues29 >>> 20) & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues29 >>> 12) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 22) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues30 >>> 14) & 0xFF);
	      out[outputOffset + 99] = (byte) ((intValues30 >>> 6) & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues30 & 63) << 2
	                                                | (intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 103] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(105);
	}

	protected static void fastpack27(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 19) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 11) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 25) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 17) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 23) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 15) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 26) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 21) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 13) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues8 >>> 19) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 >>> 11) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 22) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 25) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues10 >>> 17) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 23) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues12 >>> 15) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 26) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 21) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues14 >>> 13) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues16 >>> 19) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues16 >>> 11) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues16 >>> 3) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues16 & 7) << 5
	                                                | (intValues17 >>> 22) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues17 >>> 14) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 25) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues18 >>> 17) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues18 >>> 9) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues18 >>> 1) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues18 & 1) << 7
	                                                | (intValues19 >>> 20) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 23) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues20 >>> 15) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues20 >>> 7) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues20 & 127) << 1
	                                                | (intValues21 >>> 26) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues21 >>> 18) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 21) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues22 >>> 13) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues22 >>> 5) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues22 & 31) << 3
	                                                | (intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 80] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues24 >>> 19) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues24 >>> 11) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues24 >>> 3) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues24 & 7) << 5
	                                                | (intValues25 >>> 22) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues25 >>> 14) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 25) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues26 >>> 17) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues26 >>> 9) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues26 >>> 1) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues26 & 1) << 7
	                                                | (intValues27 >>> 20) & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 23) & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues28 >>> 15) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues28 >>> 7) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues28 & 127) << 1
	                                                | (intValues29 >>> 26) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues29 >>> 18) & 0xFF);
	      out[outputOffset + 99] = (byte) ((intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 21) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues30 >>> 13) & 0xFF);
	      out[outputOffset + 103] = (byte) ((intValues30 >>> 5) & 0xFF);
	      out[outputOffset + 104] = (byte) ((intValues30 & 31) << 3
	                                                | (intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 107] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(109);
	}

	protected static void fastpack28(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 20) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 6] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 20) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 20) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 20) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 >>> 20) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues10 >>> 20) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues12 >>> 20) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 48] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues14 >>> 20) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues14 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues16 >>> 20) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues16 >>> 12) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues16 >>> 4) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues16 & 15) << 4
	                                                | (intValues17 >>> 24) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 62] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues18 >>> 20) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues18 >>> 12) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues18 >>> 4) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues18 & 15) << 4
	                                                | (intValues19 >>> 24) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 69] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues20 >>> 20) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues20 >>> 12) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues20 >>> 4) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues20 & 15) << 4
	                                                | (intValues21 >>> 24) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 76] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues22 >>> 20) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues22 >>> 12) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues22 >>> 4) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues22 & 15) << 4
	                                                | (intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues24 >>> 20) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues24 >>> 12) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues24 >>> 4) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues24 & 15) << 4
	                                                | (intValues25 >>> 24) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 90] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues26 >>> 20) & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues26 >>> 12) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues26 >>> 4) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues26 & 15) << 4
	                                                | (intValues27 >>> 24) & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 97] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues28 >>> 20) & 0xFF);
	      out[outputOffset + 99] = (byte) ((intValues28 >>> 12) & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues28 >>> 4) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues28 & 15) << 4
	                                                | (intValues29 >>> 24) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 103] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 104] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues30 >>> 20) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues30 >>> 12) & 0xFF);
	      out[outputOffset + 107] = (byte) ((intValues30 >>> 4) & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues30 & 15) << 4
	                                                | (intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 109] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 111] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(113);
	}

	protected static void fastpack29(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 21) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 13) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 26) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 23) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 15) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 28) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 25) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 17) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 22) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 27) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 19) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 28] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 >>> 21) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 >>> 13) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 >>> 5) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 & 31) << 3
	                                                | (intValues9 >>> 26) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues9 >>> 18) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 23) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues10 >>> 15) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues10 >>> 7) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues10 & 127) << 1
	                                                | (intValues11 >>> 28) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 25) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues12 >>> 17) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues12 >>> 9) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues12 >>> 1) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues12 & 1) << 7
	                                                | (intValues13 >>> 22) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 27) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues14 >>> 19) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues14 >>> 11) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues14 >>> 3) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues14 & 7) << 5
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 57] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues16 >>> 21) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues16 >>> 13) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues16 >>> 5) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues16 & 31) << 3
	                                                | (intValues17 >>> 26) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues17 >>> 18) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues17 >>> 10) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 23) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues18 >>> 15) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues18 >>> 7) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues18 & 127) << 1
	                                                | (intValues19 >>> 28) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues19 >>> 20) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 25) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues20 >>> 17) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues20 >>> 9) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues20 >>> 1) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues20 & 1) << 7
	                                                | (intValues21 >>> 22) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues21 >>> 14) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 27) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues22 >>> 19) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues22 >>> 11) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues22 >>> 3) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues22 & 7) << 5
	                                                | (intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 86] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues24 >>> 21) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues24 >>> 13) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues24 >>> 5) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues24 & 31) << 3
	                                                | (intValues25 >>> 26) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues25 >>> 18) & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues25 >>> 10) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 23) & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues26 >>> 15) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues26 >>> 7) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues26 & 127) << 1
	                                                | (intValues27 >>> 28) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues27 >>> 20) & 0xFF);
	      out[outputOffset + 99] = (byte) ((intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 25) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues28 >>> 17) & 0xFF);
	      out[outputOffset + 103] = (byte) ((intValues28 >>> 9) & 0xFF);
	      out[outputOffset + 104] = (byte) ((intValues28 >>> 1) & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues28 & 1) << 7
	                                                | (intValues29 >>> 22) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues29 >>> 14) & 0xFF);
	      out[outputOffset + 107] = (byte) ((intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 27) & 0xFF);
	      out[outputOffset + 109] = (byte) ((intValues30 >>> 19) & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues30 >>> 11) & 0xFF);
	      out[outputOffset + 111] = (byte) ((intValues30 >>> 3) & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues30 & 7) << 5
	                                                | (intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 113] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 114] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 115] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(117);
	}

	protected static void fastpack30(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 22) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 14) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 28) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 26) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 18) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 22) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 28) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 26) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 18) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 >>> 22) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 >>> 14) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 & 63) << 2
	                                                | (intValues9 >>> 28) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues9 >>> 20) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 26) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues10 >>> 18) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues10 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 & 3) << 6
	                                                | (intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues12 >>> 22) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues12 >>> 14) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues12 >>> 6) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 & 63) << 2
	                                                | (intValues13 >>> 28) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues13 >>> 20) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 26) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues14 >>> 18) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues14 >>> 10) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues14 >>> 2) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 & 3) << 6
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues16 >>> 22) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues16 >>> 14) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues16 >>> 6) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues16 & 63) << 2
	                                                | (intValues17 >>> 28) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues17 >>> 20) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues17 >>> 12) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 26) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues18 >>> 18) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues18 >>> 10) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues18 >>> 2) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues18 & 3) << 6
	                                                | (intValues19 >>> 24) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues20 >>> 22) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues20 >>> 14) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues20 >>> 6) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues20 & 63) << 2
	                                                | (intValues21 >>> 28) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues21 >>> 20) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues21 >>> 12) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 26) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues22 >>> 18) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues22 >>> 10) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues22 >>> 2) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues22 & 3) << 6
	                                                | (intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 89] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues24 >>> 22) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues24 >>> 14) & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues24 >>> 6) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues24 & 63) << 2
	                                                | (intValues25 >>> 28) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues25 >>> 20) & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues25 >>> 12) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 26) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues26 >>> 18) & 0xFF);
	      out[outputOffset + 99] = (byte) ((intValues26 >>> 10) & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues26 >>> 2) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues26 & 3) << 6
	                                                | (intValues27 >>> 24) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 103] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 104] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues28 >>> 22) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues28 >>> 14) & 0xFF);
	      out[outputOffset + 107] = (byte) ((intValues28 >>> 6) & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues28 & 63) << 2
	                                                | (intValues29 >>> 28) & 0xFF);
	      out[outputOffset + 109] = (byte) ((intValues29 >>> 20) & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues29 >>> 12) & 0xFF);
	      out[outputOffset + 111] = (byte) ((intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 26) & 0xFF);
	      out[outputOffset + 113] = (byte) ((intValues30 >>> 18) & 0xFF);
	      out[outputOffset + 114] = (byte) ((intValues30 >>> 10) & 0xFF);
	      out[outputOffset + 115] = (byte) ((intValues30 >>> 2) & 0xFF);
	      out[outputOffset + 116] = (byte) ((intValues30 & 3) << 6
	                                                | (intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 117] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 118] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 119] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(121);
	}

	protected static void fastpack31(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 23) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 15) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 30) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 29) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 21) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 28) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 27) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 19) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 26) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 25) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 17) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 30] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 >>> 23) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 15) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 7) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 & 127) << 1
	                                                | (intValues9 >>> 30) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues9 >>> 22) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 29) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues10 >>> 21) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 13) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 5) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 & 31) << 3
	                                                | (intValues11 >>> 28) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 27) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues12 >>> 19) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 11) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 3) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 & 7) << 5
	                                                | (intValues13 >>> 26) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 25) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues14 >>> 17) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 >>> 9) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues14 >>> 1) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues14 & 1) << 7
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 61] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues16 >>> 23) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues16 >>> 15) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues16 >>> 7) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues16 & 127) << 1
	                                                | (intValues17 >>> 30) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues17 >>> 22) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues17 >>> 14) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 29) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues18 >>> 21) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues18 >>> 13) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues18 >>> 5) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues18 & 31) << 3
	                                                | (intValues19 >>> 28) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues19 >>> 20) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues19 >>> 12) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 27) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues20 >>> 19) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues20 >>> 11) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues20 >>> 3) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues20 & 7) << 5
	                                                | (intValues21 >>> 26) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues21 >>> 18) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 25) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues22 >>> 17) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues22 >>> 9) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues22 >>> 1) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues22 & 1) << 7
	                                                | (intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 92] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues24 >>> 23) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues24 >>> 15) & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues24 >>> 7) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues24 & 127) << 1
	                                                | (intValues25 >>> 30) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues25 >>> 22) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues25 >>> 14) & 0xFF);
	      out[outputOffset + 99] = (byte) ((intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 29) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues26 >>> 21) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues26 >>> 13) & 0xFF);
	      out[outputOffset + 103] = (byte) ((intValues26 >>> 5) & 0xFF);
	      out[outputOffset + 104] = (byte) ((intValues26 & 31) << 3
	                                                | (intValues27 >>> 28) & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues27 >>> 20) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues27 >>> 12) & 0xFF);
	      out[outputOffset + 107] = (byte) ((intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 27) & 0xFF);
	      out[outputOffset + 109] = (byte) ((intValues28 >>> 19) & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues28 >>> 11) & 0xFF);
	      out[outputOffset + 111] = (byte) ((intValues28 >>> 3) & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues28 & 7) << 5
	                                                | (intValues29 >>> 26) & 0xFF);
	      out[outputOffset + 113] = (byte) ((intValues29 >>> 18) & 0xFF);
	      out[outputOffset + 114] = (byte) ((intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 115] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 116] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 25) & 0xFF);
	      out[outputOffset + 117] = (byte) ((intValues30 >>> 17) & 0xFF);
	      out[outputOffset + 118] = (byte) ((intValues30 >>> 9) & 0xFF);
	      out[outputOffset + 119] = (byte) ((intValues30 >>> 1) & 0xFF);
	      out[outputOffset + 120] = (byte) ((intValues30 & 1) << 7
	                                                | (intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 121] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 122] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 123] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(125);
	}
	
	protected static void fastpack32(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 >>> 24) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues14 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues16 >>> 24) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues16 >>> 16) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues16 >>> 8) & 0xFF);
	      out[outputOffset + 67] = (byte) (intValues16 & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues17 >>> 24) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues18 >>> 24) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues18 >>> 16) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues18 >>> 8) & 0xFF);
	      out[outputOffset + 75] = (byte) (intValues18 & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues19 >>> 24) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues20 >>> 24) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues20 >>> 16) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues20 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues20 & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues21 >>> 24) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 87] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues22 >>> 24) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues22 >>> 16) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues22 >>> 8) & 0xFF);
	      out[outputOffset + 91] = (byte) (intValues22 & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 95] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues24 >>> 24) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues24 >>> 16) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues24 >>> 8) & 0xFF);
	      out[outputOffset + 99] = (byte) (intValues24 & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues25 >>> 24) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 103] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 104] = (byte) ((intValues26 >>> 24) & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues26 >>> 16) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues26 >>> 8) & 0xFF);
	      out[outputOffset + 107] = (byte) (intValues26 & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues27 >>> 24) & 0xFF);
	      out[outputOffset + 109] = (byte) ((intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 111] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues28 >>> 24) & 0xFF);
	      out[outputOffset + 113] = (byte) ((intValues28 >>> 16) & 0xFF);
	      out[outputOffset + 114] = (byte) ((intValues28 >>> 8) & 0xFF);
	      out[outputOffset + 115] = (byte) (intValues28 & 0xFF);
	      out[outputOffset + 116] = (byte) ((intValues29 >>> 24) & 0xFF);
	      out[outputOffset + 117] = (byte) ((intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 118] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 119] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 120] = (byte) ((intValues30 >>> 24) & 0xFF);
	      out[outputOffset + 121] = (byte) ((intValues30 >>> 16) & 0xFF);
	      out[outputOffset + 122] = (byte) ((intValues30 >>> 8) & 0xFF);
	      out[outputOffset + 123] = (byte) (intValues30 & 0xFF);
	      out[outputOffset + 124] = (byte) ((intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 125] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 126] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 127] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(129);
	}
	
	//16 0 bit
	protected static void fastpack33(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(16);
		outpos.add(1);
	}
	//16 1 bit
	protected static void fastpack34(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
	                                                | ((intValues1 & 1) << 6)
	                                                | ((intValues2 & 1) << 5)
	                                                | ((intValues3 & 1) << 4)
	                                                | ((intValues4 & 1) << 3)
	                                                | ((intValues5 & 1) << 2)
	                                                | ((intValues6 & 1) << 1)
	                                                | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
	                                                | ((intValues9 & 1) << 6)
	                                                | ((intValues10 & 1) << 5)
	                                                | ((intValues11 & 1) << 4)
	                                                | ((intValues12 & 1) << 3)
	                                                | ((intValues13 & 1) << 2)
	                                                | ((intValues14 & 1) << 1)
	                                                | (intValues15 & 1));
	      
		inpos.add(16);
		outpos.add(3);
	}
	
	protected static void fastpack35(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
	                                                | ((intValues1 & 3) << 4)
	                                                | ((intValues2 & 3) << 2)
	                                                | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
	                                                | ((intValues5 & 3) << 4)
	                                                | ((intValues6 & 3) << 2)
	                                                | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
	                                                | ((intValues9 & 3) << 4)
	                                                | ((intValues10 & 3) << 2)
	                                                | (intValues11 & 3));
	      out[outputOffset + 3] = (byte) (((intValues12 & 3) << 6)
	                                                | ((intValues13 & 3) << 4)
	                                                | ((intValues14 & 3) << 2)
	                                                | (intValues15 & 3));

		inpos.add(16);
		outpos.add(5);
	}
	
	protected static void fastpack36(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
	                                                | ((intValues1 & 7) << 2)
	                                                | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
	                                                | ((intValues3 & 7) << 4)
	                                                | ((intValues4 & 7) << 1)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 & 7) << 3)
	                                                | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
	                                                | ((intValues9 & 7) << 2)
	                                                | ((intValues10 >>> 1) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7)
	                                                | ((intValues11 & 7) << 4)
	                                                | ((intValues12 & 7) << 1)
	                                                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues13 & 3) << 6)
	                                                | ((intValues14 & 7) << 3)
	                                                | (intValues15 & 7));

		inpos.add(16);
		outpos.add(7);
	}
	
	protected static void fastpack37(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
	                                                | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
	                                                | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
	                                                | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
	                                                | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
	                                                | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4)
	                                                | (intValues11 & 15));
	      out[outputOffset + 6] = (byte) (((intValues12 & 15) << 4)
	                                                | (intValues13 & 15));
	      out[outputOffset + 7] = (byte) (((intValues14 & 15) << 4)
	                                                | (intValues15 & 15));

		inpos.add(16);
		outpos.add(9);
	}
	
	protected static void fastpack38(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 1) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues12 & 1) << 7)
	                                                | ((intValues13 & 31) << 2)
	                                                | ((intValues14 >>> 3) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues14 & 7) << 5)
	                                                | (intValues15 & 31));
	      
		inpos.add(16);
		outpos.add(11);
	}
	
	protected static void fastpack39(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6)
	                                                | (intValues11 & 63));
	      out[outputOffset + 9] = (byte) (((intValues12 & 63) << 2)
	                                                | ((intValues13 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues13 & 15) << 4)
	                                                | ((intValues14 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues14 & 3) << 6)
	                                                | (intValues15 & 63));
	      
		inpos.add(16);
		outpos.add(13);
	}
	
	protected static void fastpack40(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 3) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues12 & 7) << 5)
	                                                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues13 & 3) << 6)
	                                                | ((intValues14 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues14 & 1) << 7)
	                                                | (intValues15 & 127));
	      
		inpos.add(16);
		outpos.add(15);
	}
	
	protected static void fastpack41(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
	      out[outputOffset + 11] = (byte) ((intValues11 & 255));
	      out[outputOffset + 12] = (byte) ((intValues12 & 255));
	      out[outputOffset + 13] = (byte) ((intValues13 & 255));
	      out[outputOffset + 14] = (byte) ((intValues14 & 255));
	      out[outputOffset + 15] = (byte) ((intValues15 & 255));

		inpos.add(16);
		outpos.add(17);
	}
	
	protected static void fastpack42(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues15 & 0xFF);
	      
		inpos.add(16);
		outpos.add(19);
	}
	
	protected static void fastpack43(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues15 & 0xFF);
	      
		inpos.add(16);
		outpos.add(21);
	}
	
	protected static void fastpack44(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues15 & 0xFF);
	      
		inpos.add(16);
		outpos.add(23);
	}
	
	protected static void fastpack45(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues15 & 0xFF);
	      
		inpos.add(16);
		outpos.add(25);
	}
	
	protected static void fastpack46(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 12] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues8 & 31) << 3
	                                                | (intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues10 & 127) << 1
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 9) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues12 >>> 1) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues12 & 1) << 7
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 11) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues14 >>> 3) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues14 & 7) << 5
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(27);
	}
	
	protected static void fastpack47(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 6] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues8 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues8 & 63) << 2
	                                                | (intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues10 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues10 & 3) << 6
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues12 >>> 6) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues12 & 63) << 2
	                                                | (intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues14 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues14 & 3) << 6
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues15 & 0xFF);
	      
		inpos.add(16);
		outpos.add(29);
	}
	
	protected static void fastpack48(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues8 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 & 127) << 1
	                                                | (intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 13) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues10 >>> 5) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 & 31) << 3
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 11) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues12 >>> 3) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 & 7) << 5
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 9) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues14 >>> 1) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues14 & 1) << 7
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues15 & 0xFF);
	      
		inpos.add(16);
		outpos.add(31);
	}
	
	protected static void fastpack49(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(33);
	}
	
	protected static void fastpack50(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 9) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 11) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 13) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 15) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 16] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues8 >>> 9) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 11) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 13) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 15) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 33] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(35);
	}
	
	protected static void fastpack51(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 10) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 14) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 14) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues8 >>> 10) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 14) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues12 >>> 10) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 14) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(37);
	}
	
	protected static void fastpack52(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 11) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 17) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 15) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 13) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 18] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues8 >>> 11) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 17) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 15) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 13) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 37] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(39);
	}
	
	protected static void fastpack53(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues14 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(41);
	}
	
	protected static void fastpack54(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 13) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 15) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 17) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 19) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 13) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues8 & 31) << 3
	                                                | (intValues9 >>> 18) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 15) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 >>> 7) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues10 & 127) << 1
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 17) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 >>> 9) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues12 >>> 1) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues12 & 1) << 7
	                                                | (intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 19) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues14 >>> 11) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues14 >>> 3) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues14 & 7) << 5
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(43);
	}
	
	protected static void fastpack55(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 14) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 18) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 14) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 18) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 >>> 14) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues8 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues8 & 63) << 2
	                                                | (intValues9 >>> 20) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 18) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues10 >>> 10) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues10 >>> 2) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues10 & 3) << 6
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues12 >>> 14) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues12 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues12 & 63) << 2
	                                                | (intValues13 >>> 20) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 18) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues14 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues14 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues14 & 3) << 6
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(45);
	}
	
	protected static void fastpack56(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 15) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 21) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 19) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 17) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 22] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues8 >>> 15) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues8 >>> 7) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues8 & 127) << 1
	                                                | (intValues9 >>> 22) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 21) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues10 >>> 13) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues10 >>> 5) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues10 & 31) << 3
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 19) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues12 >>> 11) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues12 >>> 3) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues12 & 7) << 5
	                                                | (intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 17) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues14 >>> 9) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues14 >>> 1) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues14 & 1) << 7
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 45] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(47);
	}
	
	protected static void fastpack57(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues14 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(49);
	}
	
	protected static void fastpack58(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 17) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 9) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 19) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 11) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 21) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 13) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 22) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 23) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 15) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues8 >>> 17) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues8 >>> 9) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 18) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 19) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues10 >>> 11) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 21) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues12 >>> 13) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 22) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 23) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues14 >>> 15) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(51);
	}
	
	protected static void fastpack59(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 18) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 10) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 22) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 14) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 12] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 18) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 10) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 22) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 >>> 14) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues8 >>> 18) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues8 >>> 10) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 20) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 22) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues10 >>> 14) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues12 >>> 18) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues12 >>> 10) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 20) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 22) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues14 >>> 14) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(53);
	}
	
	protected static void fastpack60(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 19) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 11) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 25) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 17) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 23) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 15) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 26) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 21) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 13) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues8 >>> 19) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 >>> 11) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 22) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 25) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues10 >>> 17) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 23) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues12 >>> 15) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 26) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 21) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues14 >>> 13) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(55);
	}
	
	protected static void fastpack61(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 20) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 6] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 20) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 20) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 20) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues8 >>> 20) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues10 >>> 20) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues12 >>> 20) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 48] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues14 >>> 20) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues14 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(57);
	}
	
	protected static void fastpack62(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 21) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 13) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 26) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 23) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 15) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 28) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 25) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 17) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 22) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 27) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 19) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 28] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues8 >>> 21) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 >>> 13) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 >>> 5) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 & 31) << 3
	                                                | (intValues9 >>> 26) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues9 >>> 18) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues9 >>> 10) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 23) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues10 >>> 15) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues10 >>> 7) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues10 & 127) << 1
	                                                | (intValues11 >>> 28) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 25) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues12 >>> 17) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues12 >>> 9) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues12 >>> 1) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues12 & 1) << 7
	                                                | (intValues13 >>> 22) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues13 >>> 14) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 27) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues14 >>> 19) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues14 >>> 11) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues14 >>> 3) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues14 & 7) << 5
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 57] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(59);
	}
	
	protected static void fastpack63(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 22) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 14) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 28) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 26) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 18) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 22) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 28) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 26) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 18) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues8 >>> 22) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 >>> 14) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 & 63) << 2
	                                                | (intValues9 >>> 28) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues9 >>> 20) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues9 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 26) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues10 >>> 18) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues10 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 & 3) << 6
	                                                | (intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues12 >>> 22) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues12 >>> 14) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues12 >>> 6) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 & 63) << 2
	                                                | (intValues13 >>> 28) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues13 >>> 20) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues13 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 26) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues14 >>> 18) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues14 >>> 10) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues14 >>> 2) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 & 3) << 6
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(61);
	}
	
	protected static void fastpack64(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 23) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 15) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 30) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 29) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 21) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 28) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 27) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 19) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 26) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 25) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 17) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 30] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues8 >>> 23) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 15) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 7) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 & 127) << 1
	                                                | (intValues9 >>> 30) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues9 >>> 22) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 14) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 29) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues10 >>> 21) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 13) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 5) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 & 31) << 3
	                                                | (intValues11 >>> 28) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues11 >>> 20) & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 12) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 27) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues12 >>> 19) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 11) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 3) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 & 7) << 5
	                                                | (intValues13 >>> 26) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues13 >>> 18) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 25) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues14 >>> 17) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 >>> 9) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues14 >>> 1) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues14 & 1) << 7
	                                                | (intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 61] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(63);
	}
	
	//16 32bits
	protected static void fastpack65(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 >>> 24) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues14 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(65);
	}
	// 8 0 bit
	protected static void fastpack66(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {

		inpos.add(8);
		outpos.add(1);
	}
	// 8 1 bit
	protected static void fastpack67(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
	                                                | ((intValues1 & 1) << 6)
	                                                | ((intValues2 & 1) << 5)
	                                                | ((intValues3 & 1) << 4)
	                                                | ((intValues4 & 1) << 3)
	                                                | ((intValues5 & 1) << 2)
	                                                | ((intValues6 & 1) << 1)
	                                                | (intValues7 & 1));
		inpos.add(8);
		outpos.add(2);
	}
	
	protected static void fastpack68(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
	                                                | ((intValues1 & 3) << 4)
	                                                | ((intValues2 & 3) << 2)
	                                                | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
	                                                | ((intValues5 & 3) << 4)
	                                                | ((intValues6 & 3) << 2)
	                                                | (intValues7 & 3));
		inpos.add(8);
		outpos.add(3);
	}
	
	protected static void fastpack69(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
	                                                | ((intValues1 & 7) << 2)
	                                                | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
	                                                | ((intValues3 & 7) << 4)
	                                                | ((intValues4 & 7) << 1)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 & 7) << 3)
	                                                | (intValues7 & 7));
		inpos.add(8);
		outpos.add(4);
	}
	
	protected static void fastpack70(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
	                                                | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
	                                                | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
	                                                | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
	                                                | (intValues7 & 15));
		inpos.add(8);
		outpos.add(5);
	}
	
	protected static void fastpack71(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
		inpos.add(8);
		outpos.add(6);
	}
	
	protected static void fastpack72(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
		inpos.add(8);
		outpos.add(7);
	}
	
	protected static void fastpack73(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
		inpos.add(8);
		outpos.add(8);
	}
	
	protected static void fastpack74(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
		inpos.add(8);
		outpos.add(9);
	}
	
	protected static void fastpack75(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(10);
	}
	
	protected static void fastpack76(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(11);
	}
	
	protected static void fastpack77(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(12);
	}
	
	protected static void fastpack78(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(13);
	}
	
	protected static void fastpack79(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 12] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(14);
	}
	
	protected static void fastpack80(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 6] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(15);
	}
	
	protected static void fastpack81(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(16);
	}
	
	protected static void fastpack82(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(17);
	}
	
	protected static void fastpack83(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 9) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 11) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 13) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 15) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 16] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(18);
	}
	
	protected static void fastpack84(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 10) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 14) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues4 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 14) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(19);
	}
	
	protected static void fastpack85(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 11) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 17) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 15) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 13) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 18] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(20);
	}
	
	protected static void fastpack86(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(21);
	}
	
	protected static void fastpack87(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	     final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 13) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 15) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 17) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 19) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(22);
	}
	
	protected static void fastpack88(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 14) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 18) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 14) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 18) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(23);
	}
	
	protected static void fastpack89(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 15) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 21) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 19) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 17) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 22] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(24);
	}
	
	protected static void fastpack90(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(25);
	}
	
	protected static void fastpack91(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 17) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 9) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 19) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 11) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 21) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 13) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 22) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 23) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues6 >>> 15) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(26);
	}
	
	protected static void fastpack92(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 18) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 10) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 22) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 14) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 12] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues4 >>> 18) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 10) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 22) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues6 >>> 14) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(27);
	}
	
	protected static void fastpack93(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 19) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 11) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 25) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 17) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 23) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 15) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 26) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 21) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 13) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(28);
	}
	
	protected static void fastpack94(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 20) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 6] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 >>> 20) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues4 >>> 20) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues6 >>> 20) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(29);
	}
	
	protected static void fastpack95(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 21) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 13) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 5) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 31) << 3
	                                                | (intValues1 >>> 26) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 18) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 10) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 23) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 15) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 7) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 & 127) << 1
	                                                | (intValues3 >>> 28) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 25) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 17) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 9) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 1) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 & 1) << 7
	                                                | (intValues5 >>> 22) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 14) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 27) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues6 >>> 19) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 11) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 3) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 & 7) << 5
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 28] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(230);
	}
	
	protected static void fastpack96(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 22) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 14) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 63) << 2
	                                                | (intValues1 >>> 28) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 20) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 26) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 18) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 10) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues2 & 3) << 6
	                                                | (intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues4 >>> 22) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 14) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 & 63) << 2
	                                                | (intValues5 >>> 28) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues5 >>> 20) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 26) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues6 >>> 18) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 10) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 & 3) << 6
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(31);
	}
	
	protected static void fastpack97(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 23) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 15) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 7) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues0 & 127) << 1
	                                                | (intValues1 >>> 30) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 22) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 14) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 29) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 21) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 13) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 5) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues2 & 31) << 3
	                                                | (intValues3 >>> 28) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 20) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 12) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 27) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 19) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 11) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 3) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues4 & 7) << 5
	                                                | (intValues5 >>> 26) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 18) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 25) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 17) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 9) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 1) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues6 & 1) << 7
	                                                | (intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 30] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(32);
	}
	  //8 32bits
	protected static void fastpack98(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get() + 1;
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      
		inpos.add(8);
		outpos.add(33);
	}
	

	/**
	 * Pack the 32 integers
	 * 
	 * @param in
	 *            source array
	 * @param inpos
	 *            starting point in the source array
	 * @param out
	 *            output array
	 * @param outpos
	 *            starting point in the output array
	 * @param bit
	 *            how many bits to use per integer
	 */
	public static void fastunpack(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos, final int index) {
		switch (index) {
		case 0:
			fastunpack0(in, inpos, out, outpos);
			break;
		case 1:
			fastunpack1(in, inpos, out, outpos);
			break;
		case 2:
			fastunpack2(in, inpos, out, outpos);
			break;
		case 3:
			fastunpack3(in, inpos, out, outpos);
			break;
		case 4:
			fastunpack4(in, inpos, out, outpos);
			break;
		case 5:
			fastunpack5(in, inpos, out, outpos);
			break;
		case 6:
			fastunpack6(in, inpos, out, outpos);
			break;
		case 7:
			fastunpack7(in, inpos, out, outpos);
			break;
		case 8:
			fastunpack8(in, inpos, out, outpos);
			break;
		case 9:
			fastunpack9(in, inpos, out, outpos);
			break;
		case 10:
			fastunpack10(in, inpos, out, outpos);
			break;
		case 11:
			fastunpack11(in, inpos, out, outpos);
			break;
		case 12:
			fastunpack12(in, inpos, out, outpos);
			break;
		case 13:
			fastunpack13(in, inpos, out, outpos);
			break;
		case 14:
			fastunpack14(in, inpos, out, outpos);
			break;
		case 15:
			fastunpack15(in, inpos, out, outpos);
			break;
		case 16:
			fastunpack16(in, inpos, out, outpos);
			break;
		case 17:
			fastunpack17(in, inpos, out, outpos);
			break;
		case 18:
			fastunpack18(in, inpos, out, outpos);
			break;
		case 19:
			fastunpack19(in, inpos, out, outpos);
			break;
		case 20:
			fastunpack20(in, inpos, out, outpos);
			break;
		case 21:
			fastunpack21(in, inpos, out, outpos);
			break;
		case 22:
			fastunpack22(in, inpos, out, outpos);
			break;
		case 23:
			fastunpack23(in, inpos, out, outpos);
			break;
		case 24:
			fastunpack24(in, inpos, out, outpos);
			break;
		case 25:
			fastunpack25(in, inpos, out, outpos);
			break;
		case 26:
			fastunpack26(in, inpos, out, outpos);
			break;
		case 27:
			fastunpack27(in, inpos, out, outpos);
			break;
		case 28:
			fastunpack28(in, inpos, out, outpos);
			break;
		case 29:
			fastunpack29(in, inpos, out, outpos);
			break;
		case 30:
			fastunpack30(in, inpos, out, outpos);
			break;
		case 31:
			fastunpack31(in, inpos, out, outpos);
			break;
		case 32:
			fastunpack32(in, inpos, out, outpos);
			break;
		case 33:
			fastunpack33(in, inpos, out, outpos);
			break;
		case 34:
			fastunpack34(in, inpos, out, outpos);
			break;
		case 35:
			fastunpack35(in, inpos, out, outpos);
			break;
		case 36:
			fastunpack36(in, inpos, out, outpos);
			break;
		case 37:
			fastunpack37(in, inpos, out, outpos);
			break;
		case 38:
			fastunpack38(in, inpos, out, outpos);
			break;
		case 39:
			fastunpack39(in, inpos, out, outpos);
			break;
		case 40:
			fastunpack40(in, inpos, out, outpos);
			break;
		case 41:
			fastunpack41(in, inpos, out, outpos);
			break;
		case 42:
			fastunpack42(in, inpos, out, outpos);
			break;
		case 43:
			fastunpack43(in, inpos, out, outpos);
			break;
		case 44:
			fastunpack44(in, inpos, out, outpos);
			break;
		case 45:
			fastunpack45(in, inpos, out, outpos);
			break;
		case 46:
			fastunpack46(in, inpos, out, outpos);
			break;
		case 47:
			fastunpack47(in, inpos, out, outpos);
			break;
		case 48:
			fastunpack48(in, inpos, out, outpos);
			break;
		case 49:
			fastunpack49(in, inpos, out, outpos);
			break;
		case 50:
			fastunpack50(in, inpos, out, outpos);
			break;
		case 51:
			fastunpack51(in, inpos, out, outpos);
			break;
		case 52:
			fastunpack52(in, inpos, out, outpos);
			break;
		case 53:
			fastunpack53(in, inpos, out, outpos);
			break;
		case 54:
			fastunpack54(in, inpos, out, outpos);
			break;
		case 55:
			fastunpack55(in, inpos, out, outpos);
			break;
		case 56:
			fastunpack56(in, inpos, out, outpos);
			break;
		case 57:
			fastunpack57(in, inpos, out, outpos);
			break;
		case 58:
			fastunpack58(in, inpos, out, outpos);
			break;
		case 59:
			fastunpack59(in, inpos, out, outpos);
			break;
		case 60:
			fastunpack60(in, inpos, out, outpos);
			break;
		case 61:
			fastunpack61(in, inpos, out, outpos);
			break;
		case 62:
			fastunpack62(in, inpos, out, outpos);
			break;
		case 63:
			fastunpack63(in, inpos, out, outpos);
			break;
		case 64:
			fastunpack64(in, inpos, out, outpos);
			break;
		case 65:
			fastunpack65(in, inpos, out, outpos);
			break;
		case 66:
			fastunpack66(in, inpos, out, outpos);
			break;
		case 67:
			fastunpack67(in, inpos, out, outpos);
			break;
		case 68:
			fastunpack68(in, inpos, out, outpos);
			break;
		case 69:
			fastunpack69(in, inpos, out, outpos);
			break;
		case 70:
			fastunpack70(in, inpos, out, outpos);
			break;
		case 71:
			fastunpack71(in, inpos, out, outpos);
			break;
		case 72:
			fastunpack72(in, inpos, out, outpos);
			break;
		case 73:
			fastunpack73(in, inpos, out, outpos);
			break;
		case 74:
			fastunpack74(in, inpos, out, outpos);
			break;
		case 75:
			fastunpack75(in, inpos, out, outpos);
			break;
		case 76:
			fastunpack76(in, inpos, out, outpos);
			break;
		case 77:
			fastunpack77(in, inpos, out, outpos);
			break;
		case 78:
			fastunpack78(in, inpos, out, outpos);
			break;
		case 79:
			fastunpack79(in, inpos, out, outpos);
			break;
		case 80:
			fastunpack80(in, inpos, out, outpos);
			break;
		case 81:
			fastunpack81(in, inpos, out, outpos);
			break;
		case 82:
			fastunpack82(in, inpos, out, outpos);
			break;
		case 83:
			fastunpack83(in, inpos, out, outpos);
			break;
		case 84:
			fastunpack84(in, inpos, out, outpos);
			break;
		case 85:
			fastunpack85(in, inpos, out, outpos);
			break;
		case 86:
			fastunpack86(in, inpos, out, outpos);
			break;
		case 87:
			fastunpack87(in, inpos, out, outpos);
			break;
		case 88:
			fastunpack88(in, inpos, out, outpos);
			break;
		case 89:
			fastunpack89(in, inpos, out, outpos);
			break;
		case 90:
			fastunpack90(in, inpos, out, outpos);
			break;
		case 91:
			fastunpack91(in, inpos, out, outpos);
			break;
		case 92:
			fastunpack92(in, inpos, out, outpos);
			break;
		case 93:
			fastunpack93(in, inpos, out, outpos);
			break;
		case 94:
			fastunpack94(in, inpos, out, outpos);
			break;
		case 95:
			fastunpack95(in, inpos, out, outpos);
			break;
		case 96:
			fastunpack96(in, inpos, out, outpos);
			break;
		case 97:
			fastunpack97(in, inpos, out, outpos);
			break;
		case 98:
			fastunpack98(in, inpos, out, outpos);
			break;
		default:
			throw new IllegalArgumentException("Unsupported bit width.");
		}
	}
	

	protected static void fastunpack0(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;
	      out[outOffset + 11] = 0;
	      out[outOffset + 12] = 0;
	      out[outOffset + 13] = 0;
	      out[outOffset + 14] = 0;
	      out[outOffset + 15] = 0;
	      out[outOffset + 16] = 0;
	      out[outOffset + 17] = 0;
	      out[outOffset + 18] = 0;
	      out[outOffset + 19] = 0;
	      out[outOffset + 20] = 0;
	      out[outOffset + 21] = 0;
	      out[outOffset + 22] = 0;
	      out[outOffset + 23] = 0;
	      out[outOffset + 24] = 0;
	      out[outOffset + 25] = 0;
	      out[outOffset + 26] = 0;
	      out[outOffset + 27] = 0;
	      out[outOffset + 28] = 0;
	      out[outOffset + 29] = 0;
	      out[outOffset + 30] = 0;
	      out[outOffset + 31] = 0;

		inpos.add(1);
		outpos.add(32);
	}
	
	protected static void fastunpack1(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
	      out[outOffset + 10] = (i0 >>> 21) & 1;
	      out[outOffset + 11] = (i0 >>> 20) & 1;
	      out[outOffset + 12] = (i0 >>> 19) & 1;
	      out[outOffset + 13] = (i0 >>> 18) & 1;
	      out[outOffset + 14] = (i0 >>> 17) & 1;
	      out[outOffset + 15] = (i0 >>> 16) & 1;
	      out[outOffset + 16] = (i0 >>> 15) & 1;
	      out[outOffset + 17] = (i0 >>> 14) & 1;
	      out[outOffset + 18] = (i0 >>> 13) & 1;
	      out[outOffset + 19] = (i0 >>> 12) & 1;
	      out[outOffset + 20] = (i0 >>> 11) & 1;
	      out[outOffset + 21] = (i0 >>> 10) & 1;
	      out[outOffset + 22] = (i0 >>> 9) & 1;
	      out[outOffset + 23] = (i0 >>> 8) & 1;
	      out[outOffset + 24] = (i0 >>> 7) & 1;
	      out[outOffset + 25] = (i0 >>> 6) & 1;
	      out[outOffset + 26] = (i0 >>> 5) & 1;
	      out[outOffset + 27] = (i0 >>> 4) & 1;
	      out[outOffset + 28] = (i0 >>> 3) & 1;
	      out[outOffset + 29] = (i0 >>> 2) & 1;
	      out[outOffset + 30] = (i0 >>> 1) & 1;
	      out[outOffset + 31] = i0 & 1;
		
		inpos.add(5);
		outpos.add(32);
	}

	protected static void fastunpack2(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
	      out[outOffset + 10] = (i0 >>> 10) & 3;
	      out[outOffset + 11] = (i0 >>> 8) & 3;
	      out[outOffset + 12] = (i0 >>> 6) & 3;
	      out[outOffset + 13] = (i0 >>> 4) & 3;
	      out[outOffset + 14] = (i0 >>> 2) & 3;
	      out[outOffset + 15] = i0 & 3;
	      out[outOffset + 16] = (i1 >>> 30);
	      out[outOffset + 17] = (i1 >>> 28) & 3;
	      out[outOffset + 18] = (i1 >>> 26) & 3;
	      out[outOffset + 19] = (i1 >>> 24) & 3;
	      out[outOffset + 20] = (i1 >>> 22) & 3;
	      out[outOffset + 21] = (i1 >>> 20) & 3;
	      out[outOffset + 22] = (i1 >>> 18) & 3;
	      out[outOffset + 23] = (i1 >>> 16) & 3;
	      out[outOffset + 24] = (i1 >>> 14) & 3;
	      out[outOffset + 25] = (i1 >>> 12) & 3;
	      out[outOffset + 26] = (i1 >>> 10) & 3;
	      out[outOffset + 27] = (i1 >>> 8) & 3;
	      out[outOffset + 28] = (i1 >>> 6) & 3;
	      out[outOffset + 29] = (i1 >>> 4) & 3;
	      out[outOffset + 30] = (i1 >>> 2) & 3;
	      out[outOffset + 31] = i1 & 3;
		
		inpos.add(9);
		outpos.add(32);
	}

	protected static void fastunpack3(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
	      out[outOffset + 10] = ((i0 << 1) | (i1 >>> 31)) & 7;
	      out[outOffset + 11] = (i1 >>> 28) & 7;
	      out[outOffset + 12] = (i1 >>> 25) & 7;
	      out[outOffset + 13] = (i1 >>> 22) & 7;
	      out[outOffset + 14] = (i1 >>> 19) & 7;
	      out[outOffset + 15] = (i1 >>> 16) & 7;
	      out[outOffset + 16] = (i1 >>> 13) & 7;
	      out[outOffset + 17] = (i1 >>> 10) & 7;
	      out[outOffset + 18] = (i1 >>> 7) & 7;
	      out[outOffset + 19] = (i1 >>> 4) & 7;
	      out[outOffset + 20] = (i1 >>> 1) & 7;
	      out[outOffset + 21] = ((i1 << 2) | (i2 >>> 30)) & 7;
	      out[outOffset + 22] = (i2 >>> 27) & 7;
	      out[outOffset + 23] = (i2 >>> 24) & 7;
	      out[outOffset + 24] = (i2 >>> 21) & 7;
	      out[outOffset + 25] = (i2 >>> 18) & 7;
	      out[outOffset + 26] = (i2 >>> 15) & 7;
	      out[outOffset + 27] = (i2 >>> 12) & 7;
	      out[outOffset + 28] = (i2 >>> 9) & 7;
	      out[outOffset + 29] = (i2 >>> 6) & 7;
	      out[outOffset + 30] = (i2 >>> 3) & 7;
	      out[outOffset + 31] = i2 & 7;
		
		inpos.add(13);
		outpos.add(32);
	}

	protected static void fastunpack4(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
	      out[outOffset + 10] = (i1 >>> 20) & 15;
	      out[outOffset + 11] = (i1 >>> 16) & 15;
	      out[outOffset + 12] = (i1 >>> 12) & 15;
	      out[outOffset + 13] = (i1 >>> 8) & 15;
	      out[outOffset + 14] = (i1 >>> 4) & 15;
	      out[outOffset + 15] = i1 & 15;
	      out[outOffset + 16] = (i2 >>> 28);
	      out[outOffset + 17] = (i2 >>> 24) & 15;
	      out[outOffset + 18] = (i2 >>> 20) & 15;
	      out[outOffset + 19] = (i2 >>> 16) & 15;
	      out[outOffset + 20] = (i2 >>> 12) & 15;
	      out[outOffset + 21] = (i2 >>> 8) & 15;
	      out[outOffset + 22] = (i2 >>> 4) & 15;
	      out[outOffset + 23] = i2 & 15;
	      out[outOffset + 24] = (i3 >>> 28);
	      out[outOffset + 25] = (i3 >>> 24) & 15;
	      out[outOffset + 26] = (i3 >>> 20) & 15;
	      out[outOffset + 27] = (i3 >>> 16) & 15;
	      out[outOffset + 28] = (i3 >>> 12) & 15;
	      out[outOffset + 29] = (i3 >>> 8) & 15;
	      out[outOffset + 30] = (i3 >>> 4) & 15;
	      out[outOffset + 31] = i3 & 15;
		
		inpos.add(17);
		outpos.add(32);
	}

	protected static void fastunpack5(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;
	      out[outOffset + 10] = (i1 >>> 9) & 31;
	      out[outOffset + 11] = (i1 >>> 4) & 31;
	      out[outOffset + 12] = ((i1 << 1) | (i2 >>> 31)) & 31;
	      out[outOffset + 13] = (i2 >>> 26) & 31;
	      out[outOffset + 14] = (i2 >>> 21) & 31;
	      out[outOffset + 15] = (i2 >>> 16) & 31;
	      out[outOffset + 16] = (i2 >>> 11) & 31;
	      out[outOffset + 17] = (i2 >>> 6) & 31;
	      out[outOffset + 18] = (i2 >>> 1) & 31;
	      out[outOffset + 19] = ((i2 << 4) | (i3 >>> 28)) & 31;
	      out[outOffset + 20] = (i3 >>> 23) & 31;
	      out[outOffset + 21] = (i3 >>> 18) & 31;
	      out[outOffset + 22] = (i3 >>> 13) & 31;
	      out[outOffset + 23] = (i3 >>> 8) & 31;
	      out[outOffset + 24] = (i3 >>> 3) & 31;
	      out[outOffset + 25] = ((i3 << 2) | (i4 >>> 30)) & 31;
	      out[outOffset + 26] = (i4 >>> 25) & 31;
	      out[outOffset + 27] = (i4 >>> 20) & 31;
	      out[outOffset + 28] = (i4 >>> 15) & 31;
	      out[outOffset + 29] = (i4 >>> 10) & 31;
	      out[outOffset + 30] = (i4 >>> 5) & 31;
	      out[outOffset + 31] = i4 & 31;
		
		inpos.add(21);
		outpos.add(32);
	}

	protected static void fastunpack6(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
	      out[outOffset + 10] = ((i1 << 2) | (i2 >>> 30)) & 63;
	      out[outOffset + 11] = (i2 >>> 24) & 63;
	      out[outOffset + 12] = (i2 >>> 18) & 63;
	      out[outOffset + 13] = (i2 >>> 12) & 63;
	      out[outOffset + 14] = (i2 >>> 6) & 63;
	      out[outOffset + 15] = i2 & 63;
	      out[outOffset + 16] = (i3 >>> 26);
	      out[outOffset + 17] = (i3 >>> 20) & 63;
	      out[outOffset + 18] = (i3 >>> 14) & 63;
	      out[outOffset + 19] = (i3 >>> 8) & 63;
	      out[outOffset + 20] = (i3 >>> 2) & 63;
	      out[outOffset + 21] = ((i3 << 4) | (i4 >>> 28)) & 63;
	      out[outOffset + 22] = (i4 >>> 22) & 63;
	      out[outOffset + 23] = (i4 >>> 16) & 63;
	      out[outOffset + 24] = (i4 >>> 10) & 63;
	      out[outOffset + 25] = (i4 >>> 4) & 63;
	      out[outOffset + 26] = ((i4 << 2) | (i5 >>> 30)) & 63;
	      out[outOffset + 27] = (i5 >>> 24) & 63;
	      out[outOffset + 28] = (i5 >>> 18) & 63;
	      out[outOffset + 29] = (i5 >>> 12) & 63;
	      out[outOffset + 30] = (i5 >>> 6) & 63;
	      out[outOffset + 31] = i5 & 63;
		
		inpos.add(25);
		outpos.add(32);
	}

	protected static void fastunpack7(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
	      out[outOffset + 10] = (i2 >>> 19) & 127;
	      out[outOffset + 11] = (i2 >>> 12) & 127;
	      out[outOffset + 12] = (i2 >>> 5) & 127;
	      out[outOffset + 13] = ((i2 << 2) | (i3 >>> 30)) & 127;
	      out[outOffset + 14] = (i3 >>> 23) & 127;
	      out[outOffset + 15] = (i3 >>> 16) & 127;
	      out[outOffset + 16] = (i3 >>> 9) & 127;
	      out[outOffset + 17] = (i3 >>> 2) & 127;
	      out[outOffset + 18] = ((i3 << 5) | (i4 >>> 27)) & 127;
	      out[outOffset + 19] = (i4 >>> 20) & 127;
	      out[outOffset + 20] = (i4 >>> 13) & 127;
	      out[outOffset + 21] = (i4 >>> 6) & 127;
	      out[outOffset + 22] = ((i4 << 1) | (i5 >>> 31)) & 127;
	      out[outOffset + 23] = (i5 >>> 24) & 127;
	      out[outOffset + 24] = (i5 >>> 17) & 127;
	      out[outOffset + 25] = (i5 >>> 10) & 127;
	      out[outOffset + 26] = (i5 >>> 3) & 127;
	      out[outOffset + 27] = ((i5 << 4) | (i6 >>> 28)) & 127;
	      out[outOffset + 28] = (i6 >>> 21) & 127;
	      out[outOffset + 29] = (i6 >>> 14) & 127;
	      out[outOffset + 30] = (i6 >>> 7) & 127;
	      out[outOffset + 31] = i6 & 127;
		
		inpos.add(29);
		outpos.add(32);
	}

	protected static void fastunpack8(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
	      out[outOffset + 10] = (i2 >>> 8) & 255;
	      out[outOffset + 11] = i2 & 255;
	      out[outOffset + 12] = (i3 >>> 24);
	      out[outOffset + 13] = (i3 >>> 16) & 255;
	      out[outOffset + 14] = (i3 >>> 8) & 255;
	      out[outOffset + 15] = i3 & 255;
	      out[outOffset + 16] = (i4 >>> 24);
	      out[outOffset + 17] = (i4 >>> 16) & 255;
	      out[outOffset + 18] = (i4 >>> 8) & 255;
	      out[outOffset + 19] = i4 & 255;
	      out[outOffset + 20] = (i5 >>> 24);
	      out[outOffset + 21] = (i5 >>> 16) & 255;
	      out[outOffset + 22] = (i5 >>> 8) & 255;
	      out[outOffset + 23] = i5 & 255;
	      out[outOffset + 24] = (i6 >>> 24);
	      out[outOffset + 25] = (i6 >>> 16) & 255;
	      out[outOffset + 26] = (i6 >>> 8) & 255;
	      out[outOffset + 27] = i6 & 255;
	      out[outOffset + 28] = (i7 >>> 24);
	      out[outOffset + 29] = (i7 >>> 16) & 255;
	      out[outOffset + 30] = (i7 >>> 8) & 255;
	      out[outOffset + 31] = i7 & 255;
		
		inpos.add(33);
		outpos.add(32);
	}

	protected static void fastunpack9(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
	      out[outOffset + 10] = ((i2 << 3) | (i3 >>> 29)) & 511;
	      out[outOffset + 11] = (i3 >>> 20) & 511;
	      out[outOffset + 12] = (i3 >>> 11) & 511;
	      out[outOffset + 13] = (i3 >>> 2) & 511;
	      out[outOffset + 14] = ((i3 << 7) | (i4 >>> 25)) & 511;
	      out[outOffset + 15] = (i4 >>> 16) & 511;
	      out[outOffset + 16] = (i4 >>> 7) & 511;
	      out[outOffset + 17] = ((i4 << 2) | (i5 >>> 30)) & 511;
	      out[outOffset + 18] = (i5 >>> 21) & 511;
	      out[outOffset + 19] = (i5 >>> 12) & 511;
	      out[outOffset + 20] = (i5 >>> 3) & 511;
	      out[outOffset + 21] = ((i5 << 6) | (i6 >>> 26)) & 511;
	      out[outOffset + 22] = (i6 >>> 17) & 511;
	      out[outOffset + 23] = (i6 >>> 8) & 511;
	      out[outOffset + 24] = ((i6 << 1) | (i7 >>> 31)) & 511;
	      out[outOffset + 25] = (i7 >>> 22) & 511;
	      out[outOffset + 26] = (i7 >>> 13) & 511;
	      out[outOffset + 27] = (i7 >>> 4) & 511;
	      out[outOffset + 28] = ((i7 << 5) | (i8 >>> 27)) & 511;
	      out[outOffset + 29] = (i8 >>> 18) & 511;
	      out[outOffset + 30] = (i8 >>> 9) & 511;
	      out[outOffset + 31] = i8 & 511;
		
		inpos.add(37);
		outpos.add(32);
	}

	protected static void fastunpack10(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
	      out[outOffset + 10] = (i3 >>> 18) & 1023;
	      out[outOffset + 11] = (i3 >>> 8) & 1023;
	      out[outOffset + 12] = ((i3 << 2) | (i4 >>> 30)) & 1023;
	      out[outOffset + 13] = (i4 >>> 20) & 1023;
	      out[outOffset + 14] = (i4 >>> 10) & 1023;
	      out[outOffset + 15] = i4 & 1023;
	      out[outOffset + 16] = (i5 >>> 22);
	      out[outOffset + 17] = (i5 >>> 12) & 1023;
	      out[outOffset + 18] = (i5 >>> 2) & 1023;
	      out[outOffset + 19] = ((i5 << 8) | (i6 >>> 24)) & 1023;
	      out[outOffset + 20] = (i6 >>> 14) & 1023;
	      out[outOffset + 21] = (i6 >>> 4) & 1023;
	      out[outOffset + 22] = ((i6 << 6) | (i7 >>> 26)) & 1023;
	      out[outOffset + 23] = (i7 >>> 16) & 1023;
	      out[outOffset + 24] = (i7 >>> 6) & 1023;
	      out[outOffset + 25] = ((i7 << 4) | (i8 >>> 28)) & 1023;
	      out[outOffset + 26] = (i8 >>> 18) & 1023;
	      out[outOffset + 27] = (i8 >>> 8) & 1023;
	      out[outOffset + 28] = ((i8 << 2) | (i9 >>> 30)) & 1023;
	      out[outOffset + 29] = (i9 >>> 20) & 1023;
	      out[outOffset + 30] = (i9 >>> 10) & 1023;
	      out[outOffset + 31] = i9 & 1023;
		
		inpos.add(41);
		outpos.add(32);
	}

	protected static void fastunpack11(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
	      out[outOffset + 10] = (i3 >>> 7) & 2047;
	      out[outOffset + 11] = ((i3 << 4) | (i4 >>> 28)) & 2047;
	      out[outOffset + 12] = (i4 >>> 17) & 2047;
	      out[outOffset + 13] = (i4 >>> 6) & 2047;
	      out[outOffset + 14] = ((i4 << 5) | (i5 >>> 27)) & 2047;
	      out[outOffset + 15] = (i5 >>> 16) & 2047;
	      out[outOffset + 16] = (i5 >>> 5) & 2047;
	      out[outOffset + 17] = ((i5 << 6) | (i6 >>> 26)) & 2047;
	      out[outOffset + 18] = (i6 >>> 15) & 2047;
	      out[outOffset + 19] = (i6 >>> 4) & 2047;
	      out[outOffset + 20] = ((i6 << 7) | (i7 >>> 25)) & 2047;
	      out[outOffset + 21] = (i7 >>> 14) & 2047;
	      out[outOffset + 22] = (i7 >>> 3) & 2047;
	      out[outOffset + 23] = ((i7 << 8) | (i8 >>> 24)) & 2047;
	      out[outOffset + 24] = (i8 >>> 13) & 2047;
	      out[outOffset + 25] = (i8 >>> 2) & 2047;
	      out[outOffset + 26] = ((i8 << 9) | (i9 >>> 23)) & 2047;
	      out[outOffset + 27] = (i9 >>> 12) & 2047;
	      out[outOffset + 28] = (i9 >>> 1) & 2047;
	      out[outOffset + 29] = ((i9 << 10) | (i10 >>> 22)) & 2047;
	      out[outOffset + 30] = (i10 >>> 11) & 2047;
	      out[outOffset + 31] = i10 & 2047;
		
		inpos.add(45);
		outpos.add(32);
	}

	protected static void fastunpack12(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
	      out[outOffset + 10] = ((i3 << 4) | (i4 >>> 28)) & 4095;
	      out[outOffset + 11] = (i4 >>> 16) & 4095;
	      out[outOffset + 12] = (i4 >>> 4) & 4095;
	      out[outOffset + 13] = ((i4 << 8) | (i5 >>> 24)) & 4095;
	      out[outOffset + 14] = (i5 >>> 12) & 4095;
	      out[outOffset + 15] = i5 & 4095;
	      out[outOffset + 16] = (i6 >>> 20);
	      out[outOffset + 17] = (i6 >>> 8) & 4095;
	      out[outOffset + 18] = ((i6 << 4) | (i7 >>> 28)) & 4095;
	      out[outOffset + 19] = (i7 >>> 16) & 4095;
	      out[outOffset + 20] = (i7 >>> 4) & 4095;
	      out[outOffset + 21] = ((i7 << 8) | (i8 >>> 24)) & 4095;
	      out[outOffset + 22] = (i8 >>> 12) & 4095;
	      out[outOffset + 23] = i8 & 4095;
	      out[outOffset + 24] = (i9 >>> 20);
	      out[outOffset + 25] = (i9 >>> 8) & 4095;
	      out[outOffset + 26] = ((i9 << 4) | (i10 >>> 28)) & 4095;
	      out[outOffset + 27] = (i10 >>> 16) & 4095;
	      out[outOffset + 28] = (i10 >>> 4) & 4095;
	      out[outOffset + 29] = ((i10 << 8) | (i11 >>> 24)) & 4095;
	      out[outOffset + 30] = (i11 >>> 12) & 4095;
	      out[outOffset + 31] = i11 & 4095;
		
		inpos.add(49);
		outpos.add(32);
	}

	protected static void fastunpack13(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 19);
	      out[outOffset + 1] = (i0 >>> 6) & 8191;
	      out[outOffset + 2] = ((i0 << 7) | (i1 >>> 25)) & 8191;
	      out[outOffset + 3] = (i1 >>> 12) & 8191;
	      out[outOffset + 4] = ((i1 << 1) | (i2 >>> 31)) & 8191;
	      out[outOffset + 5] = (i2 >>> 18) & 8191;
	      out[outOffset + 6] = (i2 >>> 5) & 8191;
	      out[outOffset + 7] = ((i2 << 8) | (i3 >>> 24)) & 8191;
	      out[outOffset + 8] = (i3 >>> 11) & 8191;
	      out[outOffset + 9] = ((i3 << 2) | (i4 >>> 30)) & 8191;
	      out[outOffset + 10] = (i4 >>> 17) & 8191;
	      out[outOffset + 11] = (i4 >>> 4) & 8191;
	      out[outOffset + 12] = ((i4 << 9) | (i5 >>> 23)) & 8191;
	      out[outOffset + 13] = (i5 >>> 10) & 8191;
	      out[outOffset + 14] = ((i5 << 3) | (i6 >>> 29)) & 8191;
	      out[outOffset + 15] = (i6 >>> 16) & 8191;
	      out[outOffset + 16] = (i6 >>> 3) & 8191;
	      out[outOffset + 17] = ((i6 << 10) | (i7 >>> 22)) & 8191;
	      out[outOffset + 18] = (i7 >>> 9) & 8191;
	      out[outOffset + 19] = ((i7 << 4) | (i8 >>> 28)) & 8191;
	      out[outOffset + 20] = (i8 >>> 15) & 8191;
	      out[outOffset + 21] = (i8 >>> 2) & 8191;
	      out[outOffset + 22] = ((i8 << 11) | (i9 >>> 21)) & 8191;
	      out[outOffset + 23] = (i9 >>> 8) & 8191;
	      out[outOffset + 24] = ((i9 << 5) | (i10 >>> 27)) & 8191;
	      out[outOffset + 25] = (i10 >>> 14) & 8191;
	      out[outOffset + 26] = (i10 >>> 1) & 8191;
	      out[outOffset + 27] = ((i10 << 12) | (i11 >>> 20)) & 8191;
	      out[outOffset + 28] = (i11 >>> 7) & 8191;
	      out[outOffset + 29] = ((i11 << 6) | (i12 >>> 26)) & 8191;
	      out[outOffset + 30] = (i12 >>> 13) & 8191;
	      out[outOffset + 31] = i12 & 8191;
		
		inpos.add(53);
		outpos.add(32);
	}

	protected static void fastunpack14(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 18);
	      out[outOffset + 1] = (i0 >>> 4) & 16383;
	      out[outOffset + 2] = ((i0 << 10) | (i1 >>> 22)) & 16383;
	      out[outOffset + 3] = (i1 >>> 8) & 16383;
	      out[outOffset + 4] = ((i1 << 6) | (i2 >>> 26)) & 16383;
	      out[outOffset + 5] = (i2 >>> 12) & 16383;
	      out[outOffset + 6] = ((i2 << 2) | (i3 >>> 30)) & 16383;
	      out[outOffset + 7] = (i3 >>> 16) & 16383;
	      out[outOffset + 8] = (i3 >>> 2) & 16383;
	      out[outOffset + 9] = ((i3 << 12) | (i4 >>> 20)) & 16383;
	      out[outOffset + 10] = (i4 >>> 6) & 16383;
	      out[outOffset + 11] = ((i4 << 8) | (i5 >>> 24)) & 16383;
	      out[outOffset + 12] = (i5 >>> 10) & 16383;
	      out[outOffset + 13] = ((i5 << 4) | (i6 >>> 28)) & 16383;
	      out[outOffset + 14] = (i6 >>> 14) & 16383;
	      out[outOffset + 15] = i6 & 16383;
	      out[outOffset + 16] = (i7 >>> 18);
	      out[outOffset + 17] = (i7 >>> 4) & 16383;
	      out[outOffset + 18] = ((i7 << 10) | (i8 >>> 22)) & 16383;
	      out[outOffset + 19] = (i8 >>> 8) & 16383;
	      out[outOffset + 20] = ((i8 << 6) | (i9 >>> 26)) & 16383;
	      out[outOffset + 21] = (i9 >>> 12) & 16383;
	      out[outOffset + 22] = ((i9 << 2) | (i10 >>> 30)) & 16383;
	      out[outOffset + 23] = (i10 >>> 16) & 16383;
	      out[outOffset + 24] = (i10 >>> 2) & 16383;
	      out[outOffset + 25] = ((i10 << 12) | (i11 >>> 20)) & 16383;
	      out[outOffset + 26] = (i11 >>> 6) & 16383;
	      out[outOffset + 27] = ((i11 << 8) | (i12 >>> 24)) & 16383;
	      out[outOffset + 28] = (i12 >>> 10) & 16383;
	      out[outOffset + 29] = ((i12 << 4) | (i13 >>> 28)) & 16383;
	      out[outOffset + 30] = (i13 >>> 14) & 16383;
	      out[outOffset + 31] = i13 & 16383;
		
		inpos.add(57);
		outpos.add(32);
	}

	protected static void fastunpack15(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 17);
	      out[outOffset + 1] = (i0 >>> 2) & 32767;
	      out[outOffset + 2] = ((i0 << 13) | (i1 >>> 19)) & 32767;
	      out[outOffset + 3] = (i1 >>> 4) & 32767;
	      out[outOffset + 4] = ((i1 << 11) | (i2 >>> 21)) & 32767;
	      out[outOffset + 5] = (i2 >>> 6) & 32767;
	      out[outOffset + 6] = ((i2 << 9) | (i3 >>> 23)) & 32767;
	      out[outOffset + 7] = (i3 >>> 8) & 32767;
	      out[outOffset + 8] = ((i3 << 7) | (i4 >>> 25)) & 32767;
	      out[outOffset + 9] = (i4 >>> 10) & 32767;
	      out[outOffset + 10] = ((i4 << 5) | (i5 >>> 27)) & 32767;
	      out[outOffset + 11] = (i5 >>> 12) & 32767;
	      out[outOffset + 12] = ((i5 << 3) | (i6 >>> 29)) & 32767;
	      out[outOffset + 13] = (i6 >>> 14) & 32767;
	      out[outOffset + 14] = ((i6 << 1) | (i7 >>> 31)) & 32767;
	      out[outOffset + 15] = (i7 >>> 16) & 32767;
	      out[outOffset + 16] = (i7 >>> 1) & 32767;
	      out[outOffset + 17] = ((i7 << 14) | (i8 >>> 18)) & 32767;
	      out[outOffset + 18] = (i8 >>> 3) & 32767;
	      out[outOffset + 19] = ((i8 << 12) | (i9 >>> 20)) & 32767;
	      out[outOffset + 20] = (i9 >>> 5) & 32767;
	      out[outOffset + 21] = ((i9 << 10) | (i10 >>> 22)) & 32767;
	      out[outOffset + 22] = (i10 >>> 7) & 32767;
	      out[outOffset + 23] = ((i10 << 8) | (i11 >>> 24)) & 32767;
	      out[outOffset + 24] = (i11 >>> 9) & 32767;
	      out[outOffset + 25] = ((i11 << 6) | (i12 >>> 26)) & 32767;
	      out[outOffset + 26] = (i12 >>> 11) & 32767;
	      out[outOffset + 27] = ((i12 << 4) | (i13 >>> 28)) & 32767;
	      out[outOffset + 28] = (i13 >>> 13) & 32767;
	      out[outOffset + 29] = ((i13 << 2) | (i14 >>> 30)) & 32767;
	      out[outOffset + 30] = (i14 >>> 15) & 32767;
	      out[outOffset + 31] = i14 & 32767;
		
		inpos.add(61);
		outpos.add(32);
	}

	protected static void fastunpack16(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
	      out[outOffset + 10] = (i5 >>> 16);
	      out[outOffset + 11] = i5 & 65535;
	      out[outOffset + 12] = (i6 >>> 16);
	      out[outOffset + 13] = i6 & 65535;
	      out[outOffset + 14] = (i7 >>> 16);
	      out[outOffset + 15] = i7 & 65535;
	      out[outOffset + 16] = (i8 >>> 16);
	      out[outOffset + 17] = i8 & 65535;
	      out[outOffset + 18] = (i9 >>> 16);
	      out[outOffset + 19] = i9 & 65535;
	      out[outOffset + 20] = (i10 >>> 16);
	      out[outOffset + 21] = i10 & 65535;
	      out[outOffset + 22] = (i11 >>> 16);
	      out[outOffset + 23] = i11 & 65535;
	      out[outOffset + 24] = (i12 >>> 16);
	      out[outOffset + 25] = i12 & 65535;
	      out[outOffset + 26] = (i13 >>> 16);
	      out[outOffset + 27] = i13 & 65535;
	      out[outOffset + 28] = (i14 >>> 16);
	      out[outOffset + 29] = i14 & 65535;
	      out[outOffset + 30] = (i15 >>> 16);
	      out[outOffset + 31] = i15 & 65535;
		
		inpos.add(65);
		outpos.add(32);
	}

	protected static void fastunpack17(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 15);
	      out[outOffset + 1] = ((i0 << 2) | (i1 >>> 30)) & 131071;
	      out[outOffset + 2] = (i1 >>> 13) & 131071;
	      out[outOffset + 3] = ((i1 << 4) | (i2 >>> 28)) & 131071;
	      out[outOffset + 4] = (i2 >>> 11) & 131071;
	      out[outOffset + 5] = ((i2 << 6) | (i3 >>> 26)) & 131071;
	      out[outOffset + 6] = (i3 >>> 9) & 131071;
	      out[outOffset + 7] = ((i3 << 8) | (i4 >>> 24)) & 131071;
	      out[outOffset + 8] = (i4 >>> 7) & 131071;
	      out[outOffset + 9] = ((i4 << 10) | (i5 >>> 22)) & 131071;
	      out[outOffset + 10] = (i5 >>> 5) & 131071;
	      out[outOffset + 11] = ((i5 << 12) | (i6 >>> 20)) & 131071;
	      out[outOffset + 12] = (i6 >>> 3) & 131071;
	      out[outOffset + 13] = ((i6 << 14) | (i7 >>> 18)) & 131071;
	      out[outOffset + 14] = (i7 >>> 1) & 131071;
	      out[outOffset + 15] = ((i7 << 16) | (i8 >>> 16)) & 131071;
	      out[outOffset + 16] = ((i8 << 1) | (i9 >>> 31)) & 131071;
	      out[outOffset + 17] = (i9 >>> 14) & 131071;
	      out[outOffset + 18] = ((i9 << 3) | (i10 >>> 29)) & 131071;
	      out[outOffset + 19] = (i10 >>> 12) & 131071;
	      out[outOffset + 20] = ((i10 << 5) | (i11 >>> 27)) & 131071;
	      out[outOffset + 21] = (i11 >>> 10) & 131071;
	      out[outOffset + 22] = ((i11 << 7) | (i12 >>> 25)) & 131071;
	      out[outOffset + 23] = (i12 >>> 8) & 131071;
	      out[outOffset + 24] = ((i12 << 9) | (i13 >>> 23)) & 131071;
	      out[outOffset + 25] = (i13 >>> 6) & 131071;
	      out[outOffset + 26] = ((i13 << 11) | (i14 >>> 21)) & 131071;
	      out[outOffset + 27] = (i14 >>> 4) & 131071;
	      out[outOffset + 28] = ((i14 << 13) | (i15 >>> 19)) & 131071;
	      out[outOffset + 29] = (i15 >>> 2) & 131071;
	      out[outOffset + 30] = ((i15 << 15) | (i16 >>> 17)) & 131071;
	      out[outOffset + 31] = i16 & 131071;
		
		inpos.add(69);
		outpos.add(32);
	}

	protected static void fastunpack18(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 14);
	      out[outOffset + 1] = ((i0 << 4) | (i1 >>> 28)) & 262143;
	      out[outOffset + 2] = (i1 >>> 10) & 262143;
	      out[outOffset + 3] = ((i1 << 8) | (i2 >>> 24)) & 262143;
	      out[outOffset + 4] = (i2 >>> 6) & 262143;
	      out[outOffset + 5] = ((i2 << 12) | (i3 >>> 20)) & 262143;
	      out[outOffset + 6] = (i3 >>> 2) & 262143;
	      out[outOffset + 7] = ((i3 << 16) | (i4 >>> 16)) & 262143;
	      out[outOffset + 8] = ((i4 << 2) | (i5 >>> 30)) & 262143;
	      out[outOffset + 9] = (i5 >>> 12) & 262143;
	      out[outOffset + 10] = ((i5 << 6) | (i6 >>> 26)) & 262143;
	      out[outOffset + 11] = (i6 >>> 8) & 262143;
	      out[outOffset + 12] = ((i6 << 10) | (i7 >>> 22)) & 262143;
	      out[outOffset + 13] = (i7 >>> 4) & 262143;
	      out[outOffset + 14] = ((i7 << 14) | (i8 >>> 18)) & 262143;
	      out[outOffset + 15] = i8 & 262143;
	      out[outOffset + 16] = (i9 >>> 14);
	      out[outOffset + 17] = ((i9 << 4) | (i10 >>> 28)) & 262143;
	      out[outOffset + 18] = (i10 >>> 10) & 262143;
	      out[outOffset + 19] = ((i10 << 8) | (i11 >>> 24)) & 262143;
	      out[outOffset + 20] = (i11 >>> 6) & 262143;
	      out[outOffset + 21] = ((i11 << 12) | (i12 >>> 20)) & 262143;
	      out[outOffset + 22] = (i12 >>> 2) & 262143;
	      out[outOffset + 23] = ((i12 << 16) | (i13 >>> 16)) & 262143;
	      out[outOffset + 24] = ((i13 << 2) | (i14 >>> 30)) & 262143;
	      out[outOffset + 25] = (i14 >>> 12) & 262143;
	      out[outOffset + 26] = ((i14 << 6) | (i15 >>> 26)) & 262143;
	      out[outOffset + 27] = (i15 >>> 8) & 262143;
	      out[outOffset + 28] = ((i15 << 10) | (i16 >>> 22)) & 262143;
	      out[outOffset + 29] = (i16 >>> 4) & 262143;
	      out[outOffset + 30] = ((i16 << 14) | (i17 >>> 18)) & 262143;
	      out[outOffset + 31] = i17 & 262143;
		
		inpos.add(73);
		outpos.add(32);
	}

	protected static void fastunpack19(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 13);
	      out[outOffset + 1] = ((i0 << 6) | (i1 >>> 26)) & 524287;
	      out[outOffset + 2] = (i1 >>> 7) & 524287;
	      out[outOffset + 3] = ((i1 << 12) | (i2 >>> 20)) & 524287;
	      out[outOffset + 4] = (i2 >>> 1) & 524287;
	      out[outOffset + 5] = ((i2 << 18) | (i3 >>> 14)) & 524287;
	      out[outOffset + 6] = ((i3 << 5) | (i4 >>> 27)) & 524287;
	      out[outOffset + 7] = (i4 >>> 8) & 524287;
	      out[outOffset + 8] = ((i4 << 11) | (i5 >>> 21)) & 524287;
	      out[outOffset + 9] = (i5 >>> 2) & 524287;
	      out[outOffset + 10] = ((i5 << 17) | (i6 >>> 15)) & 524287;
	      out[outOffset + 11] = ((i6 << 4) | (i7 >>> 28)) & 524287;
	      out[outOffset + 12] = (i7 >>> 9) & 524287;
	      out[outOffset + 13] = ((i7 << 10) | (i8 >>> 22)) & 524287;
	      out[outOffset + 14] = (i8 >>> 3) & 524287;
	      out[outOffset + 15] = ((i8 << 16) | (i9 >>> 16)) & 524287;
	      out[outOffset + 16] = ((i9 << 3) | (i10 >>> 29)) & 524287;
	      out[outOffset + 17] = (i10 >>> 10) & 524287;
	      out[outOffset + 18] = ((i10 << 9) | (i11 >>> 23)) & 524287;
	      out[outOffset + 19] = (i11 >>> 4) & 524287;
	      out[outOffset + 20] = ((i11 << 15) | (i12 >>> 17)) & 524287;
	      out[outOffset + 21] = ((i12 << 2) | (i13 >>> 30)) & 524287;
	      out[outOffset + 22] = (i13 >>> 11) & 524287;
	      out[outOffset + 23] = ((i13 << 8) | (i14 >>> 24)) & 524287;
	      out[outOffset + 24] = (i14 >>> 5) & 524287;
	      out[outOffset + 25] = ((i14 << 14) | (i15 >>> 18)) & 524287;
	      out[outOffset + 26] = ((i15 << 1) | (i16 >>> 31)) & 524287;
	      out[outOffset + 27] = (i16 >>> 12) & 524287;
	      out[outOffset + 28] = ((i16 << 7) | (i17 >>> 25)) & 524287;
	      out[outOffset + 29] = (i17 >>> 6) & 524287;
	      out[outOffset + 30] = ((i17 << 13) | (i18 >>> 19)) & 524287;
	      out[outOffset + 31] = i18 & 524287;
		
		inpos.add(77);
		outpos.add(32);
	}

	protected static void fastunpack20(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
	      out[outOffset + 10] = (i6 >>> 4) & 1048575;
	      out[outOffset + 11] = ((i6 << 16) | (i7 >>> 16)) & 1048575;
	      out[outOffset + 12] = ((i7 << 4) | (i8 >>> 28)) & 1048575;
	      out[outOffset + 13] = (i8 >>> 8) & 1048575;
	      out[outOffset + 14] = ((i8 << 12) | (i9 >>> 20)) & 1048575;
	      out[outOffset + 15] = i9 & 1048575;
	      out[outOffset + 16] = (i10 >>> 12);
	      out[outOffset + 17] = ((i10 << 8) | (i11 >>> 24)) & 1048575;
	      out[outOffset + 18] = (i11 >>> 4) & 1048575;
	      out[outOffset + 19] = ((i11 << 16) | (i12 >>> 16)) & 1048575;
	      out[outOffset + 20] = ((i12 << 4) | (i13 >>> 28)) & 1048575;
	      out[outOffset + 21] = (i13 >>> 8) & 1048575;
	      out[outOffset + 22] = ((i13 << 12) | (i14 >>> 20)) & 1048575;
	      out[outOffset + 23] = i14 & 1048575;
	      out[outOffset + 24] = (i15 >>> 12);
	      out[outOffset + 25] = ((i15 << 8) | (i16 >>> 24)) & 1048575;
	      out[outOffset + 26] = (i16 >>> 4) & 1048575;
	      out[outOffset + 27] = ((i16 << 16) | (i17 >>> 16)) & 1048575;
	      out[outOffset + 28] = ((i17 << 4) | (i18 >>> 28)) & 1048575;
	      out[outOffset + 29] = (i18 >>> 8) & 1048575;
	      out[outOffset + 30] = ((i18 << 12) | (i19 >>> 20)) & 1048575;
	      out[outOffset + 31] = i19 & 1048575;
		
		inpos.add(81);
		outpos.add(32);
	}

	protected static void fastunpack21(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 11);
	      out[outOffset + 1] = ((i0 << 10) | (i1 >>> 22)) & 2097151;
	      out[outOffset + 2] = (i1 >>> 1) & 2097151;
	      out[outOffset + 3] = ((i1 << 20) | (i2 >>> 12)) & 2097151;
	      out[outOffset + 4] = ((i2 << 9) | (i3 >>> 23)) & 2097151;
	      out[outOffset + 5] = (i3 >>> 2) & 2097151;
	      out[outOffset + 6] = ((i3 << 19) | (i4 >>> 13)) & 2097151;
	      out[outOffset + 7] = ((i4 << 8) | (i5 >>> 24)) & 2097151;
	      out[outOffset + 8] = (i5 >>> 3) & 2097151;
	      out[outOffset + 9] = ((i5 << 18) | (i6 >>> 14)) & 2097151;
	      out[outOffset + 10] = ((i6 << 7) | (i7 >>> 25)) & 2097151;
	      out[outOffset + 11] = (i7 >>> 4) & 2097151;
	      out[outOffset + 12] = ((i7 << 17) | (i8 >>> 15)) & 2097151;
	      out[outOffset + 13] = ((i8 << 6) | (i9 >>> 26)) & 2097151;
	      out[outOffset + 14] = (i9 >>> 5) & 2097151;
	      out[outOffset + 15] = ((i9 << 16) | (i10 >>> 16)) & 2097151;
	      out[outOffset + 16] = ((i10 << 5) | (i11 >>> 27)) & 2097151;
	      out[outOffset + 17] = (i11 >>> 6) & 2097151;
	      out[outOffset + 18] = ((i11 << 15) | (i12 >>> 17)) & 2097151;
	      out[outOffset + 19] = ((i12 << 4) | (i13 >>> 28)) & 2097151;
	      out[outOffset + 20] = (i13 >>> 7) & 2097151;
	      out[outOffset + 21] = ((i13 << 14) | (i14 >>> 18)) & 2097151;
	      out[outOffset + 22] = ((i14 << 3) | (i15 >>> 29)) & 2097151;
	      out[outOffset + 23] = (i15 >>> 8) & 2097151;
	      out[outOffset + 24] = ((i15 << 13) | (i16 >>> 19)) & 2097151;
	      out[outOffset + 25] = ((i16 << 2) | (i17 >>> 30)) & 2097151;
	      out[outOffset + 26] = (i17 >>> 9) & 2097151;
	      out[outOffset + 27] = ((i17 << 12) | (i18 >>> 20)) & 2097151;
	      out[outOffset + 28] = ((i18 << 1) | (i19 >>> 31)) & 2097151;
	      out[outOffset + 29] = (i19 >>> 10) & 2097151;
	      out[outOffset + 30] = ((i19 << 11) | (i20 >>> 21)) & 2097151;
	      out[outOffset + 31] = i20 & 2097151;
		
		inpos.add(85);
		outpos.add(32);
	}

	protected static void fastunpack22(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 10);
	      out[outOffset + 1] = ((i0 << 12) | (i1 >>> 20)) & 4194303;
	      out[outOffset + 2] = ((i1 << 2) | (i2 >>> 30)) & 4194303;
	      out[outOffset + 3] = (i2 >>> 8) & 4194303;
	      out[outOffset + 4] = ((i2 << 14) | (i3 >>> 18)) & 4194303;
	      out[outOffset + 5] = ((i3 << 4) | (i4 >>> 28)) & 4194303;
	      out[outOffset + 6] = (i4 >>> 6) & 4194303;
	      out[outOffset + 7] = ((i4 << 16) | (i5 >>> 16)) & 4194303;
	      out[outOffset + 8] = ((i5 << 6) | (i6 >>> 26)) & 4194303;
	      out[outOffset + 9] = (i6 >>> 4) & 4194303;
	      out[outOffset + 10] = ((i6 << 18) | (i7 >>> 14)) & 4194303;
	      out[outOffset + 11] = ((i7 << 8) | (i8 >>> 24)) & 4194303;
	      out[outOffset + 12] = (i8 >>> 2) & 4194303;
	      out[outOffset + 13] = ((i8 << 20) | (i9 >>> 12)) & 4194303;
	      out[outOffset + 14] = ((i9 << 10) | (i10 >>> 22)) & 4194303;
	      out[outOffset + 15] = i10 & 4194303;
	      out[outOffset + 16] = (i11 >>> 10);
	      out[outOffset + 17] = ((i11 << 12) | (i12 >>> 20)) & 4194303;
	      out[outOffset + 18] = ((i12 << 2) | (i13 >>> 30)) & 4194303;
	      out[outOffset + 19] = (i13 >>> 8) & 4194303;
	      out[outOffset + 20] = ((i13 << 14) | (i14 >>> 18)) & 4194303;
	      out[outOffset + 21] = ((i14 << 4) | (i15 >>> 28)) & 4194303;
	      out[outOffset + 22] = (i15 >>> 6) & 4194303;
	      out[outOffset + 23] = ((i15 << 16) | (i16 >>> 16)) & 4194303;
	      out[outOffset + 24] = ((i16 << 6) | (i17 >>> 26)) & 4194303;
	      out[outOffset + 25] = (i17 >>> 4) & 4194303;
	      out[outOffset + 26] = ((i17 << 18) | (i18 >>> 14)) & 4194303;
	      out[outOffset + 27] = ((i18 << 8) | (i19 >>> 24)) & 4194303;
	      out[outOffset + 28] = (i19 >>> 2) & 4194303;
	      out[outOffset + 29] = ((i19 << 20) | (i20 >>> 12)) & 4194303;
	      out[outOffset + 30] = ((i20 << 10) | (i21 >>> 22)) & 4194303;
	      out[outOffset + 31] = i21 & 4194303;
		
		inpos.add(89);
		outpos.add(32);
	}

	protected static void fastunpack23(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 9);
	      out[outOffset + 1] = ((i0 << 14) | (i1 >>> 18)) & 8388607;
	      out[outOffset + 2] = ((i1 << 5) | (i2 >>> 27)) & 8388607;
	      out[outOffset + 3] = (i2 >>> 4) & 8388607;
	      out[outOffset + 4] = ((i2 << 19) | (i3 >>> 13)) & 8388607;
	      out[outOffset + 5] = ((i3 << 10) | (i4 >>> 22)) & 8388607;
	      out[outOffset + 6] = ((i4 << 1) | (i5 >>> 31)) & 8388607;
	      out[outOffset + 7] = (i5 >>> 8) & 8388607;
	      out[outOffset + 8] = ((i5 << 15) | (i6 >>> 17)) & 8388607;
	      out[outOffset + 9] = ((i6 << 6) | (i7 >>> 26)) & 8388607;
	      out[outOffset + 10] = (i7 >>> 3) & 8388607;
	      out[outOffset + 11] = ((i7 << 20) | (i8 >>> 12)) & 8388607;
	      out[outOffset + 12] = ((i8 << 11) | (i9 >>> 21)) & 8388607;
	      out[outOffset + 13] = ((i9 << 2) | (i10 >>> 30)) & 8388607;
	      out[outOffset + 14] = (i10 >>> 7) & 8388607;
	      out[outOffset + 15] = ((i10 << 16) | (i11 >>> 16)) & 8388607;
	      out[outOffset + 16] = ((i11 << 7) | (i12 >>> 25)) & 8388607;
	      out[outOffset + 17] = (i12 >>> 2) & 8388607;
	      out[outOffset + 18] = ((i12 << 21) | (i13 >>> 11)) & 8388607;
	      out[outOffset + 19] = ((i13 << 12) | (i14 >>> 20)) & 8388607;
	      out[outOffset + 20] = ((i14 << 3) | (i15 >>> 29)) & 8388607;
	      out[outOffset + 21] = (i15 >>> 6) & 8388607;
	      out[outOffset + 22] = ((i15 << 17) | (i16 >>> 15)) & 8388607;
	      out[outOffset + 23] = ((i16 << 8) | (i17 >>> 24)) & 8388607;
	      out[outOffset + 24] = (i17 >>> 1) & 8388607;
	      out[outOffset + 25] = ((i17 << 22) | (i18 >>> 10)) & 8388607;
	      out[outOffset + 26] = ((i18 << 13) | (i19 >>> 19)) & 8388607;
	      out[outOffset + 27] = ((i19 << 4) | (i20 >>> 28)) & 8388607;
	      out[outOffset + 28] = (i20 >>> 5) & 8388607;
	      out[outOffset + 29] = ((i20 << 18) | (i21 >>> 14)) & 8388607;
	      out[outOffset + 30] = ((i21 << 9) | (i22 >>> 23)) & 8388607;
	      out[outOffset + 31] = i22 & 8388607;
		
		inpos.add(93);
		outpos.add(32);
	}

	protected static void fastunpack24(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 8);
	      out[outOffset + 1] = ((i0 << 16) | (i1 >>> 16)) & 16777215;
	      out[outOffset + 2] = ((i1 << 8) | (i2 >>> 24)) & 16777215;
	      out[outOffset + 3] = i2 & 16777215;
	      out[outOffset + 4] = (i3 >>> 8);
	      out[outOffset + 5] = ((i3 << 16) | (i4 >>> 16)) & 16777215;
	      out[outOffset + 6] = ((i4 << 8) | (i5 >>> 24)) & 16777215;
	      out[outOffset + 7] = i5 & 16777215;
	      out[outOffset + 8] = (i6 >>> 8);
	      out[outOffset + 9] = ((i6 << 16) | (i7 >>> 16)) & 16777215;
	      out[outOffset + 10] = ((i7 << 8) | (i8 >>> 24)) & 16777215;
	      out[outOffset + 11] = i8 & 16777215;
	      out[outOffset + 12] = (i9 >>> 8);
	      out[outOffset + 13] = ((i9 << 16) | (i10 >>> 16)) & 16777215;
	      out[outOffset + 14] = ((i10 << 8) | (i11 >>> 24)) & 16777215;
	      out[outOffset + 15] = i11 & 16777215;
	      out[outOffset + 16] = (i12 >>> 8);
	      out[outOffset + 17] = ((i12 << 16) | (i13 >>> 16)) & 16777215;
	      out[outOffset + 18] = ((i13 << 8) | (i14 >>> 24)) & 16777215;
	      out[outOffset + 19] = i14 & 16777215;
	      out[outOffset + 20] = (i15 >>> 8);
	      out[outOffset + 21] = ((i15 << 16) | (i16 >>> 16)) & 16777215;
	      out[outOffset + 22] = ((i16 << 8) | (i17 >>> 24)) & 16777215;
	      out[outOffset + 23] = i17 & 16777215;
	      out[outOffset + 24] = (i18 >>> 8);
	      out[outOffset + 25] = ((i18 << 16) | (i19 >>> 16)) & 16777215;
	      out[outOffset + 26] = ((i19 << 8) | (i20 >>> 24)) & 16777215;
	      out[outOffset + 27] = i20 & 16777215;
	      out[outOffset + 28] = (i21 >>> 8);
	      out[outOffset + 29] = ((i21 << 16) | (i22 >>> 16)) & 16777215;
	      out[outOffset + 30] = ((i22 << 8) | (i23 >>> 24)) & 16777215;
	      out[outOffset + 31] = i23 & 16777215;
		
		inpos.add(97);
		outpos.add(32);
	}

	protected static void fastunpack25(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 7);
	      out[outOffset + 1] = ((i0 << 18) | (i1 >>> 14)) & 33554431;
	      out[outOffset + 2] = ((i1 << 11) | (i2 >>> 21)) & 33554431;
	      out[outOffset + 3] = ((i2 << 4) | (i3 >>> 28)) & 33554431;
	      out[outOffset + 4] = (i3 >>> 3) & 33554431;
	      out[outOffset + 5] = ((i3 << 22) | (i4 >>> 10)) & 33554431;
	      out[outOffset + 6] = ((i4 << 15) | (i5 >>> 17)) & 33554431;
	      out[outOffset + 7] = ((i5 << 8) | (i6 >>> 24)) & 33554431;
	      out[outOffset + 8] = ((i6 << 1) | (i7 >>> 31)) & 33554431;
	      out[outOffset + 9] = (i7 >>> 6) & 33554431;
	      out[outOffset + 10] = ((i7 << 19) | (i8 >>> 13)) & 33554431;
	      out[outOffset + 11] = ((i8 << 12) | (i9 >>> 20)) & 33554431;
	      out[outOffset + 12] = ((i9 << 5) | (i10 >>> 27)) & 33554431;
	      out[outOffset + 13] = (i10 >>> 2) & 33554431;
	      out[outOffset + 14] = ((i10 << 23) | (i11 >>> 9)) & 33554431;
	      out[outOffset + 15] = ((i11 << 16) | (i12 >>> 16)) & 33554431;
	      out[outOffset + 16] = ((i12 << 9) | (i13 >>> 23)) & 33554431;
	      out[outOffset + 17] = ((i13 << 2) | (i14 >>> 30)) & 33554431;
	      out[outOffset + 18] = (i14 >>> 5) & 33554431;
	      out[outOffset + 19] = ((i14 << 20) | (i15 >>> 12)) & 33554431;
	      out[outOffset + 20] = ((i15 << 13) | (i16 >>> 19)) & 33554431;
	      out[outOffset + 21] = ((i16 << 6) | (i17 >>> 26)) & 33554431;
	      out[outOffset + 22] = (i17 >>> 1) & 33554431;
	      out[outOffset + 23] = ((i17 << 24) | (i18 >>> 8)) & 33554431;
	      out[outOffset + 24] = ((i18 << 17) | (i19 >>> 15)) & 33554431;
	      out[outOffset + 25] = ((i19 << 10) | (i20 >>> 22)) & 33554431;
	      out[outOffset + 26] = ((i20 << 3) | (i21 >>> 29)) & 33554431;
	      out[outOffset + 27] = (i21 >>> 4) & 33554431;
	      out[outOffset + 28] = ((i21 << 21) | (i22 >>> 11)) & 33554431;
	      out[outOffset + 29] = ((i22 << 14) | (i23 >>> 18)) & 33554431;
	      out[outOffset + 30] = ((i23 << 7) | (i24 >>> 25)) & 33554431;
	      out[outOffset + 31] = i24 & 33554431;
		
		inpos.add(101);
		outpos.add(32);
	}

	protected static void fastunpack26(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 6);
	      out[outOffset + 1] = ((i0 << 20) | (i1 >>> 12)) & 67108863;
	      out[outOffset + 2] = ((i1 << 14) | (i2 >>> 18)) & 67108863;
	      out[outOffset + 3] = ((i2 << 8) | (i3 >>> 24)) & 67108863;
	      out[outOffset + 4] = ((i3 << 2) | (i4 >>> 30)) & 67108863;
	      out[outOffset + 5] = (i4 >>> 4) & 67108863;
	      out[outOffset + 6] = ((i4 << 22) | (i5 >>> 10)) & 67108863;
	      out[outOffset + 7] = ((i5 << 16) | (i6 >>> 16)) & 67108863;
	      out[outOffset + 8] = ((i6 << 10) | (i7 >>> 22)) & 67108863;
	      out[outOffset + 9] = ((i7 << 4) | (i8 >>> 28)) & 67108863;
	      out[outOffset + 10] = (i8 >>> 2) & 67108863;
	      out[outOffset + 11] = ((i8 << 24) | (i9 >>> 8)) & 67108863;
	      out[outOffset + 12] = ((i9 << 18) | (i10 >>> 14)) & 67108863;
	      out[outOffset + 13] = ((i10 << 12) | (i11 >>> 20)) & 67108863;
	      out[outOffset + 14] = ((i11 << 6) | (i12 >>> 26)) & 67108863;
	      out[outOffset + 15] = i12 & 67108863;
	      out[outOffset + 16] = (i13 >>> 6);
	      out[outOffset + 17] = ((i13 << 20) | (i14 >>> 12)) & 67108863;
	      out[outOffset + 18] = ((i14 << 14) | (i15 >>> 18)) & 67108863;
	      out[outOffset + 19] = ((i15 << 8) | (i16 >>> 24)) & 67108863;
	      out[outOffset + 20] = ((i16 << 2) | (i17 >>> 30)) & 67108863;
	      out[outOffset + 21] = (i17 >>> 4) & 67108863;
	      out[outOffset + 22] = ((i17 << 22) | (i18 >>> 10)) & 67108863;
	      out[outOffset + 23] = ((i18 << 16) | (i19 >>> 16)) & 67108863;
	      out[outOffset + 24] = ((i19 << 10) | (i20 >>> 22)) & 67108863;
	      out[outOffset + 25] = ((i20 << 4) | (i21 >>> 28)) & 67108863;
	      out[outOffset + 26] = (i21 >>> 2) & 67108863;
	      out[outOffset + 27] = ((i21 << 24) | (i22 >>> 8)) & 67108863;
	      out[outOffset + 28] = ((i22 << 18) | (i23 >>> 14)) & 67108863;
	      out[outOffset + 29] = ((i23 << 12) | (i24 >>> 20)) & 67108863;
	      out[outOffset + 30] = ((i24 << 6) | (i25 >>> 26)) & 67108863;
	      out[outOffset + 31] = i25 & 67108863;
		
		inpos.add(105);
		outpos.add(32);
	}

	protected static void fastunpack27(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 5);
	      out[outOffset + 1] = ((i0 << 22) | (i1 >>> 10)) & 134217727;
	      out[outOffset + 2] = ((i1 << 17) | (i2 >>> 15)) & 134217727;
	      out[outOffset + 3] = ((i2 << 12) | (i3 >>> 20)) & 134217727;
	      out[outOffset + 4] = ((i3 << 7) | (i4 >>> 25)) & 134217727;
	      out[outOffset + 5] = ((i4 << 2) | (i5 >>> 30)) & 134217727;
	      out[outOffset + 6] = (i5 >>> 3) & 134217727;
	      out[outOffset + 7] = ((i5 << 24) | (i6 >>> 8)) & 134217727;
	      out[outOffset + 8] = ((i6 << 19) | (i7 >>> 13)) & 134217727;
	      out[outOffset + 9] = ((i7 << 14) | (i8 >>> 18)) & 134217727;
	      out[outOffset + 10] = ((i8 << 9) | (i9 >>> 23)) & 134217727;
	      out[outOffset + 11] = ((i9 << 4) | (i10 >>> 28)) & 134217727;
	      out[outOffset + 12] = (i10 >>> 1) & 134217727;
	      out[outOffset + 13] = ((i10 << 26) | (i11 >>> 6)) & 134217727;
	      out[outOffset + 14] = ((i11 << 21) | (i12 >>> 11)) & 134217727;
	      out[outOffset + 15] = ((i12 << 16) | (i13 >>> 16)) & 134217727;
	      out[outOffset + 16] = ((i13 << 11) | (i14 >>> 21)) & 134217727;
	      out[outOffset + 17] = ((i14 << 6) | (i15 >>> 26)) & 134217727;
	      out[outOffset + 18] = ((i15 << 1) | (i16 >>> 31)) & 134217727;
	      out[outOffset + 19] = (i16 >>> 4) & 134217727;
	      out[outOffset + 20] = ((i16 << 23) | (i17 >>> 9)) & 134217727;
	      out[outOffset + 21] = ((i17 << 18) | (i18 >>> 14)) & 134217727;
	      out[outOffset + 22] = ((i18 << 13) | (i19 >>> 19)) & 134217727;
	      out[outOffset + 23] = ((i19 << 8) | (i20 >>> 24)) & 134217727;
	      out[outOffset + 24] = ((i20 << 3) | (i21 >>> 29)) & 134217727;
	      out[outOffset + 25] = (i21 >>> 2) & 134217727;
	      out[outOffset + 26] = ((i21 << 25) | (i22 >>> 7)) & 134217727;
	      out[outOffset + 27] = ((i22 << 20) | (i23 >>> 12)) & 134217727;
	      out[outOffset + 28] = ((i23 << 15) | (i24 >>> 17)) & 134217727;
	      out[outOffset + 29] = ((i24 << 10) | (i25 >>> 22)) & 134217727;
	      out[outOffset + 30] = ((i25 << 5) | (i26 >>> 27)) & 134217727;
	      out[outOffset + 31] = i26 & 134217727;
		
		inpos.add(109);
		outpos.add(32);
	}

	protected static void fastunpack28(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 4);
	      out[outOffset + 1] = ((i0 << 24) | (i1 >>> 8)) & 268435455;
	      out[outOffset + 2] = ((i1 << 20) | (i2 >>> 12)) & 268435455;
	      out[outOffset + 3] = ((i2 << 16) | (i3 >>> 16)) & 268435455;
	      out[outOffset + 4] = ((i3 << 12) | (i4 >>> 20)) & 268435455;
	      out[outOffset + 5] = ((i4 << 8) | (i5 >>> 24)) & 268435455;
	      out[outOffset + 6] = ((i5 << 4) | (i6 >>> 28)) & 268435455;
	      out[outOffset + 7] = i6 & 268435455;
	      out[outOffset + 8] = (i7 >>> 4);
	      out[outOffset + 9] = ((i7 << 24) | (i8 >>> 8)) & 268435455;
	      out[outOffset + 10] = ((i8 << 20) | (i9 >>> 12)) & 268435455;
	      out[outOffset + 11] = ((i9 << 16) | (i10 >>> 16)) & 268435455;
	      out[outOffset + 12] = ((i10 << 12) | (i11 >>> 20)) & 268435455;
	      out[outOffset + 13] = ((i11 << 8) | (i12 >>> 24)) & 268435455;
	      out[outOffset + 14] = ((i12 << 4) | (i13 >>> 28)) & 268435455;
	      out[outOffset + 15] = i13 & 268435455;
	      out[outOffset + 16] = (i14 >>> 4);
	      out[outOffset + 17] = ((i14 << 24) | (i15 >>> 8)) & 268435455;
	      out[outOffset + 18] = ((i15 << 20) | (i16 >>> 12)) & 268435455;
	      out[outOffset + 19] = ((i16 << 16) | (i17 >>> 16)) & 268435455;
	      out[outOffset + 20] = ((i17 << 12) | (i18 >>> 20)) & 268435455;
	      out[outOffset + 21] = ((i18 << 8) | (i19 >>> 24)) & 268435455;
	      out[outOffset + 22] = ((i19 << 4) | (i20 >>> 28)) & 268435455;
	      out[outOffset + 23] = i20 & 268435455;
	      out[outOffset + 24] = (i21 >>> 4);
	      out[outOffset + 25] = ((i21 << 24) | (i22 >>> 8)) & 268435455;
	      out[outOffset + 26] = ((i22 << 20) | (i23 >>> 12)) & 268435455;
	      out[outOffset + 27] = ((i23 << 16) | (i24 >>> 16)) & 268435455;
	      out[outOffset + 28] = ((i24 << 12) | (i25 >>> 20)) & 268435455;
	      out[outOffset + 29] = ((i25 << 8) | (i26 >>> 24)) & 268435455;
	      out[outOffset + 30] = ((i26 << 4) | (i27 >>> 28)) & 268435455;
	      out[outOffset + 31] = i27 & 268435455;
		
		inpos.add(113);
		outpos.add(32);
	}

	protected static void fastunpack29(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 3);
	      out[outOffset + 1] = ((i0 << 26) | (i1 >>> 6)) & 536870911;
	      out[outOffset + 2] = ((i1 << 23) | (i2 >>> 9)) & 536870911;
	      out[outOffset + 3] = ((i2 << 20) | (i3 >>> 12)) & 536870911;
	      out[outOffset + 4] = ((i3 << 17) | (i4 >>> 15)) & 536870911;
	      out[outOffset + 5] = ((i4 << 14) | (i5 >>> 18)) & 536870911;
	      out[outOffset + 6] = ((i5 << 11) | (i6 >>> 21)) & 536870911;
	      out[outOffset + 7] = ((i6 << 8) | (i7 >>> 24)) & 536870911;
	      out[outOffset + 8] = ((i7 << 5) | (i8 >>> 27)) & 536870911;
	      out[outOffset + 9] = ((i8 << 2) | (i9 >>> 30)) & 536870911;
	      out[outOffset + 10] = (i9 >>> 1) & 536870911;
	      out[outOffset + 11] = ((i9 << 28) | (i10 >>> 4)) & 536870911;
	      out[outOffset + 12] = ((i10 << 25) | (i11 >>> 7)) & 536870911;
	      out[outOffset + 13] = ((i11 << 22) | (i12 >>> 10)) & 536870911;
	      out[outOffset + 14] = ((i12 << 19) | (i13 >>> 13)) & 536870911;
	      out[outOffset + 15] = ((i13 << 16) | (i14 >>> 16)) & 536870911;
	      out[outOffset + 16] = ((i14 << 13) | (i15 >>> 19)) & 536870911;
	      out[outOffset + 17] = ((i15 << 10) | (i16 >>> 22)) & 536870911;
	      out[outOffset + 18] = ((i16 << 7) | (i17 >>> 25)) & 536870911;
	      out[outOffset + 19] = ((i17 << 4) | (i18 >>> 28)) & 536870911;
	      out[outOffset + 20] = ((i18 << 1) | (i19 >>> 31)) & 536870911;
	      out[outOffset + 21] = (i19 >>> 2) & 536870911;
	      out[outOffset + 22] = ((i19 << 27) | (i20 >>> 5)) & 536870911;
	      out[outOffset + 23] = ((i20 << 24) | (i21 >>> 8)) & 536870911;
	      out[outOffset + 24] = ((i21 << 21) | (i22 >>> 11)) & 536870911;
	      out[outOffset + 25] = ((i22 << 18) | (i23 >>> 14)) & 536870911;
	      out[outOffset + 26] = ((i23 << 15) | (i24 >>> 17)) & 536870911;
	      out[outOffset + 27] = ((i24 << 12) | (i25 >>> 20)) & 536870911;
	      out[outOffset + 28] = ((i25 << 9) | (i26 >>> 23)) & 536870911;
	      out[outOffset + 29] = ((i26 << 6) | (i27 >>> 26)) & 536870911;
	      out[outOffset + 30] = ((i27 << 3) | (i28 >>> 29)) & 536870911;
	      out[outOffset + 31] = i28 & 536870911;
		
		inpos.add(117);
		outpos.add(32);
	}

	protected static void fastunpack30(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));
	      final int i29 = ((in[inOffset + 116] & 0xFF) << 24) | ((in[inOffset + 117] & 0xFF) << 16) | ((in[inOffset + 118] & 0xFF) << 8) | ((in[inOffset + 119] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 2);
	      out[outOffset + 1] = ((i0 << 28) | (i1 >>> 4)) & 1073741823;
	      out[outOffset + 2] = ((i1 << 26) | (i2 >>> 6)) & 1073741823;
	      out[outOffset + 3] = ((i2 << 24) | (i3 >>> 8)) & 1073741823;
	      out[outOffset + 4] = ((i3 << 22) | (i4 >>> 10)) & 1073741823;
	      out[outOffset + 5] = ((i4 << 20) | (i5 >>> 12)) & 1073741823;
	      out[outOffset + 6] = ((i5 << 18) | (i6 >>> 14)) & 1073741823;
	      out[outOffset + 7] = ((i6 << 16) | (i7 >>> 16)) & 1073741823;
	      out[outOffset + 8] = ((i7 << 14) | (i8 >>> 18)) & 1073741823;
	      out[outOffset + 9] = ((i8 << 12) | (i9 >>> 20)) & 1073741823;
	      out[outOffset + 10] = ((i9 << 10) | (i10 >>> 22)) & 1073741823;
	      out[outOffset + 11] = ((i10 << 8) | (i11 >>> 24)) & 1073741823;
	      out[outOffset + 12] = ((i11 << 6) | (i12 >>> 26)) & 1073741823;
	      out[outOffset + 13] = ((i12 << 4) | (i13 >>> 28)) & 1073741823;
	      out[outOffset + 14] = ((i13 << 2) | (i14 >>> 30)) & 1073741823;
	      out[outOffset + 15] = i14 & 1073741823;
	      out[outOffset + 16] = (i15 >>> 2);
	      out[outOffset + 17] = ((i15 << 28) | (i16 >>> 4)) & 1073741823;
	      out[outOffset + 18] = ((i16 << 26) | (i17 >>> 6)) & 1073741823;
	      out[outOffset + 19] = ((i17 << 24) | (i18 >>> 8)) & 1073741823;
	      out[outOffset + 20] = ((i18 << 22) | (i19 >>> 10)) & 1073741823;
	      out[outOffset + 21] = ((i19 << 20) | (i20 >>> 12)) & 1073741823;
	      out[outOffset + 22] = ((i20 << 18) | (i21 >>> 14)) & 1073741823;
	      out[outOffset + 23] = ((i21 << 16) | (i22 >>> 16)) & 1073741823;
	      out[outOffset + 24] = ((i22 << 14) | (i23 >>> 18)) & 1073741823;
	      out[outOffset + 25] = ((i23 << 12) | (i24 >>> 20)) & 1073741823;
	      out[outOffset + 26] = ((i24 << 10) | (i25 >>> 22)) & 1073741823;
	      out[outOffset + 27] = ((i25 << 8) | (i26 >>> 24)) & 1073741823;
	      out[outOffset + 28] = ((i26 << 6) | (i27 >>> 26)) & 1073741823;
	      out[outOffset + 29] = ((i27 << 4) | (i28 >>> 28)) & 1073741823;
	      out[outOffset + 30] = ((i28 << 2) | (i29 >>> 30)) & 1073741823;
	      out[outOffset + 31] = i29 & 1073741823;
		
		inpos.add(121);
		outpos.add(32);
	}

	protected static void fastunpack31(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));
	      final int i29 = ((in[inOffset + 116] & 0xFF) << 24) | ((in[inOffset + 117] & 0xFF) << 16) | ((in[inOffset + 118] & 0xFF) << 8) | ((in[inOffset + 119] & 0xFF));
	      final int i30 = ((in[inOffset + 120] & 0xFF) << 24) | ((in[inOffset + 121] & 0xFF) << 16) | ((in[inOffset + 122] & 0xFF) << 8) | ((in[inOffset + 123] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 1);
	      out[outOffset + 1] = ((i0 << 30) | (i1 >>> 2)) & 2147483647;
	      out[outOffset + 2] = ((i1 << 29) | (i2 >>> 3)) & 2147483647;
	      out[outOffset + 3] = ((i2 << 28) | (i3 >>> 4)) & 2147483647;
	      out[outOffset + 4] = ((i3 << 27) | (i4 >>> 5)) & 2147483647;
	      out[outOffset + 5] = ((i4 << 26) | (i5 >>> 6)) & 2147483647;
	      out[outOffset + 6] = ((i5 << 25) | (i6 >>> 7)) & 2147483647;
	      out[outOffset + 7] = ((i6 << 24) | (i7 >>> 8)) & 2147483647;
	      out[outOffset + 8] = ((i7 << 23) | (i8 >>> 9)) & 2147483647;
	      out[outOffset + 9] = ((i8 << 22) | (i9 >>> 10)) & 2147483647;
	      out[outOffset + 10] = ((i9 << 21) | (i10 >>> 11)) & 2147483647;
	      out[outOffset + 11] = ((i10 << 20) | (i11 >>> 12)) & 2147483647;
	      out[outOffset + 12] = ((i11 << 19) | (i12 >>> 13)) & 2147483647;
	      out[outOffset + 13] = ((i12 << 18) | (i13 >>> 14)) & 2147483647;
	      out[outOffset + 14] = ((i13 << 17) | (i14 >>> 15)) & 2147483647;
	      out[outOffset + 15] = ((i14 << 16) | (i15 >>> 16)) & 2147483647;
	      out[outOffset + 16] = ((i15 << 15) | (i16 >>> 17)) & 2147483647;
	      out[outOffset + 17] = ((i16 << 14) | (i17 >>> 18)) & 2147483647;
	      out[outOffset + 18] = ((i17 << 13) | (i18 >>> 19)) & 2147483647;
	      out[outOffset + 19] = ((i18 << 12) | (i19 >>> 20)) & 2147483647;
	      out[outOffset + 20] = ((i19 << 11) | (i20 >>> 21)) & 2147483647;
	      out[outOffset + 21] = ((i20 << 10) | (i21 >>> 22)) & 2147483647;
	      out[outOffset + 22] = ((i21 << 9) | (i22 >>> 23)) & 2147483647;
	      out[outOffset + 23] = ((i22 << 8) | (i23 >>> 24)) & 2147483647;
	      out[outOffset + 24] = ((i23 << 7) | (i24 >>> 25)) & 2147483647;
	      out[outOffset + 25] = ((i24 << 6) | (i25 >>> 26)) & 2147483647;
	      out[outOffset + 26] = ((i25 << 5) | (i26 >>> 27)) & 2147483647;
	      out[outOffset + 27] = ((i26 << 4) | (i27 >>> 28)) & 2147483647;
	      out[outOffset + 28] = ((i27 << 3) | (i28 >>> 29)) & 2147483647;
	      out[outOffset + 29] = ((i28 << 2) | (i29 >>> 30)) & 2147483647;
	      out[outOffset + 30] = ((i29 << 1) | (i30 >>> 31)) & 2147483647;
	      out[outOffset + 31] = i30 & 2147483647;
		
		inpos.add(125);
		outpos.add(32);
	}

	protected static void fastunpack32(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));
	      final int i29 = ((in[inOffset + 116] & 0xFF) << 24) | ((in[inOffset + 117] & 0xFF) << 16) | ((in[inOffset + 118] & 0xFF) << 8) | ((in[inOffset + 119] & 0xFF));
	      final int i30 = ((in[inOffset + 120] & 0xFF) << 24) | ((in[inOffset + 121] & 0xFF) << 16) | ((in[inOffset + 122] & 0xFF) << 8) | ((in[inOffset + 123] & 0xFF));
	      final int i31 = ((in[inOffset + 124] & 0xFF) << 24) | ((in[inOffset + 125] & 0xFF) << 16) | ((in[inOffset + 126] & 0xFF) << 8) | ((in[inOffset + 127] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      out[outOffset + 10] = i10;
	      out[outOffset + 11] = i11;
	      out[outOffset + 12] = i12;
	      out[outOffset + 13] = i13;
	      out[outOffset + 14] = i14;
	      out[outOffset + 15] = i15;
	      out[outOffset + 16] = i16;
	      out[outOffset + 17] = i17;
	      out[outOffset + 18] = i18;
	      out[outOffset + 19] = i19;
	      out[outOffset + 20] = i20;
	      out[outOffset + 21] = i21;
	      out[outOffset + 22] = i22;
	      out[outOffset + 23] = i23;
	      out[outOffset + 24] = i24;
	      out[outOffset + 25] = i25;
	      out[outOffset + 26] = i26;
	      out[outOffset + 27] = i27;
	      out[outOffset + 28] = i28;
	      out[outOffset + 29] = i29;
	      out[outOffset + 30] = i30;
	      out[outOffset + 31] = i31;
	      
	      inpos.add(129);
	      outpos.add(32);
	}
	
	protected static void fastunpack33(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;
	      out[outOffset + 11] = 0;
	      out[outOffset + 12] = 0;
	      out[outOffset + 13] = 0;
	      out[outOffset + 14] = 0;
	      out[outOffset + 15] = 0;
	      
	      inpos.add(1);
	      outpos.add(16);
	}
	protected static void fastunpack34(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];

	      out[outOffset + 0] = (i0 >>> 7) & 1;
	      out[outOffset + 1] = (i0 >>> 6) & 1;
	      out[outOffset + 2] = (i0 >>> 5) & 1;
	      out[outOffset + 3] = (i0 >>> 4) & 1;
	      out[outOffset + 4] = (i0 >>> 3) & 1;
	      out[outOffset + 5] = (i0 >>> 2) & 1;
	      out[outOffset + 6] = (i0 >>> 1) & 1;
	      out[outOffset + 7] = i0 & 1;
	      out[outOffset + 8] = (i1 >>> 7) & 1;
	      out[outOffset + 9] = (i1 >>> 6) & 1;
	      out[outOffset + 10] = (i1 >>> 5) & 1;
	      out[outOffset + 11] = (i1 >>> 4) & 1;
	      out[outOffset + 12] = (i1 >>> 3) & 1;
	      out[outOffset + 13] = (i1 >>> 2) & 1;
	      out[outOffset + 14] = (i1 >>> 1) & 1;
	      out[outOffset + 15] = i1 & 1;
	      
	      inpos.add(3);
	      outpos.add(16);
	}
	protected static void fastunpack35(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];

	      out[outOffset + 0] = (i0 >>> 6) & 3;
	      out[outOffset + 1] = (i0 >>> 4) & 3;
	      out[outOffset + 2] = (i0 >>> 2) & 3;
	      out[outOffset + 3] = i0 & 3;
	      out[outOffset + 4] = (i1 >>> 6) & 3;
	      out[outOffset + 5] = (i1 >>> 4) & 3;
	      out[outOffset + 6] = (i1 >>> 2) & 3;
	      out[outOffset + 7] = i1 & 3;
	      out[outOffset + 8] = (i2 >>> 6) & 3;
	      out[outOffset + 9] = (i2 >>> 4) & 3;
	      out[outOffset + 10] = (i2 >>> 2) & 3;
	      out[outOffset + 11] = i2 & 3;
	      out[outOffset + 12] = (i3 >>> 6) & 3;
	      out[outOffset + 13] = (i3 >>> 4) & 3;
	      out[outOffset + 14] = (i3 >>> 2) & 3;
	      out[outOffset + 15] = i3 & 3;
	      
	      inpos.add(5);
	      outpos.add(16);
	}
	protected static void fastunpack36(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];

	      out[outOffset + 0] = (i0 >>> 5) & 7;
	      out[outOffset + 1] = (i0 >>> 2) & 7;
	      out[outOffset + 2] = ((i0 & 3) << 1) | (i1 >>> 7) & 1;
	      out[outOffset + 3] = (i1 >>> 4) & 7;
	      out[outOffset + 4] = (i1 >>> 1) & 7;
	      out[outOffset + 5] = ((i1 & 1) << 2) | (i2 >>> 6) & 3;
	      out[outOffset + 6] = (i2 >>> 3) & 7;
	      out[outOffset + 7] = i2 & 7;
	      out[outOffset + 8] = (i3 >>> 5) & 7;
	      out[outOffset + 9] = (i3 >>> 2) & 7;
	      out[outOffset + 10] = ((i3 & 3) << 1) | (i4 >>> 7) & 1;
	      out[outOffset + 11] = (i4 >>> 4) & 7;
	      out[outOffset + 12] = (i4 >>> 1) & 7;
	      out[outOffset + 13] = ((i4 & 1) << 2) | (i5 >>> 6) & 3;
	      out[outOffset + 14] = (i5 >>> 3) & 7;
	      out[outOffset + 15] = i5 & 7;
	      
	      inpos.add(7);
	      outpos.add(16);
	}
	protected static void fastunpack37(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];

	      out[outOffset + 0] = (i0 >>> 4) & 15;
	      out[outOffset + 1] = i0 & 15;
	      out[outOffset + 2] = (i1 >>> 4) & 15;
	      out[outOffset + 3] = i1 & 15;
	      out[outOffset + 4] = (i2 >>> 4) & 15;
	      out[outOffset + 5] = i2 & 15;
	      out[outOffset + 6] = (i3 >>> 4) & 15;
	      out[outOffset + 7] = i3 & 15;
	      out[outOffset + 8] = (i4 >>> 4) & 15;
	      out[outOffset + 9] = i4 & 15;
	      out[outOffset + 10] = (i5 >>> 4) & 15;
	      out[outOffset + 11] = i5 & 15;
	      out[outOffset + 12] = (i6 >>> 4) & 15;
	      out[outOffset + 13] = i6 & 15;
	      out[outOffset + 14] = (i7 >>> 4) & 15;
	      out[outOffset + 15] = i7 & 15;
	      
	      inpos.add(9);
	      outpos.add(16);
	}
	protected static void fastunpack38(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];

	      out[outOffset + 0] = (i0 >>> 3) & 31;
	      out[outOffset + 1] = ((i0 & 7) << 2) | (i1 >>> 6) & 3;
	      out[outOffset + 2] = (i1 >>> 1) & 31;
	      out[outOffset + 3] = ((i1 & 1) << 4) | (i2 >>> 4) & 15;
	      out[outOffset + 4] = ((i2 & 15) << 1) | (i3 >>> 7) & 1;
	      out[outOffset + 5] = (i3 >>> 2) & 31;
	      out[outOffset + 6] = ((i3 & 3) << 3) | (i4 >>> 5) & 7;
	      out[outOffset + 7] = i4 & 31;
	      out[outOffset + 8] = (i5 >>> 3) & 31;
	      out[outOffset + 9] = ((i5 & 7) << 2) | (i6 >>> 6) & 3;
	      out[outOffset + 10] = (i6 >>> 1) & 31;
	      out[outOffset + 11] = ((i6 & 1) << 4) | (i7 >>> 4) & 15;
	      out[outOffset + 12] = ((i7 & 15) << 1) | (i8 >>> 7) & 1;
	      out[outOffset + 13] = (i8 >>> 2) & 31;
	      out[outOffset + 14] = ((i8 & 3) << 3) | (i9 >>> 5) & 7;
	      out[outOffset + 15] = i9 & 31;
	      
	      inpos.add(11);
	      outpos.add(16);
	}
	protected static void fastunpack39(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];

	      out[outOffset + 0] = (i0 >>> 2) & 63;
	      out[outOffset + 1] = ((i0 & 3) << 4) | (i1 >>> 4) & 15;
	      out[outOffset + 2] = ((i1 & 15) << 2) | (i2 >>> 6) & 3;
	      out[outOffset + 3] = i2 & 63;
	      out[outOffset + 4] = (i3 >>> 2) & 63;
	      out[outOffset + 5] = ((i3 & 3) << 4) | (i4 >>> 4) & 15;
	      out[outOffset + 6] = ((i4 & 15) << 2) | (i5 >>> 6) & 3;
	      out[outOffset + 7] = i5 & 63;
	      out[outOffset + 8] = (i6 >>> 2) & 63;
	      out[outOffset + 9] = ((i6 & 3) << 4) | (i7 >>> 4) & 15;
	      out[outOffset + 10] = ((i7 & 15) << 2) | (i8 >>> 6) & 3;
	      out[outOffset + 11] = i8 & 63;
	      out[outOffset + 12] = (i9 >>> 2) & 63;
	      out[outOffset + 13] = ((i9 & 3) << 4) | (i10 >>> 4) & 15;
	      out[outOffset + 14] = ((i10 & 15) << 2) | (i11 >>> 6) & 3;
	      out[outOffset + 15] = i11 & 63;
	      
	      inpos.add(13);
	      outpos.add(16);
	}
	
	protected static void fastunpack40(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];

	      out[outOffset + 0] = (i0 >>> 1) & 127;
	      out[outOffset + 1] = ((i0 & 1) << 6) | (i1 >>> 2) & 63;
	      out[outOffset + 2] = ((i1 & 3) << 5) | (i2 >>> 3) & 31;
	      out[outOffset + 3] = ((i2 & 7) << 4) | (i3 >>> 4) & 15;
	      out[outOffset + 4] = ((i3 & 15) << 3) | (i4 >>> 5) & 7;
	      out[outOffset + 5] = ((i4 & 31) << 2) | (i5 >>> 6) & 3;
	      out[outOffset + 6] = ((i5 & 63) << 1) | (i6 >>> 7) & 1;
	      out[outOffset + 7] = i6 & 127;
	      out[outOffset + 8] = (i7 >>> 1) & 127;
	      out[outOffset + 9] = ((i7 & 1) << 6) | (i8 >>> 2) & 63;
	      out[outOffset + 10] = ((i8 & 3) << 5) | (i9 >>> 3) & 31;
	      out[outOffset + 11] = ((i9 & 7) << 4) | (i10 >>> 4) & 15;
	      out[outOffset + 12] = ((i10 & 15) << 3) | (i11 >>> 5) & 7;
	      out[outOffset + 13] = ((i11 & 31) << 2) | (i12 >>> 6) & 3;
	      out[outOffset + 14] = ((i12 & 63) << 1) | (i13 >>> 7) & 1;
	      out[outOffset + 15] = i13 & 127;
	      
	      inpos.add(15);
	      outpos.add(16);
	}
	//16 8bit
	protected static void fastunpack41(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      out[outOffset] = in[inOffset] & 0xFF;
	      out[outOffset + 1] = in[inOffset + 1] & 0xFF;
	      out[outOffset + 2] = in[inOffset + 2] & 0xFF;
	      out[outOffset + 3] = in[inOffset + 3] & 0xFF;
	      out[outOffset + 4] = in[inOffset + 4] & 0xFF;
	      out[outOffset + 5] = in[inOffset + 5] & 0xFF;
	      out[outOffset + 6] = in[inOffset + 6] & 0xFF;
	      out[outOffset + 7] = in[inOffset + 7] & 0xFF;
	      out[outOffset + 8] = in[inOffset + 8] & 0xFF;
	      out[outOffset + 9] = in[inOffset + 9] & 0xFF;
	      out[outOffset + 10] = in[inOffset + 10] & 0xFF;
	      out[outOffset + 11] = in[inOffset + 11] & 0xFF;
	      out[outOffset + 12] = in[inOffset + 12] & 0xFF;
	      out[outOffset + 13] = in[inOffset + 13] & 0xFF;
	      out[outOffset + 14] = in[inOffset + 14] & 0xFF;
	      out[outOffset + 15] = in[inOffset + 15] & 0xFF;
	      
	      inpos.add(17);
	      outpos.add(16);
	}
	protected static void fastunpack42(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));

	      out[outOffset + 0] = (i0 >>> 7) & 511;
	      out[outOffset + 1] = ((i0 << 2) | (i1 >>> 14 & 3)) & 511;
	      out[outOffset + 2] = (i1 >>> 5) & 511;
	      out[outOffset + 3] = ((i1 << 4) | (i2 >>> 12 & 15)) & 511;
	      out[outOffset + 4] = (i2 >>> 3) & 511;
	      out[outOffset + 5] = ((i2 << 6) | (i3 >>> 10 & 63)) & 511;
	      out[outOffset + 6] = (i3 >>> 1) & 511;
	      out[outOffset + 7] = ((i3 << 8) | (i4 >>> 8 & 255)) & 511;
	      out[outOffset + 8] = ((i4 << 1) | (i5 >>> 15 & 1)) & 511;
	      out[outOffset + 9] = (i5 >>> 6) & 511;
	      out[outOffset + 10] = ((i5 << 3) | (i6 >>> 13 & 7)) & 511;
	      out[outOffset + 11] = (i6 >>> 4) & 511;
	      out[outOffset + 12] = ((i6 << 5) | (i7 >>> 11 & 31)) & 511;
	      out[outOffset + 13] = (i7 >>> 2) & 511;
	      out[outOffset + 14] = ((i7 << 7) | (i8 >>> 9 & 127)) & 511;
	      out[outOffset + 15] = i8 & 511;
		
		inpos.add(19);
		outpos.add(16);
	}
	protected static void fastunpack43(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));

	      out[outOffset + 0] = (i0 >>> 6) & 1023;
	      out[outOffset + 1] = ((i0 << 4) | (i1 >>> 12 & 15)) & 1023;
	      out[outOffset + 2] = (i1 >>> 2) & 1023;
	      out[outOffset + 3] = ((i1 << 8) | (i2 >>> 8 & 255)) & 1023;
	      out[outOffset + 4] = ((i2 << 2) | (i3 >>> 14 & 3)) & 1023;
	      out[outOffset + 5] = (i3 >>> 4) & 1023;
	      out[outOffset + 6] = ((i3 << 6) | (i4 >>> 10 & 63)) & 1023;
	      out[outOffset + 7] = i4 & 1023;
	      out[outOffset + 8] = (i5 >>> 6) & 1023;
	      out[outOffset + 9] = ((i5 << 4) | (i6 >>> 12 & 15)) & 1023;
	      out[outOffset + 10] = (i6 >>> 2) & 1023;
	      out[outOffset + 11] = ((i6 << 8) | (i7 >>> 8 & 255)) & 1023;
	      out[outOffset + 12] = ((i7 << 2) | (i8 >>> 14 & 3)) & 1023;
	      out[outOffset + 13] = (i8 >>> 4) & 1023;
	      out[outOffset + 14] = ((i8 << 6) | (i9 >>> 10 & 63)) & 1023;
	      out[outOffset + 15] = i9 & 1023;
		
		inpos.add(21);
		outpos.add(16);
	}
	protected static void fastunpack44(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));

	      out[outOffset + 0] = (i0 >>> 5) & 2047;
	      out[outOffset + 1] = ((i0 << 6) | (i1 >>> 10 & 63)) & 2047;
	      out[outOffset + 2] = ((i1 << 1) | (i2 >>> 15 & 1)) & 2047;
	      out[outOffset + 3] = (i2 >>> 4) & 2047;
	      out[outOffset + 4] = ((i2 << 7) | (i3 >>> 9 & 127)) & 2047;
	      out[outOffset + 5] = ((i3 << 2) | (i4 >>> 14 & 3)) & 2047;
	      out[outOffset + 6] = (i4 >>> 3) & 2047;
	      out[outOffset + 7] = ((i4 << 8) | (i5 >>> 8 & 255)) & 2047;
	      out[outOffset + 8] = ((i5 << 3) | (i6 >>> 13 & 7)) & 2047;
	      out[outOffset + 9] = (i6 >>> 2) & 2047;
	      out[outOffset + 10] = ((i6 << 9) | (i7 >>> 7 & 511)) & 2047;
	      out[outOffset + 11] = ((i7 << 4) | (i8 >>> 12 & 15)) & 2047;
	      out[outOffset + 12] = (i8 >>> 1) & 2047;
	      out[outOffset + 13] = ((i8 << 10) | (i9 >>> 6 & 1023)) & 2047;
	      out[outOffset + 14] = ((i9 << 5) | (i10 >>> 11 & 31)) & 2047;
	      out[outOffset + 15] = i10 & 2047;
		
		inpos.add(23);
		outpos.add(16);
	}
	protected static void fastunpack45(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));

	      out[outOffset + 0] = (i0 >>> 4) & 4095;
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 8 & 255)) & 4095;
	      out[outOffset + 2] = ((i1 << 4) | (i2 >>> 12 & 15)) & 4095;
	      out[outOffset + 3] = i2 & 4095;
	      out[outOffset + 4] = (i3 >>> 4) & 4095;
	      out[outOffset + 5] = ((i3 << 8) | (i4 >>> 8 & 255)) & 4095;
	      out[outOffset + 6] = ((i4 << 4) | (i5 >>> 12 & 15)) & 4095;
	      out[outOffset + 7] = i5 & 4095;
	      out[outOffset + 8] = (i6 >>> 4) & 4095;
	      out[outOffset + 9] = ((i6 << 8) | (i7 >>> 8 & 255)) & 4095;
	      out[outOffset + 10] = ((i7 << 4) | (i8 >>> 12 & 15)) & 4095;
	      out[outOffset + 11] = i8 & 4095;
	      out[outOffset + 12] = (i9 >>> 4) & 4095;
	      out[outOffset + 13] = ((i9 << 8) | (i10 >>> 8 & 255)) & 4095;
	      out[outOffset + 14] = ((i10 << 4) | (i11 >>> 12 & 15)) & 4095;
	      out[outOffset + 15] = i11 & 4095;
		
		inpos.add(25);
		outpos.add(16);
	}
	protected static void fastunpack46(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));

	      out[outOffset + 0] = (i0 >>> 3) & 8191;
	      out[outOffset + 1] = ((i0 << 10) | (i1 >>> 6 & 1023)) & 8191;
	      out[outOffset + 2] = ((i1 << 7) | (i2 >>> 9 & 127)) & 8191;
	      out[outOffset + 3] = ((i2 << 4) | (i3 >>> 12 & 15)) & 8191;
	      out[outOffset + 4] = ((i3 << 1) | (i4 >>> 15 & 1)) & 8191;
	      out[outOffset + 5] = (i4 >>> 2) & 8191;
	      out[outOffset + 6] = ((i4 << 11) | (i5 >>> 5 & 2047)) & 8191;
	      out[outOffset + 7] = ((i5 << 8) | (i6 >>> 8 & 255)) & 8191;
	      out[outOffset + 8] = ((i6 << 5) | (i7 >>> 11 & 31)) & 8191;
	      out[outOffset + 9] = ((i7 << 2) | (i8 >>> 14 & 3)) & 8191;
	      out[outOffset + 10] = (i8 >>> 1) & 8191;
	      out[outOffset + 11] = ((i8 << 12) | (i9 >>> 4 & 4095)) & 8191;
	      out[outOffset + 12] = ((i9 << 9) | (i10 >>> 7 & 511)) & 8191;
	      out[outOffset + 13] = ((i10 << 6) | (i11 >>> 10 & 63)) & 8191;
	      out[outOffset + 14] = ((i11 << 3) | (i12 >>> 13 & 7)) & 8191;
	      out[outOffset + 15] = i12 & 8191;
		
		inpos.add(27);
		outpos.add(16);
	}
	protected static void fastunpack47(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));

	      out[outOffset + 0] = (i0 >>> 2) & 16383;
	      out[outOffset + 1] = ((i0 << 12) | (i1 >>> 4 & 4095)) & 16383;
	      out[outOffset + 2] = ((i1 << 10) | (i2 >>> 6 & 1023)) & 16383;
	      out[outOffset + 3] = ((i2 << 8) | (i3 >>> 8 & 255)) & 16383;
	      out[outOffset + 4] = ((i3 << 6) | (i4 >>> 10 & 63)) & 16383;
	      out[outOffset + 5] = ((i4 << 4) | (i5 >>> 12 & 15)) & 16383;
	      out[outOffset + 6] = ((i5 << 2) | (i6 >>> 14 & 3)) & 16383;
	      out[outOffset + 7] = i6 & 16383;
	      out[outOffset + 8] = (i7 >>> 2) & 16383;
	      out[outOffset + 9] = ((i7 << 12) | (i8 >>> 4 & 4095)) & 16383;
	      out[outOffset + 10] = ((i8 << 10) | (i9 >>> 6 & 1023)) & 16383;
	      out[outOffset + 11] = ((i9 << 8) | (i10 >>> 8 & 255)) & 16383;
	      out[outOffset + 12] = ((i10 << 6) | (i11 >>> 10 & 63)) & 16383;
	      out[outOffset + 13] = ((i11 << 4) | (i12 >>> 12 & 15)) & 16383;
	      out[outOffset + 14] = ((i12 << 2) | (i13 >>> 14 & 3)) & 16383;
	      out[outOffset + 15] = i13 & 16383;
		
		inpos.add(29);
		outpos.add(16);
	}
	protected static void fastunpack48(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));

	      out[outOffset + 0] = (i0 >>> 1) & 32767;
	      out[outOffset + 1] = ((i0 << 14) | (i1 >>> 2 & 16383)) & 32767;
	      out[outOffset + 2] = ((i1 << 13) | (i2 >>> 3 & 8191)) & 32767;
	      out[outOffset + 3] = ((i2 << 12) | (i3 >>> 4 & 4095)) & 32767;
	      out[outOffset + 4] = ((i3 << 11) | (i4 >>> 5 & 2047)) & 32767;
	      out[outOffset + 5] = ((i4 << 10) | (i5 >>> 6 & 1023)) & 32767;
	      out[outOffset + 6] = ((i5 << 9) | (i6 >>> 7 & 511)) & 32767;
	      out[outOffset + 7] = ((i6 << 8) | (i7 >>> 8 & 255)) & 32767;
	      out[outOffset + 8] = ((i7 << 7) | (i8 >>> 9 & 127)) & 32767;
	      out[outOffset + 9] = ((i8 << 6) | (i9 >>> 10 & 63)) & 32767;
	      out[outOffset + 10] = ((i9 << 5) | (i10 >>> 11 & 31)) & 32767;
	      out[outOffset + 11] = ((i10 << 4) | (i11 >>> 12 & 15)) & 32767;
	      out[outOffset + 12] = ((i11 << 3) | (i12 >>> 13 & 7)) & 32767;
	      out[outOffset + 13] = ((i12 << 2) | (i13 >>> 14 & 3)) & 32767;
	      out[outOffset + 14] = ((i13 << 1) | (i14 >>> 15 & 1)) & 32767;
	      out[outOffset + 15] = i14 & 32767;
		
		inpos.add(31);
		outpos.add(16);
	}
	protected static void fastunpack49(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      out[outOffset] = ((in[inOffset] & 0xFF) << 8) | (in[inOffset + 1] & 0xFF);
	      out[outOffset + 1] = ((in[inOffset + 2] & 0xFF) << 8) | (in[inOffset + 3] & 0xFF);
	      out[outOffset + 2] = ((in[inOffset + 4] & 0xFF) << 8) | (in[inOffset + 5] & 0xFF);
	      out[outOffset + 3] = ((in[inOffset + 6] & 0xFF) << 8) | (in[inOffset + 7] & 0xFF);
	      out[outOffset + 4] = ((in[inOffset + 8] & 0xFF) << 8) | (in[inOffset + 9] & 0xFF);
	      out[outOffset + 5] = ((in[inOffset + 10] & 0xFF) << 8) | (in[inOffset + 11] & 0xFF);
	      out[outOffset + 6] = ((in[inOffset + 12] & 0xFF) << 8) | (in[inOffset + 13] & 0xFF);
	      out[outOffset + 7] = ((in[inOffset + 14] & 0xFF) << 8) | (in[inOffset + 15] & 0xFF);
	      out[outOffset + 8] = ((in[inOffset + 16] & 0xFF) << 8) | (in[inOffset + 17] & 0xFF);
	      out[outOffset + 9] = ((in[inOffset + 18] & 0xFF) << 8) | (in[inOffset + 19] & 0xFF);
	      out[outOffset + 10] = ((in[inOffset + 20] & 0xFF) << 8) | (in[inOffset + 21] & 0xFF);
	      out[outOffset + 11] = ((in[inOffset + 22] & 0xFF) << 8) | (in[inOffset + 23] & 0xFF);
	      out[outOffset + 12] = ((in[inOffset + 24] & 0xFF) << 8) | (in[inOffset + 25] & 0xFF);
	      out[outOffset + 13] = ((in[inOffset + 26] & 0xFF) << 8) | (in[inOffset + 27] & 0xFF);
	      out[outOffset + 14] = ((in[inOffset + 28] & 0xFF) << 8) | (in[inOffset + 29] & 0xFF);
	      out[outOffset + 15] = ((in[inOffset + 30] & 0xFF) << 8) | (in[inOffset + 31] & 0xFF);
		
		inpos.add(33);
		outpos.add(16);
	}
	protected static void fastunpack50(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 1) | (i1 >>> 15 & 1)) & 131071;
	      out[outOffset + 1] = ((i1 << 2) | (i2 >>> 14 & 3)) & 131071;
	      out[outOffset + 2] = ((i2 << 3) | (i3 >>> 13 & 7)) & 131071;
	      out[outOffset + 3] = ((i3 << 4) | (i4 >>> 12 & 15)) & 131071;
	      out[outOffset + 4] = ((i4 << 5) | (i5 >>> 11 & 31)) & 131071;
	      out[outOffset + 5] = ((i5 << 6) | (i6 >>> 10 & 63)) & 131071;
	      out[outOffset + 6] = ((i6 << 7) | (i7 >>> 9 & 127)) & 131071;
	      out[outOffset + 7] = ((i7 << 8) | (i8 >>> 8 & 255)) & 131071;
	      out[outOffset + 8] = ((i8 << 9) | (i9 >>> 7 & 511)) & 131071;
	      out[outOffset + 9] = ((i9 << 10) | (i10 >>> 6 & 1023)) & 131071;
	      out[outOffset + 10] = ((i10 << 11) | (i11 >>> 5 & 2047)) & 131071;
	      out[outOffset + 11] = ((i11 << 12) | (i12 >>> 4 & 4095)) & 131071;
	      out[outOffset + 12] = ((i12 << 13) | (i13 >>> 3 & 8191)) & 131071;
	      out[outOffset + 13] = ((i13 << 14) | (i14 >>> 2 & 16383)) & 131071;
	      out[outOffset + 14] = ((i14 << 15) | (i15 >>> 1 & 32767)) & 131071;
	      out[outOffset + 15] = ((i15 << 16) | (i16 >>> 0 & 65535)) & 131071;
		
		inpos.add(35);
		outpos.add(16);
	}
	protected static void fastunpack51(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 2) | (i1 >>> 14 & 3)) & 262143;
	      out[outOffset + 1] = ((i1 << 4) | (i2 >>> 12 & 15)) & 262143;
	      out[outOffset + 2] = ((i2 << 6) | (i3 >>> 10 & 63)) & 262143;
	      out[outOffset + 3] = ((i3 << 8) | (i4 >>> 8 & 255)) & 262143;
	      out[outOffset + 4] = ((i4 << 10) | (i5 >>> 6 & 1023)) & 262143;
	      out[outOffset + 5] = ((i5 << 12) | (i6 >>> 4 & 4095)) & 262143;
	      out[outOffset + 6] = ((i6 << 14) | (i7 >>> 2 & 16383)) & 262143;
	      out[outOffset + 7] = ((i7 << 16) | (i8 >>> 0 & 65535)) & 262143;
	      out[outOffset + 8] = ((i9 << 2) | (i10 >>> 14 & 3)) & 262143;
	      out[outOffset + 9] = ((i10 << 4) | (i11 >>> 12 & 15)) & 262143;
	      out[outOffset + 10] = ((i11 << 6) | (i12 >>> 10 & 63)) & 262143;
	      out[outOffset + 11] = ((i12 << 8) | (i13 >>> 8 & 255)) & 262143;
	      out[outOffset + 12] = ((i13 << 10) | (i14 >>> 6 & 1023)) & 262143;
	      out[outOffset + 13] = ((i14 << 12) | (i15 >>> 4 & 4095)) & 262143;
	      out[outOffset + 14] = ((i15 << 14) | (i16 >>> 2 & 16383)) & 262143;
	      out[outOffset + 15] = ((i16 << 16) | (i17 >>> 0 & 65535)) & 262143;
		
		inpos.add(37);
		outpos.add(16);
	}
	protected static void fastunpack52(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 3) | (i1 >>> 13 & 7)) & 524287;
	      out[outOffset + 1] = ((i1 << 6) | (i2 >>> 10 & 63)) & 524287;
	      out[outOffset + 2] = ((i2 << 9) | (i3 >>> 7 & 511)) & 524287;
	      out[outOffset + 3] = ((i3 << 12) | (i4 >>> 4 & 4095)) & 524287;
	      out[outOffset + 4] = ((i4 << 15) | (i5 >>> 1 & 32767)) & 524287;
	      out[outOffset + 5] = ((i5 << 18) | (i6 << 2 & 262143) | (i7 >>> 14 & 3)) & 524287;
	      out[outOffset + 6] = ((i7 << 5) | (i8 >>> 11 & 31)) & 524287;
	      out[outOffset + 7] = ((i8 << 8) | (i9 >>> 8 & 255)) & 524287;
	      out[outOffset + 8] = ((i9 << 11) | (i10 >>> 5 & 2047)) & 524287;
	      out[outOffset + 9] = ((i10 << 14) | (i11 >>> 2 & 16383)) & 524287;
	      out[outOffset + 10] = ((i11 << 17) | (i12 << 1 & 131071) | (i13 >>> 15 & 1)) & 524287;
	      out[outOffset + 11] = ((i13 << 4) | (i14 >>> 12 & 15)) & 524287;
	      out[outOffset + 12] = ((i14 << 7) | (i15 >>> 9 & 127)) & 524287;
	      out[outOffset + 13] = ((i15 << 10) | (i16 >>> 6 & 1023)) & 524287;
	      out[outOffset + 14] = ((i16 << 13) | (i17 >>> 3 & 8191)) & 524287;
	      out[outOffset + 15] = ((i17 << 16) | (i18 >>> 0 & 65535)) & 524287;
		
		inpos.add(39);
		outpos.add(16);
	}
	protected static void fastunpack53(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 4) | (i1 >>> 12 & 15)) & 1048575;
	      out[outOffset + 1] = ((i1 << 8) | (i2 >>> 8 & 255)) & 1048575;
	      out[outOffset + 2] = ((i2 << 12) | (i3 >>> 4 & 4095)) & 1048575;
	      out[outOffset + 3] = ((i3 << 16) | (i4 >>> 0 & 65535)) & 1048575;
	      out[outOffset + 4] = ((i5 << 4) | (i6 >>> 12 & 15)) & 1048575;
	      out[outOffset + 5] = ((i6 << 8) | (i7 >>> 8 & 255)) & 1048575;
	      out[outOffset + 6] = ((i7 << 12) | (i8 >>> 4 & 4095)) & 1048575;
	      out[outOffset + 7] = ((i8 << 16) | (i9 >>> 0 & 65535)) & 1048575;
	      out[outOffset + 8] = ((i10 << 4) | (i11 >>> 12 & 15)) & 1048575;
	      out[outOffset + 9] = ((i11 << 8) | (i12 >>> 8 & 255)) & 1048575;
	      out[outOffset + 10] = ((i12 << 12) | (i13 >>> 4 & 4095)) & 1048575;
	      out[outOffset + 11] = ((i13 << 16) | (i14 >>> 0 & 65535)) & 1048575;
	      out[outOffset + 12] = ((i15 << 4) | (i16 >>> 12 & 15)) & 1048575;
	      out[outOffset + 13] = ((i16 << 8) | (i17 >>> 8 & 255)) & 1048575;
	      out[outOffset + 14] = ((i17 << 12) | (i18 >>> 4 & 4095)) & 1048575;
	      out[outOffset + 15] = ((i18 << 16) | (i19 >>> 0 & 65535)) & 1048575;
		
		inpos.add(41);
		outpos.add(16);
	}
	protected static void fastunpack54(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 5) | (i1 >>> 11 & 31)) & 2097151;
	      out[outOffset + 1] = ((i1 << 10) | (i2 >>> 6 & 1023)) & 2097151;
	      out[outOffset + 2] = ((i2 << 15) | (i3 >>> 1 & 32767)) & 2097151;
	      out[outOffset + 3] = ((i3 << 20) | (i4 << 4 & 1048575) | (i5 >>> 12 & 15)) & 2097151;
	      out[outOffset + 4] = ((i5 << 9) | (i6 >>> 7 & 511)) & 2097151;
	      out[outOffset + 5] = ((i6 << 14) | (i7 >>> 2 & 16383)) & 2097151;
	      out[outOffset + 6] = ((i7 << 19) | (i8 << 3 & 524287) | (i9 >>> 13 & 7)) & 2097151;
	      out[outOffset + 7] = ((i9 << 8) | (i10 >>> 8 & 255)) & 2097151;
	      out[outOffset + 8] = ((i10 << 13) | (i11 >>> 3 & 8191)) & 2097151;
	      out[outOffset + 9] = ((i11 << 18) | (i12 << 2 & 262143) | (i13 >>> 14 & 3)) & 2097151;
	      out[outOffset + 10] = ((i13 << 7) | (i14 >>> 9 & 127)) & 2097151;
	      out[outOffset + 11] = ((i14 << 12) | (i15 >>> 4 & 4095)) & 2097151;
	      out[outOffset + 12] = ((i15 << 17) | (i16 << 1 & 131071) | (i17 >>> 15 & 1)) & 2097151;
	      out[outOffset + 13] = ((i17 << 6) | (i18 >>> 10 & 63)) & 2097151;
	      out[outOffset + 14] = ((i18 << 11) | (i19 >>> 5 & 2047)) & 2097151;
	      out[outOffset + 15] = ((i19 << 16) | (i20 >>> 0 & 65535)) & 2097151;
		
		inpos.add(43);
		outpos.add(16);
	}
	protected static void fastunpack55(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 6) | (i1 >>> 10 & 63)) & 4194303;
	      out[outOffset + 1] = ((i1 << 12) | (i2 >>> 4 & 4095)) & 4194303;
	      out[outOffset + 2] = ((i2 << 18) | (i3 << 2 & 262143) | (i4 >>> 14 & 3)) & 4194303;
	      out[outOffset + 3] = ((i4 << 8) | (i5 >>> 8 & 255)) & 4194303;
	      out[outOffset + 4] = ((i5 << 14) | (i6 >>> 2 & 16383)) & 4194303;
	      out[outOffset + 5] = ((i6 << 20) | (i7 << 4 & 1048575) | (i8 >>> 12 & 15)) & 4194303;
	      out[outOffset + 6] = ((i8 << 10) | (i9 >>> 6 & 1023)) & 4194303;
	      out[outOffset + 7] = ((i9 << 16) | (i10 >>> 0 & 65535)) & 4194303;
	      out[outOffset + 8] = ((i11 << 6) | (i12 >>> 10 & 63)) & 4194303;
	      out[outOffset + 9] = ((i12 << 12) | (i13 >>> 4 & 4095)) & 4194303;
	      out[outOffset + 10] = ((i13 << 18) | (i14 << 2 & 262143) | (i15 >>> 14 & 3)) & 4194303;
	      out[outOffset + 11] = ((i15 << 8) | (i16 >>> 8 & 255)) & 4194303;
	      out[outOffset + 12] = ((i16 << 14) | (i17 >>> 2 & 16383)) & 4194303;
	      out[outOffset + 13] = ((i17 << 20) | (i18 << 4 & 1048575) | (i19 >>> 12 & 15)) & 4194303;
	      out[outOffset + 14] = ((i19 << 10) | (i20 >>> 6 & 1023)) & 4194303;
	      out[outOffset + 15] = ((i20 << 16) | (i21 >>> 0 & 65535)) & 4194303;
		
		inpos.add(45);
		outpos.add(16);
	}
	protected static void fastunpack56(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 7) | (i1 >>> 9 & 127)) & 8388607;
	      out[outOffset + 1] = ((i1 << 14) | (i2 >>> 2 & 16383)) & 8388607;
	      out[outOffset + 2] = ((i2 << 21) | (i3 << 5 & 2097151) | (i4 >>> 11 & 31)) & 8388607;
	      out[outOffset + 3] = ((i4 << 12) | (i5 >>> 4 & 4095)) & 8388607;
	      out[outOffset + 4] = ((i5 << 19) | (i6 << 3 & 524287) | (i7 >>> 13 & 7)) & 8388607;
	      out[outOffset + 5] = ((i7 << 10) | (i8 >>> 6 & 1023)) & 8388607;
	      out[outOffset + 6] = ((i8 << 17) | (i9 << 1 & 131071) | (i10 >>> 15 & 1)) & 8388607;
	      out[outOffset + 7] = ((i10 << 8) | (i11 >>> 8 & 255)) & 8388607;
	      out[outOffset + 8] = ((i11 << 15) | (i12 >>> 1 & 32767)) & 8388607;
	      out[outOffset + 9] = ((i12 << 22) | (i13 << 6 & 4194303) | (i14 >>> 10 & 63)) & 8388607;
	      out[outOffset + 10] = ((i14 << 13) | (i15 >>> 3 & 8191)) & 8388607;
	      out[outOffset + 11] = ((i15 << 20) | (i16 << 4 & 1048575) | (i17 >>> 12 & 15)) & 8388607;
	      out[outOffset + 12] = ((i17 << 11) | (i18 >>> 5 & 2047)) & 8388607;
	      out[outOffset + 13] = ((i18 << 18) | (i19 << 2 & 262143) | (i20 >>> 14 & 3)) & 8388607;
	      out[outOffset + 14] = ((i20 << 9) | (i21 >>> 7 & 511)) & 8388607;
	      out[outOffset + 15] = ((i21 << 16) | (i22 >>> 0 & 65535)) & 8388607;
		
		inpos.add(47);
		outpos.add(16);
	}
	protected static void fastunpack57(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 8) | (i1 >>> 8 & 255)) & 16777215;
	      out[outOffset + 1] = ((i1 << 16) | (i2 >>> 0 & 65535)) & 16777215;
	      out[outOffset + 2] = ((i3 << 8) | (i4 >>> 8 & 255)) & 16777215;
	      out[outOffset + 3] = ((i4 << 16) | (i5 >>> 0 & 65535)) & 16777215;
	      out[outOffset + 4] = ((i6 << 8) | (i7 >>> 8 & 255)) & 16777215;
	      out[outOffset + 5] = ((i7 << 16) | (i8 >>> 0 & 65535)) & 16777215;
	      out[outOffset + 6] = ((i9 << 8) | (i10 >>> 8 & 255)) & 16777215;
	      out[outOffset + 7] = ((i10 << 16) | (i11 >>> 0 & 65535)) & 16777215;
	      out[outOffset + 8] = ((i12 << 8) | (i13 >>> 8 & 255)) & 16777215;
	      out[outOffset + 9] = ((i13 << 16) | (i14 >>> 0 & 65535)) & 16777215;
	      out[outOffset + 10] = ((i15 << 8) | (i16 >>> 8 & 255)) & 16777215;
	      out[outOffset + 11] = ((i16 << 16) | (i17 >>> 0 & 65535)) & 16777215;
	      out[outOffset + 12] = ((i18 << 8) | (i19 >>> 8 & 255)) & 16777215;
	      out[outOffset + 13] = ((i19 << 16) | (i20 >>> 0 & 65535)) & 16777215;
	      out[outOffset + 14] = ((i21 << 8) | (i22 >>> 8 & 255)) & 16777215;
	      out[outOffset + 15] = ((i22 << 16) | (i23 >>> 0 & 65535)) & 16777215;
		
		inpos.add(49);
		outpos.add(16);
	}
	protected static void fastunpack58(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 9) | (i1 >>> 7 & 511)) & 33554431;
	      out[outOffset + 1] = ((i1 << 18) | (i2 << 2 & 262143) | (i3 >>> 14 & 3)) & 33554431;
	      out[outOffset + 2] = ((i3 << 11) | (i4 >>> 5 & 2047)) & 33554431;
	      out[outOffset + 3] = ((i4 << 20) | (i5 << 4 & 1048575) | (i6 >>> 12 & 15)) & 33554431;
	      out[outOffset + 4] = ((i6 << 13) | (i7 >>> 3 & 8191)) & 33554431;
	      out[outOffset + 5] = ((i7 << 22) | (i8 << 6 & 4194303) | (i9 >>> 10 & 63)) & 33554431;
	      out[outOffset + 6] = ((i9 << 15) | (i10 >>> 1 & 32767)) & 33554431;
	      out[outOffset + 7] = ((i10 << 24) | (i11 << 8 & 16777215) | (i12 >>> 8 & 255)) & 33554431;
	      out[outOffset + 8] = ((i12 << 17) | (i13 << 1 & 131071) | (i14 >>> 15 & 1)) & 33554431;
	      out[outOffset + 9] = ((i14 << 10) | (i15 >>> 6 & 1023)) & 33554431;
	      out[outOffset + 10] = ((i15 << 19) | (i16 << 3 & 524287) | (i17 >>> 13 & 7)) & 33554431;
	      out[outOffset + 11] = ((i17 << 12) | (i18 >>> 4 & 4095)) & 33554431;
	      out[outOffset + 12] = ((i18 << 21) | (i19 << 5 & 2097151) | (i20 >>> 11 & 31)) & 33554431;
	      out[outOffset + 13] = ((i20 << 14) | (i21 >>> 2 & 16383)) & 33554431;
	      out[outOffset + 14] = ((i21 << 23) | (i22 << 7 & 8388607) | (i23 >>> 9 & 127)) & 33554431;
	      out[outOffset + 15] = ((i23 << 16) | (i24 >>> 0 & 65535)) & 33554431;
		
		inpos.add(51);
		outpos.add(16);
	}
	protected static void fastunpack59(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));
	      final short i25 = (short) (((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 10) | (i1 >>> 6 & 1023)) & 67108863;
	      out[outOffset + 1] = ((i1 << 20) | (i2 << 4 & 1048575) | (i3 >>> 12 & 15)) & 67108863;
	      out[outOffset + 2] = ((i3 << 14) | (i4 >>> 2 & 16383)) & 67108863;
	      out[outOffset + 3] = ((i4 << 24) | (i5 << 8 & 16777215) | (i6 >>> 8 & 255)) & 67108863;
	      out[outOffset + 4] = ((i6 << 18) | (i7 << 2 & 262143) | (i8 >>> 14 & 3)) & 67108863;
	      out[outOffset + 5] = ((i8 << 12) | (i9 >>> 4 & 4095)) & 67108863;
	      out[outOffset + 6] = ((i9 << 22) | (i10 << 6 & 4194303) | (i11 >>> 10 & 63)) & 67108863;
	      out[outOffset + 7] = ((i11 << 16) | (i12 >>> 0 & 65535)) & 67108863;
	      out[outOffset + 8] = ((i13 << 10) | (i14 >>> 6 & 1023)) & 67108863;
	      out[outOffset + 9] = ((i14 << 20) | (i15 << 4 & 1048575) | (i16 >>> 12 & 15)) & 67108863;
	      out[outOffset + 10] = ((i16 << 14) | (i17 >>> 2 & 16383)) & 67108863;
	      out[outOffset + 11] = ((i17 << 24) | (i18 << 8 & 16777215) | (i19 >>> 8 & 255)) & 67108863;
	      out[outOffset + 12] = ((i19 << 18) | (i20 << 2 & 262143) | (i21 >>> 14 & 3)) & 67108863;
	      out[outOffset + 13] = ((i21 << 12) | (i22 >>> 4 & 4095)) & 67108863;
	      out[outOffset + 14] = ((i22 << 22) | (i23 << 6 & 4194303) | (i24 >>> 10 & 63)) & 67108863;
	      out[outOffset + 15] = ((i24 << 16) | (i25 >>> 0 & 65535)) & 67108863;
		
		inpos.add(53);
		outpos.add(16);
	}
	protected static void fastunpack60(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));
	      final short i25 = (short) (((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF)));
	      final short i26 = (short) (((in[inOffset + 52] & 0xFF) << 8) | ((in[inOffset + 53] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 11) | (i1 >>> 5 & 2047)) & 134217727;
	      out[outOffset + 1] = ((i1 << 22) | (i2 << 6 & 4194303) | (i3 >>> 10 & 63)) & 134217727;
	      out[outOffset + 2] = ((i3 << 17) | (i4 << 1 & 131071) | (i5 >>> 15 & 1)) & 134217727;
	      out[outOffset + 3] = ((i5 << 12) | (i6 >>> 4 & 4095)) & 134217727;
	      out[outOffset + 4] = ((i6 << 23) | (i7 << 7 & 8388607) | (i8 >>> 9 & 127)) & 134217727;
	      out[outOffset + 5] = ((i8 << 18) | (i9 << 2 & 262143) | (i10 >>> 14 & 3)) & 134217727;
	      out[outOffset + 6] = ((i10 << 13) | (i11 >>> 3 & 8191)) & 134217727;
	      out[outOffset + 7] = ((i11 << 24) | (i12 << 8 & 16777215) | (i13 >>> 8 & 255)) & 134217727;
	      out[outOffset + 8] = ((i13 << 19) | (i14 << 3 & 524287) | (i15 >>> 13 & 7)) & 134217727;
	      out[outOffset + 9] = ((i15 << 14) | (i16 >>> 2 & 16383)) & 134217727;
	      out[outOffset + 10] = ((i16 << 25) | (i17 << 9 & 33554431) | (i18 >>> 7 & 511)) & 134217727;
	      out[outOffset + 11] = ((i18 << 20) | (i19 << 4 & 1048575) | (i20 >>> 12 & 15)) & 134217727;
	      out[outOffset + 12] = ((i20 << 15) | (i21 >>> 1 & 32767)) & 134217727;
	      out[outOffset + 13] = ((i21 << 26) | (i22 << 10 & 67108863) | (i23 >>> 6 & 1023)) & 134217727;
	      out[outOffset + 14] = ((i23 << 21) | (i24 << 5 & 2097151) | (i25 >>> 11 & 31)) & 134217727;
	      out[outOffset + 15] = ((i25 << 16) | (i26 >>> 0 & 65535)) & 134217727;
		
		inpos.add(55);
		outpos.add(16);
	}
	protected static void fastunpack61(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));
	      final short i25 = (short) (((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF)));
	      final short i26 = (short) (((in[inOffset + 52] & 0xFF) << 8) | ((in[inOffset + 53] & 0xFF)));
	      final short i27 = (short) (((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 12) | (i1 >>> 4 & 4095)) & 268435455;
	      out[outOffset + 1] = ((i1 << 24) | (i2 << 8 & 16777215) | (i3 >>> 8 & 255)) & 268435455;
	      out[outOffset + 2] = ((i3 << 20) | (i4 << 4 & 1048575) | (i5 >>> 12 & 15)) & 268435455;
	      out[outOffset + 3] = ((i5 << 16) | (i6 >>> 0 & 65535)) & 268435455;
	      out[outOffset + 4] = ((i7 << 12) | (i8 >>> 4 & 4095)) & 268435455;
	      out[outOffset + 5] = ((i8 << 24) | (i9 << 8 & 16777215) | (i10 >>> 8 & 255)) & 268435455;
	      out[outOffset + 6] = ((i10 << 20) | (i11 << 4 & 1048575) | (i12 >>> 12 & 15)) & 268435455;
	      out[outOffset + 7] = ((i12 << 16) | (i13 >>> 0 & 65535)) & 268435455;
	      out[outOffset + 8] = ((i14 << 12) | (i15 >>> 4 & 4095)) & 268435455;
	      out[outOffset + 9] = ((i15 << 24) | (i16 << 8 & 16777215) | (i17 >>> 8 & 255)) & 268435455;
	      out[outOffset + 10] = ((i17 << 20) | (i18 << 4 & 1048575) | (i19 >>> 12 & 15)) & 268435455;
	      out[outOffset + 11] = ((i19 << 16) | (i20 >>> 0 & 65535)) & 268435455;
	      out[outOffset + 12] = ((i21 << 12) | (i22 >>> 4 & 4095)) & 268435455;
	      out[outOffset + 13] = ((i22 << 24) | (i23 << 8 & 16777215) | (i24 >>> 8 & 255)) & 268435455;
	      out[outOffset + 14] = ((i24 << 20) | (i25 << 4 & 1048575) | (i26 >>> 12 & 15)) & 268435455;
	      out[outOffset + 15] = ((i26 << 16) | (i27 >>> 0 & 65535)) & 268435455;
		
		inpos.add(57);
		outpos.add(16);
	}
	protected static void fastunpack62(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));
	      final short i25 = (short) (((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF)));
	      final short i26 = (short) (((in[inOffset + 52] & 0xFF) << 8) | ((in[inOffset + 53] & 0xFF)));
	      final short i27 = (short) (((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF)));
	      final short i28 = (short) (((in[inOffset + 56] & 0xFF) << 8) | ((in[inOffset + 57] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 13) | (i1 >>> 3 & 8191)) & 536870911;
	      out[outOffset + 1] = ((i1 << 26) | (i2 << 10 & 67108863) | (i3 >>> 6 & 1023)) & 536870911;
	      out[outOffset + 2] = ((i3 << 23) | (i4 << 7 & 8388607) | (i5 >>> 9 & 127)) & 536870911;
	      out[outOffset + 3] = ((i5 << 20) | (i6 << 4 & 1048575) | (i7 >>> 12 & 15)) & 536870911;
	      out[outOffset + 4] = ((i7 << 17) | (i8 << 1 & 131071) | (i9 >>> 15 & 1)) & 536870911;
	      out[outOffset + 5] = ((i9 << 14) | (i10 >>> 2 & 16383)) & 536870911;
	      out[outOffset + 6] = ((i10 << 27) | (i11 << 11 & 134217727) | (i12 >>> 5 & 2047)) & 536870911;
	      out[outOffset + 7] = ((i12 << 24) | (i13 << 8 & 16777215) | (i14 >>> 8 & 255)) & 536870911;
	      out[outOffset + 8] = ((i14 << 21) | (i15 << 5 & 2097151) | (i16 >>> 11 & 31)) & 536870911;
	      out[outOffset + 9] = ((i16 << 18) | (i17 << 2 & 262143) | (i18 >>> 14 & 3)) & 536870911;
	      out[outOffset + 10] = ((i18 << 15) | (i19 >>> 1 & 32767)) & 536870911;
	      out[outOffset + 11] = ((i19 << 28) | (i20 << 12 & 268435455) | (i21 >>> 4 & 4095)) & 536870911;
	      out[outOffset + 12] = ((i21 << 25) | (i22 << 9 & 33554431) | (i23 >>> 7 & 511)) & 536870911;
	      out[outOffset + 13] = ((i23 << 22) | (i24 << 6 & 4194303) | (i25 >>> 10 & 63)) & 536870911;
	      out[outOffset + 14] = ((i25 << 19) | (i26 << 3 & 524287) | (i27 >>> 13 & 7)) & 536870911;
	      out[outOffset + 15] = ((i27 << 16) | (i28 >>> 0 & 65535)) & 536870911;
		
		inpos.add(59);
		outpos.add(16);
	}
	protected static void fastunpack63(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));
	      final short i25 = (short) (((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF)));
	      final short i26 = (short) (((in[inOffset + 52] & 0xFF) << 8) | ((in[inOffset + 53] & 0xFF)));
	      final short i27 = (short) (((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF)));
	      final short i28 = (short) (((in[inOffset + 56] & 0xFF) << 8) | ((in[inOffset + 57] & 0xFF)));
	      final short i29 = (short) (((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 14) | (i1 >>> 2 & 16383)) & 1073741823;
	      out[outOffset + 1] = ((i1 << 28) | (i2 << 12 & 268435455) | (i3 >>> 4 & 4095)) & 1073741823;
	      out[outOffset + 2] = ((i3 << 26) | (i4 << 10 & 67108863) | (i5 >>> 6 & 1023)) & 1073741823;
	      out[outOffset + 3] = ((i5 << 24) | (i6 << 8 & 16777215) | (i7 >>> 8 & 255)) & 1073741823;
	      out[outOffset + 4] = ((i7 << 22) | (i8 << 6 & 4194303) | (i9 >>> 10 & 63)) & 1073741823;
	      out[outOffset + 5] = ((i9 << 20) | (i10 << 4 & 1048575) | (i11 >>> 12 & 15)) & 1073741823;
	      out[outOffset + 6] = ((i11 << 18) | (i12 << 2 & 262143) | (i13 >>> 14 & 3)) & 1073741823;
	      out[outOffset + 7] = ((i13 << 16) | (i14 >>> 0 & 65535)) & 1073741823;
	      out[outOffset + 8] = ((i15 << 14) | (i16 >>> 2 & 16383)) & 1073741823;
	      out[outOffset + 9] = ((i16 << 28) | (i17 << 12 & 268435455) | (i18 >>> 4 & 4095)) & 1073741823;
	      out[outOffset + 10] = ((i18 << 26) | (i19 << 10 & 67108863) | (i20 >>> 6 & 1023)) & 1073741823;
	      out[outOffset + 11] = ((i20 << 24) | (i21 << 8 & 16777215) | (i22 >>> 8 & 255)) & 1073741823;
	      out[outOffset + 12] = ((i22 << 22) | (i23 << 6 & 4194303) | (i24 >>> 10 & 63)) & 1073741823;
	      out[outOffset + 13] = ((i24 << 20) | (i25 << 4 & 1048575) | (i26 >>> 12 & 15)) & 1073741823;
	      out[outOffset + 14] = ((i26 << 18) | (i27 << 2 & 262143) | (i28 >>> 14 & 3)) & 1073741823;
	      out[outOffset + 15] = ((i28 << 16) | (i29 >>> 0 & 65535)) & 1073741823;
		
		inpos.add(61);
		outpos.add(16);
	}
	protected static void fastunpack64(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));
	      final short i25 = (short) (((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF)));
	      final short i26 = (short) (((in[inOffset + 52] & 0xFF) << 8) | ((in[inOffset + 53] & 0xFF)));
	      final short i27 = (short) (((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF)));
	      final short i28 = (short) (((in[inOffset + 56] & 0xFF) << 8) | ((in[inOffset + 57] & 0xFF)));
	      final short i29 = (short) (((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF)));
	      final short i30 = (short) (((in[inOffset + 60] & 0xFF) << 8) | ((in[inOffset + 61] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 15) | (i1 >>> 1 & 32767)) & 2147483647;
	      out[outOffset + 1] = ((i1 << 30) | (i2 << 14 & 1073741823) | (i3 >>> 2 & 16383)) & 2147483647;
	      out[outOffset + 2] = ((i3 << 29) | (i4 << 13 & 536870911) | (i5 >>> 3 & 8191)) & 2147483647;
	      out[outOffset + 3] = ((i5 << 28) | (i6 << 12 & 268435455) | (i7 >>> 4 & 4095)) & 2147483647;
	      out[outOffset + 4] = ((i7 << 27) | (i8 << 11 & 134217727) | (i9 >>> 5 & 2047)) & 2147483647;
	      out[outOffset + 5] = ((i9 << 26) | (i10 << 10 & 67108863) | (i11 >>> 6 & 1023)) & 2147483647;
	      out[outOffset + 6] = ((i11 << 25) | (i12 << 9 & 33554431) | (i13 >>> 7 & 511)) & 2147483647;
	      out[outOffset + 7] = ((i13 << 24) | (i14 << 8 & 16777215) | (i15 >>> 8 & 255)) & 2147483647;
	      out[outOffset + 8] = ((i15 << 23) | (i16 << 7 & 8388607) | (i17 >>> 9 & 127)) & 2147483647;
	      out[outOffset + 9] = ((i17 << 22) | (i18 << 6 & 4194303) | (i19 >>> 10 & 63)) & 2147483647;
	      out[outOffset + 10] = ((i19 << 21) | (i20 << 5 & 2097151) | (i21 >>> 11 & 31)) & 2147483647;
	      out[outOffset + 11] = ((i21 << 20) | (i22 << 4 & 1048575) | (i23 >>> 12 & 15)) & 2147483647;
	      out[outOffset + 12] = ((i23 << 19) | (i24 << 3 & 524287) | (i25 >>> 13 & 7)) & 2147483647;
	      out[outOffset + 13] = ((i25 << 18) | (i26 << 2 & 262143) | (i27 >>> 14 & 3)) & 2147483647;
	      out[outOffset + 14] = ((i27 << 17) | (i28 << 1 & 131071) | (i29 >>> 15 & 1)) & 2147483647;
	      out[outOffset + 15] = ((i29 << 16) | (i30 >>> 0 & 65535)) & 2147483647;
		
		inpos.add(63);
		outpos.add(16);
	}
	protected static void fastunpack65(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final short i0 = (short) (((in[inOffset + 0] & 0xFF) << 8) | ((in[inOffset + 1] & 0xFF)));
	      final short i1 = (short) (((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF)));
	      final short i2 = (short) (((in[inOffset + 4] & 0xFF) << 8) | ((in[inOffset + 5] & 0xFF)));
	      final short i3 = (short) (((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF)));
	      final short i4 = (short) (((in[inOffset + 8] & 0xFF) << 8) | ((in[inOffset + 9] & 0xFF)));
	      final short i5 = (short) (((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF)));
	      final short i6 = (short) (((in[inOffset + 12] & 0xFF) << 8) | ((in[inOffset + 13] & 0xFF)));
	      final short i7 = (short) (((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF)));
	      final short i8 = (short) (((in[inOffset + 16] & 0xFF) << 8) | ((in[inOffset + 17] & 0xFF)));
	      final short i9 = (short) (((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF)));
	      final short i10 = (short) (((in[inOffset + 20] & 0xFF) << 8) | ((in[inOffset + 21] & 0xFF)));
	      final short i11 = (short) (((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF)));
	      final short i12 = (short) (((in[inOffset + 24] & 0xFF) << 8) | ((in[inOffset + 25] & 0xFF)));
	      final short i13 = (short) (((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF)));
	      final short i14 = (short) (((in[inOffset + 28] & 0xFF) << 8) | ((in[inOffset + 29] & 0xFF)));
	      final short i15 = (short) (((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF)));
	      final short i16 = (short) (((in[inOffset + 32] & 0xFF) << 8) | ((in[inOffset + 33] & 0xFF)));
	      final short i17 = (short) (((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF)));
	      final short i18 = (short) (((in[inOffset + 36] & 0xFF) << 8) | ((in[inOffset + 37] & 0xFF)));
	      final short i19 = (short) (((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF)));
	      final short i20 = (short) (((in[inOffset + 40] & 0xFF) << 8) | ((in[inOffset + 41] & 0xFF)));
	      final short i21 = (short) (((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF)));
	      final short i22 = (short) (((in[inOffset + 44] & 0xFF) << 8) | ((in[inOffset + 45] & 0xFF)));
	      final short i23 = (short) (((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF)));
	      final short i24 = (short) (((in[inOffset + 48] & 0xFF) << 8) | ((in[inOffset + 49] & 0xFF)));
	      final short i25 = (short) (((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF)));
	      final short i26 = (short) (((in[inOffset + 52] & 0xFF) << 8) | ((in[inOffset + 53] & 0xFF)));
	      final short i27 = (short) (((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF)));
	      final short i28 = (short) (((in[inOffset + 56] & 0xFF) << 8) | ((in[inOffset + 57] & 0xFF)));
	      final short i29 = (short) (((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF)));
	      final short i30 = (short) (((in[inOffset + 60] & 0xFF) << 8) | ((in[inOffset + 61] & 0xFF)));
	      final short i31 = (short) (((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF)));

	      out[outOffset + 0] = ((i0 << 16) | (i1 >>> 0 & 65535));
	      out[outOffset + 1] = ((i2 << 16) | (i3 >>> 0 & 65535));
	      out[outOffset + 2] = ((i4 << 16) | (i5 >>> 0 & 65535));
	      out[outOffset + 3] = ((i6 << 16) | (i7 >>> 0 & 65535));
	      out[outOffset + 4] = ((i8 << 16) | (i9 >>> 0 & 65535));
	      out[outOffset + 5] = ((i10 << 16) | (i11 >>> 0 & 65535));
	      out[outOffset + 6] = ((i12 << 16) | (i13 >>> 0 & 65535));
	      out[outOffset + 7] = ((i14 << 16) | (i15 >>> 0 & 65535));
	      out[outOffset + 8] = ((i16 << 16) | (i17 >>> 0 & 65535));
	      out[outOffset + 9] = ((i18 << 16) | (i19 >>> 0 & 65535));
	      out[outOffset + 10] = ((i20 << 16) | (i21 >>> 0 & 65535));
	      out[outOffset + 11] = ((i22 << 16) | (i23 >>> 0 & 65535));
	      out[outOffset + 12] = ((i24 << 16) | (i25 >>> 0 & 65535));
	      out[outOffset + 13] = ((i26 << 16) | (i27 >>> 0 & 65535));
	      out[outOffset + 14] = ((i28 << 16) | (i29 >>> 0 & 65535));
	      out[outOffset + 15] = ((i30 << 16) | (i31 >>> 0 & 65535));
		
		inpos.add(65);
		outpos.add(16);
	}
	protected static void fastunpack66(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
		
		inpos.add(1);
		outpos.add(8);
	}
	protected static void fastunpack67(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];

	      out[outOffset + 0] = (i0 >>> 7) & 1;
	      out[outOffset + 1] = (i0 >>> 6) & 1;
	      out[outOffset + 2] = (i0 >>> 5) & 1;
	      out[outOffset + 3] = (i0 >>> 4) & 1;
	      out[outOffset + 4] = (i0 >>> 3) & 1;
	      out[outOffset + 5] = (i0 >>> 2) & 1;
	      out[outOffset + 6] = (i0 >>> 1) & 1;
	      out[outOffset + 7] = i0 & 1;
		
		inpos.add(2);
		outpos.add(8);
	}
	protected static void fastunpack68(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];

	      out[outOffset + 0] = (i0 >>> 6) & 3;
	      out[outOffset + 1] = (i0 >>> 4) & 3;
	      out[outOffset + 2] = (i0 >>> 2) & 3;
	      out[outOffset + 3] = i0 & 3;
	      out[outOffset + 4] = (i1 >>> 6) & 3;
	      out[outOffset + 5] = (i1 >>> 4) & 3;
	      out[outOffset + 6] = (i1 >>> 2) & 3;
	      out[outOffset + 7] = i1 & 3;
		
		inpos.add(3);
		outpos.add(8);
	}
	protected static void fastunpack69(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];

	      out[outOffset + 0] = (i0 >>> 5) & 7;
	      out[outOffset + 1] = (i0 >>> 2) & 7;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 7 & 1)) & 7;
	      out[outOffset + 3] = (i1 >>> 4) & 7;
	      out[outOffset + 4] = (i1 >>> 1) & 7;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 6 & 3)) & 7;
	      out[outOffset + 6] = (i2 >>> 3) & 7;
	      out[outOffset + 7] = i2 & 7;
		
		inpos.add(4);
		outpos.add(8);
	}
	protected static void fastunpack70(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];

	      out[outOffset + 0] = (i0 >>> 4) & 15;
	      out[outOffset + 1] = i0 & 15;
	      out[outOffset + 2] = (i1 >>> 4) & 15;
	      out[outOffset + 3] = i1 & 15;
	      out[outOffset + 4] = (i2 >>> 4) & 15;
	      out[outOffset + 5] = i2 & 15;
	      out[outOffset + 6] = (i3 >>> 4) & 15;
	      out[outOffset + 7] = i3 & 15;
		
		inpos.add(5);
		outpos.add(8);
	}
	protected static void fastunpack71(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];

	      out[outOffset + 0] = (i0 >>> 3) & 31;
	      out[outOffset + 1] = ((i0 << 2) | (i1 >>> 6 & 3)) & 31;
	      out[outOffset + 2] = (i1 >>> 1) & 31;
	      out[outOffset + 3] = ((i1 << 4) | (i2 >>> 4 & 15)) & 31;
	      out[outOffset + 4] = ((i2 << 1) | (i3 >>> 7 & 1)) & 31;
	      out[outOffset + 5] = (i3 >>> 2) & 31;
	      out[outOffset + 6] = ((i3 << 3) | (i4 >>> 5 & 7)) & 31;
	      out[outOffset + 7] = i4 & 31;
		
		inpos.add(6);
		outpos.add(8);
	}
	protected static void fastunpack72(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];

	      out[outOffset + 0] = (i0 >>> 2) & 63;
	      out[outOffset + 1] = ((i0 << 4) | (i1 >>> 4 & 15)) & 63;
	      out[outOffset + 2] = ((i1 << 2) | (i2 >>> 6 & 3)) & 63;
	      out[outOffset + 3] = i2 & 63;
	      out[outOffset + 4] = (i3 >>> 2) & 63;
	      out[outOffset + 5] = ((i3 << 4) | (i4 >>> 4 & 15)) & 63;
	      out[outOffset + 6] = ((i4 << 2) | (i5 >>> 6 & 3)) & 63;
	      out[outOffset + 7] = i5 & 63;
		
		inpos.add(7);
		outpos.add(8);
	}
	protected static void fastunpack73(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];

	      out[outOffset + 0] = (i0 >>> 1) & 127;
	      out[outOffset + 1] = ((i0 << 6) | (i1 >>> 2 & 63)) & 127;
	      out[outOffset + 2] = ((i1 << 5) | (i2 >>> 3 & 31)) & 127;
	      out[outOffset + 3] = ((i2 << 4) | (i3 >>> 4 & 15)) & 127;
	      out[outOffset + 4] = ((i3 << 3) | (i4 >>> 5 & 7)) & 127;
	      out[outOffset + 5] = ((i4 << 2) | (i5 >>> 6 & 3)) & 127;
	      out[outOffset + 6] = ((i5 << 1) | (i6 >>> 7 & 1)) & 127;
	      out[outOffset + 7] = i6 & 127;
		
		inpos.add(8);
		outpos.add(8);
	}
	protected static void fastunpack74(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];

	      out[outOffset + 0] = i0 & 255;
	      out[outOffset + 1] = i1 & 255;
	      out[outOffset + 2] = i2 & 255;
	      out[outOffset + 3] = i3 & 255;
	      out[outOffset + 4] = i4 & 255;
	      out[outOffset + 5] = i5 & 255;
	      out[outOffset + 6] = i6 & 255;
	      out[outOffset + 7] = i7 & 255;
		
		inpos.add(9);
		outpos.add(8);
	}
	protected static void fastunpack75(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];

	      out[outOffset + 0] = ((i0 << 1) | (i1 >>> 7 & 1)) & 511;
	      out[outOffset + 1] = ((i1 << 2) | (i2 >>> 6 & 3)) & 511;
	      out[outOffset + 2] = ((i2 << 3) | (i3 >>> 5 & 7)) & 511;
	      out[outOffset + 3] = ((i3 << 4) | (i4 >>> 4 & 15)) & 511;
	      out[outOffset + 4] = ((i4 << 5) | (i5 >>> 3 & 31)) & 511;
	      out[outOffset + 5] = ((i5 << 6) | (i6 >>> 2 & 63)) & 511;
	      out[outOffset + 6] = ((i6 << 7) | (i7 >>> 1 & 127)) & 511;
	      out[outOffset + 7] = ((i7 << 8) | (i8 >>> 0 & 255)) & 511;
		
		inpos.add(10);
		outpos.add(8);
	}
	protected static void fastunpack76(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];

	      out[outOffset + 0] = ((i0 << 2) | (i1 >>> 6 & 3)) & 1023;
	      out[outOffset + 1] = ((i1 << 4) | (i2 >>> 4 & 15)) & 1023;
	      out[outOffset + 2] = ((i2 << 6) | (i3 >>> 2 & 63)) & 1023;
	      out[outOffset + 3] = ((i3 << 8) | (i4 >>> 0 & 255)) & 1023;
	      out[outOffset + 4] = ((i5 << 2) | (i6 >>> 6 & 3)) & 1023;
	      out[outOffset + 5] = ((i6 << 4) | (i7 >>> 4 & 15)) & 1023;
	      out[outOffset + 6] = ((i7 << 6) | (i8 >>> 2 & 63)) & 1023;
	      out[outOffset + 7] = ((i8 << 8) | (i9 >>> 0 & 255)) & 1023;
		
		inpos.add(11);
		outpos.add(8);
	}
	protected static void fastunpack77(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];

	      out[outOffset + 0] = ((i0 << 3) | (i1 >>> 5 & 7)) & 2047;
	      out[outOffset + 1] = ((i1 << 6) | (i2 >>> 2 & 63)) & 2047;
	      out[outOffset + 2] = ((i2 << 9) | (i3 << 1 & 511) | (i4 >>> 7 & 1)) & 2047;
	      out[outOffset + 3] = ((i4 << 4) | (i5 >>> 4 & 15)) & 2047;
	      out[outOffset + 4] = ((i5 << 7) | (i6 >>> 1 & 127)) & 2047;
	      out[outOffset + 5] = ((i6 << 10) | (i7 << 2 & 1023) | (i8 >>> 6 & 3)) & 2047;
	      out[outOffset + 6] = ((i8 << 5) | (i9 >>> 3 & 31)) & 2047;
	      out[outOffset + 7] = ((i9 << 8) | (i10 >>> 0 & 255)) & 2047;
		
		inpos.add(12);
		outpos.add(8);
	}
	protected static void fastunpack78(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];

	      out[outOffset + 0] = ((i0 << 4) | (i1 >>> 4 & 15)) & 4095;
	      out[outOffset + 1] = ((i1 << 8) | (i2 >>> 0 & 255)) & 4095;
	      out[outOffset + 2] = ((i3 << 4) | (i4 >>> 4 & 15)) & 4095;
	      out[outOffset + 3] = ((i4 << 8) | (i5 >>> 0 & 255)) & 4095;
	      out[outOffset + 4] = ((i6 << 4) | (i7 >>> 4 & 15)) & 4095;
	      out[outOffset + 5] = ((i7 << 8) | (i8 >>> 0 & 255)) & 4095;
	      out[outOffset + 6] = ((i9 << 4) | (i10 >>> 4 & 15)) & 4095;
	      out[outOffset + 7] = ((i10 << 8) | (i11 >>> 0 & 255)) & 4095;
		
		inpos.add(13);
		outpos.add(8);
	}
	protected static void fastunpack79(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];

	      out[outOffset + 0] = ((i0 << 5) | (i1 >>> 3 & 31)) & 8191;
	      out[outOffset + 1] = ((i1 << 10) | (i2 << 2 & 1023) | (i3 >>> 6 & 3)) & 8191;
	      out[outOffset + 2] = ((i3 << 7) | (i4 >>> 1 & 127)) & 8191;
	      out[outOffset + 3] = ((i4 << 12) | (i5 << 4 & 4095) | (i6 >>> 4 & 15)) & 8191;
	      out[outOffset + 4] = ((i6 << 9) | (i7 << 1 & 511) | (i8 >>> 7 & 1)) & 8191;
	      out[outOffset + 5] = ((i8 << 6) | (i9 >>> 2 & 63)) & 8191;
	      out[outOffset + 6] = ((i9 << 11) | (i10 << 3 & 2047) | (i11 >>> 5 & 7)) & 8191;
	      out[outOffset + 7] = ((i11 << 8) | (i12 >>> 0 & 255)) & 8191;
		
		inpos.add(14);
		outpos.add(8);
	}
	protected static void fastunpack80(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];

	      out[outOffset + 0] = ((i0 << 6) | (i1 >>> 2 & 63)) & 16383;
	      out[outOffset + 1] = ((i1 << 12) | (i2 << 4 & 4095) | (i3 >>> 4 & 15)) & 16383;
	      out[outOffset + 2] = ((i3 << 10) | (i4 << 2 & 1023) | (i5 >>> 6 & 3)) & 16383;
	      out[outOffset + 3] = ((i5 << 8) | (i6 >>> 0 & 255)) & 16383;
	      out[outOffset + 4] = ((i7 << 6) | (i8 >>> 2 & 63)) & 16383;
	      out[outOffset + 5] = ((i8 << 12) | (i9 << 4 & 4095) | (i10 >>> 4 & 15)) & 16383;
	      out[outOffset + 6] = ((i10 << 10) | (i11 << 2 & 1023) | (i12 >>> 6 & 3)) & 16383;
	      out[outOffset + 7] = ((i12 << 8) | (i13 >>> 0 & 255)) & 16383;
		
		inpos.add(15);
		outpos.add(8);
	}
	protected static void fastunpack81(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];

	      out[outOffset + 0] = ((i0 << 7) | (i1 >>> 1 & 127)) & 32767;
	      out[outOffset + 1] = ((i1 << 14) | (i2 << 6 & 16383) | (i3 >>> 2 & 63)) & 32767;
	      out[outOffset + 2] = ((i3 << 13) | (i4 << 5 & 8191) | (i5 >>> 3 & 31)) & 32767;
	      out[outOffset + 3] = ((i5 << 12) | (i6 << 4 & 4095) | (i7 >>> 4 & 15)) & 32767;
	      out[outOffset + 4] = ((i7 << 11) | (i8 << 3 & 2047) | (i9 >>> 5 & 7)) & 32767;
	      out[outOffset + 5] = ((i9 << 10) | (i10 << 2 & 1023) | (i11 >>> 6 & 3)) & 32767;
	      out[outOffset + 6] = ((i11 << 9) | (i12 << 1 & 511) | (i13 >>> 7 & 1)) & 32767;
	      out[outOffset + 7] = ((i13 << 8) | (i14 >>> 0 & 255)) & 32767;
		
		inpos.add(16);
		outpos.add(8);
	}
	protected static void fastunpack82(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];

	      out[outOffset + 0] = ((i0 << 8) | (i1 >>> 0 & 255)) & 65535;
	      out[outOffset + 1] = ((i2 << 8) | (i3 >>> 0 & 255)) & 65535;
	      out[outOffset + 2] = ((i4 << 8) | (i5 >>> 0 & 255)) & 65535;
	      out[outOffset + 3] = ((i6 << 8) | (i7 >>> 0 & 255)) & 65535;
	      out[outOffset + 4] = ((i8 << 8) | (i9 >>> 0 & 255)) & 65535;
	      out[outOffset + 5] = ((i10 << 8) | (i11 >>> 0 & 255)) & 65535;
	      out[outOffset + 6] = ((i12 << 8) | (i13 >>> 0 & 255)) & 65535;
	      out[outOffset + 7] = ((i14 << 8) | (i15 >>> 0 & 255)) & 65535;
		
		inpos.add(17);
		outpos.add(8);
	}
	protected static void fastunpack83(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];

	      out[outOffset + 0] = ((i0 << 9) | (i1 << 1 & 511) | (i2 >>> 7 & 1)) & 131071;
	      out[outOffset + 1] = ((i2 << 10) | (i3 << 2 & 1023) | (i4 >>> 6 & 3)) & 131071;
	      out[outOffset + 2] = ((i4 << 11) | (i5 << 3 & 2047) | (i6 >>> 5 & 7)) & 131071;
	      out[outOffset + 3] = ((i6 << 12) | (i7 << 4 & 4095) | (i8 >>> 4 & 15)) & 131071;
	      out[outOffset + 4] = ((i8 << 13) | (i9 << 5 & 8191) | (i10 >>> 3 & 31)) & 131071;
	      out[outOffset + 5] = ((i10 << 14) | (i11 << 6 & 16383) | (i12 >>> 2 & 63)) & 131071;
	      out[outOffset + 6] = ((i12 << 15) | (i13 << 7 & 32767) | (i14 >>> 1 & 127)) & 131071;
	      out[outOffset + 7] = ((i14 << 16) | (i15 << 8 & 65535) | (i16 >>> 0 & 255)) & 131071;
		
		inpos.add(18);
		outpos.add(8);
	}
	protected static void fastunpack84(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];

	      out[outOffset + 0] = ((i0 << 10) | (i1 << 2 & 1023) | (i2 >>> 6 & 3)) & 262143;
	      out[outOffset + 1] = ((i2 << 12) | (i3 << 4 & 4095) | (i4 >>> 4 & 15)) & 262143;
	      out[outOffset + 2] = ((i4 << 14) | (i5 << 6 & 16383) | (i6 >>> 2 & 63)) & 262143;
	      out[outOffset + 3] = ((i6 << 16) | (i7 << 8 & 65535) | (i8 >>> 0 & 255)) & 262143;
	      out[outOffset + 4] = ((i9 << 10) | (i10 << 2 & 1023) | (i11 >>> 6 & 3)) & 262143;
	      out[outOffset + 5] = ((i11 << 12) | (i12 << 4 & 4095) | (i13 >>> 4 & 15)) & 262143;
	      out[outOffset + 6] = ((i13 << 14) | (i14 << 6 & 16383) | (i15 >>> 2 & 63)) & 262143;
	      out[outOffset + 7] = ((i15 << 16) | (i16 << 8 & 65535) | (i17 >>> 0 & 255)) & 262143;
		
		inpos.add(19);
		outpos.add(8);
	}
	protected static void fastunpack85(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];

	      out[outOffset + 0] = ((i0 << 11) | (i1 << 3 & 2047) | (i2 >>> 5 & 7)) & 524287;
	      out[outOffset + 1] = ((i2 << 14) | (i3 << 6 & 16383) | (i4 >>> 2 & 63)) & 524287;
	      out[outOffset + 2] = ((i4 << 17) | (i5 << 9 & 131071) | (i6 << 1 & 511) | (i7 >>> 7 & 1)) & 524287;
	      out[outOffset + 3] = ((i7 << 12) | (i8 << 4 & 4095) | (i9 >>> 4 & 15)) & 524287;
	      out[outOffset + 4] = ((i9 << 15) | (i10 << 7 & 32767) | (i11 >>> 1 & 127)) & 524287;
	      out[outOffset + 5] = ((i11 << 18) | (i12 << 10 & 262143) | (i13 << 2 & 1023) | (i14 >>> 6 & 3)) & 524287;
	      out[outOffset + 6] = ((i14 << 13) | (i15 << 5 & 8191) | (i16 >>> 3 & 31)) & 524287;
	      out[outOffset + 7] = ((i16 << 16) | (i17 << 8 & 65535) | (i18 >>> 0 & 255)) & 524287;
		
		inpos.add(20);
		outpos.add(8);
	}
	protected static void fastunpack86(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];

	      out[outOffset + 0] = ((i0 << 12) | (i1 << 4 & 4095) | (i2 >>> 4 & 15)) & 1048575;
	      out[outOffset + 1] = ((i2 << 16) | (i3 << 8 & 65535) | (i4 >>> 0 & 255)) & 1048575;
	      out[outOffset + 2] = ((i5 << 12) | (i6 << 4 & 4095) | (i7 >>> 4 & 15)) & 1048575;
	      out[outOffset + 3] = ((i7 << 16) | (i8 << 8 & 65535) | (i9 >>> 0 & 255)) & 1048575;
	      out[outOffset + 4] = ((i10 << 12) | (i11 << 4 & 4095) | (i12 >>> 4 & 15)) & 1048575;
	      out[outOffset + 5] = ((i12 << 16) | (i13 << 8 & 65535) | (i14 >>> 0 & 255)) & 1048575;
	      out[outOffset + 6] = ((i15 << 12) | (i16 << 4 & 4095) | (i17 >>> 4 & 15)) & 1048575;
	      out[outOffset + 7] = ((i17 << 16) | (i18 << 8 & 65535) | (i19 >>> 0 & 255)) & 1048575;
		
		inpos.add(21);
		outpos.add(8);
	}
	protected static void fastunpack87(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];

	      out[outOffset + 0] = ((i0 << 13) | (i1 << 5 & 8191) | (i2 >>> 3 & 31)) & 2097151;
	      out[outOffset + 1] = ((i2 << 18) | (i3 << 10 & 262143) | (i4 << 2 & 1023) | (i5 >>> 6 & 3)) & 2097151;
	      out[outOffset + 2] = ((i5 << 15) | (i6 << 7 & 32767) | (i7 >>> 1 & 127)) & 2097151;
	      out[outOffset + 3] = ((i7 << 20) | (i8 << 12 & 1048575) | (i9 << 4 & 4095) | (i10 >>> 4 & 15)) & 2097151;
	      out[outOffset + 4] = ((i10 << 17) | (i11 << 9 & 131071) | (i12 << 1 & 511) | (i13 >>> 7 & 1)) & 2097151;
	      out[outOffset + 5] = ((i13 << 14) | (i14 << 6 & 16383) | (i15 >>> 2 & 63)) & 2097151;
	      out[outOffset + 6] = ((i15 << 19) | (i16 << 11 & 524287) | (i17 << 3 & 2047) | (i18 >>> 5 & 7)) & 2097151;
	      out[outOffset + 7] = ((i18 << 16) | (i19 << 8 & 65535) | (i20 >>> 0 & 255)) & 2097151;
		
		inpos.add(22);
		outpos.add(8);
	}
	protected static void fastunpack88(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];

	      out[outOffset + 0] = ((i0 << 14) | (i1 << 6 & 16383) | (i2 >>> 2 & 63)) & 4194303;
	      out[outOffset + 1] = ((i2 << 20) | (i3 << 12 & 1048575) | (i4 << 4 & 4095) | (i5 >>> 4 & 15)) & 4194303;
	      out[outOffset + 2] = ((i5 << 18) | (i6 << 10 & 262143) | (i7 << 2 & 1023) | (i8 >>> 6 & 3)) & 4194303;
	      out[outOffset + 3] = ((i8 << 16) | (i9 << 8 & 65535) | (i10 >>> 0 & 255)) & 4194303;
	      out[outOffset + 4] = ((i11 << 14) | (i12 << 6 & 16383) | (i13 >>> 2 & 63)) & 4194303;
	      out[outOffset + 5] = ((i13 << 20) | (i14 << 12 & 1048575) | (i15 << 4 & 4095) | (i16 >>> 4 & 15)) & 4194303;
	      out[outOffset + 6] = ((i16 << 18) | (i17 << 10 & 262143) | (i18 << 2 & 1023) | (i19 >>> 6 & 3)) & 4194303;
	      out[outOffset + 7] = ((i19 << 16) | (i20 << 8 & 65535) | (i21 >>> 0 & 255)) & 4194303;
		
		inpos.add(23);
		outpos.add(8);
	}
	protected static void fastunpack89(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];

	      out[outOffset + 0] = ((i0 << 15) | (i1 << 7 & 32767) | (i2 >>> 1 & 127)) & 8388607;
	      out[outOffset + 1] = ((i2 << 22) | (i3 << 14 & 4194303) | (i4 << 6 & 16383) | (i5 >>> 2 & 63)) & 8388607;
	      out[outOffset + 2] = ((i5 << 21) | (i6 << 13 & 2097151) | (i7 << 5 & 8191) | (i8 >>> 3 & 31)) & 8388607;
	      out[outOffset + 3] = ((i8 << 20) | (i9 << 12 & 1048575) | (i10 << 4 & 4095) | (i11 >>> 4 & 15)) & 8388607;
	      out[outOffset + 4] = ((i11 << 19) | (i12 << 11 & 524287) | (i13 << 3 & 2047) | (i14 >>> 5 & 7)) & 8388607;
	      out[outOffset + 5] = ((i14 << 18) | (i15 << 10 & 262143) | (i16 << 2 & 1023) | (i17 >>> 6 & 3)) & 8388607;
	      out[outOffset + 6] = ((i17 << 17) | (i18 << 9 & 131071) | (i19 << 1 & 511) | (i20 >>> 7 & 1)) & 8388607;
	      out[outOffset + 7] = ((i20 << 16) | (i21 << 8 & 65535) | (i22 >>> 0 & 255)) & 8388607;
		
		inpos.add(24);
		outpos.add(8);
	}
	protected static void fastunpack90(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];

	      out[outOffset + 0] = ((i0 << 16) | (i1 << 8 & 65535) | (i2 >>> 0 & 255)) & 16777215;
	      out[outOffset + 1] = ((i3 << 16) | (i4 << 8 & 65535) | (i5 >>> 0 & 255)) & 16777215;
	      out[outOffset + 2] = ((i6 << 16) | (i7 << 8 & 65535) | (i8 >>> 0 & 255)) & 16777215;
	      out[outOffset + 3] = ((i9 << 16) | (i10 << 8 & 65535) | (i11 >>> 0 & 255)) & 16777215;
	      out[outOffset + 4] = ((i12 << 16) | (i13 << 8 & 65535) | (i14 >>> 0 & 255)) & 16777215;
	      out[outOffset + 5] = ((i15 << 16) | (i16 << 8 & 65535) | (i17 >>> 0 & 255)) & 16777215;
	      out[outOffset + 6] = ((i18 << 16) | (i19 << 8 & 65535) | (i20 >>> 0 & 255)) & 16777215;
	      out[outOffset + 7] = ((i21 << 16) | (i22 << 8 & 65535) | (i23 >>> 0 & 255)) & 16777215;
		
		inpos.add(25);
		outpos.add(8);
	}
	protected static void fastunpack91(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];

	      out[outOffset + 0] = ((i0 << 17) | (i1 << 9 & 131071) | (i2 << 1 & 511) | (i3 >>> 7 & 1)) & 33554431;
	      out[outOffset + 1] = ((i3 << 18) | (i4 << 10 & 262143) | (i5 << 2 & 1023) | (i6 >>> 6 & 3)) & 33554431;
	      out[outOffset + 2] = ((i6 << 19) | (i7 << 11 & 524287) | (i8 << 3 & 2047) | (i9 >>> 5 & 7)) & 33554431;
	      out[outOffset + 3] = ((i9 << 20) | (i10 << 12 & 1048575) | (i11 << 4 & 4095) | (i12 >>> 4 & 15)) & 33554431;
	      out[outOffset + 4] = ((i12 << 21) | (i13 << 13 & 2097151) | (i14 << 5 & 8191) | (i15 >>> 3 & 31)) & 33554431;
	      out[outOffset + 5] = ((i15 << 22) | (i16 << 14 & 4194303) | (i17 << 6 & 16383) | (i18 >>> 2 & 63)) & 33554431;
	      out[outOffset + 6] = ((i18 << 23) | (i19 << 15 & 8388607) | (i20 << 7 & 32767) | (i21 >>> 1 & 127)) & 33554431;
	      out[outOffset + 7] = ((i21 << 24) | (i22 << 16 & 16777215) | (i23 << 8 & 65535) | (i24 >>> 0 & 255)) & 33554431;
		
		inpos.add(26);
		outpos.add(8);
	}
	protected static void fastunpack92(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];
	      final byte i25 = in[inOffset + 25];

	      out[outOffset + 0] = ((i0 << 18) | (i1 << 10 & 262143) | (i2 << 2 & 1023) | (i3 >>> 6 & 3)) & 67108863;
	      out[outOffset + 1] = ((i3 << 20) | (i4 << 12 & 1048575) | (i5 << 4 & 4095) | (i6 >>> 4 & 15)) & 67108863;
	      out[outOffset + 2] = ((i6 << 22) | (i7 << 14 & 4194303) | (i8 << 6 & 16383) | (i9 >>> 2 & 63)) & 67108863;
	      out[outOffset + 3] = ((i9 << 24) | (i10 << 16 & 16777215) | (i11 << 8 & 65535) | (i12 >>> 0 & 255)) & 67108863;
	      out[outOffset + 4] = ((i13 << 18) | (i14 << 10 & 262143) | (i15 << 2 & 1023) | (i16 >>> 6 & 3)) & 67108863;
	      out[outOffset + 5] = ((i16 << 20) | (i17 << 12 & 1048575) | (i18 << 4 & 4095) | (i19 >>> 4 & 15)) & 67108863;
	      out[outOffset + 6] = ((i19 << 22) | (i20 << 14 & 4194303) | (i21 << 6 & 16383) | (i22 >>> 2 & 63)) & 67108863;
	      out[outOffset + 7] = ((i22 << 24) | (i23 << 16 & 16777215) | (i24 << 8 & 65535) | (i25 >>> 0 & 255)) & 67108863;
		
		inpos.add(27);
		outpos.add(8);
	}
	protected static void fastunpack93(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];
	      final byte i25 = in[inOffset + 25];
	      final byte i26 = in[inOffset + 26];

	      out[outOffset + 0] = ((i0 << 19) | (i1 << 11 & 524287) | (i2 << 3 & 2047) | (i3 >>> 5 & 7)) & 134217727;
	      out[outOffset + 1] = ((i3 << 22) | (i4 << 14 & 4194303) | (i5 << 6 & 16383) | (i6 >>> 2 & 63)) & 134217727;
	      out[outOffset + 2] = ((i6 << 25) | (i7 << 17 & 33554431) | (i8 << 9 & 131071) | (i9 << 1 & 511) | (i10 >>> 7 & 1)) & 134217727;
	      out[outOffset + 3] = ((i10 << 20) | (i11 << 12 & 1048575) | (i12 << 4 & 4095) | (i13 >>> 4 & 15)) & 134217727;
	      out[outOffset + 4] = ((i13 << 23) | (i14 << 15 & 8388607) | (i15 << 7 & 32767) | (i16 >>> 1 & 127)) & 134217727;
	      out[outOffset + 5] = ((i16 << 26) | (i17 << 18 & 67108863) | (i18 << 10 & 262143) | (i19 << 2 & 1023) | (i20 >>> 6 & 3)) & 134217727;
	      out[outOffset + 6] = ((i20 << 21) | (i21 << 13 & 2097151) | (i22 << 5 & 8191) | (i23 >>> 3 & 31)) & 134217727;
	      out[outOffset + 7] = ((i23 << 24) | (i24 << 16 & 16777215) | (i25 << 8 & 65535) | (i26 >>> 0 & 255)) & 134217727;
		
		inpos.add(28);
		outpos.add(8);
	}
	protected static void fastunpack94(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];
	      final byte i25 = in[inOffset + 25];
	      final byte i26 = in[inOffset + 26];
	      final byte i27 = in[inOffset + 27];

	      out[outOffset + 0] = ((i0 << 20) | (i1 << 12 & 1048575) | (i2 << 4 & 4095) | (i3 >>> 4 & 15)) & 268435455;
	      out[outOffset + 1] = ((i3 << 24) | (i4 << 16 & 16777215) | (i5 << 8 & 65535) | (i6 >>> 0 & 255)) & 268435455;
	      out[outOffset + 2] = ((i7 << 20) | (i8 << 12 & 1048575) | (i9 << 4 & 4095) | (i10 >>> 4 & 15)) & 268435455;
	      out[outOffset + 3] = ((i10 << 24) | (i11 << 16 & 16777215) | (i12 << 8 & 65535) | (i13 >>> 0 & 255)) & 268435455;
	      out[outOffset + 4] = ((i14 << 20) | (i15 << 12 & 1048575) | (i16 << 4 & 4095) | (i17 >>> 4 & 15)) & 268435455;
	      out[outOffset + 5] = ((i17 << 24) | (i18 << 16 & 16777215) | (i19 << 8 & 65535) | (i20 >>> 0 & 255)) & 268435455;
	      out[outOffset + 6] = ((i21 << 20) | (i22 << 12 & 1048575) | (i23 << 4 & 4095) | (i24 >>> 4 & 15)) & 268435455;
	      out[outOffset + 7] = ((i24 << 24) | (i25 << 16 & 16777215) | (i26 << 8 & 65535) | (i27 >>> 0 & 255)) & 268435455;
		
		inpos.add(29);
		outpos.add(8);
	}
	protected static void fastunpack95(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];
	      final byte i25 = in[inOffset + 25];
	      final byte i26 = in[inOffset + 26];
	      final byte i27 = in[inOffset + 27];
	      final byte i28 = in[inOffset + 28];

	      out[outOffset + 0] = ((i0 << 21) | (i1 << 13 & 2097151) | (i2 << 5 & 8191) | (i3 >>> 3 & 31)) & 536870911;
	      out[outOffset + 1] = ((i3 << 26) | (i4 << 18 & 67108863) | (i5 << 10 & 262143) | (i6 << 2 & 1023) | (i7 >>> 6 & 3)) & 536870911;
	      out[outOffset + 2] = ((i7 << 23) | (i8 << 15 & 8388607) | (i9 << 7 & 32767) | (i10 >>> 1 & 127)) & 536870911;
	      out[outOffset + 3] = ((i10 << 28) | (i11 << 20 & 268435455) | (i12 << 12 & 1048575) | (i13 << 4 & 4095) | (i14 >>> 4 & 15)) & 536870911;
	      out[outOffset + 4] = ((i14 << 25) | (i15 << 17 & 33554431) | (i16 << 9 & 131071) | (i17 << 1 & 511) | (i18 >>> 7 & 1)) & 536870911;
	      out[outOffset + 5] = ((i18 << 22) | (i19 << 14 & 4194303) | (i20 << 6 & 16383) | (i21 >>> 2 & 63)) & 536870911;
	      out[outOffset + 6] = ((i21 << 27) | (i22 << 19 & 134217727) | (i23 << 11 & 524287) | (i24 << 3 & 2047) | (i25 >>> 5 & 7)) & 536870911;
	      out[outOffset + 7] = ((i25 << 24) | (i26 << 16 & 16777215) | (i27 << 8 & 65535) | (i28 >>> 0 & 255)) & 536870911;
		
		inpos.add(30);
		outpos.add(8);
	}
	protected static void fastunpack96(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];
	      final byte i25 = in[inOffset + 25];
	      final byte i26 = in[inOffset + 26];
	      final byte i27 = in[inOffset + 27];
	      final byte i28 = in[inOffset + 28];
	      final byte i29 = in[inOffset + 29];

	      out[outOffset + 0] = ((i0 << 22) | (i1 << 14 & 4194303) | (i2 << 6 & 16383) | (i3 >>> 2 & 63)) & 1073741823;
	      out[outOffset + 1] = ((i3 << 28) | (i4 << 20 & 268435455) | (i5 << 12 & 1048575) | (i6 << 4 & 4095) | (i7 >>> 4 & 15)) & 1073741823;
	      out[outOffset + 2] = ((i7 << 26) | (i8 << 18 & 67108863) | (i9 << 10 & 262143) | (i10 << 2 & 1023) | (i11 >>> 6 & 3)) & 1073741823;
	      out[outOffset + 3] = ((i11 << 24) | (i12 << 16 & 16777215) | (i13 << 8 & 65535) | (i14 >>> 0 & 255)) & 1073741823;
	      out[outOffset + 4] = ((i15 << 22) | (i16 << 14 & 4194303) | (i17 << 6 & 16383) | (i18 >>> 2 & 63)) & 1073741823;
	      out[outOffset + 5] = ((i18 << 28) | (i19 << 20 & 268435455) | (i20 << 12 & 1048575) | (i21 << 4 & 4095) | (i22 >>> 4 & 15)) & 1073741823;
	      out[outOffset + 6] = ((i22 << 26) | (i23 << 18 & 67108863) | (i24 << 10 & 262143) | (i25 << 2 & 1023) | (i26 >>> 6 & 3)) & 1073741823;
	      out[outOffset + 7] = ((i26 << 24) | (i27 << 16 & 16777215) | (i28 << 8 & 65535) | (i29 >>> 0 & 255)) & 1073741823;
		
		inpos.add(31);
		outpos.add(8);
	}
	protected static void fastunpack97(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];
	      final byte i25 = in[inOffset + 25];
	      final byte i26 = in[inOffset + 26];
	      final byte i27 = in[inOffset + 27];
	      final byte i28 = in[inOffset + 28];
	      final byte i29 = in[inOffset + 29];
	      final byte i30 = in[inOffset + 30];

	      out[outOffset + 0] = ((i0 << 23) | (i1 << 15 & 8388607) | (i2 << 7 & 32767) | (i3 >>> 1 & 127)) & 2147483647;
	      out[outOffset + 1] = ((i3 << 30) | (i4 << 22 & 1073741823) | (i5 << 14 & 4194303) | (i6 << 6 & 16383) | (i7 >>> 2 & 63)) & 2147483647;
	      out[outOffset + 2] = ((i7 << 29) | (i8 << 21 & 536870911) | (i9 << 13 & 2097151) | (i10 << 5 & 8191) | (i11 >>> 3 & 31)) & 2147483647;
	      out[outOffset + 3] = ((i11 << 28) | (i12 << 20 & 268435455) | (i13 << 12 & 1048575) | (i14 << 4 & 4095) | (i15 >>> 4 & 15)) & 2147483647;
	      out[outOffset + 4] = ((i15 << 27) | (i16 << 19 & 134217727) | (i17 << 11 & 524287) | (i18 << 3 & 2047) | (i19 >>> 5 & 7)) & 2147483647;
	      out[outOffset + 5] = ((i19 << 26) | (i20 << 18 & 67108863) | (i21 << 10 & 262143) | (i22 << 2 & 1023) | (i23 >>> 6 & 3)) & 2147483647;
	      out[outOffset + 6] = ((i23 << 25) | (i24 << 17 & 33554431) | (i25 << 9 & 131071) | (i26 << 1 & 511) | (i27 >>> 7 & 1)) & 2147483647;
	      out[outOffset + 7] = ((i27 << 24) | (i28 << 16 & 16777215) | (i29 << 8 & 65535) | (i30 >>> 0 & 255)) & 2147483647;
		
		inpos.add(32);
		outpos.add(8);
	}
	protected static void fastunpack98(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final byte i0 = in[inOffset + 0];
	      final byte i1 = in[inOffset + 1];
	      final byte i2 = in[inOffset + 2];
	      final byte i3 = in[inOffset + 3];
	      final byte i4 = in[inOffset + 4];
	      final byte i5 = in[inOffset + 5];
	      final byte i6 = in[inOffset + 6];
	      final byte i7 = in[inOffset + 7];
	      final byte i8 = in[inOffset + 8];
	      final byte i9 = in[inOffset + 9];
	      final byte i10 = in[inOffset + 10];
	      final byte i11 = in[inOffset + 11];
	      final byte i12 = in[inOffset + 12];
	      final byte i13 = in[inOffset + 13];
	      final byte i14 = in[inOffset + 14];
	      final byte i15 = in[inOffset + 15];
	      final byte i16 = in[inOffset + 16];
	      final byte i17 = in[inOffset + 17];
	      final byte i18 = in[inOffset + 18];
	      final byte i19 = in[inOffset + 19];
	      final byte i20 = in[inOffset + 20];
	      final byte i21 = in[inOffset + 21];
	      final byte i22 = in[inOffset + 22];
	      final byte i23 = in[inOffset + 23];
	      final byte i24 = in[inOffset + 24];
	      final byte i25 = in[inOffset + 25];
	      final byte i26 = in[inOffset + 26];
	      final byte i27 = in[inOffset + 27];
	      final byte i28 = in[inOffset + 28];
	      final byte i29 = in[inOffset + 29];
	      final byte i30 = in[inOffset + 30];
	      final byte i31 = in[inOffset + 31];

	      out[outOffset + 0] = ((i0 << 24) | (i1 << 16 & 16777215) | (i2 << 8 & 65535) | (i3 >>> 0 & 255));
	      out[outOffset + 1] = ((i4 << 24) | (i5 << 16 & 16777215) | (i6 << 8 & 65535) | (i7 >>> 0 & 255));
	      out[outOffset + 2] = ((i8 << 24) | (i9 << 16 & 16777215) | (i10 << 8 & 65535) | (i11 >>> 0 & 255));
	      out[outOffset + 3] = ((i12 << 24) | (i13 << 16 & 16777215) | (i14 << 8 & 65535) | (i15 >>> 0 & 255));
	      out[outOffset + 4] = ((i16 << 24) | (i17 << 16 & 16777215) | (i18 << 8 & 65535) | (i19 >>> 0 & 255));
	      out[outOffset + 5] = ((i20 << 24) | (i21 << 16 & 16777215) | (i22 << 8 & 65535) | (i23 >>> 0 & 255));
	      out[outOffset + 6] = ((i24 << 24) | (i25 << 16 & 16777215) | (i26 << 8 & 65535) | (i27 >>> 0 & 255));
	      out[outOffset + 7] = ((i28 << 24) | (i29 << 16 & 16777215) | (i30 << 8 & 65535) | (i31 >>> 0 & 255));
		
		inpos.add(33);
		outpos.add(8);
	}
}
