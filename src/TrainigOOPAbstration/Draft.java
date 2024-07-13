package TrainigOOPAbstration;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Draft {

    public static void main(String[] args) throws Exception {

        String a = stripUrlParams("https://edabit.com?a=2", new String[]{"b"});
        System.out.println(a);

        Haine haine = null;
//        if (args[0].equalsIgnoreCase("Pantaloni")) {
//            haine = new Pantaloni();
//            haine.croieste();
//        } else if (args[0].equalsIgnoreCase("Tricou")) {
//            haine = (Haine) new Tricou();
//            haine.croieste();
//        }

        Cat myCat = new Cat("Matu", 6);

        Field[] catFields = myCat.getClass().getDeclaredFields();
        Class<? extends Cat> cayClass = myCat.getClass();

        for (Field field : catFields) {
            if (field.getName().equalsIgnoreCase("name")) {
                field.setAccessible(true);
                field.set(myCat, "Marius Petrut");
            }

        }

        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for (Method method : catMethods) {
            if (method.getName().equalsIgnoreCase("thisIsAPrivateStaticMethod ")) {
                method.setAccessible(true);
                method.invoke(null);

            }

        }

        SecretConfig config = new SecretConfig();
        // Before changing the private field
        System.out.println(config.performAction());

        Field secretField = SecretConfig.class.getDeclaredField("secretValue");
        Method performAction = SecretConfig.class.getDeclaredMethod("performAction");
        //Bypass the access check for private field
        secretField.setAccessible(true);

        //Changing the value of the private field
        secretField.set(config, "modified");

        //After changing the private field
        System.out.println(config.performAction());

        Class<SecretConfig> clazz = SecretConfig.class;
        System.out.println("Class name: " + clazz.getName());




        String text = "Egor Alla Alexander";
        Pattern pattern = Pattern.compile("A.+a");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        //Test obj1 = (Test)Class.forName("com.p1.Test").newInstance();


        Tricou obj = new Tricou();
        Class<?> objClass = obj.getClass();  // Retrieve the runtime class descriptor of obj

        System.out.println("Class Name: " + objClass.getName());
        System.out.println("Superclass: " + objClass.getSuperclass().getName());
        List<Field> fields = Arrays.stream(objClass.getDeclaredFields()).collect(Collectors.toList());

        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Reflexion test");
        }
        System.out.println("Reflexion test");


    }

    private static String stripUrlParams(String s, String[] strings) {
        return "https://edabit.com";
    }

    // why here the matcher.find() method is not calleble?

//    String text = "Egor Alla Alexander";
//    Pattern pattern = Pattern.compile("A.+a");
//    Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//        System.out.println(text.substring(matcher.start(), matcher.end()));
//    }


}
