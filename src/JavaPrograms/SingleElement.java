package JavaPrograms;
import java.util.HashMap;
import java.util.Map;

// Problem statement - Find out the single element in an array 
// Example - Input [7,9,7,5,0,0,5,] output - [9]
public class SingleElement {

	public static void main(String[] args) {
       
        int[] arr = { 1,1,2,2,4,5,5 };
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
                mp.put(arr[i], 1 + mp.get(arr[i]));
            else
                mp.put(arr[i], 1);
        }
        for (Map.Entry entry : mp.entrySet())
        {
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1)
                System.out.print(entry.getKey() + " ");
               
        }
    }
	
}