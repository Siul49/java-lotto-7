package lotto.service;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;


public class MakeRandomNumbers {
    private final List<List<Integer>> lottoNumbersContainer = new ArrayList<List<Integer>>();

    public List<List<Integer>> makeRandomNumbers(int numberOfTrials) {

        for (int i = 0; i < numberOfTrials; i++) {
            List<Integer> lottoNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            lottoNumbersContainer.add(lottoNumbers);
        }

        return lottoNumbersContainer;
    }

}
