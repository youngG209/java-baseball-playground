package stringCalculator;

import java.util.regex.Pattern;

public class StringUtils {
    private static final Pattern IS_ONLY_NUMBER = Pattern.compile("^[0-9]*$");
    private static final String SPLIT_VAL = " ";
    public StringUtils() {}

    public String[] splitString(String val) {
        return val.split(SPLIT_VAL);
    }

    public int toInt(String val) {
        checkNum(val);
        checkBlank(val);

        return Integer.parseInt(val);
    }

    private void checkBlank(String val) {
        if (val.length() < 1){
            throw new IllegalArgumentException("빈값이 있습니다.");
        }
    }

    private void checkNum(String val) {
        if (!IS_ONLY_NUMBER.matcher(val).matches()) {
            throw new IllegalArgumentException("숫자가 아닌 값이 존재합니다.");
        }
    }
}
