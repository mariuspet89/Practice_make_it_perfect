package tmp.PolymorphismPractice;

public class PolymorphismPractice {



}



 class Primate {
    public boolean hasHair() {
        return true;
    }
}
 interface HasTail {
    public abstract boolean isTailStriped();
}
 class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
//        Lemur lemur = new Lemur();
//        System.out.println(lemur.age);
//        HasTail hasTail = lemur;
//        System.out.println(hasTail.isTailStriped());
//        Primate primate = lemur;
//        System.out.println(primate.hasHair());

        HasTail hasTail = new Lemur();
    //    System.out.println(hasTail.age); // DOES NOT COMPILE

        Primate primate = new Lemur();
     //   System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

    } }