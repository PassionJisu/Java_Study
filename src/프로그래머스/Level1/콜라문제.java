public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int totalCoke = 0;
        int currentCoke = n;

        while(currentCoke >= 2 && currentCoke / a != 0){
            totalCoke += (currentCoke / a) * b;
            currentCoke = (currentCoke / a) * b + currentCoke % a;
        }

        return totalCoke;
    }
}
