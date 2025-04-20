package 프로그래머스.1단계;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        if(arr.length == 4 || arr.length == 6){
            for(char ch : arr){
                if((int)ch >= 48 && (int)ch <= 57 ) count ++;
            }
        }

        return count == arr.length ? true : false;
    }
}
