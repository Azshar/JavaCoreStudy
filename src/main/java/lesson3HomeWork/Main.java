package lesson3HomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        changeArrayValues(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        createArray100();
        taskThree();
        taskFour();
        taskFive(10, 200);
        taskSix();
    }

    /**
     1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     * */
    private static void changeArrayValues (int [] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;

            System.out.println(array[i]);
        }

        System.out.println("----------------------------------- Task 1");
    }

    /**
     2. Задать пустой целочисленный массив длиной 100.
     С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     * */
    private static void createArray100 () {
        int[] array  = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

            System.out.println(array[i]);
        }

        System.out.println("----------------------------------- Task 2");
    }

    /**
     3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * */
    private static void taskThree () {
        int[] array  = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }

            System.out.println(array[i]);
        }

        System.out.println("----------------------------------- Task 3");
    }

    /**
     4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     Определить элементы одной из диагоналей можно по следующему
     принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * */
    private static void taskFour () {
        int[][] array  = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                    System.out.print(array[i][j]);
                } else {
                    array[i][j] = 0;
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------- Task 4");
    }

    /**
     5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len,
     каждая ячейка которого равна initialValue;
     * */
    private static int[] taskFive (int len, int initialValue) {
        int[] array  = new int[len];

        Arrays.fill(array, initialValue);

        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("----------------------------------- Task 5");
        return array;
    }

    /**
     6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     * */
    private static void taskSix () {
        int[] array  = new int[]{9, 2, 0, 4, 9, 11, 22, 3, 7};

        int min = array[0];
        int max = array[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            min = Math.min(array[i], min);
            max = Math.max(array[i], max);
        }

        System.out.println(min);
        System.out.println(max);

        System.out.println("----------------------------------- Task 6");
    }
}
