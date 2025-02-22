package lotto.service;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.model.Lotto;
import lotto.util.Validator;


public class LottoList {
    private List<Lotto> lottoContainer = new ArrayList<>();

    public LottoList(int numberOfTrials) {
        for (int i = 0; i < numberOfTrials; i++) {
            List<Integer> lottoNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Validator validator = new Validator();
            validator.numberDuplicateValidator(lottoNumbers);
            Lotto lotto = new Lotto(lottoNumbers);
            lottoContainer.add(lotto);
        }
    }

    public List<Lotto> getLottoContainer() {
        return lottoContainer;
    }
}
