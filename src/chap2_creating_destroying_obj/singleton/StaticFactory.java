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
    }
}
