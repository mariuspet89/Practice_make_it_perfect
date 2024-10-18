package AnonymusClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private String name;
    private int id;

    public Duck(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() { // use readable output
        return name;
    }

    public int compareTo(Duck d) {
        return id - d.id; // sorts ascendingly by name
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]


    }

}

class Animal implements Comparable<Animal> {
    private int id;

    public int compareTo(Animal a) {
        return id - a.id; // sorts ascending by id
    }

    public static void main(String[] args) {
        var a1 = new Animal();

        var a2 = new Animal();
        a1.id = 2;
        a2.id = 7;
        System.out.println(a1.compareTo(a2)); // -5
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(a2.compareTo(a1)); // 5

        Collection<?> c = new ArrayList<String>();
         for (Object o : c) {

        }
        Collection<? extends Object> tre = c;
        Object per = new Object();





    }
}