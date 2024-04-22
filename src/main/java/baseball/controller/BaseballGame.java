package baseball.controller;

import baseball.generator.ProgramNumGenerator;

public class BaseballGame {
    public void start(){
        makeQuiz();
    }
    public void makeQuiz(){
        ProgramNumGenerator programNumGenerator = new ProgramNumGenerator();
        programNumGenerator.makeRandom();
    }
}
