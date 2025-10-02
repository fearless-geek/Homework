import java.util.Scanner;


public class Task4 {
	static int[][] createMatrix() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows amount:");
		int rows = scanner.nextInt();
		System.out.println("Enter colums amount:");
		int cols = scanner.nextInt();
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter element of " + (i + 1) + " row " + (j + 1) + " column");
				matrix[i][j] = scanner.nextInt();
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
 	static boolean isStrictAscending(int number) {
 		int previous = 10;
 		boolean flag = true;
 		while (number > 0) {
 			int lastDigit = number % 10;
 			if (lastDigit < previous) {
 				previous = lastDigit;
 			} else {
 				flag = false;
 				break;
 			}
 			number /= 10;
 		}
 		return flag;
 	}
 	static boolean checkCondition(int[][] matrix) {
 		boolean flag = true;
 		for (int i = 0; i < matrix.length; i++) {
 			int counter = 0;
 			for (int j = 0; j < matrix[i].length; j++) {
 				if (isStrictAscending(matrix[i][j])) {
 					counter += 1;
 				}
 			}
 			if (counter != 2) {
 				flag = false;
 				break;
 			}
 		}
 		return flag;
 	}
	public static void main(String[] args) {
		int[][] matrix = createMatrix();
		printMatrix(matrix);
		String answer = (checkCondition(matrix)) ? "Yes" : "No";
		System.out.println(answer);
	}
}