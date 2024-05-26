package baseball;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumGenerator {
    static List<Integer> randomNum = new ArrayList<>();
    static boolean[] flag = new boolean[10];
    static public List<Integer> generateRandomNum(){
        while(randomNum.size()<3){
            int newRandomNum = pickNumberInRange(1,9);
            if(!checkDuplication(newRandomNum)){
                randomNum.add(newRandomNum);
            }
        }
        return randomNum;
    }

    static public boolean checkDuplication(int checkNum){
        if(!flag[checkNum]){
            flag[checkNum] = true;
            return false;
        }
        return true;
    }
}
