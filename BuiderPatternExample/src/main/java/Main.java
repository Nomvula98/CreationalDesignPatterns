public class Main {
    public static void main(String[] args) {
        //Builder pattern builds a complex object using simple objects and using a step-by-step approach.
        //A Builder class builds the final object step by step. This builder is independent of other objects.
        //It is mostly used when object can't be created in single step like in the de-serialization of a complex object.

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
