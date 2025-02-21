package lotto.service;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.service.CountLotto;


public class MakeRandomNumbers {
    private List<List<Integer>> numbers;
    private List<Integer> number;
    private int trial;
    public List<List<Integer>> makeRandomNumbers(int money) {
        CountLotto t = new CountLotto();
        trial = t.countLotto(money);

        for (int i = 0; i < trial; i++) {
            number = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            numbers.add(number);
        }

        return numbers;
    }
}
