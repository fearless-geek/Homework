import java.util.Scanner;


public class Task3 {
	static int pow(int base, int exponent) {
		int result = 1;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int exp = 1; exp <= n; exp++) {
			sum += pow(n, exp); 
		}
		System.out.println(sum);
	}
}