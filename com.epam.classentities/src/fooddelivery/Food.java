package fooddelivery;

public class Food {
    private String category;
    private String name;
    private int calories;

    public Food(String category, String name, int calories) {
        this.category = category;
        this.name = name;
        this.calories = calories;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
