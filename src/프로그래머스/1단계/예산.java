import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int value : d){
            budget -= value;
            if(budget < 0) break;
            answer++;
        }
        
        return answer;
    }   
}
