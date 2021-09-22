import jdk.jfr.StackTrace;

public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.err.println("NullPointerException例外をcatchしました");
            System.err.println("--スタックとれーす--");
            e.printStackTrace();
            System.err.println("-----------------");
        }
    }
}