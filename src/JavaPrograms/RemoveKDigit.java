package JavaPrograms;
//Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible. 

/*//Input: num = "1432219", k = 3
	Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.*/

public class RemoveKDigit {

	public static String removeKdigits(String num, int k) {
		if (num.length() <= k)
			return "0";
		if (k == 0)
			return num;

		for (int i = 0; i < k; i++) { // k=3
			boolean flag = false;
			for (int j = 1; j < num.length(); j++) {

				if (num.charAt(j - 1) > num.charAt(j)) {

					num = num.substring(0, j - 1) + num.substring(j, num.length());
					flag = true;
					break;
				} else
					continue;
			}
			if (!flag)
				num = num.substring(0, num.length() - 1);
		}

		boolean flag = false;
		for (int ii = 0; ii < num.length(); ii++) {
			if (num.charAt(ii) == '0')
				flag = true;
			else {
				System.out.println("Number After Removing K Digit is : " + num);
				return num.substring(ii, num.length());
			}
		}
		if (flag)
			return "0";

		return num;

	}

	public static void main(String[] args) {
		removeKdigits("1432219", 3);

	}

}
