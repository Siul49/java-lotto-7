package lotto.view;

import lotto.model.Lotto;
import java.util.List;
import lotto.util.MessageConstants;



public class UserOutput {
   public void printNumberOfLotto(int numberOfLotto){
       System.out.println(numberOfLotto + MessageConstants.PURCHASE_MESSAGE.getMessage());
   }

   public void printNumberOfLottoNumbers(List<Lotto> lottoList) {
       for (Lotto lotto : lottoList) {
           System.out.println(lotto.getNumbers());
       }
   }
}
