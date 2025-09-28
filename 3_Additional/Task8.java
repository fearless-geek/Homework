import java.util.Scanner;


public class Task8 {
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
	static int findSum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] array2D = createArray();
		printArray(array2D);
		for (int[] array : array2D) {
			System.out.println(findSum(array));
		} 
	}
}