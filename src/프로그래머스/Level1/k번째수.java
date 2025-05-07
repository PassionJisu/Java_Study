package 프로그래머스.Level1;

import java.util.*;

public class k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length ; i++){
            int[] temp_array = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]);
            Arrays.sort(temp_array);
            answer[i] = temp_array[commands[i][2] - 1];
        }
        //copyOfRange ** 원본 배열 복사 후 start 인덱스부터 end 인덱스(미포함) 까지 잘라내는 메서드
        return answer;
    }
}
