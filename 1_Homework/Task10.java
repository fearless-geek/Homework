import java.util.Scanner;


public class Task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String result = "";
		while (number > 0) {
			int lastDigit = number % 10;
			result += String.valueOf(lastDigit);
			number /= 10;
		}
		System.out.println(result);
	}
}