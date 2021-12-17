package baseBallGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallTest {
    private BaseBall baseBall;

    @BeforeEach
    void setUp() {
        baseBall = new BaseBall();
    }

    @ValueSource(strings = {"123", "938", "456", "365", "875"})
    @ParameterizedTest
    void baseBallGameTest(String input) {
        String result = baseBall.baseBallGame(input);

        assertThat(result).isEqualTo("3스트라이크");
    }
}
