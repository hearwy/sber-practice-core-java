package ru.sber.base.syntax;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        int i = 2;
        if (num < 2) {
            System.out.println("Число должно быть больше 1");
        } else {
            while (i * i <= num) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}

