package ex2.main;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import ex2.classes.Hero;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("齊藤");
        Hero h2 = new Hero("鈴木");
        ArrayList<Hero> al = new ArrayList<>();
        al.add(h1);
        al.add(h2);
        for (Hero hero : al) {
            System.out.println(hero.getName());
        }
        Map<Hero, Integer> hm = new HashMap<>();
        hm.put(h1, 5);
        hm.put(h2, 2);
        for (Hero key : hm.keySet()) {
            int num = hm.get(key);
            System.out.println(key.getName() + "の倒した敵の数は" + num + "体");
        }
    }
}
