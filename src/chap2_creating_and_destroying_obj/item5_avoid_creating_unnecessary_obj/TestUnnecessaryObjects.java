package chap2_creating_and_destroying_obj.item5_avoid_creating_unnecessary_obj;

public class TestUnnecessaryObjects {

    public static void main(String[] args) {

        //*** Avoid creating unnecessary objects ***

        testStrings();
    }

    static void testStrings() {

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
