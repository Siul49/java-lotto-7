package lotto.model;

import java.util.List;


public class Lotto {
    private final List<Integer> numbers;
    private int correctNumbers;

    public Lotto(List<Integer> lotto) {
        correctNumbers = 0;
        numbers = lotto;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getCorrectNumbers() {
        return correctNumbers;
    }

    public void setNumbers(int correctNumbers) {
        this.correctNumbers = correctNumbers;
    }

    public void plusCorrectNumbers() {
        correctNumbers++;
    }
}
