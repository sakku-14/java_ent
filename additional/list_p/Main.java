import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

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

        al.add(2, "Keisuke");
        al.add(3, "Seiko");

        System.out.println("al.size: " + al.size());

        for (String name : al) {
            System.out.println("Name1: " + name);
        }

        Iterator<String> i = al.iterator();
        while (i.hasNext())
        {
            String name = i.next();
            System.out.println("Name2: " + name);
        }
        Iterator<String> i2 = al.iterator();
        Consumer<String> act = (name) -> { System.out.println("Name3: " + name); };
        // al.forEachRemaining(act);
        i2.forEachRemaining(act);
    }
}