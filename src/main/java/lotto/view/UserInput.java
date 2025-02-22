package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class UserInput {

    private String trial;
    private String numbers;
    private String bonusNumber;
    private List<String> lottoNumbers;

    public UserInput() {
        trial = "";
        numbers = "";
        bonusNumber = "";
        lottoNumbers = new ArrayList<>();
    }

    public int getTrial() {
        return Integer.parseInt(trial);
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }

    public void setTrial() {
        try {
            System.out.println("구입 금액을 입력해 주세요.");
            trial = Console.readLine();
        } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }

    public void setWinningNumbers() {
        try {
            System.out.println("당첨 번호를 입력해 주세요.");
            numbers = Console.readLine();
            String [] numbersArray = numbers.split(",");
            lottoNumbers = new ArrayList<>(Arrays.asList(numbersArray));

        } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }

    public void bonusNumber(){
        try {
            System.out.println("보너스 번호를 입력해 주세요");
            bonusNumber = Console.readLine();
        } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }
}
