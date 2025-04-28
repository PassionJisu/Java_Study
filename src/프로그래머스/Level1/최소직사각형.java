package 프로그래머스.Level1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            // 두 변의 길이 중 큰 값을 가로로, 작은 값을 세로로 통일
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);

            // Maximum Update Pattern
            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth * maxHeight;
    }
}
