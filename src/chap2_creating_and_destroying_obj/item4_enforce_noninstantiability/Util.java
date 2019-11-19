package chap2_creating_and_destroying_obj.item4_enforce_noninstantiability;

public class Util {

    //Noninstantiable utility class
    // Suppress default constructor for noninstantiability. The AssertionError isn’t strictly
    // required, but it provides insurance in case the constructor is accidentally invoked
    // from within the class. It guarantees that the class will never be instantiated under
    // any circumstances, this idiom also prevents the class from being subclassed
    private Util() {
        throw new AssertionError();
    }

    public static String getGreeting(final String place) {
        return "Welcome to " + place;
    }
}
