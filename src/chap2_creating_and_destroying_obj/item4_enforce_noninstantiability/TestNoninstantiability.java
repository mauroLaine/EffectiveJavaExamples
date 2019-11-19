package chap2_creating_and_destroying_obj.item4_enforce_noninstantiability;

public class TestNoninstantiability {

    public static void main(String[] args) {

        //*** Enforce noninstantiability with a private constructor ***

        //Utility classes were not designed to be instantiated
        System.out.println(Util.getGreeting("Las Vegas"));
    }
}
