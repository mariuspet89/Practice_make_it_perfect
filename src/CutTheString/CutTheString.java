package CutTheString;

public class CutTheString {


    public static void main(String[] args) {

        String myString = "hello world";
//        String result = "";
                StringBuilder result = new StringBuilder();
        for (int i = 1; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
            result.append(myString.charAt(i));
            //result.append(String.valueOf(myString.charAt(i)));

        }
        System.out.println("");
        System.out.println(result);

    }
}

