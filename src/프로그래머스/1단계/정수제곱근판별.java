package 프로그래머스.1단계;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        
        long n2 = (long) Math.sqrt(n);
        
        if(n == (n2 * n2)) answer = (n2+1) * (n2+1) ;
        else answer = -1;
        
        return answer;
    }
}
