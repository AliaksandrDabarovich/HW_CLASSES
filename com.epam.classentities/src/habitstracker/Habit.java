package habitstracker;

public class Habit {
    private String name;
    private boolean isHabitDone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHabitDone() {
        return isHabitDone;
    }

    public void setHabitDone(boolean habitDone) {
        isHabitDone = habitDone;
    }

    public Habit(String name, boolean isHabitDone) {
        this.name = name;
        this.isHabitDone = isHabitDone;
    }


}
