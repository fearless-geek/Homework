import java.util.Scanner;


public class Task3 {
	static int[][] createArray() {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int [][] array = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
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
	static int sumDigits(int num) {
		int res = 0;
		while (num > 0) {
			int last = num % 10;
			res += last;
			num /= 10;
		}
		return res;
	}
	static boolean checkRule(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			int counter = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (sumDigits(array[i][j]) % 5 == 0) {
					counter += 1;
				}
			}
			if (counter < 2) {
				return false;
			}

		}
		return true;
	}
	public static void main(String[] args) {
		int [][] array = createArray();
		printArray(array);
		String answer = (checkRule(array)) ? "Yes" : "No";
		System.out.println(answer);
	}
}