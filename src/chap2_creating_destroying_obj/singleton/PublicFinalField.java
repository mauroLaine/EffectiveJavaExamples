package chap2_creating_destroying_obj.singleton;

public class PublicFinalField {
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
