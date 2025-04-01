package 인터페이스;

public class MyCalTest {
    public static void main(String[] args) {
        Caculator cal = new MyCal();
        System.out.println(cal.plus(10, 20));
        System.out.println(cal.multiple(10, 20));
        System.out.println(cal.exec(20, 30));
    }
}
