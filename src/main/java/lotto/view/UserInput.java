package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.model.Lotto;

import java.util.ArrayList;

public class UserInput {

    private String budget;
    private Lotto winningLotto;
    private String bonusNumber;


    public UserInput() {
        budget = "";
        bonusNumber = "";
    }

    public int getNumberOfLotto() {
        return Integer.parseInt(budget)/1000;
    }

    public Lotto getWinningLotto() { return winningLotto; }
    public String getBonusNumber() { return bonusNumber; }

    public void setTrial() {
        try {
            System.out.println("구입 금액을 입력해 주세요.");
            budget = Console.readLine();
        } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }

    public void setWinningNumbers() {
        try {
            System.out.println("당첨 번호를 입력해 주세요.");
            ArrayList<Integer> numbers = new ArrayList<>();
            String winningNums = Console.readLine();
            for (String num : winningNums.split(",")) {
                numbers.add(Integer.parseInt(num.trim()));
            }

            winningLotto = new Lotto(numbers);
         } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }

    public void setBonusNumber(){
        try {
            System.out.println("보너스 번호를 입력해 주세요");
            bonusNumber = Console.readLine();
        } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }
}
