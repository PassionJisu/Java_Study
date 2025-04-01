package 인터페이스;

public class InnerExam2 {
    static class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.prinltn(cal.value);
    }


    }
}
