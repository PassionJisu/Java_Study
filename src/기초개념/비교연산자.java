package 기초개념;

public class 비교연산자 {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;

        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i > j);
        System.out.println(i >= j);

        i += 10; // i = i + 10;

        System.out.println(i);

        System.out.println(i -= 5);
        System.out.println(i);
        }
}
