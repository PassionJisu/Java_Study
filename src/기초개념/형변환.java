package 기초개념;

public class 형변환 {
    public static void main(String[] args) {
        int x = 50000;
        long y = x; // int to long 형변환 자연스러운 변환 -> 묵시적 형변환

        long x2 = 5;
        int y2 = (int) x2; // 강제 형변환

    }
}
