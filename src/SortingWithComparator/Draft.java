package SortingWithComparator;

import java.util.Arrays;
import java.util.Scanner;

public class Draft {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you clouts preferences");
        String clouts = scanner.nextLine();



        String a = stripUrlParams("https://edabit.com?a=2", new String[]{"b"});
        System.out.println(a);


        Haine haine = null;
        if (clouts.equalsIgnoreCase("Pantaloni")) {
            haine = new Pantaloni("albastrii");
            haine.croieste();
        } else if (clouts.equalsIgnoreCase("Tricou")) {
            haine = new Tricou("alb");
            haine.croieste();
        }
    }

    private static String stripUrlParams(String s, String[] strings) {
        return "https://edabit.com" + Arrays.toString(strings);
    }

}
