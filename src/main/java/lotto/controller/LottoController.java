package lotto.controller;

import lotto.model.Lotto;
import lotto.service.AdjustmentLotto;
import lotto.service.CalculateTotalBenefit;
import lotto.service.CountCorrectNumber;
import lotto.service.LottoList;
import lotto.view.UserInput;
import lotto.view.UserOutput;
import lotto.util.Validator;

public class LottoController {
    UserInput userInput;
    UserOutput userOutput;
    Validator validator;
    LottoList lottoList;
    CountCorrectNumber countCorrectNumber;
    AdjustmentLotto adjustmentLotto;
    CalculateTotalBenefit calculateTotalBenefit;

    public LottoController(
            UserInput userInput,
            UserOutput userOutput,
            Validator validator,
            LottoList lottoList,
            CountCorrectNumber countCorrectNumber,
            AdjustmentLotto adjustmentLotto,
            CalculateTotalBenefit calculateTotalBenefit) {
        this.userInput = userInput;
        this.userOutput = userOutput;
        this.validator = validator;
        this.lottoList = lottoList;
        this.countCorrectNumber = countCorrectNumber;
        this.adjustmentLotto = adjustmentLotto;
        this.calculateTotalBenefit = calculateTotalBenefit;
    }

    public void lottoPlaying(){
        buyLotto();
        executeLotto();
        winningPriceLotto();
    }

    public void buyLotto(){
        userInput.setBudget();
        lottoList = new LottoList(userInput.getNumberOfLotto());

        userOutput.printNumberOfLotto(userInput.getNumberOfLotto());
        userOutput.printNumberOfLottoNumbers(lottoList.getLottoContainer());
    }

    public void executeLotto(){
        userInput.setWinningNumbers();
        Lotto winningLotto = new Lotto(userInput.getWinningLotto().getNumbers());
        validator.numberCountValidator(winningLotto.getNumbers());

        userInput.setBonusNumber();
        validator.numberDuplicateWithBonusNumberValidator(winningLotto, userInput.getBonusNumber());

        countCorrectNumber.listCorrectNumber(lottoList.getLottoContainer(), winningLotto);

    }

    public void winningPriceLotto(){
        adjustmentLotto.countCorrectNumber();
        adjustmentLotto.printLotto();

        calculateTotalBenefit.calculateTotalBenefit();
    }







}
