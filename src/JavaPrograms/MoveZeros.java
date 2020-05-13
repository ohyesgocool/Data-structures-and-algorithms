package JavaPrograms;

//Given an array move the non zero elements to the left and all zero's followed by them
// Input a[1,4,0,9,6,0] out put is supposed to be a[1,4,9,6,0,0]
public class MoveZeros {
	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 3, 0, 0, 2, 89 };
		int n = a.length;
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				a[c++] = a[i];
			}
		}
		while (c < n) {
			a[c++] = 0;
		}
		for (int j = 0; j < n; j++) {
			System.out.println(a[j] + "");
		}
	}
}
