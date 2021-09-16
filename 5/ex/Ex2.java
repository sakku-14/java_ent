public class Ex2 {
    public static void main(String[] args) {
        String title = "tomorrow plan";
        String address = "kumasan.04.24.14@gmail.com";
        String text = "We will see you at 10am in Shibuya. Please come to Hachiko. See you tomorrow.";

        email(title, address, text);
        email(address, text);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:無題");
        System.out.println("本文:" + text);
    }
}
