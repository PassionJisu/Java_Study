package 클래스;

public class 스트링클래스 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2)
        System.out.println(str1);
        if(str3 == str4)
        System.out.println(str3);

        System.out.println(str1);
        System.out.println(str1.substring(3));
        System.out.println(str1);
    }
}
