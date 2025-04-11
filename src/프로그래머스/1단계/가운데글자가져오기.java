package 프로그래머스.1단계;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int i = (s.length() -1) / 2;
        if (s.length() % 2 != 0) answer = s.substring(i, i+1);
        else answer = s.substring(i, i+2);
            
        return answer;
    }
}
