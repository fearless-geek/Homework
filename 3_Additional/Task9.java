import java.util.Scanner;


public class Task9 {
	static int[][] createArray() {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int[][] array = new int[rows][cols];
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
	static int[][] transposeArray(int[][] array) {
		int[][] transposedArray = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				transposedArray[j][i] = array[i][j];
			}
		}
		return transposedArray;
	}
	public static void main(String[] args) {
		int[][] array = createArray();
		int[][] transposedArray = transposeArray(array);
		printArray(array);
		printArray(transposedArray);
	}
}