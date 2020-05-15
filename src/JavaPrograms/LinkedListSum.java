package JavaPrograms;

import java.util.LinkedList;

/*
 * Input linked list : 1->3->4 and 2-> 3-> 7
 * 
 * Output should be : 732 + 431 = 1,163
 * 
 * so output is 3->6->1->1 Linked list
 */
public class LinkedListSum {

	public static void main(String[] args) {
		String c = "", t = "";

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		int temp = list1.get(0);
		list1.add(3);
		list1.add(4);
		list1.set(0, list1.getLast());
		list1.set(2, temp);

		for (int i : list1) {

			c += i;

		}

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(2);
		int temp1 = list2.get(0);
		list2.add(3);
		list2.add(7);
		list2.set(0, list2.getLast());
		list2.set(2, temp1);

		for (int i : list2) {
			t += i;

		}

		StringBuilder sb = new StringBuilder(String.valueOf(Integer.valueOf(t) + Integer.valueOf(c)));

		LinkedList<Integer> result2 = new LinkedList<Integer>();

		int[] digits = sb.reverse().toString().chars().map(cha -> cha - '0').toArray();
		for (int d : digits) {
			result2.add(d);
		}
		System.out.print(result2);

	}

}
