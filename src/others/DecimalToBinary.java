/**
 * 
 */
package others;

/**
 * @author NDcruz
 *
 */
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(toBinaryString(0));
	}
	
	//First solution - repeated divide by 2
	public static String toBinaryString(int i) {
		StringBuilder s = new StringBuilder();
		if(i == 0) {
			return "0";
		}
		while(i>0) {
			s.append(i%2);
			i/=2;
		}
		
		//Reverse to display since the output will be from least significant to Most significant bit
		return s.reverse().toString();
	}
}
