import java.util.Scanner;


public class Task12 {
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
	static int[][] processArray(int[][] array) {
		int[][] newArray = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					newArray[i][j] = 1;
				} else {
					if (i + j + 2 == array.length + 1) {
						newArray[i][j] = 2;
					}
				}
			}
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[][] array = createArray();
		printArray(array);
		int [][] newArray = processArray(array);
		printArray(newArray);
	}
}