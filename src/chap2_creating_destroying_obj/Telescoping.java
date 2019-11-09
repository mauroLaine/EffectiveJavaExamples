package chap2_creating_destroying_obj;

public class Telescoping {

    public static void main(String[] args) {

        //In short, the telescoping constructor pattern works, but it is hard to write client code
        // when there are many parameters, and harder still to read it

        final NutritionFacts fries = new NutritionFacts(240, 8, 100, 0);
        System.out.println(fries.toString());
    }

    static class NutritionFacts {
        //required
        private final int servingSize;
        private final int servings;
        //optionals
        private final int calories;
        private final int fat;
        private final int sodium;
        private final int carbohydrate;

        public NutritionFacts(int servingSize, int servings) {
            this(servingSize, servings, 0);
        }

        public NutritionFacts(int servingSize, int servings, int calories) {
            this(servingSize, servings, calories, 0);
        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat) {
            this(servingSize, servings, calories, fat, 0);

        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
            this(servingSize, servings, calories, fat, sodium, 0);
        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbohydrate = carbohydrate;
        }

        @Override
        public String toString() {
            return "NutritionFacts{" +
                    "servingSize=" + servingSize +
                    ", servings=" + servings +
                    ", calories=" + calories +
                    ", fat=" + fat +
                    ", sodium=" + sodium +
                    ", carbohydrate=" + carbohydrate +
                    '}';
        }
    }
}