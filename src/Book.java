

public class Book {

    private final String title;
    private final int id;
    private final String author;
    private final int year;

    public Book(String author,String title, int year, int id) {
        this.author = author;
        this.year = year;
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return title;
    }
}
