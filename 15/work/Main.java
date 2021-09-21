import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Calendar <-> Date
        // Calendar c = Calendar.getInstance();
        // System.out.println(c);
        // System.out.println(c.get(Calendar.YEAR));
        // System.out.println(c.get(Calendar.MONTH) + 1);
        // System.out.println(c.get(Calendar.DAY_OF_MONTH));
        // System.out.println(c.get(Calendar.HOUR));
        // Date d = c.getTime();
        // System.out.println(d);

        //SimpleDateFormat <-> Date
        // SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
        // Date now = new Date();
        // String s = f.format(now);
        // System.out.println(s);
        // Date d = f.parse(s);
        // System.out.println(d);

        //java.instant.*
        // Instant i1 = Instant.now();
        // System.out.println(i1);
        // ZonedDateTime z1 = ZonedDateTime.now();
        // System.out.println(z1);
        // Instant i2 = z1.toInstant();
        // System.out.println(i2);
        // ZonedDateTime z3 = i2.atZone(ZoneId.of("Europe/London"));
        // System.out.println(z3);

        //LocalDateTime
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
        System.out.println(l1);
        System.out.println(l2);
        ZonedDateTime z4 = l2.atZone(ZoneId.of("Europe/London"));
        System.out.println(z4);
        LocalDateTime l3 = z4.toLocalDateTime();
        System.out.println(l3);
    }
}
