package AnonymusClass;


import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;

@FunctionalInterface
interface IntegerOperation {
    int operation(int a, int b);
}


public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();

        public void greetSomeone(String someone);
    }


    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
                new HelloWorldAnonymousClasses();
      //  myApp.sayHello();


//        Collection<List<String>> list = Arrays.asList(
//                Arrays.asList("a"),
//                Arrays.asList("b"));
//        System.out.println(list);
//
//        System.out.println(list
//                .stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList()));

        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        Collection<String> c = Collections.checkedCollection(new HashSet<>(), String.class);

//        LinkedList<String> linkedListAsArrayList = new ArrayList<>();

        Collection<Long> da = new ArrayList<>();

        // list1.removeIf(s -> s.startsWith("a")); // The target type is Predicate<String>

        Button button = new Button();
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("You clicked a button");
//            }
//        });

//        Optional<String> first1 = formats.stream()
//                .map(ConvertedFormat::getLines)
//                .flatMap(line -> line.stream().map(ConvertedFormat.Line::getFields))
//                .flatMap(Collection::stream)
//                .filter(AbstractField::isHeaderLine)
//                .map(AbstractField::getKey)
//                .findFirst();
//
//
//        Optional<String> first = formats.stream()
//                .flatMap(format -> format.getLines().stream())
//                .flatMap(line -> line.getFields().stream())
//                .filter(AbstractField::isHeaderLine)
//                .map(AbstractField::getKey)
//                .findFirst();

//        List<String> list11 = Arrays.asList("m2", "m3", "m1");
//        System.out.println("simple list" + Collections.binarySearch(list11, "m3"));
//
//        Collections.sort(list11);
//        System.out.println("sort list" + Collections.binarySearch(list11, "m3"));
//
//        Collections.reverse(list11);
//        System.out.println("reverse list" + Collections.binarySearch(list11, "m3"));


        String text = "java is fun java is powerful";

        Integer[] arr = {11, 55, 22, 0, 89};
        //ArrayList<Integer> internas =  new ArrayList<>();
        Arrays.sort(arr);


        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : text.split(" ")) {
            wordCount.merge(word, 1, Integer::sum);  // Increment count if word exists, otherwise add new
        }

        // System.out.println(wordCount);
//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Tom", "Bus Tour");
//        favorites.merge("Jenny", "Skyride", mapper);
//        favorites.merge("Sam", "Skyride", mapper);
        //System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}

        List<? super IOException> exceptions = new ArrayList<Exception>();
        //exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());

//        var listp = List.of("Toby", "Anna", "Leroy", "Alex");
//        List<String> filtered = new ArrayList<>();
//        for (
//                String name : listp)
//            if (name.length() == 4) filtered.add(name);
//        Collections.sort(filtered);
//        var iter = filtered.iterator();
//        if (iter.hasNext()) System.out.println(iter.next());
//        System.out.println(listp);
//        if (iter.hasNext()) System.out.println(iter.next());
//
//        var listty = List.of("Toby", "Anna", "Leroy", "Alex");
//        listty.stream()
//                .filter(n ->
//                        n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);


//        Stream.generate(() ->
//                        "Elsa++++")
//                .filter(n ->
//                        n.length() == 4)
//                .limit(2)
//
//                .sorted()
//                .forEach(System.out::println);

//        var random = DoubleStream.generate(Math::random);
//        var fractions = DoubleStream.iterate(.5, d ->
//                d / 2);
//        random.limit(3).forEach(System.out::println);
//        fractions.limit(3).forEach(System.out::println);
//        System.out.println(listp+"  print interface List");
//        System.out.println(filtered+"  print ArrayList");
//        System.out.println(random+"  print Stream");
//        System.out.println();

        Crow gre = new Crow();
        gre.caw("Vaca");

    }
    public int print() {
        System.out.println("Signature is: print()");
        return 0;
    }

    static BiFunction<String, String, String> mapper = (v1, v2) ->
            null;
}

class Crow {
    private  String color = "black";

    public void caw(String name) {
        String volume = "loudly";
        //volume = "3"; - not effectively final if uncommneted
        color = "black";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
        consumer.accept(name);
    }


}


class DemoClass {

    void driver() {
        List<BaseWork> baseWorks = new ArrayList<>();
        List<RxWork> rxWorks = new ArrayList<>();

        baseWorks.add(new RxWork());
        baseWorks.add(new BaseWork());

        startJob(baseWorks); // Bingo!
        startJob(rxWorks);
    }

    void startJob(List<? extends BaseWork> incomingWork) {
        // validate the work and submit.
        for (BaseWork b : incomingWork) {
            //Scheduler.submit(b);
        }
    }
}