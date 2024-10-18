package AnonymusClass;

import java.util.ArrayList;
import java.util.List;

public class PracticeCollections<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        PracticeCollections<Integer> integerBox = new PracticeCollections<Integer>();
        integerBox.set(10);
        integerBox.inspect(43);
        PracticeCollections<Number> box = new PracticeCollections<Number>();
        box.add(10);   // OK
        box.add(10.1);  // OK
    }

    private void add(T i) {
        System.out.println("number added to the list" + i);
    }
//    static List<List<? extends PracticeCollections>>
//            history = new ArrayList<List<? extends PracticeCollections>>();
//
//    public void drawAll(List<? extends PracticeCollections> shapes) {
//        history.addLast(shapes);
//        for (PracticeCollections s: shapes) {
//            s.draw(this);
//        }
//    }
}

class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
    // ...
}

