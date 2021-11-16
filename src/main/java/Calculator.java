import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
//    요구사항
//    사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
//    문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
//    예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
//    https://wikidocs.net/91126
    private static final Pattern IS_ONLY_NUMBER = Pattern.compile("^[0-9]*?");
    private String[] operationType = {"+", "-", "*", "/"};

    public int add(int firstVal, int secondVal) {
        return  firstVal + secondVal;
    }

    public int subtract(int firstVal, int secondVal) {
        return  firstVal - secondVal;
    }

    public int multiply(int firstVal, int secondVal) {
        return  firstVal * secondVal;
    }

    public int divide(int firstVal, int secondVal) {
        return  firstVal / secondVal;
    }

    public String[] splitString(String val) {
        return val.split(" ");
    }

    public int toInt(String val) {
        return Integer.parseInt(val);
    }

    public int calculator(String val) {
        String[] splitVal = splitString(val);
        int result = toInt(splitVal[0]);;
        int second = 0;
        String confirmStr = "";
        String num = "";

        for (int i = 1; i < splitVal.length; i++) {
            if (i % 2 == 0){
                num = confirmNumber(splitVal[i], i);
                if (i != 0) {
                    second = toInt(num);
                if ("+".equals(confirmStr)) result = add(result, second);
                if ("-".equals(confirmStr)) result = subtract(result, second);
                if ("*".equals(confirmStr)) result = multiply(result, second);
                if ("/".equals(confirmStr)) result = divide(result, second);
                }
            }
            if (i % 2 != 0) {
                confirmStr = confirmOperation(splitVal[i]);
            }

        }

        return result;
    }

    private String confirmOperation(String splitVal) {

        for (String str : operationType) {
            if (str.equals(splitVal)){
                return splitVal;
            }else {
                new IllegalArgumentException("사칙연산 수식이 아닙니다.");
            }
        }

        return null;
    }

    private String confirmNumber(String splitVal, int i) {
        if (!IS_ONLY_NUMBER.matcher(splitVal).matches()) {
            new IllegalArgumentException(i +"번째 자리가 숫자가 아닙니다.");
        }
        return splitVal;
    }

}
