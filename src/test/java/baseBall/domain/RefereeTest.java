package baseBall.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    private static final List<Integer> ANSWER =  Arrays.asList(1, 2, 3);
    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,3 스트라이크", "4,5,6,낫싱", "3,1,2,3 볼 0 스트라이크", "3,2,1,2 볼 1 스트라이크"})
    void compare(int num1, int num2, int num3, String expected) {
        String compare = referee.compare(ANSWER, Arrays.asList(num1, num2, num3));

        assertThat(compare).isEqualTo(expected);

    }

    @Test
    void 스트라이크3개() {
        String compare = referee.compare(ANSWER, Arrays.asList(1, 2, 3));

        assertThat(compare).isEqualTo("3 스트라이크");

    }

    @Test
    void 낫싱() {
        String compare = referee.compare(ANSWER, Arrays.asList(4, 5, 6));

        assertThat(compare).isEqualTo("낫싱");

    }

    @Test
    void 볼3개() {
        String compare = referee.compare(Arrays.asList(6, 4, 5), Arrays.asList(4, 5, 6));

        assertThat(compare).isEqualTo("3 볼 0 스트라이크");

    }

    @Test
    void 볼2개스크라이크1() {
        String compare = referee.compare(Arrays.asList(6, 5, 4), Arrays.asList(4, 5, 6));

        assertThat(compare).isEqualTo("2 볼 1 스트라이크");

    }
}