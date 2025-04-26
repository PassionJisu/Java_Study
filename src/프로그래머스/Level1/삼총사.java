package 프로그래머스.Level1;

import java.util.*;

class Solution {
        
    List<List<Integer>> result = new ArrayList<>();
    
    public int solution(int[] number) {
        int answer = 0;
        
        combine(number, new ArrayList<>(), 0, 3);
        
       for (List<Integer> inner : result) {
            int sum = 0;
            for (int num : inner) {
                sum += num;
            }
            if(sum == 0) answer ++;
       }    
        return answer;
    }
    
    public void combine(int[] arr, List<Integer> temp, int start, int r) {
        if (temp.size() == r) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            combine(arr, temp, i + 1, r);
            temp.remove(temp.size() - 1);
        }
    }
}

