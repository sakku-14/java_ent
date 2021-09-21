public class Main {
    public static void main(String[] args) {
        String folder1 = new String("c:\\javadev");
        String folder2 = new String("c:\\user\\");
        String file = new String("readme.txt");

        // StringBuilder sb = new StringBuilder(folder1);
        // if (folder1.endsWith("\\"))
        //     sb.append(file);
        // else
        //     sb.append("\\").append(file);
        // String ans = sb.toString();
        //better way
        String s = new String(folder1);
        if (!folder1.endsWith("\\"))
            folder1 += "\\";
        System.out.println(folder1 + file);
    }
}