package utils;

import java.util.HashSet;
import java.util.Set;

public class InputUtils {
    private static final int PLAYER_SIZE = 3;
    private static final int MINIMUM_INDEX = 0;
    private static final int MAXIMUM_INDEX = 3;
    private static final int MINIMUM_ASCII = 49;
    private static final int MAXIMUM_ASCII = 57;

    private static boolean validationFlag = true;
    private static boolean lengthFlag = true;
    private static boolean boundaryFlag = true;
    private static boolean numberFlag = true;
    private InputUtils(){

    }
/*
1. 3으로 길이 제한
2. 세 문자가 다 달라야 함
3. 1~9여야 함
*/
    public static boolean checkValidation(String playerNumber){
        if(!checkLength(playerNumber)){
            throw new IllegalArgumentException("3자리보다 짧은 길이의 숫자 또는 긴 길이의 숫자는 입력될 수 없습니다.");
        }

        if(!checkBoundary(playerNumber)){
            throw new IllegalArgumentException("문자 또는 0은 입력될 수 없습니다.");
        }

        if(!checkNumber(playerNumber)){
            throw new IllegalArgumentException("동일한 숫자는 입력될 수 없습니다.");
        }

        return validationFlag;
    }

    public static boolean checkLength(String playerNumber){
        if(playerNumber.length()<PLAYER_SIZE || playerNumber.length()>PLAYER_SIZE){
            lengthFlag = false;
        }
        return lengthFlag;
    }
    public static boolean checkBoundary(String playerNumber){
        char[] playerArray = playerNumber.toCharArray();
        for (int i = MINIMUM_INDEX; i < MAXIMUM_INDEX; i++) {
            if (playerArray[i] < MINIMUM_ASCII || playerArray[i] > MAXIMUM_ASCII) {
                boundaryFlag = false;
            }
        }

        return boundaryFlag;
    }

    public static boolean checkNumber(String playerNumber){
        Set<Character> playerSet = new HashSet<>();
        char[] playerArray = playerNumber.toCharArray();

        for (int i = MINIMUM_INDEX; i < MAXIMUM_INDEX; i++) {
            playerSet.add(playerArray[i]);
        }

        if (playerSet.size() < PLAYER_SIZE) {
            numberFlag = false;
        }

        return numberFlag;

    }

}
