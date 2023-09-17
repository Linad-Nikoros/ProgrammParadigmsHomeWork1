package org.example;
import java.util.Arrays;

public class MainTask {
//    Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
//    сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки
    public static void imperativOption() {
        // императивный вариант
        int[] array = {24, 54, 2, 16, 18, 13, 18, 1, 9, 7};
        System.out.println("БЫЛО:" + Arrays.toString(array));
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int num1 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = num1;
                    flag = false;
                }
            }
        }
        System.out.println("СТАЛО: "+ Arrays.toString(array));
    }
    public static void declarativeOption() {
        // декларативный вариант
        int[] array = {1, 15, 16, 14, 2, 5, 74, 87, 89, 71, 66};
        System.out.println("БЫЛО:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("СТАЛО: "+ Arrays.toString(array));
    }
}
