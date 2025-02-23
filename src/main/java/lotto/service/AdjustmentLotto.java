package lotto.service;

import lotto.model.Lotto;
import lotto.util.MessageConstants;

import java.util.ArrayList;
import java.util.List;

import static lotto.service.FindSameNumber.sameNumber;

public class AdjustmentLotto {
    private int[] lotto = {0, 0, 0, 0, 0};
    private List<Lotto> lottoList = new ArrayList<Lotto>();
    private int bonus;

    public AdjustmentLotto(List<Lotto> lottoList, int bonus) {
        this.lottoList = lottoList;
        this.bonus = bonus;
    }

    public int[] getLotto() {
        return lotto;
    }

    public void printLotto() {
        System.out.println(MessageConstants.THREE_MESSAGE.getMessage() + lotto[0] + "개");
        System.out.println(MessageConstants.FOUR_MESSAGE.getMessage() + lotto[1] + "개");
        System.out.println(MessageConstants.FIVE_MESSAGE.getMessage() + lotto[2] + "개");
        System.out.println(MessageConstants.FIVE_AND_BONUS_MASSAGE.getMessage() + lotto[3] + "개");
        System.out.println(MessageConstants.SIX_MASSAGE.getMessage() + lotto[4] + "개");
    }

    public void countCorrectNumber(){
        for (Lotto l : lottoList){
            countCorrectNumber(l);
        }
    }

    public void countCorrectNumber(Lotto winningLotto) {
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
