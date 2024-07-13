package AnonymusClass;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
        myApp.sayHello();


        List<List<String>> list = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
        System.out.println(list);

        System.out.println(list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));

        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        list1.removeIf(s -> s.startsWith("a")); // The target type is Predicate<String>

        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked a button");
            }
        });

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


    }
}