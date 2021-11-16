import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {
    private Operator operator;

    @Test
    void addTest() {
        //given
        int firstVal = 1;
        int secondVal = 2;
        int result = 0;

        //when
        result = Operator.PLUS.result("+",firstVal, secondVal);

        //then
        assertThat(result).isEqualTo(3);

    }

    @Test
    void subtractTest() {
        //given
        int firstVal = 1;
        int secondVal = 2;
        int result = 0;

        //when
        result = Operator.MINUS.result("-",firstVal, secondVal);

        //then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void multiplyTest() {
        //given
        int firstVal = 4;
        int secondVal = 2;
        int result = 0;

        //when
        result = Operator.MULTIPLY.result("*",firstVal, secondVal);

        //then
        assertThat(result).isEqualTo(8);
    }

    @Test
    void divideTest() {
        //given
        int firstVal = 4;
        int secondVal = 2;
        int result = 0;

        //when
        result = Operator.DIVIDED.result("/",firstVal, secondVal);

        //then
        assertThat(result).isEqualTo(2);
    }

    @CsvSource(value = {"+ : 12", "- : 8", "* : 20", "/ : 5"},delimiter = ':')
    @ParameterizedTest
    void operatorFindTest(String str, int val) {
        //given
        int firstVal = 10;
        int secondVal = 2;
        assertThat(Operator.find(str).result(str, firstVal, secondVal)).isEqualTo(val);

    }
}