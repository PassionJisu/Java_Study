package BaekJoon;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  
        System.out.println(isPalindrome(input));
    }

    public static int isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        return s.equals(reversed) ? 1 : 0;
    }
}
