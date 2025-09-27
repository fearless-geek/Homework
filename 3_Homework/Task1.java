import java.util.Scanner;


public class Task1 {
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
	static boolean checkRule(int[][] array) {
		for (int j = 0; j < array[0].length; j++) {
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i][j] % 3 == 0) {
					counter += 1;
				}
				if (counter == array.length) {
					return true;
				}

			}
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