package JavaPrograms;

import java.util.LinkedList;

/*Given a singly linked list, determine if it is a palindrome.
Example 1:
Input: 1->2
Output: false
Example 2:
Input: 1->2->2->1
Output: true*/

public class PalindromeLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);
		String t = "";
		for (int i : list) {
			t += i;

		}
		if (t.equals(new StringBuilder(t).reverse().toString())) {
			System.out.println("True");
		} else
			System.out.println("False");
	}

}
