package lotto.service;

import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class MakeRandomNumbers {
    private List<Integer> numbers;

    public MakeRandomNumbers() {
        numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
