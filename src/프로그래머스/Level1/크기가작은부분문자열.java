package 프로그래머스.Level1;

public class 크기가작은부분문자열 {

        public int solution(String t, String p) {
            int answer = 0;
            
            for(int i = 0; i <=t.length() - p.length(); i++){
                String str = t.substring(i, p.length() + i);
                if (str.compareTo(p) <= 0) answer++;
            }
            return answer;
        }
    }
