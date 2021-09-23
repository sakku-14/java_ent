import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************Date***************");
        Date d = new Date();
        System.out.println("Date型: [" + d + "], longで基準からのミリ秒: [" + d.getTime() + "]");
    }
}