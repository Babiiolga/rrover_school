import java.util.Arrays;

public class HW5_arrays {
    public static void main(String[] args) {


/*Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
* необходимо вывести сумму элементов массива.
* необходимо вывести максимальное значение массива.
* необходимо вывести количество элементов в массиве. */

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int summ = 0;
        int max = array[0];
        int min = array[0];
        int average = array[0];
       // необходимо вывести сумму всех значений массива.
       /* for (int i=0; i<array.length; i++){

           summ = summ + array[i];
        }
        System.out.println(summ);*/

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
                summ = summ + array[i];
                average = summ / array.length;
        }
        System.out.println("Average element= " + average);


    }
}
