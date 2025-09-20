import java.util.Scanner;


public class Task12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String result = "";
		while (number > 0) {
			result += number % 2;
			number /= 2;
		}
		for (int i = result.length() - 1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
		System.out.println();
		scanner.close();
	}
}