import java.util.Scanner;


public class Task2 {
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
 	static int sumDigits(int number) {
 		int sum = 0;
 		while (number > 0) {
 			int lastDigit = number % 10;
 			number /= 10;
 			sum += lastDigit;
 		}
 		return sum;
 	}
 	static boolean checkCondition(int[][] matrix) {
 		boolean flag = false;
 		for (int i = 0; i < matrix.length; i++) {
 			for (int j = 0; j < matrix[i].length - 1; j++) {
 				if (sumDigits(matrix[j][i]) != sumDigits(matrix[j + 1][i])) {
 					break;
 				} else {
 					flag = true;
 				}
 			}
 			if (flag == true) {
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