package javautil_exam;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)); //**Caution!!** 자바에서는 월을 표현할 때 0 ~ 11월까지 표현함 like index
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR)); 
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //HOUR_OF_DAY 13시 20시 처럼 표현함
        System.out.println(cal.get(Calendar.MINUTE));

        cal.add(Calendar.HOUR, 5); // Calendar의 Hour 필드를 아규먼트의 값만큼 증가

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)); 
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR)); 
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
    }
}
