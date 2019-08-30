public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }
    
    public String getDescription() {
        return this.description;
    }

    public String getStatusIcon() {
        return (isDone ? "+" : "-");
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public String formattedString() {
        return this.getStatusIcon() + " | " + this.description;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.description;
    }
}
