package lotto.service;

import lotto.model.Lotto;

import java.util.List;

public class CountCorrectNumber {
    private List<Lotto> lottoList;



    public CountCorrectNumber(List<Lotto> lottoList) {
        this.lottoList = lottoList;
    }

    public void listCorrectNumber(List<Lotto> myLottos, Lotto winningLotto){
        for (Lotto myLotto : myLottos) {
            chooseCorrectNumber(myLotto, winningLotto);
        }
    }

    public void chooseCorrectNumber(Lotto myLotto, Lotto winningLotto) {
        for (int winningLottoNumber : winningLotto.getNumbers()) {
            sameNumber(myLotto, winningLottoNumber);
        }
    }

    public void sameNumber(Lotto myLotto, int oneOfMyLottoNumber) {
        for (int lotto : myLotto.getNumbers()) {
            if (lotto == oneOfMyLottoNumber) {
                myLotto.plusCorrectNumbers();
                break;
            }
        }
    }
}
