package JavaPrograms;

import java.util.LinkedList;

public class LinkedListSum {

	/*
	 * Input linked list : 1->3->4 and 2-> 3-> 7
	 * 
	 * Output should be : 732 + 431 = 1,163
	 * 
	 * so output is 3->6->1->1 Linked list
	 */

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
		int val = Integer.valueOf(c);
		// System.out.println(val);
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
		int val1 = Integer.valueOf(t) + val;
		StringBuilder sb = new StringBuilder(String.valueOf(val1));

		//System.out.println(sb.reverse().toString());
		
		LinkedList<Integer> result2 = new LinkedList<Integer>();
		
		int[] digits = sb.reverse().toString().chars().map(cha -> cha -'0').toArray();  
	    for(int d : digits)
	    {
	    	result2.add(d);
	    }
	        System.out.print(result2);

		/*
		 * System.out.println(result2);
		 * 
		 * System.out.println(val1);
		 * 
		 * System.out.println(list1); System.out.println(list2);
		 */
	}

}
