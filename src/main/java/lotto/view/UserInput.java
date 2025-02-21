package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class UserInput {

    private String trial;
    private int numbers;

    public String getTrial() {
        return trial;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setTrial() {
        try {
            System.out.println("구입 금액을 입력해 주세요.");
            trial = Console.readLine();
        } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }

    public void setNumbers() {
        try {
            System.out.println("당첨 번호를 입력해 주세요.");
            numbers = Integer.parseInt(Console.readLine());
        } catch (Exception exception) {
            throw new IllegalArgumentException("[Error] 입출력 과정에서 예외가 발생했습니다. ");
        }
    }

}
