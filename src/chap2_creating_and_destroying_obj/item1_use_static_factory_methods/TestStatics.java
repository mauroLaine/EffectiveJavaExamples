package chap2_creating_and_destroying_obj.item1_use_static_factory_methods;

public class TestStatics {


    public static void main(String[] args) {

        //*** Consider static factory methods instead of constructors ***

        //(static factory method is not the same as the Factory Method pattern)
        //Providing a static factory method instead of a public constructor has both advantages and disadvantages.
        // + One advantage of static factory methods is that, unlike constructors, they have names
        // + A second advantage of static factory methods is that, unlike constructors, they are not
        //      required to create a new object each time they’re invoked
        //      (The constructor creates a new object each time it’s called, while the static factory
        //          method is never required to do so and won’t in practice)
        // + A third advantage of static factory methods is that, unlike constructors, they can return an
        //      object of any subtype of their return type
        // - The main disadvantage of providing only static factory methods is that classes without
        //      public or protected constructors cannot be subclassed
        // - A second disadvantage of static factory methods is that they are not readily distinguishable
        //      from other static methods

        final String myValue = "true";
        final boolean isTrue = Boolean.valueOf(myValue);
        System.out.println(isTrue);

        final Cat garfield = Cat.getGarfield();
        System.out.println(garfield.toString());

        final Cat silvestre = Cat.getSilvestre();
        System.out.println(silvestre.toString());
    }


    static class Cat {
        private final String name;

        private Cat(String name) {
            this.name = name;
        }

        public static Cat getGarfield() {
            return new Cat("Garfield");
        }

        public static Cat getSilvestre() {
            return new Cat("Silvestre");
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}