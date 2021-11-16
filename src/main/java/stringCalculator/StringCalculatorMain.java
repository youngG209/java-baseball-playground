package stringCalculator;

import java.util.Scanner;

public class StringCalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
//        String formula = "2 + 3 * 4 / 2";;
        String input = scanner.nextLine();
        int result = calculator.calculator(input);

        System.out.println("결과 : " + result);
    }
}
