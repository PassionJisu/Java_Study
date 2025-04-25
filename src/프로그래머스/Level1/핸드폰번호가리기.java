package 프로그래머스.Level1;


public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder(phone_number);
        int len = phone_number.length();
        for(int i = 0; i < len - 4; i++){
        sb.setCharAt(i, '*');
        }
        answer = sb.toString();
        
        return answer;
    }
}
