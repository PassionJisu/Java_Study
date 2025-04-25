package 프로그래머스.Level1;

import java.util.*;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        for(int value : arr){
            if (value % divisor == 0) list.add(value); 
        }
        Collections.sort(list);
        int[] empty = {-1};
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length ; i++){
            answer[i] = list.get(i);
        }
        return list.size() != 0 ? answer : empty;
    }
}
