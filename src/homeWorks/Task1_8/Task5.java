package homeWorks.Task1_8;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        /*
        Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.

         */

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        System.out.println(sum1);

            /*
            Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива
             */
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            if (max2 < array2[i]){
                max2 = array2[i];
            }

        }
        System.out.println(max2);
            /*
            Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
             */
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min3 = Integer.MAX_VALUE;
        for (int i = 0; i < array3.length; i++) {
            if (min3 > array3[i]){
                min3 = array3[i];
            }
        }
        System.out.println(min3);
            /*
            Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
             */
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double avg4 = 0;
        for (int i = 0; i < array4.length; i++) {
            avg4 += array4[i];
        }
        avg4 /= array4.length;
        System.out.println(avg4);
            /*
            Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
             */
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum5 = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum5 += array5[i][j];
            }

        }
        System.out.println(sum5);
            /*
            Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
             */
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max6 = Integer.MIN_VALUE;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (max6 < array6[i][j]){
                    max6 = array6[i][j];
                }
            }
        }
        System.out.println(max6);
            /*
            Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
             */
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count7 = 0;
        for (int i = 0; i < array7.length; i++) {
            count7 += array7[i].length;
        }
        System.out.println(count7);
        System.out.println(Arrays.deepToString(array7));
    }
}
