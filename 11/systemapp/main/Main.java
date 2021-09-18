package systemapp.main;
import systemapp.asset.tangible.computer.Computer;
import systemapp.asset.tangible.book.Book;

public class Main {
    public static void main(String[] args) {
        Computer mac = new Computer("saku-mac", 150000, "gray", "Apple");
        mac.setWeight(255);
        Book book = new Book("saku-book", 3000, "white", "Syu-E-Sya");
        book.setWeight(300);

        System.out.println("パソコン紹介");
        System.err.println("---name---price---color---maker---weight---");
        System.out.println(mac.getName() + "---" + mac.getPrice() + "---" + mac.getColor() + "---" + mac.getMakerName() + "---" + mac.getWeight());

        System.out.println("本紹介");
        System.err.println("---name---price---color---isbn---weight---");
        System.out.println(book.getName() + "---" + book.getPrice() + "---" + book.getColor() + "---" + book.getIsbn() + "---" + book.getWeight());
    }
}