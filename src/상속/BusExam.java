package 상속;

public class BusExam {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.run();
        bus1.ppangppang();

        Car car = new Car();
        car.run();
        // car.ppangppang();

        Car c = new Bus();
        c.run();
        // c.ppangppang(); //부모 클래스는 자식 클래스의 메서드를 사용할 수 없음
        Bus bus = (Bus)c; //c의 최초 선언시 버스 객체를 참조하였기 때문에(그러나 부모 객체로써 작용하였음) 강제 형 변환 가능
        bus.run();
        bus.ppangppang();


    }
}
