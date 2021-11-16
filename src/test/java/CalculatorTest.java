import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @Test
    void addTest() {
        //given
        int firstVal = 1;
        int secondVal = 2;
        int result = 0;

        //when
        result = firstVal + secondVal;

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
        result = firstVal - secondVal;

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
        result = firstVal * secondVal;

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
        result = firstVal / secondVal;

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void splitStringTest() {
        //given
        String str = "20 / 3 * 4 - 2";
        String[] result;

        //when
        result = str.split(" ");

        //then
        assertThat(result).containsExactly("20", "/", "3", "*", "4", "-", "2");
    }

    @Test
    void toIntTest() {
        //given
        String str = "20";
        int result;

        //when
        result = Integer.parseInt(str);

        //then
        assertThat(result).isEqualTo(20);
    }

    @CsvSource(value = {"20 / 3 * 4 - 2 : 22","2 + 3 * 4 / 2 : 10","2 + 6 * 2 / 8 : 2"},delimiter = ':')
    @ParameterizedTest
    void calculatorTest(String input, int result) {
        assertThat(calculator.calculator(input)).isEqualTo(result);
    }
}