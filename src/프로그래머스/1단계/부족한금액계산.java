package 프로그래머스.1단계;

public class 부족한금액계산 {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for(int i = 1; i <= count ; i++){
            sum += price * i;
        }
        long answer = sum - money;
        return answer > 0 ? answer : 0;
    }
}
