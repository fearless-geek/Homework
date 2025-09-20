import java.util.Scanner;


public class Task8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		for (int i = 2; i <= 10; i++) {
			System.out.println(k + " * " + i + " = " + k * i);
		}
	}
}