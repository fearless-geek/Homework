import java.util.Scanner;


public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		int n = scanner.nextInt();
		if (0 <= x && x <= n) {
			if (0 <= y && y <= n) {
				System.out.println("Yes");
			}
		} else {
			System.out.println("No");
		}
	}
}