import java.util.Scanner;


public class Task11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int result = 0;
		int pow = 0;

		while (number > 0) {
			int lastDigit = number % 10;
			int multiplier = 1;
			for (int i = 1; i <= pow; i++) {
				multiplier *= 2;
			}
			result += lastDigit * multiplier;
			number /= 10;
			pow += 1;
		}
		System.out.println(result);

	}
}


// 01010110 