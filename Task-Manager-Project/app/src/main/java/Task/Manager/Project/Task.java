/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 9, 2021
 * Description: Task Class to store data for tasks to be completed.
 */

package Task.Manager.Project;

public class Task {
    protected String taskName;
    protected String taskDesc; //not in orig scope. Added by Dave McD.
    protected Task subTask;
    protected boolean completed = false; //default false. Not in orig scope. Added by Dave McD.
    //protected Task subTask;
    /***********************
     * Constructors
     * *********************/
    public Task() {
        //intentionally empty
    }

    public Task(String taskName, String taskDesc) {
        this.taskName = taskName;
        this.taskDesc = taskDesc;
    }

    /***********************
     * Getters
     * *********************/

    /***********************
     * Setters
     * *********************/
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }
    /***********************
     * Methods
     * *********************/
}
