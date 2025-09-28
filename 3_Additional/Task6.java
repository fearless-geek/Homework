import java.util.Scanner;


public class Task6 {
	static int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	static int findMultiplication(int[] array) {
		int result = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				result *= array[i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = createArray();
		int result = findMultiplication(array);
		System.out.println(result);
	}
}