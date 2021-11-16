package StringCalculator;


public class Calculator {
    private Operator operator;
    private StringUtils utils;

    public int calculator(String val) {
        String[] splitVal = utils.splitString(val);
        int result = utils.toInt(splitVal[0]);;
        int second = 0;
        String confirmStr = "";
        String num = "";

        for (int i = 1; i < splitVal.length; i++) {
            if (i % 2 == 0){
                second = utils.toInt(splitVal[i]);
                result = operator.result(confirmStr, result, second);
            }
            if (i % 2 != 0) {
                confirmStr = splitVal[i];
            }
        }

        return result;
    }

}
