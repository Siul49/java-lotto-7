package lotto.service;

import lotto.util.MessageConstants;

public class CalculateTotalBenefit {
    private int[] lotto;
    private int budget;
    private double totalBenefit = 0;
    public CalculateTotalBenefit(int[] lotto, int budget) {
        this.lotto = lotto;
        this.budget = budget;
    }

    public void sumLotto(){
        lotto[0] *= 5000;
        lotto[1] *= 50000;
        lotto[2] *= 1500000;
        lotto[3] *= 30000000;
        lotto[4] *= 2000000000;
        for (int i = 0; i < lotto.length; i++) {
            totalBenefit += (double)lotto[i];
        }
    }

    public void calculateTotalBenefit() {
        if (totalBenefit != 0) {
            totalBenefit /= (double)budget;
            System.out.println(MessageConstants.TOTAL_BENEFIT.getMessage(totalBenefit));
            return;
        }
        System.out.println(MessageConstants.TOTAL_BENEFIT.getMessage(0));
    }
}
