
public class Main {

    public static void main(String[] args) {

        Library aNewLibrary = new Library();
Book b1 = new Book("Ilon Mask","Make IT",2010,1);
Book b2 = new Book("Andreev","Full",2011,2);


aNewLibrary.allBooks.add(b1);
aNewLibrary.allBooks.add(b2);

//        aNewLibrary.allBooks.add( new Book ("Ilon Mask","Make IT",2010,1));
//        aNewLibrary.allBooks.add( new Book ("Andreev","Full",2011,2));
//        aNewLibrary.allBooks.add( new Book ("Ivan Stepanov","RUS",2009,3));
//        aNewLibrary.allBooks.add( new Book ("Martin","Java",2007,4));
//        aNewLibrary.allBooks.add( new Book ("Martin1","Code",2007,5));
//        aNewLibrary.allBooks.add( new Book ("Martin2","Code",2007,5));

        Person user1 = new Person("Sasha", 12);
        Person user3 = new Person("Masha", 15);
        Person user2 = new Person("Alex", 20);

//        aNewLibrary.showAllBooksInLibrary();

        aNewLibrary.giveBookToPerson("Make IT", user1);
        aNewLibrary.giveBookToPerson("Full", user1);

        aNewLibrary.takeBookFromPerson("Make IT", user1);
        aNewLibrary.takeBookFromPerson("Full", user1);

        user1.showHistory();
        user2.showHistory();
     }
}
