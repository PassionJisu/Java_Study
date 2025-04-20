package 기초개념;

public class 산술연산자 {
    public static void main(String[] args) {
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3; // i3 = i3+1;
        System.out.println(i4);
        System.out.println(i3);

        int i5 = i3++; // i3 = i3 + 1;
        System.out.println(i5); // 후위연산자 였기 때문에 i5에 i3을 먼저 집어넣고 i3을 1 더하는 작업 수행
        System.out.println(i3);

        int i = 5;
        int j = 2;

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / (double)j); // 데이터 타입이 더 큰 피연산자의 자료형으로 변환됨됨
        System.out.println(i % j);
    }
}
