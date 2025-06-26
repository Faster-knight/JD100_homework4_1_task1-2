import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(
                "title1",
                LocalDate.now().toString(),
                400,
                new Author("trofim", "postnikov", 1)
        );
        System.out.println(book.isBig());
        System.out.println(book.estimatePrice());
        System.out.println(book.matches("trof"));
        System.out.println(book.matches("title1"));
        System.out.println(book.matches("dima"));
    }
}
