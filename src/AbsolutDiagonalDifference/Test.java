package AbsolutDiagonalDifference;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public class Book
    {
     private    String name;
      private   int price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
    public static void main(String[] args) {

     Test test = new Test();
//        System.out.println(test.getBooks().map(book -> book.name).collect(Collectors.toList()));
        List<Book> collect = test.getBooks().collect(Collectors.toList());
        Set<Book> collect1 = test.getBooks().collect(Collectors.toSet());
        Vector<Book> collect2 = test.getBooks().collect(Collectors.toCollection(Vector::new));
        LinkedList<Book> collect3 = test.getBooks().collect(Collectors.toCollection(LinkedList::new));
       // System.out.println(Arrays.stream(collect.toArray()).reduce((o, o2) -> o.getClass()));
        System.out.println(collect2.stream().map(Book::getName).map(s ->  s.length()).collect(Collectors.toList()));
        System.out.println(test.getBooks().limit(2).count());

        List<Double> tenRandomNumbers = Stream.generate(Math::random)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(tenRandomNumbers);
        Stream.generate(() -> "Petrut")
                .limit(6)
                .forEach(System.out::println);
        List<Integer> intsForm0To9 = Stream.iterate(0, n -> n + 1)
                .limit(10)
                .collect(Collectors.toList());
        Stream.iterate(1, n -> n+2)
                .limit(10)
                .forEach(System.out::println);


    }
    Book lordsOfTheRings = new Book();
    Book hobbit = new Book();
    Book harryPotter = new Book();
    Book daVinciCode = new Book();
    Book gameOfThrones = new Book();
    public Stream<Book> getBooks(){
        Stream<Book> books= Stream.of(lordsOfTheRings, hobbit, harryPotter,
                daVinciCode, gameOfThrones);
lordsOfTheRings.setName("a");
lordsOfTheRings.setPrice(1);
hobbit.setName("b");
hobbit.setPrice(2);
harryPotter.setName("c");
harryPotter.setPrice(3);
daVinciCode.setName("d");
daVinciCode.setPrice(4);
gameOfThrones.setName("e");
gameOfThrones.setPrice(5);

        return books;
    }
}