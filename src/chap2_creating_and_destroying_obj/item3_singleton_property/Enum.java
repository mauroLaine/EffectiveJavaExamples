package chap2_creating_and_destroying_obj.item3_singleton_property;

public class Enum {

    //This approach is functionally equivalent to the public field approach, except that it is more concise, provides
    // the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation

    public enum Elvis {
        INSTANCE;

        public void singVivaLasVegas() {
            System.out.println("bright light city...");
        }
    }
}
