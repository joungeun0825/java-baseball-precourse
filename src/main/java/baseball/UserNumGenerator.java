package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserNumGenerator {

    static public ArrayList<Integer> generateUserNum(String input){
        checkVal(input);
        checkSize(input);
        ArrayList<Integer> userNum = convertToList(input);
        checkDuplicate(userNum);
        return userNum;
    }

    //list로 바꾸기
    static public ArrayList<Integer> convertToList(String inputString){
        ArrayList<Integer> newList = new ArrayList<>();
        String[] list = inputString.split("");
        for(String l : list){
            newList.add(Integer.valueOf(l));
        }
        return newList;
    }

    //1~9값을 입력 안하는 경우
    static public void checkVal(String checkValNums){
        for(int i=0; i<checkValNums.length(); i++){
            if(checkValNums.charAt(i) < 49 || checkValNums.charAt(i) > 57){
                throw new IllegalArgumentException("1~9 값을 입력하세요.");
            }
        }
    }

    //같은 값을 입력하는 경우
    static public ArrayList<Integer> checkDuplicate(ArrayList<Integer> checkDupNums){
        int[] flag = new int[10];
        for(Integer checkDupNum : checkDupNums){
            flag[checkDupNum] += 1;
            if(flag[checkDupNum] > 1){
                throw new IllegalArgumentException("서로 다른 값을 입력하세요.");
            }
        }
        return checkDupNums;
    }

    //3 이상의 값을 입력하는 경우
    static public void checkSize(String checkSizeNums){
        if(checkSizeNums.length() != 3){
            throw new IllegalArgumentException("3가지 값만 입력하세요.");
        }
    }
}
