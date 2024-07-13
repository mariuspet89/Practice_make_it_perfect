package tmp.PolymorphismPractice;

public class ArmouredCar extends Car1 implements Floatable, Flyable{


    int bulletProofWindows;
    void remoteStartCar() {
        // can start remote
    }

    @Override
    public void floatOverWater() {
        System.out.println("Float car");
    }


    @Override
    public void fly() {
        System.out.println("Fly car");
    }

    @Override
    public void mar() {

    }

    @Override
    public void mar1() {

    }
}
