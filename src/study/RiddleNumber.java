package study;

import java.util.Scanner;

public class RiddleNumber {
    public static int askNumber() {
        System.out.println("Введите число от 0 до 100");
        int userNumber = new Scanner(System.in).nextInt();

        return userNumber;
    }
    public static boolean checkRandomNumber(int userNumber) {
        int randomNumber = createRandomNumber();
        if (randomNumber > userNumber) {
            System.out.println("Больше");
            return false;
        } else if (randomNumber < userNumber) {
            System.out.println("Меньше");
            return false;
        } else if (randomNumber == userNumber) {
            System.out.println("Правильно!");
            return true;
        } else {
            System.out.println("Число введено неверно");
            return false;
        }
    }

    private static int createRandomNumber() {
        int a = 0;
        int b = 100;

        return a + (int) (Math.random() * b);
    }
}
