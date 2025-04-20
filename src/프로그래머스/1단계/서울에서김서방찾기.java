package 프로그래머스.1단계;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for (String str : seoul){
            if(str.equals("Kim")) break;
            x++;
        }
        answer = String.format("김서방은 %d에 있다", x);
        return answer;
    }
}
