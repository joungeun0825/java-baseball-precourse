package baseball.controller;

import baseball.generator.ProgramNumGenerator;
import utils.InputUtils;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballGame {
    public void start(){
        makeQuiz();
        makeAnswer();
    }
    public void makeQuiz(){
        ProgramNumGenerator programNumGenerator = new ProgramNumGenerator();
        programNumGenerator.makeRandom();
    }

    public void makeAnswer(){
        System.out.print("숫자를 입력해주세요 : ");
        String playerNumber = readLine();
    }
}
