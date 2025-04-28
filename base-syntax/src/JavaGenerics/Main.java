package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pair<String, Integer>> months = new ArrayList<>();

        months.add(new Pair<>("Январь", 31));
        months.add(new Pair<>("Февраль", 28));
        months.add(new Pair<>("Март", 31));
        months.add(new Pair<>("Апрель", 30));
        months.add(new Pair<>("Май", 31));
        months.add(new Pair<>("Июнь", 30));
        months.add(new Pair<>("Июль", 31));
        months.add(new Pair<>("Август", 31));
        months.add(new Pair<>("Сентябрь", 30));
        months.add(new Pair<>("Октябрь", 31));
        months.add(new Pair<>("Ноябрь", 30));
        months.add(new Pair<>("Декабрь", 31));

        System.out.println("Список месяцев с количеством дней:");
        System.out.println(months);

        List<Pair<Integer, String>> countryCodes = new ArrayList<>();

        countryCodes.add(new Pair<>(7, "Россия"));
        countryCodes.add(new Pair<>(1, "США"));
        countryCodes.add(new Pair<>(44, "Великобритания"));
        countryCodes.add(new Pair<>(49, "Германия"));
        countryCodes.add(new Pair<>(81, "Япония"));

        System.out.println("Справочник телефонных кодов стран:");
        System.out.println(countryCodes);
    }
}