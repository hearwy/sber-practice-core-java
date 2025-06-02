package ru.sber.base.syntax;

public class Task3 {
    public static void main(String[] args) {
        final int even = 10;
        final int odd = 6;

        for (int i = 0; i < odd; i++) {
            for (int j = 0; j < even - i % 2; ++j) {
                if(i % 2 == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
