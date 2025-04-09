package 프로그래머스.1단계;

import java.util.*;

public class 정수내림차순정렬 {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        
        while(n > 0){
            list.add(n % 10);    
            n /= 10;
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for (long num : list){
            answer = answer * 10 + num;
        }
        return answer;
        
    }
}
