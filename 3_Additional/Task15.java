import java.util.Scanner;


public class Task15 {
	static int[][] createArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		return array;
	}
	static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int sumDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int last = number % 10;
			number /= 10;
			sum += last;
		}
		return sum;
	}
	static boolean checkRule(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = 0; j < array.length; j++) {
				if (sumDigits(array[i][j]) % 7 == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] array = createArray();
		printArray(array);
		String answer = (checkRule(array)) ? "Yes" : "No";
		System.out.println(answer);
	}
}