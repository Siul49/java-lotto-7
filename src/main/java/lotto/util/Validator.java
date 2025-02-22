package lotto.util;

import lotto.model.Lotto;

import java.util.*;

public class Validator {
    public void numberCountValidator(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    public void numberLimitValidator(List<Integer> numbers) {
        numbers.forEach(number -> {
            if (number > 45 || number < 1) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        });
    }

    public void numberDuplicateValidator(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        for (Integer number : numbers) {
            if (!seen.add(number)) {
                throw new IllegalArgumentException("[ERROR] 중복된 값을 입력받았습니다!");
            }
        }
    }
    public void numberDuplicateWithBonusNumberValidator(Lotto winningLotto, String bonusNumber) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < winningLotto.getNumbers().size() + 1; i++) {
            if (!seen.add(winningLotto.getNumbers().get(i))) {
                throw new IllegalArgumentException("[ERROR] 중복된 값을 입력받았습니다!");
            }
            if (!seen.add(Integer.parseInt(bonusNumber))) {
                throw new IllegalArgumentException("[ERROR] 중복된 값을 입력받았습니다!");
            }
        }
    }
}
