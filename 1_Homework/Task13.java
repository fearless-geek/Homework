import java.util.Scanner;


public class Task13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (true) {
			int previous = num;
			num = scanner.nextInt();
			if (num >= previous) {
				continue;
			} else {
				break;
			}
		}
		scanner.close();
	}
}