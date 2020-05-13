package JavaPrograms;
//Given an array , count element x such that x+1 is also in the array 

//array = {1,2,3} ||  1 +1 =2 count =1 || 2+1 =3 count=2 || 3 +1 =4 not an elment of array so return Output as 2 

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
	public static int countElements(int a[]) {

		Set<Integer> st = new HashSet<Integer>();
		for (int var : a) {
			st.add(var);
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (st.contains(a[i] + 1)) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int result = countElements(arr);
		System.out.println(result);
	}
}
