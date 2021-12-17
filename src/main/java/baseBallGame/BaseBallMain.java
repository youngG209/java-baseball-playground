package baseBallGame;

import java.util.Scanner;

public class BaseBallMain {

    public static void main(String[] args) {
        BaseBall baseBall = new BaseBall();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = baseBall.baseBallGame(input);

        System.out.println("결과 : " + result);
    }
}
