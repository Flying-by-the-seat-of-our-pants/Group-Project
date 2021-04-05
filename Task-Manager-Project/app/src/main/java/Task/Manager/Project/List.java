/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: List Class to store to do items
 */

package Task.Manager.Project;

public class List {
    protected String listName;
    protected int listID;

    /***********************
     * Constructors
     * *********************/
    public List() { // intentionally empty
    }

    public List(String listName) {
        this.listName = listName;
    }

    /***********************
     * Getters
     * *********************/
    public String getListName() {
        return listName;
    }

    public int getListID() {
        return listID;
    }
    /***********************
     * Setters
     * *********************/
    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setListID(int listID) {
        this.listID = listID;
    }

    /***********************
     * Methods
     * *********************/

}
