/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 9, 2021
 * Description: Task Class to store data for tasks to be completed.
 */

package Task.Manager.Project;

import java.util.List;

public class Task {
    protected String taskName;
    protected String taskDesc; //not in orig scope. Added by Dave McD.
    protected List<Subtask> subTask;
    protected boolean completed = false; //default false. Not in orig scope. Added by Dave McD.

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

    public Task(String taskName) {
        this.taskName = taskName;
    }

    /***********************
     * Getters
     * *********************/
    public String getTaskName() {
        return taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public boolean isCompleted() {
        return completed;
    }

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
    public String displayComplete(){
        if(this.completed){
            return "* Completed.";
        }
        return "";
    }
}
