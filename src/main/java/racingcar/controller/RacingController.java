package racingcar.controller;


import racingcar.service.RacingService;

public class RacingController {

    private final RacingService racingService;
    public static final String CAR_NAME_INPUT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String HOW_MANY_ROUND_INPUT = "시도할 회수는 몇회인가요?";
    public static final String WRONG_CAR_NAME_ERROR_MESSAGE = "차량 이름은 5글자 이하이어야 합니다.";
    public static final String NOT_A_INTEGER_NUMBER_ERROR_MESSAGE = "숫자만 입력 가능합니다.";

    public RacingController(RacingService racingService) {
        this.racingService = new RacingService();
    }

    public String[] userInputToCarArray(String userInput) {
        return userInput.split(",");
    }
}
