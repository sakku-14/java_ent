public class Main {
    public static void main(String[] args) {
        String folder1 = new String("c:\\javadev");
        String folder2 = new String("c:\\user\\");
        String file = new String("readme.txt");
        if (folder1.endsWith("\\"))
            System.out.println("true1");
        if (folder2.endsWith("\\"))
            System.out.println("true2");
    }
}