package JavaPrograms;

public class MonkeyProblem {
	public static int monkeyProblem(int x, int y, int n) {
		int steps;

		if (x < y)
			return -1;
		else if (x > n / 2) {
			steps = n / (x - y);
			steps++;
		} else {

			steps = (n - x) / (x - y);

			if (n >= steps * (x - y))
				steps++;
		}

		return steps;

	}

	public static void main(String[] args) {

		System.out.println("Total Steps taken = " + monkeyProblem(5, 2, 20));
		System.out.println("Total Steps taken = " + monkeyProblem(3, 2, 10));
		System.out.println("Total Steps taken = " + monkeyProblem(6, 2, 10));

	}

}
