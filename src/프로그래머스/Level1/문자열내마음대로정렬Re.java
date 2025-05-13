import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬Re {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2); // 사전순 정렬
                } else {
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            }
        });

        return strings;
    }
}
//재학습 필요