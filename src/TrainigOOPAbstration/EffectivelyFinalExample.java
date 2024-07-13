package TrainigOOPAbstration;

import java.util.function.Consumer;

public class EffectivelyFinalExample {

    public  void main1(String[] args) {
        String greeting = "Hello"; // Effectively final variable
        Consumer<String> greet = name -> {
            System.out.println(greeting + "," + name);
        };
        greet.accept("World");
        //Uncommenting the next line will cause a compilation error
        // greeting = "Hi";





    }

    public  void test(){
        class LocalClass extends Animal1 implements CanRun, CanJump{
            @Override
            public void run(){
                System.out.println("Running...");
            }

            @Override
            public void jump(){
                System.out.println("Jumping...");
            }

            @Override
            void eat() {
                System.out.println("Eating...");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.eat();
        localClass.run();
        localClass.jump();
    }

    abstract class Animal1 {
        abstract void eat();
    }

    interface CanRun{
        void run();
    }

    interface CanJump {
        void jump();
    }




}



class ZooGiftShop {
    public int admission(int basePrice) {
        SaleTodayOnlyAbstract sale = new SaleTodayOnlyAbstract() {
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    abstract class SaleTodayOnlyAbstract {
        abstract int dollarsOff();
    }
}


class ZooGiftShopImplementAnInterface {
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
    interface SaleTodayOnly {
        int dollarsOff();
    }
}