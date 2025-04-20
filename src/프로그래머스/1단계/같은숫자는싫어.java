package 프로그래머스.1단계;

import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length ; i++){
            if(i == arr.length - 1) {
                stack.push(arr[i]);
                break;
            }
            if(arr[i] == arr[i+1]) continue;
            stack.push(arr[i]);
        }
        
        int[] answer = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
