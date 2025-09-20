import java.util.Scanner;


public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		boolean isFound = false;
		float radiusSquare = x * x + y * y;
		for (int r = 0; r <= 10; r++) {
			if (radiusSquare <= r * r) {
				System.out.println(r);
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("Missed");
		}
	}
}