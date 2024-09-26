import java.util.Arrays;

public class HW5_arrays {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int summ = 0;
        int summ2 = 0;
        int max = array[0];
        int max2 = array2[0][0];
        int min = array[0];
        int average = array[0];
        int quantity = 0;


        // необходимо вывести сумму всех значений массива.
        for (int i = 0; i < array.length; i++) {

            summ += array[i];
        }
        System.out.println("Sum = " + summ);

        //* необходимо вывести максимальное значение массива.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max element= " + max);

        //* необходимо вывести минимальное значение массива.

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min element= " + min);

        //* необходимо вывести среднее арифметическое всех значений массива.
        for (int i = 0; i < array.length; i++) {
            average = summ / array.length;
        }
        System.out.println("Average element= " + average);

        //* необходимо вывести сумму элементов массива2.
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {

                summ2 += array2[i][j];
            }
        }
        System.out.println("Sum2 = " + summ2);

        //* необходимо вывести максимальное значение массива.
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++){
                if (array2[i][j] > max2) {
                    max2 = array2[i][j];
                }
            }
        }
        System.out.println("Max2 element= " + max2);
        //* необходимо вывести количество элементов в массиве.

        for (int i = 0; i < array2.length; i++) {
                quantity += array2[i].length;
        }
        System.out.println("Vsego elementov: " + quantity);
    }
}
