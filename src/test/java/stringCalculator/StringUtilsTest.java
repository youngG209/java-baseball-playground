package stringCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {
    private StringUtils utils;

    @BeforeEach
    void setUp() {
        utils = new StringUtils();
    }

    @Test
    void splitString() {
        String str = "20 / 3 * 4 - 2";

        String[] strArray = str.split(" ");

        assertThat(strArray).containsExactly("20", "/", "3", "*", "4", "-", "2");
    }

    @Test
    void toInt() {
        String val = "2";
        int anInt = utils.toInt(val);
        assertThat(anInt).isEqualTo(2);
    }
}