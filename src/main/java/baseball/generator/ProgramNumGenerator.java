package baseball.generator;

import java.util.ArrayList;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class ProgramNumGenerator {
    private ArrayList<Integer> programNum = new ArrayList<>();
    private boolean[] flag = new boolean[10];
    public void checkNumber(int randomNum){
        flag[randomNum] = true;
    }
    public void makeRandom(){
        while(programNum.size()!=3){
            int randomNum = pickNumberInRange(1,9);
            if(flag[randomNum]){
                continue;
            }else{
                programNum.add(randomNum);
                checkNumber(randomNum);
            }
        }

        for (int i=0;i<3;i++){
            System.out.println(programNum.get(i));
        }
    }
}
