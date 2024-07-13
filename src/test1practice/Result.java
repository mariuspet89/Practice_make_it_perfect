package test1practice;

public class Result {
    public static String reversedString(String names) {

        StringBuilder reversedName = new StringBuilder();
        int length = names.length();
        for (int i = length - 1; i >= 0; i--) {
            char c = names.charAt(i);
            reversedName.append(c);
        }

        return reversedName.toString();
    }

    public static void main(String[] args) {


        System.out.println(reversedString("Corina"));


    }

}
