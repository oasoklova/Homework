package part03;

/**
 * 1) Вывести номера строк и сумму их элементов
 * 2) Вывести номера столбцов и сумму их элементов
 * 3) Заменить все нечетные элементы массива на 1, а четные на 0 и вывести на экран
 * 4) Найти целое среднее арифметическое для каждой строки и вывести на экран
 * 5) Преобразовать двумерный массив в перевернутый одномерный
 */

public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
//      printLineAndSum(array);
//      printColumnAndSum(array);
//      printChangeNumber(array);
//      printArithmeticalMean(array);
        printInvertedArray(array);
    }

    public static void printLineAndSum(int[][] array) {
        System.out.println("-1-");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + " ");
            int sum = 0;
            for (int j = 0; j < array[1].length; j++) {
                sum += array[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
        System.out.println();
    }

    public static void printColumnAndSum(int[][] array) {
        System.out.println("-2-");
        for (int i = 0; i < array[1].length; i++) {
            int sum = 0;
            System.out.print(i + 1 + " ");
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            System.out.print(sum);
            System.out.println();
        }
        System.out.println();
    }

    public static void printChangeNumber(int[][] array) {
        System.out.println("-3-");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] = 0;
                } else array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArithmeticalMean(int[][] array) {
        System.out.println("-4-");
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            System.out.print(i + 1 + " ");
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println(sum / array[i].length);
        }
        System.out.println();
    }

    public static void printInvertedArray(int[][] array) {
        System.out.println("-5-");
        int[] newArray = new int[array.length * array[1].length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[1].length - 1; j >= 0; j--) {
                newArray[index] = array[i][j];
                System.out.print(newArray[index] + " ");
                index++;
            }
        }
    }
}