package work.classes;
import work.classes.Character;

public class Hero extends Character {
    public Hero(String n, int hp) {
        super(n, hp);
        System.out.println("Heroコンストラクタ終了");
    }
    
    public void attack(String enemy) {
        System.out.println(this.name + "は" + enemy + "を攻撃した！");
    }
}