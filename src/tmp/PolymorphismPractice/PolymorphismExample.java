package tmp.PolymorphismPractice;

public class PolymorphismExample {
    public static void main(String[] args) {
        AnimalInstinct myDog = new Dog(); // dog object reference by animal type
        myDog.eat(); // calls the dog's object overridden eat method

        Dog myRealDog =(Dog) myDog; // casting dog to dog
        myRealDog.bark(); // now we call the bark() because the reference is Dog

        Pet myCat = new Cat(); // Cat object reference by Pet type
        myCat.play(); // Calls the play method from the Pet interface
        // myCat.meow(); // This line would cause a compilation error because meow is not in Pet

        Cat myRealCat =(Cat) myCat; // Casting back to Cat
        myRealCat.meow(); // Now we can call meow() because the reference is Cat

    }
}





class Penguin {
    public int getHeight() { return 3; }
    public void printInfo() {
        System.out.print(this.getHeight());
    }
}
 class EmperorPenguin extends Penguin {
    public int getHeight() { return 8; }
    public static void main(String []fish) {


        Penguin penguin = new Penguin();
    //    var emperorPenguin =(EmperorPenguin) penguin; // class cast exception

        Penguin penguin1 = new EmperorPenguin();

       // EmperorPenguin emperorPenguin1 = new Penguin(); // class cast exception

        Penguin penguin2 = new Penguin();
    //    EmperorPenguin emperorPenguin2 = (EmperorPenguin) penguin2; // class cast exception


        new EmperorPenguin().printInfo();
    }
}

class Penguin1 {
    public int getHeight() { return 3; }
    public void printInfo() {
        System.out.print(getHeight()); // DOES NOT COMPILE
    }
}

 class EmperorPenguin1 extends Penguin1 {
    public int getHeight() { return 8; }
    public void printInfo() {
        System.out.print(super.getHeight());
    }
    public static void main(String []fish) {
        new EmperorPenguin1().printInfo(); // 3
    }
}
