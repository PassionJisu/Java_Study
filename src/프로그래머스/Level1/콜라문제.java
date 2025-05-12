public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int totalCoke = 0;
        int currentCoke = n;

        while(currentCoke >= 2 && currentCoke / a != 0){ //조건을 단순히 currentCoke >= a 로 하는 게 더 깔끔끔
            totalCoke += (currentCoke / a) * b;
            currentCoke = (currentCoke / a) * b + currentCoke % a;
        }

        return totalCoke;
    }
}
