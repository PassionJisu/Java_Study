package test;
public class test4 {
    
    public int solution(int n) {
        int answer = 0;
        int num = n;

        int count = (int)(Math.log10(num));
        System.out.println(count);
        for(int i = count; i >= 0 ;i--)
        {
            answer += num / (int)Math.pow(10, i);
            num %= (int)Math.pow(10, i);
        }

        return answer;
    

    }
}