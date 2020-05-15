package JavaPrograms;

import java.util.ArrayList;
/*You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API

		Given n = 5, and version = 4 is the first bad version.

		call isBadVersion(3) -> false
		call isBadVersion(5) -> true
		call isBadVersion(4) -> true

		Then 4 is the first bad version.*/

public class FirstBadVersion {

	public static void main(String[] args) {

		int n = 10;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int o = 1; o <= 10; o++) {
			arr.add(o);
		}

		if (arr.contains(n)) {
			for (int i = 0; i < arr.indexOf(n); i++) {
				System.out.println("Version " + arr.get(i) + " True");
			}
			for (int j = arr.indexOf(n); j < arr.size(); j++) {
				System.out.println("Version " + arr.get(j) + " False");
			}

		} else {
			System.out.println("Please Enter a Valid Version");
		}

	}

}
