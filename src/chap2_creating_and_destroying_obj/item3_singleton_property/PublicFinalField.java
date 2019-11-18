package chap2_creating_and_destroying_obj.item3_singleton_property;

public class PublicFinalField {

    //The main advantage of the public field approach is that the declarations make it clear
    // that the class is a singleton: the public static field is final, so it will
    // always contain the same object reference

    static class Elvis {

        public static final Elvis INSTANCE = new Elvis();

        private Elvis() {
        }

        public void leaveTheBuilding() {
            System.out.println("leave the building");
        }

        public void singVivaLasVegas() {
            System.out.println("bright light city...");
        }
    }
}
