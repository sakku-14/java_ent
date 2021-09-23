import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //Date
        System.out.println("**************Date***************");
        Date d = new Date();
        System.out.println("Date型: [" + d + "], longで基準からのミリ秒: [" + d.getTime() + "]");

        //Calendar型は各値を単独で取ることができる。
        System.out.println("**************Calendar***************");
        Calendar c = Calendar.getInstance();
        System.out.println("Calendar型: [" + c + "]");

        //SimpleDateFormat
        System.out.println("*************SimpleDateFormat****************");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String ret = sdf.format(d);
        System.out.println("SimpleDateFormat型: [" + sdf + "], method: [" + ret + "]");

        //LocalDateTime
        System.out.println("*************LocalDateTime*************************");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime型: [" + ldt + "]");
    }
}