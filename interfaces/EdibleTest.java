package Final.interfaces;

public class EdibleTest {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 95);
        Fruit orange = new Fruit("Orange", 62);

        // Test getName() and getCalories() methods
        System.out.println("Apple has " + apple.getCalories() + " calories");
        System.out.println("Orange has " + orange.getCalories() + " calories");

        // Test getTaste() method
        System.out.println("The taste of apple is " + apple.getTaste());
        System.out.println("The taste of orange is " + orange.getTaste());

        // Test isEdible() method
        System.out.println("Is apple edible? " + Edible.isEdible());
        System.out.println("Is orange edible? " + Edible.isEdible());

        // Test FOOD_CATEGORY constant
        System.out.println("The category of apple is " + Edible.FOOD_CATEGORY);
        System.out.println("The category of orange is " + Edible.FOOD_CATEGORY);
    }
}
