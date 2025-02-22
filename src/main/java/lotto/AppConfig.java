package lotto;


import lotto.controller.LottoController;
import lotto.service.CountCorrectNumber;
import lotto.service.LottoList;
import lotto.util.Validator;
import lotto.view.UserInput;
import lotto.view.UserOutput;

public class AppConfig {
    public UserInput userInput(){
        return new UserInput();
    };

    public UserOutput userOutput(){
        return new UserOutput();
    }

    public Validator validator(){
        return new Validator();
    }

    public LottoList makeRandomLotto(){
        return new LottoList(userInput().getNumberOfLotto());
    }

    public CountCorrectNumber chooseCorrectNumber(){
        return new CountCorrectNumber(makeRandomLotto().getLottoContainer());
    }

    public LottoController lottoController(){
        return new LottoController(
                userInput(),
                userOutput(),
                validator(),
                makeRandomLotto(),
                chooseCorrectNumber()
                );
    }
}
