package 클래스;

public class 스트링메소드연습 {
    public static void main(String[] args) {
        //String str = new String("hello");
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        str = str.concat(" world");
        System.out.println(str);
        
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
        System.out.println(str.charAt(1));
    }
}
 