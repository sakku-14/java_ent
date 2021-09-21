import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Date-Calendar-SimpleDateFormat
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_MONTH, 100);
        d = c.getTime();
        System.out.println(d);
        // SimpleDateFormat sdf = new SimpleDateFormat();
        // sdf.applyPattern("西暦yyyy年MM月dd日");
        //better way
        SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(sdf.format(d));

        //Time API
        LocalDate ld = LocalDate.now();
        ld = ld.plusDays(100);
        //another way
        // ld = ld.plus(Period.ofDays(100));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(ld.format(dtf));
    }
}
