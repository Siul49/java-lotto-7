package lotto.util;

import lotto.model.Lotto;

import java.util.*;

public class Validator {
    public void numberCountValidator(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(MessageConstants.NUMBER_COUNT_ERROR.getMessage());
        }
    }

    public void numberLimitValidator(List<Integer> numbers) {
        numbers.forEach(number -> {
            if (number > 45 || number < 1) {
                throw new IllegalArgumentException(MessageConstants.NUMBER_LIMIT_ERROR.getMessage());
            }
        });
    }

    public void numberDuplicateValidator(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        for (Integer number : numbers) {
            if (!seen.add(number)) {
                throw new IllegalArgumentException(MessageConstants.NUMBER_DUPLICATE_ERROR.getMessage());
            }
        }
    }
    public void numberDuplicateWithBonusNumberValidator(Lotto winningLotto, int bonusNumber) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < winningLotto.getNumbers().size(); i++) {
            if (!seen.add(winningLotto.getNumbers().get(i))) {
                throw new IllegalArgumentException(MessageConstants.NUMBER_DUPLICATE_ERROR.getMessage());
            }
        }
        if (!seen.add(bonusNumber)) {
            throw new IllegalArgumentException(MessageConstants.NUMBER_DUPLICATE_ERROR.getMessage());
        }
    }
}
