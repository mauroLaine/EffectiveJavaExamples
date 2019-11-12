package chap2_creating_destroying_obj.singleton;

public class StaticFactory {

    //One advantage of the factory-method approach is that it gives you the flexibility to change
    // your mind about whether the class should be a singleton without changing its API

    static class Elvis {

        private static final Elvis INSTANCE = new Elvis();

        private Elvis() {
        }

        public static Elvis getInstance() {
            return INSTANCE;
        }

        public void singVivaLasVegas() {
            System.out.println("bright light city...");
        }

        //To maintain the singleton guarantee, you have to declare all instance fields transient
        // and provide a readResolve method. Otherwise, each time a serialized instance is
        // deserialized, a new instance will be created
        private Object readResolve() {
            // Return the one true Elvis and let the garbage collector
            // take care of the Elvis impersonator.
            return INSTANCE;
        }
    }
}
