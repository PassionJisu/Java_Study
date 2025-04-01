package 상속;

public class Truck extends Car{
    public Truck(){
        super("소방차"); //Truck 객체를 만들 때 부모의 생성자를 자동적으로 만들어냄
        System.out.println("Truck의 기본 생성자입니다.");
    }
}
