package 프로그래머스.Level1;

class 숫자문자열과영단어 {
    public int solution(String s) {
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
    
        for (int i = 0; i < words.length; i++) {
        s = s.replace(words[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}

/*
 public int solution(String s) {
        Map<String, String> numberMap = Map.ofEntries(
            Map.entry("zero", "0"), Map.entry("one", "1"), Map.entry("two", "2"),
            Map.entry("three", "3"), Map.entry("four", "4"), Map.entry("five", "5"),
            Map.entry("six", "6"), Map.entry("seven", "7"), Map.entry("eight", "8"),
            Map.entry("nine", "9")
        );

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c); // 숫자는 바로 붙임
            } else {
                temp.append(c); // 문자는 이어붙이며 확인
                if (numberMap.containsKey(temp.toString())) {
                    result.append(numberMap.get(temp.toString()));
                    temp.setLength(0); // temp 초기화
                }
            }
        }

        return Integer.parseInt(result.toString());
    } 매핑을 통하여 해결하는 방법
 */ 
