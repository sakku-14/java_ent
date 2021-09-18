import jdk.vm.ci.hotspot.amd64.AMD64HotSpotJVMCIBackendFactory;

public class Matango {
    int hp = 50;
    char suffix;

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero h) {
        System.out.println("キノコ" + this.suffix + "のダメージ");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}

public class PoisonMatango extends Matango {
    int poison_atck;
    
    public PoisonMatango(char suffix) {
        super(suffix);
        this.poison_atck = 5;
    }

    public attack(Hero h) {
        super.attack(h);
        if (poison_atck > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ");
            this.poison_atck--;
        }
    }
}