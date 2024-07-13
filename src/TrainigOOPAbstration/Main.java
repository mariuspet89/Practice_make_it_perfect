package TrainigOOPAbstration;

 class PrintNumbers1 {
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
         printer.calculate(); // 100
     }

}


 public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Bark
        dog.sleep("Sleeping ... !!!!"); // Outputs : Sleeping ... !!!!
        Animal.sleepJustStatic("Static sleep ... !!!!"); // Outputs : Static sleep ... !!!!

        for (Season season : Season.values()) {
            System.out.print(season + ": ");
            season.printExpectedVisitors();
        }

        Season spring = Season.SPRING;

        String season = Season2.FALL.getHours();
        System.out.println(spring);
        System.out.println(season);
        NestedStaticClassInJava nestedStaticClassInJava = new NestedStaticClassInJava();
        var reptile = nestedStaticClassInJava.new Reptile();

        System.out.println(reptile.displayInfo());

        reptile.displayInfo();

        NestedStaticClassInJava.Mammal nestedClassMammal = new NestedStaticClassInJava.Mammal();
        var ride = new NestedStaticClassInJava.Ride();
        var nestedClassMam = new NestedStaticClassInJava.Mammal();


    }
}
