public class Stdin {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("How old are you?");
        int age = new java.util.Scanner(System.in).nextInt();

        System.out.println(".\n..\n...\n....\n");
        System.out.println("Nice to meet you " + name + ".");
        System.out.println("Your age is " + age + ".");
        if (age < 20){
            System.out.println("You are so young. I envy you.");
        } else {
            System.out.println("You are already old... You are already behind...lol");
        }
    }
}