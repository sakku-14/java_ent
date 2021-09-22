import java.io.InputStream;
import java.net.*;

public class Url {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.co.jp/");
        InputStream is = u.openStream();
        int i = is.read();
        while (i != -1)
        {
            char c = (char)i;
            System.out.print(c);
            i = is.read();
        }
    }
}