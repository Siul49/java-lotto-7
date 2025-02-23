package lotto.util;

public enum MessageConstants{
    THREE_MESSAGE("3개 일치 (5,000원) - "),
    FOUR_MESSAGE("4개 일치 (50,000원) - "),
    FIVE_MESSAGE("5개 일치 (1,500,000원) - "),
    FIVE_AND_BONUS_MASSAGE("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    SIX_MASSAGE("6개 일치 (2,000,000,000원) - "),

    PURCHASE_MESSAGE("개를 구매했습니다"),
    REQUEST_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
    REQUEST_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
    REQUEST_PURCHASE_AMOUNT("구입 금액을 입력해 주세요."),
    WINNING_STATISTICS("당첨 통계\n---"),
    TOTAL_BENEFIT("총 수익률은 %.1f%%입니다."),

    INOUTPUT_ERROR("[Error] 입출력 과정에서 예외가 발생했습니다."),
    NUMBER_COUNT_ERROR("[ERROR] 로또 번호는 6개여야 합니다."),
    NUMBER_LIMIT_ERROR("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다."),
    NUMBER_DUPLICATE_ERROR("[ERROR] 중복된 값을 입력받았습니다!"),
    NOT_NUMBER_ERROR("[ERROR] 숫자를 입력하세요.");


    private String message;
    MessageConstants(String message){
        this.message = message;
    }

    public String getMessage(double totalBenefit){
        return String.format(message, totalBenefit);
    }
    public String getMessage(){
        return message;
    }
}