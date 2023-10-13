package max_comparator_example.TimeConversion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 28));

        // Create a Comparator to sort by age
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

        // Sort the list using the Comparator
        people.sort(ageComparator);

        // Print the sorted list
        System.out.println("Sorted by Age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
