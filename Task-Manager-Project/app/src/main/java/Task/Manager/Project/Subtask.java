package Task.Manager.Project;

public class Subtask extends Task {
    /***********************
     * Constructors
     * *********************/
    public Subtask() {
    }

    public Subtask(String taskName, String taskDesc) {
        super(taskName, taskDesc);
    }

    public Subtask(String taskName) {
        super(taskName);
    }
}
