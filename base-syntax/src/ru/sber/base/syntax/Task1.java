package ru.sber.base.syntax;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
