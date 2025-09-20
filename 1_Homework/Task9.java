import java.util.Scanner;


public class Task9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sm = 0;
		while (number > 0) {
			sm += number % 10;
			number /= 10;
		}
		System.out.println(sm);
	}
}