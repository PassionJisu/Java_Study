package 프로그래머스.Level1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        int y_count = 0;
        int p_count = 0;
        String str = s.toUpperCase(); 
        for(char c : str.toCharArray()){
            if(c == 'Y') y_count++; 
            if(c == 'P') p_count++;
        }
        if(y_count != p_count) answer = false;
        
        return answer;
    }
}
