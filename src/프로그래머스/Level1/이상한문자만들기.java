package 프로그래머스.Level1;

public class 이상한문자만들기 {
    public String solution(String s) {

        StringBuilder sb = new StringBuilder();        
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') {
                idx = 0;
                sb.append(c);
            }
            else{
                if(idx % 2 == 0) c = Character.toUpperCase(c);
                else c = Character.toLowerCase(c);
                sb.append(c);
                idx++;
            }
        }

        return sb.toString();
    }
}
