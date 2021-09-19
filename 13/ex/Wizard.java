public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public void setHp(int h) {
        if (h < 0)
            h = 0;
        else
            this.hp = h;
    }
    public void setMp(int m) {
        if (m < 0)
            m = 0;
        else
            this.mp = m;
    }
    public void setName(String n) {
        if (n == null)
            throw new IllegalArgumentException("名前は３文字以上入力してください。");
        else if (n.length() < 3)
            throw new IllegalArgumentException("名前は３文字以上入力してください。");
        this.name = n;

    }
    public void setWand(Wand w) {
        if (w == null)
            throw new IllegalArgumentException("杖の入力値がnullです。");
        this.wand = w; 
    }
    public int getHp() { return this.hp; }
    public int getMp() { return this.mp; }
    public String getName() { return this.name; }
    public Wand getWand() { return this.wand; }

}