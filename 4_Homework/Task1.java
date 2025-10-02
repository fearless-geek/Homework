import java.util.Scanner;


public class Task1 {
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
 	static int findRank(int number) {
 		int counter = 0;
 		while (number > 0) {
 			number /= 10;
 			counter += 1;
 		}
 		return counter - 1;
 	}
 	static int pow(int base, int exp) {
 		int result = 1;
 		for (int i = 1; i <= exp; i++) {
 			result *= base;
 		}
 		return result;
 	}
 	static int findHighestFirstDigit(int number) {
 		int divisor = pow(10, findRank(number));
 		int result = number / divisor;
 		return result;
 	}
 	static boolean isPalindrom(int number) {
 		boolean flag = true;
 		while (number > 0) {
 			int lastDigit = number % 10;
 			int firstDigit = findHighestFirstDigit(number);
 			if (firstDigit != lastDigit) {
 				flag = false;
 				break;
 			}
 			number -= firstDigit * pow(10, findRank(number));
 			number /= 10;
 		}
 		return flag;
 	}
 	static boolean checkRule(int[][] matrix) {
 		int rowCounter = 0;
 		for (int i = 0; i < matrix.length; i++) {
 			int counter = 0;
 			for (int j = 0; j < matrix[i].length; j++) {
 				if (isPalindrom(matrix[i][j])) {
 					counter += 1;
 				}
 			}
 			if (counter == 1) {
 				rowCounter += 1;
 			}
 		}
 		if (rowCounter == matrix.length) {
 			return true;
 		}
 		return false;
 	}
	public static void main(String[] args) {
		int[][] matrix = createMatrix();
		printMatrix(matrix);
		String answer = (checkRule(matrix)) ? "Yes" : "No";
		System.out.println(answer + "! Every row has one number-palindrom");
	}
}