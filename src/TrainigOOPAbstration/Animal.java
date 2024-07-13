package TrainigOOPAbstration;

public interface Animal {

    void makeSound();

    default void sleep(String test) {

        System.out.println(getFormatMessageStatic(test));
        System.out.println(getFormatMessageNonStatic(test));
    }

    static void sleepJustStatic(String test) {

        System.out.println(getFormatMessageStatic(test));
    }

    private static String getFormatMessageStatic(String message) {
        return "Animal : " + message;
    }



    private  String getFormatMessageNonStatic(String message) {
        System.out.println(getFormatMessageStatic(message));
        System.out.println(getFormatMessageNonStatic1(message));
        return "AnimalNonStatic : " + message;
    }

    private  String getFormatMessageNonStatic1(String message) {
        System.out.println(getFormatMessageStatic(message));
        return "AnimalNonStatic : " + message;
    }


}
