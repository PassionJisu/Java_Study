package test;

public class test2 {
    public static void main(String[] args) {

        int test1 = 13;
        int test3 = 0;


        String test = Integer.toString(test1);
        String test2 = Integer.toString(test3);
        String answer = "";
        answer = answer.join(":", test, test2);
        System.out.println(answer);

        String pos = "13:52";
        String[] ps = pos.split(":");

        System.out.println(ps[0]);
        System.out.println(ps[1]);
        
        int ps_int = Integer.parseInt(ps[0])*60 + Integer.parseInt(ps[1]);
        System.out.println(ps_int);
    }
}
