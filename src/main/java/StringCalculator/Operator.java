package StringCalculator;

import java.util.Collections;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operator {
    PLUS ("+", (firstVal, secondVal) -> firstVal + secondVal),
    MINUS ("-", (firstVal, secondVal) -> firstVal - secondVal),
    MULTIPLY ("*", (firstVal, secondVal) -> firstVal * secondVal),
    DIVIDED ("/", (firstVal, secondVal) -> {
        if (secondVal == 0) {
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
        }
        return firstVal / secondVal;
    });
    private static final Map<String, Operator> OPERATOR_MAP =
                Collections.unmodifiableMap(Stream.of(values())
                        .collect(Collectors.toMap(Operator::getOperator, Function.identity())));
    private final String operator;
    private final BiFunction<Integer, Integer, Integer> expression;

    Operator(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static Operator find(String representation) {
        if (OPERATOR_MAP.containsKey(representation)) {
            return OPERATOR_MAP.get(representation);
        }
        throw new IllegalArgumentException("사칙연산 수식이 아닙니다.");
    }

    public String getOperator() {
        return operator;
    }

    public int result(String operator, int firstVal, int secondVal) {
        return find(operator).expression.apply(firstVal, secondVal);
    }
}
