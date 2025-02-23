package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.model.Lotto;
import lotto.util.MessageConstants;

import java.util.ArrayList;

public class UserInput {

    private int budget;
    private Lotto winningLotto;
    private int bonusNumber;


    public UserInput() {
        budget = 0;
        bonusNumber = 0;
    }

    public int getNumberOfLotto() {
        return budget/1000;
    }
    public Lotto getWinningLotto() { return winningLotto; }
    public int getBonusNumber() { return bonusNumber; }
    public int getBudget() { return budget; }


    public void setBudget() {
        try {
            System.out.println(MessageConstants.REQUEST_PURCHASE_AMOUNT.getMessage());
            budget = Integer.parseInt(Console.readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException(MessageConstants.INOUTPUT_ERROR.getMessage());
        }
    }

    public void setWinningNumbers() {
        try {
            System.out.println(MessageConstants.REQUEST_WINNING_NUMBER.getMessage());
            ArrayList<Integer> numbers = new ArrayList<>();
            String winningNums = Console.readLine();
            for (String num : winningNums.split(",")) {
                numbers.add(Integer.parseInt(num.trim()));
            }

            winningLotto = new Lotto(numbers);
         } catch (Exception exception) {
            throw new IllegalArgumentException(MessageConstants.INOUTPUT_ERROR.getMessage());
        }
    }

    public void setBonusNumber(){
        try {
            System.out.println(MessageConstants.REQUEST_BONUS_NUMBER.getMessage());
            bonusNumber = Integer.parseInt(Console.readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException(MessageConstants.INOUTPUT_ERROR.getMessage());
        }
    }
}
