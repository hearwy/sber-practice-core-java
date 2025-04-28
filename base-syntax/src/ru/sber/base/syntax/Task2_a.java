package ru.sber.base.syntax;

import java.util.Scanner;

class Task2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((num <= 100) & (num >= 1)) {
            String new_num = translate(num);
            System.out.print(new_num);
        } else {
            System.out.println("Число больше 100");
        }
    }
    public static String translate(int num) {
        String new_number = "";

        if (num == 100) {
            new_number += "C";
        } else if (num / 10 < 4) {
            for (int i = 1; i <= num / 10; i ++) {
                new_number += "X";
            }
        } else if (num / 10 == 4) {
            new_number += "XL";
        } else if (num / 10 == 5) {
            new_number += "L";
        } else if ((num / 10 > 5) & (num / 10 < 9)) {
            new_number += "L";
            for (int i = 5; i < num / 10; i++) {
                new_number += "X";
            }
        } else if (num / 10 == 9) {
            new_number += "XC";
        }

        if (num % 10 == 0) {
            new_number += "";
        } else if (num % 10 < 4) {
            for (int i = 1; i <= num % 10; i ++) {
                new_number += "I";
            }
        } else if (num % 10 == 4) {
            new_number += "IV";
        } else if (num % 10 == 5) {
            new_number += "V";
        } else if ((num % 10 > 5) & (num % 10 < 9)) {
            new_number += "V";
            for (int i = 5; i < num % 10; i++) {
                new_number += "I";
            }
        } else if (num % 10 == 9) {
            new_number += "IX";
        }
        return String.valueOf(new_number);
    }

}
