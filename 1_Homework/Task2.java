import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        float a = myScanner.nextFloat();
        float b = myScanner.nextFloat();
        if (a > b) {
            System.out.println("Number " + a + " greater than " + b);
        } else if (a < b) {
            System.out.println("Number " + b + " greater than " + a);
        } else {
            System.out.println("Numbers are the same");
        }
    }
}