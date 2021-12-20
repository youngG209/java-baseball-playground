package baseBall.domain;

import java.util.List;

public class Judgment {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < computer.size(); i++) {
            int playerNumber = player.get(i);
            boolean contains = computer.contains(playerNumber);
            if (contains) {
                result++;
            }

        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeNumber, int number) {
        return false;
    }
}
