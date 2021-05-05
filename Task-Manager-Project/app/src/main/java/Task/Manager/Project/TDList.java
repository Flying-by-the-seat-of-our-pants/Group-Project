/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: List Class to store to do items
 */

package Task.Manager.Project;

import java.util.List;

public class TDList {
    protected String listName;
    //protected int listID;
    protected String listDesc;
    protected List<Task> tasks;
    protected TDList subList;

    /***********************
     * Constructors
     * *********************/
    //Default empty C-Tor
    public TDList() { // intentionally empty
    }

    //List name
    public TDList(String listName) {
        this.listName = listName;
    }

    public TDList(String listName, String listDesc) {
        this.listName = listName;
        this.listDesc = listDesc;
    }

    //List name, List of tasks
    public TDList(String listName, List<Task> tasks) {
        this.listName = listName;
        this.tasks = tasks;
    }

    //List name, list description, list of tasks
    public TDList(String listName, String listDesc, List<Task> tasks) {
        this.listName = listName;
        this.listDesc = listDesc;
        this.tasks = tasks;
    }

    /***********************
     * Getters
     * *********************/
    public String getListName() {
        return listName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    /*public int getListID() {
        return listID;
    }*/
    /***********************
     * Setters
     * *********************/
    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    /*public void setListID(int listID) {
        this.listID = listID;
    }*/

    /***********************
     * Methods
     * *********************/
    public void appendTask(){

    }
    protected void displayTaskNames(){
        for (Task task : tasks) {
            System.out.println("Task:" +
                    task.taskName);
        }
    }
    @Override
    public String toString() {
        return "TDList{" +
                "listName='" + listName + '\'' +
                ", tasks=" + tasks +
                '}';
    }

    public Task getTaskByName(String name){
        for (Task tsk : tasks) {//have to search all tasks
            if (tsk.taskName.equals(name)) {
                return tsk;
            }
        }
        return new Task();
    }
}
