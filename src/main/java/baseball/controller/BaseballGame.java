package baseball.controller;

import baseball.domain.ComputerNum;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballGame {
    public void start(){
        makeQuiz();
    }
    public void makeQuiz(){
        ComputerNum computerNum = new ComputerNum();
        computerNum.makeRandom();
    }
    public void makeAnswer(){
        String s = readLine();
    }
}
