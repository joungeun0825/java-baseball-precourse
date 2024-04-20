package baseball.domain;

import java.util.ArrayList;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class ComputerNum{

    private ArrayList<Integer> computer = new ArrayList<>();
    public void makeRandom(){
        for (int i=0;i<3;i++){
            Integer randomNum = pickNumberInRange(1,9);
            computer.add(randomNum);
        }
        for (int i=0;i<3;i++){
            System.out.println(computer.get(i));
        }
    }
}
