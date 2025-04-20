package 기초개념;

public class 연산자우선순위 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println((a - b) * c);

        System.out.println(a > 5 && b > 5);

        System.out.println(++a - 5); //a++ 이면 결과값 0 그리고 a = 6이 될 것

        System.out.println(a);
    }
}
