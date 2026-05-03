package DateTime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Demo1 {
    public static void main(String[] args) {
        ZonedDateTime tz = ZonedDateTime.now();
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(tf.format(tz));
    }
}