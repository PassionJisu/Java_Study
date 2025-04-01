package 클래스;

public class 열거형 {
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = 열거형.MALE;
        gender1 = 열거형.FEMALE;
        
        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        gender2 = "boy";
    }
}
enum Gender{
    MALE, FEMALE;
}