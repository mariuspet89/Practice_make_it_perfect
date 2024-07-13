package tmp.packagea;

public class AfricanElephant extends Elephant{
    public AfricanElephant() {
        super();

    }
}
 class Bird {
    public boolean hasFeathers() {
        return true;
    }
    public static void flyAway() {}
}
 class Penguin extends Bird {
    public final boolean hasFeathers() { // DOES NOT COMPILE
        return false;
    }
    public final static void flyAway() {} // DOES NOT COMPILE
}