import java.util.Scanner;


public class Task4 {
	static int pow(int base, int exp) {
		int result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += pow(2, i);
		}
		System.out.println(sum);
	}
}