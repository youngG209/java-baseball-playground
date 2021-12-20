package baseBall.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        // 몇 개의 숫자가 같은지 알아낸 뒤
        // 스크라이크의 갯수를 구한 후 뺀다
        // 남은 수는 볼의 갯수

        Judgment judgment = new Judgment();

        int correctCount = judgment.correctCount(computer, player);

        int strike = 0;
        for (int i = 0; i < computer.size(); i++) {
            if (judgment.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }

        int ball = correctCount - strike;
        String message = ball + " 볼, " + strike + " 스트라이크";
        return message;
    }
}
