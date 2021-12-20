package baseBall.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    public List<Integer> createRandomNumbers() {
        // 2개의 숫자가 담길 때 까지
        // 만약 이미 존재하는 숫자라면 담지 않는다
        // 만약 존재하지 않는 숫자라면 담는다
        List<Integer> numbers = new ArrayList<>();

//        for (int i = 0; i < 3; i++) {
//            int number = new Random().nextInt(9) + 1;
//            if (numbers.contains(number)) {
//                i--;
//                continue;
//            }else {
//                numbers.add(number);
//            }
//        }
        while (numbers.size() < 3) {
            int number = new Random().nextInt(9) + 1;
            if (numbers.contains(number)) {
                continue;
            }else {
                numbers.add(number);
            }
        }

        return numbers;
    }

}
