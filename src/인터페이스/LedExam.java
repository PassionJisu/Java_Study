package 인터페이스;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTv();
        tv.turnOn();
        tv.changeVolume(8);
        tv.changeChannel(39);
        tv.turnOff();
    }
}
