package ru.sber.base.syntax;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a = ");
        double a = scanner.nextInt();
        System.out.print("Введите b = ");
        double b = scanner.nextInt();
        System.out.print("Введите c = ");
        double c = scanner.nextInt();
        double D = b*b - 4 * a * c;
        if (D < 0){
            System.out.println("Корней нет");
        }
        else if(D == 0){
            System.out.println("Корень уравнения x = " + (-b + Math.sqrt(D)) / 2 / a);
        }
        else{
            System.out.println("Корень уравнения x1 = " + (-b + Math.sqrt(D)) / 2 / a);
            System.out.println("Корень уравнения x2 = " + (-b - Math.sqrt(D)) / 2 / a);
        }
    }
}
