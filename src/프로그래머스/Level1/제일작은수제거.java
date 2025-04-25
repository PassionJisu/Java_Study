package 프로그래머스.Level1;

public class 제일작은수제거 {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            return new int[]{-1};
        }
        int target = arr[0];
        for(int i = 0; i< arr.length ; i++){
            target = target < arr[i] ? target : arr[i];
        }
        int[] answer = new int[arr.length -1];
        int index = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target) continue;
            answer[index++] = arr[i];
        }
        return answer;
    }
}
