package tmp;

public class TourBus {

    static void compareIntegers(Number number) {
        if (number instanceof Integer data) {
            System.out.print(data.compareTo(24));
        }
    }


    static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.print("Winter");
                break;
            case 4, 5, 6:
                System.out.print("Spring");
                break;
            default:
                System.out.print("Unknown");
                break;
            case 7, 8, 9:
                System.out.print("Summer");
                break;
            case 10, 11, 12:
                System.out.print("Fall");
                break;
        }
    }


    public static void main(String... args) {
        var nycTour = new String[]{"Downtown", "Uptown",
                "Brooklyn"};
        var times = new String[]{"Day", "Night"};
        for (int i = 4, j = 1; i < nycTour.length && j < times.length;
             i++, j++)
            System.out.println(nycTour[i] + "-"
                    + times[j]);
        //compareIntegers(23);
        // printSeason(8);

//        int x = 0;
//        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
//            System.out.print(y + " "); }
//        System.out.print(x + " ");

        String myStr = "Hello, World!";
        System.out.println(myStr.substring(7, 13));


        var name = "animals";
        System.out.println(name.substring(3));
        System.out.println(name.substring(name.indexOf('m')));
        System.out.println(name.substring(3, 4)); // m
        System.out.println(name.substring(3, 7)); // mals

        int three = 3;
        String four = "4";
        System.out.println(11 + +2 + three + four);


        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int mySingleArray : mySimpleArray) {
                System.out.print(mySingleArray + "\t");
            }
            System.out.println();
        }


    }

}
