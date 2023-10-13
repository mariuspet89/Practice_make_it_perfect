package Interviu;

class Car {
    String name;
    int mileage;

    public Car(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
    }
}


class A {
}

class B extends A {
}

class C extends A {
}


public class Solution {

    public static void main(String[] args) {


        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("a instanceof A: " + (a instanceof A)); //true
        System.out.println("b instanceof A: " + (b instanceof A)); //true
        System.out.println("c instanceof A: " + (c instanceof A)); //true
        System.out.println("a instanceof B: " + (a instanceof B)); //false
        System.out.println("null instanceof A: " + (null instanceof A)); //false
        System.out.println("a.getClass().isInstance(a): " + a.getClass().isInstance(a)); //true
        System.out.println("b.getClass().isInstance(c): " + b.getClass().isInstance(c)); //false
        System.out.println("a.getClass().isInstance(b): " + a.getClass().isInstance(b)); //true

        Car car = new Car("Volkswagen", 100);
        int code = car.hashCode();
        System.out.println(code);
        System.out.println(car.name);
        System.out.println(car.mileage);

        Car B = car;

//		 B.mileage = 32 ;
//		 B.name = "Volks" ;
        System.out.println(B.name);
        System.out.println(B.mileage);
        code = B.hashCode();
        System.out.println(code);
        boolean equals = car.equals(B);
        System.out.println(equals);

        Object obj = new Object();

    }


}






