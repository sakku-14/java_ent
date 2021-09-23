package list_p.chara;

public class Chara {
    private String name;
    private int age;

    public Chara(String n, int a) {
        this.name = n;
        this.age = a;
    }
    
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}