package JavaPrograms;
import java.util.ArrayList;
public class AmazonPerfectNumber {
	public static boolean isPerfect(int T) {
		ArrayList<Integer> result = new ArrayList<>();
		int i, sum = 0;
		for (i = 1; i < T; i++) {
			if (T % i == 0)
				result.add(i);
		}
		for (int j = 0; j < result.size(); j++) {
			sum = sum + result.get(j);
		}
		if (sum == T)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(isPerfect(6));
		System.out.println(isPerfect(7));
		System.out.println(isPerfect(32));
		System.out.println(isPerfect(5));
		System.out.println(isPerfect(28));
	}
}
