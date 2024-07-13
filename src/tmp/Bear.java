package tmp;

public class Bear {
 private Bear pandaBear;
 private void roar(Bear b) {
         System.out.println("Roar!");
         pandaBear = b;





         }


    long goat = 10;
    int sheep1 = 5;

    private int getAnInt() {
        return (int) (sheep1 * goat);
    }


    public static void main(String[] args) {
         Bear brownBear = new Bear();
         Bear polarBear = new Bear();
         brownBear.roar(polarBear);
         polarBear = null;
         brownBear = null;
     System.gc(); }

    int fish = (int)1.0; // DOES NOT COMPILE
    short bird = (short)1921222; // DOES NOT COMPILE
    int mammal = (int)9f;
    short mmammal = 9;
    short boots = (short) (mmammal + 888888888);

    short mouse = 10;
    short hamster = 3;
    short capybara = (short) (mouse * 3);

    int goat1 = 10;
    int tet = 5;
   int tet1 = (int) (tet * goat);






}

 class KitchenSink {
    private int numForks;
    public static void main(String[] args) {
        int numKnives;
        System.out.print("""
        "# forks = " + numForks +
    " # knives = " + numKnives +
        # cups = 0
    """);
    }
}