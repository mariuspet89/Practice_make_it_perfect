package TrainigOOPAbstration;

public class Cat {

    private final String name;

    private int age;

    public Cat(String nane, int age) {
        this.age = age;
        this.name = nane;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void meow() {
        System.out.println("Meow");
    }

    private void heyThisIsPrivate() {
        System.out.println("How did you call this??");
    }


    public static void thisIsAPublicStaticMethod() {
        System.out.println("I am a public static method!");
    }

    private static void thisIsAPrivateStaticMethod() {
        System.out.println("I am a private static method!");
    }



}
