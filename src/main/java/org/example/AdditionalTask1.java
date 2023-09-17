package org.example;

import java.util.Arrays;

public  class AdditionalTask1 {
//    У вас есть массив целых чисел, в котором каждое число,
//    кроме одного, повторяется дважды. Вам нужно найти это одиночное число.
    public static void searchSingeNumber(){
        int[] array0 = {4, 3, 2, 4, 1, 3, 2};
        System.out.println( Arrays.toString(array0));
        int count = 0;
        for(int i = 0; i < array0.length ; i++) {
            count = 0;
            int num = array0[i];
            for(int j = 0 ; j < array0.length ; j++) {
                if(num == array0[j]) {
                    count ++;
                }
            }
            if(count == 1) {
                System.out.println("число " + num + " встречается 1 раз");
            }
        }
    }
}


