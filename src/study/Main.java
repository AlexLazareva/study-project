package study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "";

        do {
            userName = UserRegistrator.regName();
        } while (!UserRegistrator.checkName(userName));

        System.out.println("Введите название игры: Угадать число или Загадать число");
        String gameName = new Scanner(System.in).nextLine();

        if (gameName.equals("Угадать число")) {
            int userNumber = 0;
            do {
                userNumber = RiddleNumber.askNumber();
            } while (!RiddleNumber.checkRandomNumber(userNumber));
        }
    }

}
