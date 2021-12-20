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
        for (int i = 0; i < player.size(); i++) {
            if (judgment.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }
        int ball = correctCount - strike;

        if (correctCount == 0) {
            String message = "낫싱";
            return message;
        }
        if (strike == 3) {
            String message = "3 스트라이크";
            return message;
        }
        String message = ball + " 볼, " + strike + " 스트라이크";
        return message;
    }
}
