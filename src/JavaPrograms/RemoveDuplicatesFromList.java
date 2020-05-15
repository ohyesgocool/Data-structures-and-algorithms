package JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Map.Entry;

/*Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Input: 1->2->3->3->4->4->5
Output: 1->2->5
*/

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		LinkedList<Integer> sorted = new LinkedList<>();
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(3);
		sorted.add(4);
		sorted.add(4);
		sorted.add(5);
		HashMap<Integer, Integer> mp = new HashMap<>();
		int d;
		for (int i = 0; i < sorted.size(); i++) {
			if (mp.containsKey(sorted.get(i)))
				mp.put(sorted.get(i), 1 + mp.get(sorted.get(i)));
			else
				mp.put(sorted.get(i), 1);
		}
		LinkedList<Integer> result = new LinkedList<>();
		for (Iterator<Entry<Integer, Integer>> iterator = mp.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, Integer> entry = iterator.next();
			if (Integer.parseInt(String.valueOf(entry.getValue())) == 1) {
				d = (int) entry.getKey();

				result.add(d);

			}

		}

		System.out.println(result);
	}
}
