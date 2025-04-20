package 클래스;

public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();
        myclass.method2(2);
        int value = myclass.method3();
        System.out.println("m3이 리턴한 값:" + value);
        myclass.method4(5,10);
        int value2 = myclass.method5(10);
        System.out.println("m5가 리턴한 값:" + value2);
    }
}
