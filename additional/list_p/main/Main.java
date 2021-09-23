package list_p.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import list_p.chara.Chara;

class Main {
    public static void main(String[] args) {
        System.out.println("****************List********************");
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
            if (name.equals("Hiroyuki"))
                System.out.println("Name2: " + name);
        }
        Iterator<String> i2 = al.iterator();
        Consumer<String> act = (name) -> { System.out.println("Name3: " + name); };
        // al.forEachRemaining(act);
        i2.forEachRemaining(act);

        Chara dad = new Chara("Hiroyuki", 54);
        Chara mom = new Chara("Syoko", 55);
        LinkedList<Chara> sakuma = new LinkedList<>();
        sakuma.add(dad);
        sakuma.add(mom);
        for (Chara c : sakuma) {
            System.out.println("Name: " + c.getName() + " Age: " + c.getAge());
        }
        System.out.println("*******************Set**********************");
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();
        String saku1 = "Hiroyuki";
        String saku2 = "Syoko";
        String saku3 = "Hironobu";
        String saku4 = "Kazuyuki";
        String saku5 = "Yuki";
        s1.add(saku1);
        s1.add(saku2);
        s1.add(saku3);
        s1.add(saku4);
        s1.add(saku5);
        s2.add(saku1);
        s2.add(saku2);
        s2.add(saku3);
        s2.add(saku4);
        s2.add(saku5);
        s3.add(saku1);
        s3.add(saku2);
        s3.add(saku3);
        s3.add(saku4);
        s3.add(saku5);
        for (String s : s1) {
            System.out.println("Name1: " + s);
        }
        for (String s : s2) {
            System.out.println("Name2: " + s);
        }
        for (String s : s3) {
            System.out.println("Name3: " + s);
        }
    }
}