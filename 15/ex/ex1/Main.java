public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            s.append(i + 1);
            s.append(',');
        }
        System.out.println(s);
        String str = new String(s);
        String[] ans = new String[100];
        ans = str.split(",");
        for (String string : ans) {
            System.out.println(string);
        }
    }
}
