package ru.sber.base.syntax;

import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = (int)(Math.random() * 26 + 65);
        while (true) {
            System.out.println("Введите букву (a - z): ");
            String a = scan.nextLine();
            a = a.toUpperCase();
            int q = (int) a.charAt(0);
            if (q < 65 || q > 90 || a.length() != 1) {
                System.out.println("Введен недопустимый символ");
            } else if (q < code) {
                System.out.println("Ищи букву, которая после нее в алфавите");
            } else if (q > code) {
                System.out.println("Ищи букву, которая перед ней в алфавите");
            } else {
                System.out.println("Верно!");
                break;
            }
        }
    }
}
