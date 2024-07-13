package TrainigOOPAbstration;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    // The sleep method is inherited from the Animal interface

}
