import java.io.IOException;

public class ToDoCommand extends Command {
    private String taskDescription;
    
    public ToDoCommand(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    
    /**
     * Creates a ToDoTask and adds it to this TaskList.
     *
     * @param taskList The TaskList object passed from Duke.
     * @param ui       The Ui object passed from Duke.
     * @param storage  The Storage object passed from Duke.
     * @return The response String.
     * @throws DukeException A DukeException custom exception.
     * @throws IOException An IOException.
     */
    public String execute(TaskList taskList, Ui ui, Storage storage) throws DukeException, IOException {
        if (taskDescription.matches("\\s*")) {
            throw new EmptyTaskDescriptionException("OOPS!!! The description of a task cannot be empty.");
        }
        Task currentTask = new ToDoTask(taskDescription);
        taskList.addTask(currentTask);
        storage.writeSavedList(taskList.getList());
        return ui.printAfterAddingTask(currentTask, taskList.getSize());
    }
}