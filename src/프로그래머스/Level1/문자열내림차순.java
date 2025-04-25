package 프로그래머스.Level1;

import java.util.Arrays;

public class 문자열내림차순 {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        
        Arrays.sort(charArray);
        
        for(int i = 0; i < charArray.length / 2 ; i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length -1 -i];
            charArray[charArray.length -1 -i] = temp;
        }
        String answer = new String(charArray);
        
        return answer;
    }
}

