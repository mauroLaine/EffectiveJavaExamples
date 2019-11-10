package chap2_creating_destroying_obj;

public class BuilderPattern {

    public static void main(String[] args) {

        //Note that NutritionFacts is immutable, and that all parameter default values are in a single location
        // The Builder pattern is flexible. A single builder can be used to build multiple objects

        final NutritionFacts fries = new NutritionFacts.Builder(240, 100)
                .setCalories(10)
                .setSodium(6)
                .build();

        System.out.println(fries.toString());
    }

    static class NutritionFacts {
        private final int servingSize;
        private final int servings;
        private final int calories;
        private final int fat;
        private final int sodium;
        private final int carbohydrate;

        static class Builder {
            //required
            private final int servingSize;
            private final int servings;
            //optionals
            private int calories = 0;
            private int fat = 0;
            private int sodium = 0;
            private int carbohydrate = 0;

            public Builder(int servingSize, int servings) {
                this.servingSize = servingSize;
                this.servings = servings;
            }

            public Builder setCalories(int calories) {
                this.calories = calories;
                return this;
            }

            public Builder setFat(int fat) {
                this.fat = fat;
                return this;
            }

            public Builder setSodium(int sodium) {
                this.sodium = sodium;
                return this;
            }

            public Builder setCarbohydrate(int carbohydrate) {
                this.carbohydrate = carbohydrate;
                return this;
            }

            public NutritionFacts build() {
                return new NutritionFacts(this);
            }
        }

        private NutritionFacts(Builder builder) {
            this.servingSize = builder.servingSize;
            this.servings = builder.servings;
            this.calories = builder.calories;
            this.fat = builder.fat;
            this.sodium = builder.sodium;
            this.carbohydrate = builder.carbohydrate;
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
