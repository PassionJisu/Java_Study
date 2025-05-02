package 프로그래머스.Level1;
import java.util.*;
class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> seen = new HashSet<>();

        // Generate all unique pair sums
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                seen.add(numbers[i] + numbers[j]);
            }
        }

        // 인트형 배열에 수동으로 넣기
        int[] answer = new int[seen.size()];
        int index = 0;
        for (Integer num : seen) {
            answer[index++] = num;
        }

        // Sort the array
        Arrays.sort(answer);

        return answer;
    }
}

