package JavaPrograms;
/*
Given a number n , for each integer i in the range from 1 to n , print one value per line as follows :
	if i is a multilple of both 3 and 5 , print FizzBuzz
	if i is a multiple of 3 but not 5 print fizz
	if i is a multiple of 5 but not 3 print buzz
	if i is not a multiple of 3 or 5 print the value of i*/

public class FizzBuzz {

	public static String fizBuz(int n, int i) {
		String result = null;
		for (int j = 0; j <= n; j++) {
			if (i % 3 == 0 && i % 5 == 0)
				result = "FizzBuzz";
			else if (i % 3 == 0 && i % 5 != 0)
				result = "Fizz";
			else if (i % 3 != 0 && i % 5 == 0)
				result = "Buzz";
			else
				return String.valueOf(i);

		}
		return result;

	}
	public static void main(String[] args) {
		System.out.println(fizBuz(30, 12));
		System.out.println(fizBuz(30, 15));
		System.out.println(fizBuz(30, 20));
		System.out.println(fizBuz(30, 17));
	}

}
