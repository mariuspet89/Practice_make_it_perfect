package test;

interface Department {
    public void show();
}

public class Anonymous_Demo_Class {

    // This method creates an anonymous class that extends the 'department' interface
    public void newClassInterface() {
        //anonymous class extending 'Department' class
        DepartmentInterface d1 = new DepartmentInterface() {
            //Overrides the show method
            @Override
            public void show() {
                System.out.println("Inside of the anonymous" +
                        " class extending an Interface");
            }
        };
        d1.show();
    }

    public void newClass() {
        DepartmentOuterClass d1 = new DepartmentOuterClass() {
            //Overrides the show method
            @Override
            public void show(){
                System.out.println("Instance of the anonymous" +
                        "class extending an outerClass");
            }
        };
        d1.show();
    }

}

interface DepartmentInterface {
    public void show();
}

class DepartmentOuterClass {
    public void show() {
        System.out.println("Inside the department class");
    }
}

class Main1 {
    public static void main(String[] args) {
        //creates an instance
        Anonymous_Demo_Class demo = new Anonymous_Demo_Class();
        demo.newClassInterface();
        demo.newClass();

    }
}