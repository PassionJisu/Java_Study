package 클래스;

public class 변수스코프 {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        // System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(valueScope);
        System.out.println(staticVal);

        변수스코프 v1 = new 변수스코프();
        System.out.println(v1.globalScope);
        변수스코프 v2 = new 변수스코프();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal); //인스턴스가 다른 각각의 변수에 값을 집어넣었지만 메모리는 공유중
        System.out.println(변수스코프.staticVal); //인스턴스의 영향을 받지 않기 때문에 클래스명과 함께 쓰는 것이 더 명료함.
    }
}
