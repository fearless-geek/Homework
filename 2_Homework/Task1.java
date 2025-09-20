import java.util.Scanner;


public class Task1 {
	static String generateRow(int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += "1";
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		String result = generateRow(n);
		for (int i = 0; i < m; i++) {
			System.out.println(result);
		}
	}
}