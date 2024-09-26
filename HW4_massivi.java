import java.util.Arrays;

public class HW4_massivi {
   /* Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести все нечетные числа из массива.*/

    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 !=0){
                System.out.println("Necetnii massiv:" + array[i]);
            }
/*Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все значения массива больше 5.*/
            if (array[i] > 5){
                System.out.println("Element > 5:" + array[i]);
            }

 //необходимо увеличить все значения массива на 15
            array[i]  = array[i] + 15;
            System.out.println(Arrays.toString(array));
        }

    }




}