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

    public void showAllBooksInLibrary() {
        for (Book book : allBooks) {
            System.out.println("Title = " + "'" + book.getTitle() + "'" + " Author = " + "'" + book.getAuthor() + "'");
        }

    }

    public void giveBookToPerson(String bookName, Person pers) {

        Book foundBook = findBook(bookName);
        if (assignmentBook.containsKey(foundBook)) {
            System.out.println("The Book " + foundBook.getTitle() + " Alredy on hand on " + pers.getFirstName());

        } else

            if (foundBook != null) {
            assignmentBook.put(foundBook, pers);
            pers.historyList.add(foundBook);
            System.out.println("The book " + "'" + bookName + "'" + " was given " + pers.getFirstName());
        }


    }


    public void takeBookFromPerson(String bookName, Person pers) {

        for (Map.Entry<Book, Person> map : assignmentBook.entrySet()) {
            Book foundedBook = findBook(bookName);

            if (map.getKey().equals(foundedBook) & map.getValue().equals(pers)) {
                assignmentBook.remove(foundedBook);

                System.out.println("The book " + foundedBook.getTitle() + " was returned back " + pers.getFirstName());
            }

        }

    }


}
