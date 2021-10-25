package fooddelivery;

import java.util.List;

public class Catalog {
    private List<Food> foodList;

    public Catalog(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
