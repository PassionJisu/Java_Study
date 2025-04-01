package 기초개념;

public class 삼항연산자 {
    public static void main(String[] args) {
        int b1 = (5 > 4) ? 50 : 40;

        System.out.println(b1);

        int b2 = 0;
        if(5 < 4){ //삼항연산자가 익숙치 않으면 조건문으로 충분히 대체 가능
            b2 = 50;
        }
        else{
            b2 = 40;
        }

        System.out.println(b2);
    }
}
