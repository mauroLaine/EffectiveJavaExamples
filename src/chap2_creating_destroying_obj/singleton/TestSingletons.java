package chap2_creating_destroying_obj.singleton;

public class TestSingletons {

    public static void main(String[] args) {

        //A singleton is simply a class that is instantiated exactly once

        final PublicFinalField.Elvis elvis = PublicFinalField.Elvis.INSTANCE;
        elvis.singVivaLasVegas();

        final StaticFactory.Elvis elvis1 = StaticFactory.Elvis.getInstance();
        elvis1.singVivaLasVegas();
    }
}
