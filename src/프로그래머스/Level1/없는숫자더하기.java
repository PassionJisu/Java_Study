package 프로그래머스.Level1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int num : numbers){
            answer += num;
        }
        
        return 45 - answer;
    }
}
