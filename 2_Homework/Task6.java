import java.util.Scanner;


public class Task6 {
	static int pow(int base, int exp) {
		int result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		return result;
	}
	static int factorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x:");
		int x = scanner.nextInt();
		System.out.println("Enter n:");
		int n = scanner.nextInt();
		int sum = 0;
		for (int k = 1; k <= n; k++) {
			sum += factorial(k) * pow(x, k);
		}
		System.out.println(sum);
	}
}