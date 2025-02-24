package ru.sber.base.syntax;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        long a = 0;
        long b = 1;
        if (n < 2 || n > 100){
            System.out.println("Число n должно быть 2<=n<=100");
        }
        else{
            System.out.print(a + " " + b);
            for (int i = 2; i < n; ++i) {
                long fb = a + b;
                System.out.print(" " + fb);
                a = b;
                b = fb;
            }
        }
    }
}
