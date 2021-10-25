package habitstracker;

public class BadHabit extends Habit{
    private int negativeScores;

    public BadHabit(String name, boolean isHabitDone, int negativeScores) {
        super(name, isHabitDone);
        this.negativeScores = negativeScores;
    }

    public int getNegativeScores() {
        return negativeScores;
    }

    public void setNegativeScores(int negativeScores) {
        this.negativeScores = negativeScores;
    }
}
