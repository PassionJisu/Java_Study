package 프로그래머스.1단계;

class x만큼간격 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++ ){
            answer[i] = (long)x*(i+1);
        }
        return answer;
    }
}