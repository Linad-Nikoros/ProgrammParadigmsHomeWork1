package org.example;

public class AdditionalTask2 {
//    У вас есть массив, содержащий числа от 1 до N, где N - длина массива.
//    Одно из чисел в массиве повторяется дважды,
//    а одно число пропущено. Найдите повторяющееся число и пропущенное число.
    public static void searchMissingNumber (int[] array0){
        boolean availableNumber = false;
        for(int i = 0; i < array0.length; i++) {
             availableNumber = false;
            for(int j = 0; j < array0.length; j++) {
                if(i == array0[j] || i == 0) {
                    availableNumber = true;
                }
            }
            if(availableNumber == false) {
                System.out.println(" Недостоющие число: " + i);
            }
        }
    }
    public static void searchRepeatingNumber(int[] array0) {
        int count = 0;
        for(int i = 0; i < array0.length ; i++) {
            count = 0;
            int num = array0[i];
            for(int j = 0 ; j < array0.length ; j++) {
                if(num == array0[j]) {
                    count ++;
                }
            }
            if(count == 2) {
                System.out.println("Число " + num + " повторяется 2 раза");
                break;
            }

        }
    }
}
