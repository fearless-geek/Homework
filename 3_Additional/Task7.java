import java.util.Scanner;


public class Task7 {
	static int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	static int countRangeElements(int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scanner.nextInt();
		System.out.println("Enter b");
		int b = scanner.nextInt();
		int count = 0;
		for (int num : array) {
			if (num >= a && num <= b) {
				count += 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] array = createArray();
		int result = countRangeElements(array);
		System.out.println(result);
	}
}