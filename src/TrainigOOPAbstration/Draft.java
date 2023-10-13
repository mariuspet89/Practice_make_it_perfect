package TrainigOOPAbstration;

public class Draft {

    public static void main(String[] args) {

        String a = stripUrlParams("https://edabit.com?a=2", new String[]{"b"});
        System.out.println(a);

        Haine haine = null;
        if (args[1].equalsIgnoreCase("Pantaloni")) {
            haine = new Pantaloni();
        } else if (args[1].equalsIgnoreCase("Tricou")) {
            haine = (Haine) new Tricou();
        }
    }

    private static String stripUrlParams(String s, String[] strings) {
        return "https://edabit.com";
    }

}
