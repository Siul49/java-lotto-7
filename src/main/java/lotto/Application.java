package lotto;

import lotto.controller.LottoController;

public class Application {
    static AppConfig appConfig;
    static LottoController lottoController;
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        appConfig = new AppConfig();
        lottoController = appConfig.lottoController();

        lottoController.buyLotto();
    }
}
