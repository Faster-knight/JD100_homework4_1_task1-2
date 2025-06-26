public class Book {
    private String title;
    private String releaseDate;
    private Author author;
    private int pages;
    public Book(
            String titleBook,
            String releaseDateBook,
            int pagesBook,
            Author authorBook
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
        return author.getSurname().contains(word) || author.getName().contains(word) || title.contains(word);
    }
    public int estimatePrice() {
        return Math.max((int)Math.floor(pages * 3 * Math.sqrt(author.getRating())), 250);
    }
}
