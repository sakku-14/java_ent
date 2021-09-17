package calcapp.main;
import calcapp.logic.*;

public class Calc {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        System.out.println(CalcLogic.tasu(5, 9));
        System.out.println(CalcLogic.kakeru(9, 5));
    }
}
