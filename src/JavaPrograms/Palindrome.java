package JavaPrograms;


/*To Check whether the given number is palindrome or not */
public class Palindrome {

	public static boolean isPalindrome(int n)
	{		
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		StringBuilder sb1 = sb.reverse();
		System.out.println(Integer.valueOf(sb.toString()));
		System.out.println(Integer.valueOf(sb1.toString()));
		System.out.println(sb1);
		
		if (Integer.valueOf(sb.toString()) == Integer.valueOf(sb1.toString()) )
				{
					return true;
				}
		

		else 
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(123321));
		

	}

}
