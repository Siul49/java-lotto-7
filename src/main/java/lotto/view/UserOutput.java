package lotto.view;

import java.util.List;

public class UserOutput {
   public void printNumberOfLotto(int numberOfLotto){
       System.out.println(numberOfLotto + "개를 구매했습니다.");
   }

   public void printNumberOfLottoNumbers(List<List<Integer>> lottoList){
       for (List<Integer> integers : lottoList) {
           System.out.println(integers.toString());
       }
   }


}
