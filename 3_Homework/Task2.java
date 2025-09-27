import java.util.Scanner;


public class Task2 {
	static int[][] createArray() {
		// creating 2d array
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int[][] array = new int[rows][cols];

		// input elements
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
	static boolean isEven(int num) {
		int i = 0;
		int counter = 0;
		while (num > 0) {
			i += 1;
			int last = num % 10;
			if (last % 2 == 0) {
				counter += 1;
			}
			num /= 10;
		}
		if (counter == i) {
			return true;
		}
		return false;
	}
	static boolean checkRule(int[][] array) {
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			
			int counter = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (isEven(array[i][j])) {
					counter += 1;
				}
			}
			if (counter == 1) {
				res += 1;
			}
		}
		if (res == array.length) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] array = createArray();
		printArray(array);
		boolean isGood = checkRule(array);
		String answer = (isGood)? "Yes" : "No";
		System.out.println(answer); 
	}
}