package ex2.main;
import java.util.ArrayList;

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
    }
}
