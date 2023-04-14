package Final.interfaces;

public interface Edible {
    // Abstract method to get the name of the food item
    String getName();

    // Abstract method to get the number of calories in the food item
    int getCalories();

    // Default method to get the taste of the food item
    default String getTaste() {
        return "Unknown";
    }
    static boolean isEdible() {
        return true;
    }

    // Constant to represent the food category
    public static final String FOOD_CATEGORY = "Edible";
}
