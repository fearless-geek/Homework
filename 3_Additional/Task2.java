import java.util.Scanner;


public class Task2 {
	static int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	static int countOdd(int[] array) {
		int count = 0;
		for (int num : array) {
			if (num % 2 != 0) {
				count += 1;
			}
		}
		return count;
	}
	static int countEven(int[] array) {
		int count = 0;
		for (int num : array) {
			if (num % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}	
	public static void main(String[] args) {
		int[] array = createArray();
		int oddAmount = countOdd(array);
		int evenAmount = countEven(array);
		System.out.println("Even: " + evenAmount);
		System.out.println("Odd: " + oddAmount);
	}
}