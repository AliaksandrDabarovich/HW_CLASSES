package planner;

public class Task {
    private String taskName;
    private String deadLine;
    private boolean isFinished;

    public Task(String taskName, String deadLine, boolean isFinished) {
        this.taskName = taskName;
        this.deadLine = deadLine;
        this.isFinished = isFinished;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
