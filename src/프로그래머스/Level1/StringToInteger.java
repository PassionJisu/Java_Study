package 프로그래머스.Level1;

public class StringToInteger {
    public int solution(String s) {
        
        int answer = Integer.parseInt(s);
        
        try {
             int num = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                    System.out.println("숫자로 변환할 수 없는 문자열입니다.");
                }
        return answer;
    }
}
