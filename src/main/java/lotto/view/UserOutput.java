package lotto.view;

import lotto.model.Lotto;
import lotto.service.AdjustmentLotto;

import java.awt.*;
import java.util.List;



public class UserOutput {
   public void printNumberOfLotto(int numberOfLotto){
       System.out.println(numberOfLotto + "개를 구매했습니다.");
   }

   public void printNumberOfLottoNumbers(List<Lotto> lottoList) {
       for (Lotto lotto : lottoList) {
           System.out.println(lotto.getNumbers());
       }
   }

   public void printNumberOfWinningNumbers(Lotto winningLotto, int bonus) {
       AdjustmentLotto adjustmentLotto = new AdjustmentLotto();
   }
}
