/**
 * 
 */
package others;

/**
 * @author NDcruz
 * 
 * credit : https://tech.liuchao.me/2016/11/count-bits-of-integer/
 *
 */
public class CountBitsInInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 255;
		System.out.println("countBits : " + num + " ==> " + Integer.toBinaryString(num) + " ==> " + countBits(num));
		System.out.println("countBitsBetter : " + num + " ==> " + Integer.toBinaryString(num) + " ==> " + countBitsBetter(num));
	}
	
	//First solution - Naive since right shift will keep decreasing value of n and at some point n will become 0
	// but this solution will keep going for all 32
	public static int countBits(int n) {
		int count = 0;
		for (int i=0; i < 32; i++) {
			System.out.println("in loop");
			count += n & 1;
			n >>= 1;
		}
		return count;
	}
	
	//Better solution - only while n > 0
	public static int countBitsBetter(int n) {
		int count = 0;
		while (n > 0) {
			System.out.println("in loop");
			count += n & 1;
			n >>= 1;
		}
		return count;
	}
	
}
