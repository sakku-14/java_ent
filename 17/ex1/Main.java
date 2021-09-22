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

        try {
            int x = Integer.parseInt("三");
        } catch (NumberFormatException e) {
            System.err.println("********Integer.parseInt*********");
            e.printStackTrace();
            System.err.println("*********************************");
        }
    }
}