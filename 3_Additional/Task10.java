import java.util.Scanner;


public class Task10 {
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
	static int[] findMaxInRow(int[][] array) {
		int[] maxArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int max = array[i][0];
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			maxArray[i] = max;
		}
		return maxArray;
	}
	static int[] findMaxInCol(int[][] array) {
		int[] maxArray = new int[array[0].length];
		for (int i = 0; i < array.length; i++) {
			int max = array[0][i];
			for (int j = 0; j < array[i].length; j++) {
				if (array[j][i] > max) {
					max = array[j][i];
				}
			}
			maxArray[i] = max;
		}
		return maxArray;
	}
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[][] array = createArray();
		printArray(array);
		int[] maxInRow = findMaxInRow(array);
		int[] maxInCol = findMaxInCol(array);
		printArray(maxInRow);
		printArray(maxInCol);
	}
}