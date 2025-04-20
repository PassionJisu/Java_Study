package javautil_exam;

import java.time.*;

public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate Id1 = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(Id1);

        LocalTime It1 = LocalTime.of(17, 18);
        System.out.println(It1);
        LocalTime It2 = LocalTime.parse("10:15:30");
        System.out.println(It2);

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        Month month = timePoint.getMonth();
        System.out.println(timePoint.getMonth());
        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());
    }
}
