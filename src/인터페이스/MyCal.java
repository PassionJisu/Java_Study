package 인터페이스;

public class MyCal implements Caculator{
    public int plus(int i, int j){
        return i + j;
    }

    public int multiple(int i, int j){
        return i * j;
    }
}
