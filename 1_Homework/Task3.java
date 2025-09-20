import java.util.Scanner;


public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		float num3 = scanner.nextFloat();
		float mx;
		if (num1 >= num2 && num1 >= num3) {
			mx = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			mx = num2;
		} else {
			mx = num3;
		}
		System.out.println(mx);
	}
}


// 5 4 3
// 3 4 5
// 4 5 3