import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************Date***************");
        Date d = new Date();
        System.out.println("Date型: [" + d + "], longで基準からのミリ秒: [" + d.getTime() + "]");

        System.out.println("**************Calendar***************");
        Calendar c = Calendar.getInstance();
        System.out.println("Calendar型: [" + c + "]");
    }
}