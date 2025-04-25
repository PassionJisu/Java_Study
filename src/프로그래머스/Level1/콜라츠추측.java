package 프로그래머스.Level1;

public class 콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        while (num != 1) {
            if(num % 2 == 0) {
                num /= 2;
            }
            else {
                if (num > Integer.MAX_VALUE / 3) return -1; // int 오버플로우 방지
                num = num *3 + 1;
            }
            answer++;
        }
        return answer >= 500 ? -1 : answer;
    }
}
//해결방안 1. long 타입 변환 or 2.int 오버플로우 발생시 강제 종료

