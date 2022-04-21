package part03;

public class oneDimensionalArray {
    public static void main(String[] args) {
        int[] array = new int[]{3, 22, 1, 13, 4, 6, 16, 5};

        printEvenNumber(array);
        printTwoDigitNumber(array);
        printLargestNumber(array);
        printSumArray(array);
        printReverseArray(array);
    }

    public static void printEvenNumber(int[] array) {
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println("");
    }

    public static void printTwoDigitNumber(int[] array) {
        for (int value : array) {
            if (value > 9 && value < 100) {
                System.out.print(value + " ");
            }
        }
        System.out.println("");
    }

    public static void printLargestNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else continue;
            System.out.print(max);
        }
        System.out.println("");
    }

    public static void printSumArray(int[] array) {
        int sum = 0;
        for (int value : array)
            sum += value;
        System.out.print(sum);
        System.out.println("");
    }

    public static void printReverseArray(int[] array) {
        int[] newArr = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--, j++) {
            newArr[j] = array[i];
            System.out.print(newArr[j] + " ");
        }
    }

}