package habitstracker;

public class GoodHabit extends Habit{
    private int positiveScores;

    public int getPositiveScores() {
        return positiveScores;
    }

    public void setPositiveScores(int positiveScores) {
        this.positiveScores = positiveScores;
    }

    public GoodHabit(String name, boolean isHabitDone, int positiveScores) {
        super(name, isHabitDone);
        this.positiveScores = positiveScores;
    }
}
