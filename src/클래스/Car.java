package 클래스;

public class Car {
    //타입 필드명
    String name;
    int number;

    public Car(){
        //기본 생성자
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음", 0); //자신의 매개변수 2개를 가지는 생성자를 호출하게 됨
    }
    public Car(String name){
        this.name = name; //매개변수를 가지는 생성자
    }

    public Car(String name, int number){
        this.name = name; 
        this.number = number;
    }
}
