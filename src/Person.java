import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Book> historyList = new ArrayList<Book>();
    private String firstName;
    private int age;

    private Person() {
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void showHistory() {
        for (Book h : historyList) {
            System.out.println("Books were on user " + h.getTitle());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}


