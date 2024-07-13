package tmp.packageb;


public class ClassB {


     boolean b1, b2;
 String s1 = "test";
 double d1; double d2;
 int i1; int i2;
 int i3;




    public static void main(String[] args) {
        packagea.ClassA a;
        System.out.println("Got it!");

        ClassB bv = new ClassB();
        String s11 = bv.s1;


        int be = Integer.parseInt("123");
        int primitive = Integer.parseInt("123");
        int primitiveq = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");



    }

    public  void eatMore (boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }



}
