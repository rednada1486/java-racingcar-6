package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String readInput(String question) {
        System.out.println(question);
        return readLine();
    }
}
