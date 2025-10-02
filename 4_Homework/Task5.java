import java.util.Scanner;


public class Task5 {
	static int[][] createZeroMatrix() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows and colums amount:");
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = 0;
			}
		}
		return matrix;
	}
	static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
 	}
 	static int[][] createRequiredMatrix(int[][] matrix) {
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
		int[][] matrix = createZeroMatrix();
		int[][] requiredMatrix = createRequiredMatrix(matrix);
		printMatrix(requiredMatrix);
	}
}