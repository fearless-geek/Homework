import java.util.Scanner;


public class Task4 {
	static int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	static boolean isAscending(int[] array) {
		boolean flag = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] array = createArray();
		String answer = (isAscending(array)) ? "Yes" : "No";
		System.out.println(answer);
	}
}