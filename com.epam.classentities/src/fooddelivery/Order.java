package fooddelivery;

import java.util.Map;

public class Order {
    private String time;
    private Map<Food, Integer> positions;

    public Order(String time, Map<Food, Integer> positions) {
        this.time = time;
        this.positions = positions;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Map<Food, Integer> getPositions() {
        return positions;
    }

    public void setPositions(Map<Food, Integer> positions) {
        this.positions = positions;
    }
}
