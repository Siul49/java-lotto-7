package lotto.service;

import lotto.model.Lotto;

import java.util.ArrayList;
import java.util.List;


public class AdjustmentLotto {
    private int[] lotto = new int[5];
    private List<Lotto> lottoList = new ArrayList<Lotto>();
    private int bonus;

    public AdjustmentLotto(List<Lotto> lottoList, int bonus) {
        this.lottoList = lottoList;
        this.bonus = bonus;
        for (int l : lotto) { lotto[l] = 0; }
    }

    public int[] getLotto() {
        return lotto;
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
            CountCorrectNumber countCorrectNumber = new CountCorrectNumber(lottoList);
            if (countCorrectNumber.sameNumber(winningLotto, bonus)){
                lotto[3]++;
                return;
            }
            lotto[4]++;
        }
        if (winningLotto.getCorrectNumbers() == 6)  { lotto[4]++;  }
    }
}
