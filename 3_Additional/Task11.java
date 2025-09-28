import java.util.Scanner;


public class Task11 {
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
	static boolean isDiagonal(int[][] array) {
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					if (array[i][j] == 0) {
						flag = false;
					}
				} else {
					if (array[i][j] != 0) {
						flag = false;
					}
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[][] array = createArray();
		printArray(array);
		String answer = (isDiagonal(array)) ? "Yes" : "No";
		System.out.println(answer);
	}
}