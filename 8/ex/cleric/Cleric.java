package ex.cleric;
import java.util.*;

public class Cleric {
    int hp = 50;
    int mp = 10;
    final int  MAX_HP = 50;
    final int MAX_MP = 10;

    public void selfAid() {
        this.hp = MAX_HP;
        this.mp -= 5;
        System.out.println("セルフエイドによってHPを全回復した");
        System.out.println("現在のHPは" + this.hp);
        System.out.println("現在のMPは" + this.mp);
    }
    public int pray(int sec) {
        int tmp = this.mp;
        int ret = new Random().nextInt(3) + sec;
        System.out.println(sec + "秒祈りを捧げた");
        this.mp = Math.min(this.mp + ret, this.MAX_MP);
        System.out.println((this.mp - tmp) + "MP回復した");
        System.out.println("現在のHPは" + this.hp);
        System.out.println("現在のMPは" + this.mp);
        
        return (this.mp - tmp);
    }
}
