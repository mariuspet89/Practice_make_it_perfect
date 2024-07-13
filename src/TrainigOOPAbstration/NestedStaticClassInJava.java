package TrainigOOPAbstration;

public class NestedStaticClassInJava {

    static int data = 30;

    public Greeting createGreeting() {
        class HelloGreeting implements Greeting {

            @Override
            public String greet(String name) {
                return "Hello, " + name;
            }
        }

        return new HelloGreeting();
    }

    interface Greeting {
        String greet(String name);
    }

    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal. ");
        }
    }

    static class Ride {
        private int price = 6;

        void msg() {
            System.out.println("msg     " + data);
        }
    }

    class Reptile {
        public String displayInfo() {
            System.out.println("I am a reptile.");
            return "rete";
        }
    }



    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);
        ride.msg();

        NestedStaticClassInJava greeting = new NestedStaticClassInJava();
        Greeting greetingInstanceOfLocalClass = greeting.createGreeting();

        System.out.println(greetingInstanceOfLocalClass.greet("World!!!"));

        Reptile reptile = greeting.new Reptile();

    }
}

class provisionMain {
    public static void main(String[] args) {
        var ride = new NestedStaticClassInJava.Ride();
        var greet = new PrintNumbers();
    }
}
class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Calculator {
            public void multiply() {
                System.out.print(length * width);
            }

        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate();
    }
}