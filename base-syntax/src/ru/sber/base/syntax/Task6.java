package ru.sber.base.syntax;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int maxValue = 0;
        int maxIndex = 0;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i + 1;
            }
            sum += arr[i];
        }
        System.out.println("Массив " + Arrays.toString(arr));
        System.out.println("Максимальное значение = [" + maxValue + "] находится в элементе под индексом [" + maxIndex + "]");
        System.out.println("Среднее значение = [" + sum / arr.length + "]");
    }
}
