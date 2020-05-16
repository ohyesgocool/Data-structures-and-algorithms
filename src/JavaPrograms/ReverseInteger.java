package JavaPrograms;

/*Given a 32-bit signed integer, reverse digits of an integer.
Input: 123
Output: 321

Input: 120
Output: 21*/
public class ReverseInteger {
	public static int reverse(int x) {

		StringBuilder sb = new StringBuilder(Integer.toString(x));
		return Integer.valueOf(sb.reverse().toString());

	}

	public static void main(String[] args) {

		System.out.println(reverse(123));
		System.out.println(reverse(120));
	}

}
