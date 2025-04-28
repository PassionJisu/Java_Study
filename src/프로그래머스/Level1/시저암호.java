package 프로그래머스.Level1;

public class 시저암호 {
    public String solution(String s, int n) {
        char arr[] = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++){
            if(arr[i] == ' ') continue;
        
            if(arr[i] >= 'a' && arr[i] <= 'z')
            arr[i] = (char) ('a' + (arr[i] -'a' + n) % 26); //아스키코드를 빼 0~25 범위 안으로 만들고 초과되면 0으로 초기화
            else
            arr[i] = (char) ('A' + (arr[i] -'A' + n) % 26);
            
        }
        return new String(arr); //문자형 배열을 새로운 문자열 객체로 생성
    }
}
