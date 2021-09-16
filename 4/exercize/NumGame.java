public class NumGame {
    public static void main(String[] args) {
        int[] ans_list = {3, 4, 9};

        System.out.println("一桁の数字を入力してください");
        int num = new java.util.Scanner(System.in).nextInt();

        for (int ans : ans_list) {
            if (ans == num) {
                System.out.println("アタリ！");
                return;
            }
        }
        System.out.println("ハズレ。。。");
    }
}
