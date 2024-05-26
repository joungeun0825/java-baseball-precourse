package baseball;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballGame {
    static List<Integer> computerNum = new ArrayList<>();
    static List<Integer> userNum = new ArrayList<>();

    static public void startGame(){
        computerNum = RandomNumGenerator.generateRandomNum();
        String input = readLine();
        userNum = UserNumGenerator.generateUserNum(input);
    }
}
