import java.util.Scanner;


public class Task6 {
	static int[][] createMatrix() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}
		return matrix;
	}
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int[][] createRequiredMatrix(int[][] matrix) {
		for (int i = 1; i < matrix.length - 1; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				matrix[i][j] = 1;
			}
		}
		int targetIndex = (int) matrix.length / 2;
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][targetIndex] = 1;
		}
		for (int j = 0; j < matrix.length; j++) {
			matrix[targetIndex][j] = 1;
		}
		return matrix;
	}
	public static void main(String[] args) {
		int[][] matrix = createMatrix();
		printMatrix(matrix);
		int[][] requiredMatrix = createRequiredMatrix(matrix);
		printMatrix(requiredMatrix);
	}
}