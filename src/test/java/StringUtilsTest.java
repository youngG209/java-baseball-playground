import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

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