package StringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @CsvSource(value = {"20 / 3 * 4 - 2 : 22","2 + 3 * 4 / 2 : 10","2 + 6 * 2 / 8 : 2"},delimiter = ':')
    @ParameterizedTest
    void calculatorTest(String input, int result) {
        Assertions.assertThat(calculator.calculator(input)).isEqualTo(result);
    }

    @ValueSource(strings = {"20 = 3 * 4 - 2","2 + 3 < 2 / 22"})
    @ParameterizedTest
    void checkOperator(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            calculator.calculator(input);
        });
    }

    @ValueSource(strings = {"20 / null * 4 - 2","2 + 3 *   / 22"})
    @ParameterizedTest
    void checkNull(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            calculator.calculator(input);
        });
    }


}