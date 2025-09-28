import java.util.Scanner;


public class Task1 {
	static int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	static int findSum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] array = createArray();
		int result = findSum(array);
		System.out.println(result);
	}
}