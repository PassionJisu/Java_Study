package 프로그래머스.1단계;
import java.util.*;
public class 자연수뒤집기 {
    public int[] solution(long n) {
        int count = (int)Math.log10(n) + 1;
        int[] answer = new int[count];
        for(int i = 0; i < count; i++){
            answer[i] = (int)(n % 10); 
            n /= 10;
        }
        return answer;
    }
}
