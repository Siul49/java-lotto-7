package lotto;


import lotto.controller.LottoController;
import lotto.service.CountLotto;
import lotto.service.MakeRandomNumbers;
import lotto.view.UserInput;
import lotto.view.UserOutput;

public class AppConfig {
    public UserInput userInput(){
        return new UserInput();
    };

    public UserOutput userOutput(){
        return new UserOutput();
    }

    public LottoController lottoController(){
        return new LottoController(
                userInput(),
                userOutput()
        );
    }
}
