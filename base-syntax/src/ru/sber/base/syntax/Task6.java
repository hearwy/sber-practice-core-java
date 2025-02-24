package ru.sber.base.syntax;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Массив " + Arrays.toString(arr));
        int maxValue = arr[0];
        int maxIndex = 0;
        double sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
                sum = sum + arr[i];
            }
        }
        double midsum = sum / arr.length;
        System.out.println("Максимальное значение = [" + maxValue + "] находится в элементе под индексом [" + maxIndex + "]");
        System.out.println("Среднее значение = [" + midsum + "]");
    }
}
