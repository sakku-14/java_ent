package ex.main;
import ex.cleric.*;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric();
        cleric.selfAid();
        cleric.pray(3);
    }
}