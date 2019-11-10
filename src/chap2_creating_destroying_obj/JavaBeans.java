package chap2_creating_destroying_obj;

public class JavaBeans {

    public static void main(String[] args) {

        // JavaBeans Pattern - allows inconsistency, mandates mutability, a JavaBean object
        // may be in an inconsistent state partway through its construction.

        final NutritionFacts fries = new NutritionFacts();
        fries.setServingSize(240);
        fries.setServings(8);
        fries.setCalories(100);
        System.out.println(fries.toString());
    }

    static class NutritionFacts {
        //required
        private int servingSize = -1;
        private int servings = -1;
        //optionals
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public NutritionFacts() {
        }

        public void setServingSize(int servingSize) {
            this.servingSize = servingSize;
        }

        public void setServings(int servings) {
            this.servings = servings;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public void setFat(int fat) {
            this.fat = fat;
        }

        public void setSodium(int sodium) {
            this.sodium = sodium;
        }

        public void setCarbohydrate(int carbohydrate) {
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
