package 프로그래머스.Level1;

class _3진법뒤집기 {
    public int solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        while (n > 0){
            sb.append(n % 3);
            n /= 3;
        }
        
        String s = sb.toString();
 
        int result = 0;

        for(int i = 0 ; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            result += digit * (int)Math.pow(3, s.length() - i -1);  
        }
        return result;
    }
}