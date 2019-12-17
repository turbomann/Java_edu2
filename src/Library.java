import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    public List<Book> allBooks = new ArrayList<Book>();
    private Map<Book, Person> assignmentBook = new HashMap<Book, Person>();

    private Book findBook(String bookName) {
        Book foundBook = null;

        for (Book book : allBooks) {
            if (book.getTitle().equals(bookName)) {
                foundBook = book;
                break;
            }

        }
        return foundBook;
    }


    public void giveBook(String bookName, Person pers) {

        Book foundBook = findBook(bookName);

        if (assignmentBook.containsKey(foundBook)) {
            System.out.println("The Book Alredy on hand");

        } else if (foundBook != null) {
            assignmentBook.put(foundBook, pers);
            System.out.println("The book " + bookName + " was given " + pers.toString());
        }


    }


    public void takeBookFromPerson(String bookName, Person pers) {

        for (Map.Entry<Book, Person> map : assignmentBook.entrySet()) {
            Book foundedBook = findBook(bookName);

            if (map.getKey().equals(foundedBook) & map.getValue().equals(pers)) {
                assignmentBook.remove(foundedBook);

                System.out.println("The book " + foundedBook + " was returned back");
            }

        }

    }


}
