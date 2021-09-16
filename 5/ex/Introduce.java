public class Introduce {
    public static void main(String[] args) {
        IntroduceMyself();
    }

    public static void IntroduceMyself() {
        String  name = "Michael";
        int     age = 29;
        double  height = 174.8;
        char    zodiac = '申';

        System.out.println("私は" + name + "です。年齢は" + age + "、身長は" + height + "、干支は" + zodiac + "です。");
    }
}