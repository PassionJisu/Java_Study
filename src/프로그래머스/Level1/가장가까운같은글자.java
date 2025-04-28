package 프로그래머스.Level1;

import java.util.Arrays;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] lastIndex = new int[26]; //소문자 a~z 만 다루는 경우
        Arrays.fill(lastIndex, -1);
        
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a'; // a를 기준으로 범위 매핑
            
            if(lastIndex[idx] == -1){
                answer[i] = -1;
            }    
            else {
                answer[i] = i - lastIndex[idx]; 
            }
            
            lastIndex[idx] = i; // Update Last Index
        }        
        return answer;
    }
}
