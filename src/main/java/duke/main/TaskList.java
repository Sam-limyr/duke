package duke.main;

import duke.task.Task;

import java.util.ArrayList;

/**
 * An abstraction of the list of Task objects.
 */
public class TaskList {
    /**
     * The list of Tasks.
     */
    private ArrayList<Task> taskList;
    
    /**
     * Creates a TaskList object.
     * The list is initialized with a capacity of 100.
     */
    public TaskList() {
        this.taskList = new ArrayList<>(100);
    }
    
    /**
     * Creates a TaskList object.
     * The list is initialized as the input list.
     *
     * @param taskList The inputted list of Tasks.
     */
    public TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }
    
    /**
     * Gets the list of Tasks stored in this TaskList object.
     *
     * @return Returns this list of Tasks.
     */
    public ArrayList<Task> getList() {
        return this.taskList;
    }
    
    public Task getTask(int index) {
        return this.taskList.get(index);
    }
    
    /**
     * Gets the number of Tasks in this TaskList object.
     *
     * @return Returns the number of Tasks in this list.
     */
    public int getSize() {
        return this.taskList.size();
    }
   
    /**
     * Adds a Task to this TaskList.
     *
     * @param currentTask The Task object to be added.
     */
    public void addTask(Task currentTask) {
        taskList.add(currentTask);
    }
    
    public Task deleteTask(int index) {
        return this.taskList.remove(index);
    }
}