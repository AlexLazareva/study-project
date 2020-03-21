package study;

import java.util.Scanner;

public class UserRegistrator {
    public static boolean checkName(String name) {
        if (name.equals("")) {
            System.out.println("Пустое имя, попробуйте ещё раз");
            return false;
        } else {
            System.out.println("Имя корректно, продолжайте...");
            return true;
        }
    }

    public static String regName() {
        System.out.println("Введите имя:");
        return new Scanner(System.in).nextLine();
    }
}
