package ru.sber.base.syntax.practicex01;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Массив до сортировки " + Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив " + Arrays.toString(arr));
    }
}
