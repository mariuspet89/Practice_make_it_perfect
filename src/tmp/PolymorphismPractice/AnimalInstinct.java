package tmp.PolymorphismPractice;

public class AnimalInstinct {
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends AnimalInstinct {
    void bark(){
        System.out.println("Dog barks");
    }

    @Override
    void eat(){
        System.out.println("Dog eats");
    }
}

interface Pet {
    void play();
}

class Cat extends AnimalInstinct implements Pet {


    @Override
    public void play() {
        System.out.println("Cat plays");
    }

    void meow(){
        System.out.println("Cat meows");
    }
}