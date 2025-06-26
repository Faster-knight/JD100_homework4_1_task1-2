public class Book {
    private String title;
    private String releaseDate;
    private String author;
    private int pages;
    public Book(
            String titleBook,
            String releaseDateBook,
            int pagesBook,
            String authorBook
    ) {
        this.title = titleBook;
        this.releaseDate = releaseDateBook;
        this.author = authorBook;
        this.pages = pagesBook;
    }
    public boolean isBig() {
        return pages > 500;
    }
    public boolean matches(String word) {
        boolean matchAccept = title.contains(word);
        if (!matchAccept) {
            matchAccept = author.contains(word);
        }
        return matchAccept;
    }
    public int estimatePrice() {
        return Math.max(pages * 3, 250);
    }
}
