package 프로그래머스.1단계;

class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int value : arr){
            sum += value;
        }
        answer = (double)sum / arr.length; 
        return answer;
    }
}