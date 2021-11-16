import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 열거형 타입으로 Operator를 생성
 * Lambda를 이용해 계산식을 수행할 수 있다.
 */
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

    /*
    * BiFunction은 첫번째 인자, 두번째 인자를 받아 세번째 인자로 리턴해주는 Functional Interface 이다.
    * */
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

    /* operator로 Mapping되는 simbol과 firstVal, secondVal를 계산한 값을 리턴한다. */
    public int result(String operator, int firstVal, int secondVal) {
        return find(operator).expression.apply(firstVal, secondVal);
    }
}
