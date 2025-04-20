package 프로그래머스.1단계;

public class 나머지가1 {
    public int solution(int n) {
        int answer = 1;
        
        while(!(n % answer == 1)){
            answer++;
        }
        return answer;
    }
}
