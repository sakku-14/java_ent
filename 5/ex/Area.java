public class Area {
    public static void main(String[] args) {
        double bottom, height, radius;
        
        bottom = 10;
        height = 5;
        radius = 5;
        System.out.println("底辺" + bottom + "cm、高さ" + height + "cmの三角形の面積は" + calcTriangleArea(bottom, height) + "㎠です");
        System.out.println("半径" + radius + "cmの円の面積は" + String.format("%.1f", calcCircleArea(radius)) + "㎠です");
    }

    public static double calcTriangleArea(double bottom, double height) {
        return (bottom * height / 2);
    }

    public static double calcCircleArea(double radius) {
        return (radius * radius * Math.PI);
    }
}
