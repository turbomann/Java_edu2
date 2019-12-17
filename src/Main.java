import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Library aNewLibrary = new Library();
        aNewLibrary.allBooks.add( new Book ("Ilon Mask","Make IT",2010,1));
        aNewLibrary.allBooks.add( new Book ("Andreev","Full",2011,2));
        aNewLibrary.allBooks.add( new Book ("Ivan Stepanov","RUS",2009,3));
        aNewLibrary.allBooks.add( new Book ("Martin","Java",2007,4));
        aNewLibrary.allBooks.add( new Book ("Martin","Code",2007,5));

        Person user1 = new Person("Sasha", 12);
        Person user2 = new Person("Alex", 20);
        Person user3 = new Person("Masha", 15);

        aNewLibrary.giveBook("Make IT", user1);
        aNewLibrary.giveBook("Make IT", user1);
        aNewLibrary.giveBook("Make IT", user1);


        aNewLibrary.takeBookFromPerson("Make IT", user1);
        aNewLibrary.takeBookFromPerson("Make IT", user1);
        aNewLibrary.takeBookFromPerson("Make IT", user1);
        aNewLibrary.takeBookFromPerson("Make IT", user1);


     }
}
