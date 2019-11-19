package chap2_creating_and_destroying_obj.item5_avoid_creating_unnecessary_obj;

import java.util.Calendar;

public class TestUnnecessaryObjects {

    public static void main(String[] args) {

        //*** Avoid creating unnecessary objects ***

//        testStrings();

//        testStaticInitialization();

        testAutoboxing();

    }

    private static void testAutoboxing() {
        //Prefer primitives to boxed primitives, and watch out for unintentional autoboxing
//        Long sum = 0L;
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void testStaticInitialization() {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(1945, Calendar.JANUARY, 1, 0, 0);

        final Person p1 = new Person(calendar.getTime());
        System.out.println(p1.isBadBabyBoomer());
        System.out.println(p1.isBabyBoomer());
    }

    private static void testStrings() {

        //DON'T DO THIS!
        //The statement creates a new String instance each time it is executed, and none of those
        // object creations is necessary
        final String garfield = new String("Garfield");

        //This version uses a single String instance, rather than creating a new one each time
        // it is executed
        final String silvestre = "Silvestre";

        System.out.println("cats: " + garfield + " & " + silvestre);
    }
}
