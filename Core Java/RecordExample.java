import java.util.List;
import java.util.ArrayList;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {

        // Create Person instances
        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 25);

        // Print instances
        System.out.println("Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Store in a List
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        // Filter based on age using Streams
        System.out.println("\nPersons aged 18 or above:");

        people.stream()
              .filter(person -> person.age() >= 18)
              .forEach(System.out::println);
    }
}