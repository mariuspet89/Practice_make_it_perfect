package SortingWithComparator;

public class Pantaloni extends Imbraminte {
    @Override
    public void croieste() {
        String pantaloni = "pantaloni cu dunga.";
        System.out.println(pantaloni);
    }

    public Pantaloni(String culoare) {
        super(culoare);
    }
}
