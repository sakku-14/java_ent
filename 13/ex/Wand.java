public class Wand {
    private String name;
    private double power;

    public void setName(String name) {
        if (name == null || name.length() < 3)
            throw new IllegalArgumentException("名前は３文字以上入力してください。");
        this.name = name;
    }
    public void setPower(double power) {
        if (power < 0.5 || power > 100.0)
            throw new IllegalArgumentException("杖による増幅率は0.5以上100以下の値を入力してください。");
        this.power = power;
    }
    public String getName() {
        return this.name;
    }
    public double getPower() {
        return this.power;
    }
}