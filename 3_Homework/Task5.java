import java.util.Scanner;

public class Task5 {
    static int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        
        // Заполнение массива шахматным узором
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Условие для шахматного узора
                if ((i + j) % 2 == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = createArray();
        printArray(array);
    }
}
