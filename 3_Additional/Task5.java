import java.util.Scanner;


public class Task5 {
	static int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	static int[] processArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
		}
		return array;
	}
	static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = createArray();
		int[] newArray = processArray(array);
		printArray(newArray);
	}
}