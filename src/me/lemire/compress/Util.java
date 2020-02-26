/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.compress;

/**
 * Routine utility functions.
 * 
 * @author Daniel Lemire
 * 
 */
public final class Util {
		//max bit for a sequence of integers, from $pos to $pos+length
        public static int maxbits(int[] in, int pos, int length) {
                int mask = 0;
                for (int k = pos; k < pos + length; ++k)
                        mask |= in[k];
                return bits(mask);
        }
        //max bit for 32 integers
        protected static int maxbits32(int[] in, int pos) {
                int mask = in[pos];
                mask |= in[pos + 1];
                mask |= in[pos + 2];
                mask |= in[pos + 3];
                mask |= in[pos + 4];
                mask |= in[pos + 5];
                mask |= in[pos + 6];
                mask |= in[pos + 7];
                mask |= in[pos + 8];
                mask |= in[pos + 9];
                mask |= in[pos + 10];
                mask |= in[pos + 11];
                mask |= in[pos + 12];
                mask |= in[pos + 13];
                mask |= in[pos + 14];
                mask |= in[pos + 15];
                mask |= in[pos + 16];
                mask |= in[pos + 17];
                mask |= in[pos + 18];
                mask |= in[pos + 19];
                mask |= in[pos + 20];
                mask |= in[pos + 21];
                mask |= in[pos + 22];
                mask |= in[pos + 23];
                mask |= in[pos + 24];
                mask |= in[pos + 25];
                mask |= in[pos + 26];
                mask |= in[pos + 27];
                mask |= in[pos + 28];
                mask |= in[pos + 29];
                mask |= in[pos + 30];
                mask |= in[pos + 31];
                return bits(mask);
        }

        protected static int maxdiffbits(int initoffset, int[] i, int pos, int length) {
                int mask = 0;
                mask |= (i[pos] - initoffset);
                for (int k = pos + 1; k < pos + length; ++k) {
                        mask |= i[k] - i[k - 1];
                }
                return bits(mask);
        }

        protected static int bits(int i) {
                return 32 - Integer.numberOfLeadingZeros(i);
        }

        protected static int floorBy(int value, int factor) {
                return value - value % factor;
        }
}
