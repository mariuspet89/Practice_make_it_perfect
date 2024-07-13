package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

    int stdId;
    String stdName;
    static String collegeName = "CIT";
    // The following static method, valueChange to change the value of a static variable
    static void valueChange() {
        collegeName = "MIT";
    }

    // The following constructor is used to initialise the variable
    Student(int id, String name) {
        stdId = id;
        stdName = name;
    }

    // The display method to display values
    void display() {
        System.out.println(stdId + " " + stdName + " " + collegeName);
    }



    //Static keyword limitations

    
   /* // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called.");
    }

    // Static method
    public static void staticMethod() {
        // Trying to call an instance method directly will cause a compile-time error
        instanceMethod(); // ERROR: Cannot make a static reference to the non-static method instanceMethod() from the type MyClass
    }

    // Instance member variable
    private int instanceVar = 100;

    // Static method
    public static void staticMethod() {
        // Trying to access an instance variable directly will cause a compile-time error
        System.out.println(instanceVar); // ERROR: Cannot make a static reference to the non-static field instanceVar
    }

    public static void main(String[] args) {
        staticMethod();
    }*/


}

    // The class Demo is used to create and display the values of the object

 class Demo {
     public static void main(String[] args) {
         Student.valueChange();//calling valueChange method
         // creating the objects
         Student stdObject = new Student(221, "Kamal");
         Student stdObject1 = new Student(222, "Sharvan");
         Student stdObject2 = new Student(223, "Michael");
         // calling display method
         stdObject.display();
         stdObject1.display();
         stdObject2.display();



     }
     List<Number> intList = new ArrayList<>();
     List<? super Integer>  numList = intList;
     private static class Processor {
         private Random rand = new Random();


         public void Processor() {
         }

         public void Go() {

         }


     }





 }