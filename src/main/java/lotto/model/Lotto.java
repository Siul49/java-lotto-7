package lotto.model;

import java.util.List;
import lotto.AppConfig;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> number) {

        AppConfig appConfig = new AppConfig();
        appConfig.validator(number);
        this.numbers = number;
    }


    // TODO: 추가 기능 구현
}
