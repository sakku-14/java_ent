import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Hiroyuki");
        al.add("Syoko");
        al.add("Hironobu");
        al.add("Kazuyuki");
        al.add("Yuki");

        System.out.println("al.size: " + al.size());

        al.remove(4);

        System.out.println("al.size: " + al.size());
    }
}