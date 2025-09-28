import java.util.Scanner;


public class Task13 {
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
	static int sumElements(int[][] array) {
		int centerIndex = (int) array.length / 2;
		int num1 = array[centerIndex - 1][centerIndex];
		int num2 = array[centerIndex + 1][centerIndex];
		int num3 = array[centerIndex][centerIndex - 1];
		int num4 = array[centerIndex][centerIndex + 1];
		return num1 + num2 + num3 + num4;
	}
	public static void main(String[] args) {
		int[][] array = createArray();
		printArray(array);
		int sumNearCenter = sumElements(array);
		System.out.println(sumNearCenter);
	}
}