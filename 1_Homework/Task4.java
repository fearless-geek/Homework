import java.util.Scanner;


public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		if (num1 == num2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
