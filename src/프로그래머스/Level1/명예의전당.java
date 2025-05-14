import java.util.Arrays;

public class 명예의전당 {
     public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] jundang = new int[k];
        int size = 0;

        for (int i = 0; i < score.length; i++) {
            if (size < k) {
                jundang[size++] = score[i]; // 아직 전당이 다 안 찼으면 그냥 넣기
            } else if (score[i] > jundang[0]) {
                jundang[0] = score[i]; // 가장 낮은 점수 교체
            }
            Arrays.sort(jundang, 0, size); // 항상 현재 size까지 정렬

            answer[i] = jundang[0]; // 가장 낮은 점수 저장
        }

        return answer;
    }
}
