package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        // System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);

        GregorianCalendar gc = new GregorianCalendar();
        // System.out.println((Calendar.getAvailableCalendarTypes()));
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);

        LocalTime t = LocalTime.now();
        LocalDate tm = LocalDate.now();
        LocalDateTime tw = LocalDateTime.now();
        System.out.println(t);
        System.out.println(tm);
        System.out.println(tw);

    }
}
