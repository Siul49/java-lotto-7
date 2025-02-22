package lotto.service;

import lotto.model.Lotto;

import java.awt.*;

public class FindSameNumber {
    private Lotto lotto;

    public FindSameNumber(Lotto lotto) {
        this.lotto = lotto;
    }

    public static boolean sameNumber(Lotto myLotto, int bonus) {
        for (int lotto : myLotto.getNumbers()) {
            if (lotto == bonus) {
                return true;
            }
        }
        return false;
    }
}
