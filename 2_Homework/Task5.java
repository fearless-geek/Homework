import java.util.Scanner;


public class Task5 {
	static int factorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += factorial(i);
		}
		System.out.println(sum);
	}
}