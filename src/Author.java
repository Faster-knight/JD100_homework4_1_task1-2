public class Author {
    private String name;
    private String surname;
    private int rating;
    public Author(
            String name,
            String surname,
            int rating
    ) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
}
