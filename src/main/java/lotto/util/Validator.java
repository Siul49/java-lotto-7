package lotto.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
    private void numberCountValidator(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    private void numberLimitValidator(List<Integer> numbers) {
        numbers.forEach(number -> {
            if (number > 45 || number < 1) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        });
    }

    private void numberDuplicateValidator(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        for (int number : numbers) {
            if (!seen.add(number)) {  // add()가 false를 반환하면 중복된 값
                throw new IllegalArgumentException("[ERROR] 중복된 값을 입력받았습니다!");
            }
        }
    }
}
