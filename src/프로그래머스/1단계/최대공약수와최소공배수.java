public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(m, n);
        answer[1] = lcm(m, n);
        return answer;
    }
    
    public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
        }   
    return a;
    }   
    
    public static int lcm(int a, int b) {
    return a * b / gcd(a, b); 
    }
}
