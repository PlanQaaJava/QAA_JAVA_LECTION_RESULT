import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Date {

    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toInstant());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMM.yyyy", Locale.ENGLISH);
        System.out.println(formatter.format(localDate));

        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        System.out.println(timestamp.getTime());
        System.out.println(timestamp.getNanos());
    }
}
