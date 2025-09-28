import java.util.Scanner;

public class Task14 {
    static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static int[] createMergedArray(int[] firstArray, int[] secondArray) {
        int size = firstArray.length + secondArray.length;
        int[] mergedArray = new int[size];

        int i = 0, j = 0;
        for (int k = 0; k < size; k++) {
            if (k % 2 == 0 && i < firstArray.length) {
                mergedArray[k] = firstArray[i++];
            }
            else if (k % 2 != 0 && j < secondArray.length) {
                mergedArray[k] = secondArray[j++];
            }
        }

        while (i < firstArray.length) {
            mergedArray[i + j] = firstArray[i];
            i++;
        }

        while (j < secondArray.length) {
            mergedArray[i + j] = secondArray[j];
            j++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] firstArray = createArray();
        int[] secondArray = createArray();

        System.out.println("First array:");
        printArray(firstArray);
        System.out.println("Second array");
        printArray(secondArray);

        int[] mergedArray = createMergedArray(firstArray, secondArray);
        System.out.println("Merged array");
        printArray(mergedArray);
    }
}
