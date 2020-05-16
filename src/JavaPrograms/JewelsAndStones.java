package JavaPrograms;

import java.util.ArrayList;

/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Input: J = "aA", S = "aAAbbbb"
Output: 3*/

public class JewelsAndStones {

	public static int numJewelsInStones(String J, String S) {
		char jewels[] = J.toCharArray();
		char stone[] = S.toCharArray();

		int count = 0;
		for (int i = 0; i < jewels.length; i++) {
			for (int j = 0; j < stone.length; j++) {
				if (jewels[i] == stone[j])
					count++;

			}
		}

		return count;

	}

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));

	}

}
