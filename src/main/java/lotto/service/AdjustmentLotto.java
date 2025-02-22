package lotto.service;

import lotto.model.Lotto;

import java.util.List;

import static lotto.service.FindSameNumber.sameNumber;

public class AdjustmentLotto {
    private int[] lotto = {0, 0, 0, 0, 0};

    public void countCorrectNumber(List<Lotto> lotto, int bonus){
        for (Lotto l : lotto){
            countCorrectNumber(l, bonus);
        }
    }

    public void countCorrectNumber(Lotto winningLotto, int bonus) {
        if (winningLotto.getCorrectNumbers() == 3)  { lotto[0]++; }
        if (winningLotto.getCorrectNumbers() == 4)  { lotto[1]++;  }
        if (winningLotto.getCorrectNumbers() == 5)  {
            if (sameNumber(winningLotto, bonus)){
                lotto[3]++;
                return;
            }
            lotto[4]++;
        }
        if (winningLotto.getCorrectNumbers() == 6)  { lotto[4]++;  }
    }
}
