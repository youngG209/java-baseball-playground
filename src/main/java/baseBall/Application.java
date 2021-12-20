package baseBall;

import baseBall.domain.Judgment;
import baseBall.domain.NumberGenerator;
import baseBall.domain.Referee;

import java.util.Arrays;
import java.util.List;

/**
 * 객체 지향 프로그래밍
 * 1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
 * 2. 필요한 기능을 (역활에 맞는) 인스턴스가 수행하게 한다. (의인화)
 * 3. 각 결과를 종합한다.
 */
public class Application {
    public static void main(String[] args) {
//        NumberGenerator generator = new NumberGenerator();
//        List<Integer> numbers = generator.createRandomNumbers();
//        System.out.println(numbers);

//        Judgment judgment = new Judgment();
//        int count = judgment.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 3));
//        System.out.println(count);

//        boolean hasPlace = judgment.hasPlace(Arrays.asList(2, 4, 3), 0, 3);
//        System.out.println(hasPlace);

        Referee referee = new Referee();
        String compare = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 3));
        System.out.println(compare);
    }
}
