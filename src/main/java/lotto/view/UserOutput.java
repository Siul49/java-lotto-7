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

   public void printWinningLotto(int[] lotto){
       System.out.println(MessageConstants.THREE_MESSAGE.getMessage() + lotto[0] + "개");
       System.out.println(MessageConstants.FOUR_MESSAGE.getMessage() + lotto[1] + "개");
       System.out.println(MessageConstants.FIVE_MESSAGE.getMessage() + lotto[2] + "개");
       System.out.println(MessageConstants.FIVE_AND_BONUS_MASSAGE.getMessage() + lotto[3] + "개");
       System.out.println(MessageConstants.SIX_MASSAGE.getMessage() + lotto[4] + "개");
   }
}
