package work.classes;

public abstract class Character {
    String name;
    int hp;
    
    public Character(String n, int hp) {
        this.name = n;
        this.hp = hp;
        System.out.println("Characterコンストラクタ終了");
    }

    public abstract void attack(String enemy);
}
