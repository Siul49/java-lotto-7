package lotto.controller;

import lotto.model.Lotto;
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


    public LottoController(
            UserInput userInput,
            UserOutput userOutput,
            Validator validator,
            LottoList lottoList,
            CountCorrectNumber countCorrectNumber) {
        this.userInput = userInput;
        this.userOutput = userOutput;
        this.validator = validator;
        this.lottoList = lottoList;
        this.countCorrectNumber = countCorrectNumber;
    }

    public void lottoPlaying(){
        buyLotto();
        executeLotto();
    }

    public void buyLotto(){
        userInput.setTrial();
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







}
