package AnonymusClass;

import java.util.*;

public class SortAuthByName {

    public static void main(String[] args) {
        // List of objects of Author class
        ArrayList<Author> al = new ArrayList<>();
        al.add(new Author("Henry", "Miller", "Tropic of Cancer"));
        al.add(new Author("Nalo", "Hopkinson", "Brown Girl in the Ring"));
        al.add(new Author("Frank", "Miller", "300"));
        al.add(new Author("Deborah", "Hopkinson", "Sky Boys"));
        al.add(new Author("George R. R.", "Martin", "Song of Ice and Fire"));

        List sed = new LinkedList<>(List.of("Petru", "petrut", "da"));
        List sed1 = sed;

        Iterator<String> iter = sed1.iterator();
        while(iter.hasNext()) {
            getPrintln(iter.next());

        }

        List<String> tre = new ArrayList<>();
        tre.add("a");
        tre.add("b");
        Object[] array = tre.toArray();
        String[] array1 = tre.toArray(new String[0]);
        System.out.println(array.length);
        Arrays.stream(array1).forEach(s -> System.out.println(s));



        /*
         * Sorting the list using Collections.sort() method, we
         * can use this method because we have implemented the
         * Comparable interface in our user defined class Author
         */
        Collections.sort(al);
        for (Author str : al) {
            getPrintln(str.firstName + " " +
                    str.lastName + " " + "Book: " + str.bookName);
        }
    }

    private static void getPrintln(String iter) {
        System.out.println(iter);
    }


}
