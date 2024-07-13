package test.NestedClasses;

public class OuterClass {

    String outerField = "OutrField";
    static String staticOuterField = "Static outer field";

    public int x = 0;

    class InnerClass {

       public int x = 1;

       void methodFirstLevel(int x) {
           System.out.println("x = " +x);
           System.out.println("this.x = " + this.x);
           System.out.println("ShadowTest.this.x = " + OuterClass.this.x);
        }
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {

        void accessMembers(OuterClass outer) {
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class");
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.accessMembers(outerObject);

        System.out.println("\nTop-level class");
        TopLevelClass topLevelClass = new TopLevelClass();
        topLevelClass.accessMembers(outerObject);

        innerObject.methodFirstLevel(23);

    }

}

class TopLevelClass {
    void accessMembers(OuterClass outerClass) {
        System.out.println(outerClass.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
