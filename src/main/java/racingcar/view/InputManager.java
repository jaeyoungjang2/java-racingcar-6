package racingcar.view;

public class InputManager {
    public static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static void requestCarName() {
        System.out.println(INPUT_CAR_NAME);
    }
}