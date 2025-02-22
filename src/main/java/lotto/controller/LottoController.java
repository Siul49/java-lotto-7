package lotto.controller;

import lotto.service.CountLotto;
import lotto.service.MakeRandomNumbers;
import lotto.view.UserInput;
import lotto.view.UserOutput;
import lotto.util.Validator;
import java.util.List;

public class LottoController {
    UserInput userInput;
    UserOutput userOutput;
    Validator validator;

    public LottoController(UserInput userInput, UserOutput userOutput) {
        this.userInput = userInput;
        this.userOutput = userOutput;
        validator = new Validator();
    }

    public void lottoPlaying(){
        buyLotto();
    }

    public void buyLotto(){
        userInput.setTrial();
        MakeRandomNumbers lottoList = new MakeRandomNumbers();
        CountLotto countLotto = new CountLotto();

        int numberOfLotto = countLotto.countLotto(userInput.getTrial());
        List<List<Integer>> lottoNumbersContainer = lottoList.makeRandomNumbers(numberOfLotto);

        userOutput.printNumberOfLotto(numberOfLotto);
        userOutput.printNumberOfLottoNumbers(lottoNumbersContainer);
    }

    public void executeLotto(){
        userInput.setWinningNumbers();
        validator.numberCountValidator(userInput.getLottoNumbers());

    }

    public void lottoController() {

    }






}
