import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
        Date now = new Date();
        String s = f.format(now);
        System.out.println(s);
        Date d = f.parse(s);
        System.out.println(d);
    }
}
