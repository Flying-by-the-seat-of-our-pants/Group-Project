/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: User Class to store data about indiv. user.
 */

package Task.Manager.Project;

import java.util.ArrayList;
import java.util.List;

public class User {

    protected String email;
    protected String userName;
    protected String password;
    protected boolean loginStatus = false; //default = f TODO: this was string on class dig.
    // Need to store lists connected to User.
    protected List<TDList> tdLists; //not in orig scope. Added by Dave McD.

    /***********************
     * Constructors
     * *********************/
    public User(){/*intentionally empty*/}

    public User(String email, String userName, String password,
                boolean loginStatus, List<TDList> tdLists) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.loginStatus = loginStatus;
    }

    public User(String email, String userName, String password, boolean loginStatus) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.loginStatus = loginStatus;
    }

    public User(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    /***********************
     * Getters
     * *********************/
    private String getEmail() {
        return email;
    }

    private String getUserName() {
        return userName;
    }

    private String getPassword() {
        return password;
    }

    private boolean getLoginStatus() {
        return loginStatus;
    }

    public List<TDList> getTdLists(String liName) {
        return tdLists;
    }

    /***********************
     * Setters
     * *********************/
    private void setEmail(String email) {
        this.email = email;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    /***********************
     * Methods
     * *********************/
    protected boolean verifyLogin(String usrName, String psWord, boolean logStat) {
        if (usrName.equals(this.userName) &&
                psWord.equals(this.password) &&
                !logStat) {
            //correct userName, passWord and not already logged in
            this.loginStatus = true;
            /*System.out.println("Thank you, you are now logged in.\n");*/
            return true;
        } else {
            /*System.out.println("You have entered incorrect information.");*/
            return false;
        }

    }

    /***********************
     * List functions
     * *********************/
    //TODO: add functionality to add tasks here.
    //TODO: is this the same as constructor?
    protected void createList(String name, String description){
        if(tdLists == null){
            tdLists = new ArrayList<TDList>() {
            };
        }
        tdLists.add(new TDList(name, description));
    }

    protected void displayListNames(){
        if(tdLists != null) {
            for (TDList tdl : tdLists) {
                System.out.println("List: " +
                        tdl.listName);
            }
        } else {
            System.out.println("You have no lists.");
        }
    }

    protected void displayLists(){//not in orig scope. Added by Dave McD.
        if(loginStatus) {//user must be logged in.
            // TODO: add more output? Mess with format.
            System.out.println("Your Lists:");
            if (tdLists != null) {
                for (TDList tdl : tdLists) {
                    System.out.println("List:" +
                            tdl.listName);
                    /*if(tdl.subList != null) {
                        for (Sublist subLst : tdl.subList) {
                            System.out.println("\tSublist: " +
                                    subLst.listName);
                        }
                    System.out.println("\n");
                }*/
                    if (tdl.tasks != null && !tdl.tasks.isEmpty()) {
                        for (Task tsk : tdl.tasks) {
                            System.out.println("\tTask: " +
                                    tsk.taskName + " " +
                                    tsk.displayComplete());
                            /*if(tsk.isCompleted()){
                                System.out.println("Completed.");
                            }*/
                        }
                        System.out.println("\n");
                    } else if (tdl.tasks == null || tdl.tasks.isEmpty()) {
                        System.out.println("No tasks.\n");
                    }
                }
            } else {
                System.out.println("You have no lists.");
            }
        }
    }

    protected TDList lastList() {//not in orig scope. Added by Dave McD.
        TDList tdl;
        if (loginStatus) {//user must be logged in.
            tdl =  tdLists.get(tdLists.size() - 1);
        } else {
            tdl = new TDList();
        }
        return tdl;
    }

    protected TDList getListByName(String name){
        if(tdLists != null) {
            for (TDList tdl : tdLists) {//have to search all lists in tdLists
                if (tdl.listName.equals(name)) {
                    return tdl;
                }
            }
        }
        return new TDList();
    }

    protected void removeList(String name) {
        if (tdLists != null) {
            for (TDList tdl : tdLists) {//have to search all lists in tdLists
                if (tdl.listName.equals(name)) {
                    System.out.println("Removing List: " + tdl.listName + "\n");
                    tdLists.remove(tdl);
                    break;
                }
            }
        }
    }

    /***********************
     * Sublist functions TODO: come back if time.
     ***********************/
   /* protected void createSubList(String listName, String subListName, String description){
        if(tdLists != null) {
            for (TDList tdl : tdLists) {//have to search all lists in tdLists
                if (tdl.listName.equals(listName)) {
                    tdl.subList = new List<Sublist>(subListName, description);
                }
            }
        }
    }*/

    /***********************
     * Task functions
     ***********************/
    //TODO: should this be moved to TDList class?
    protected void createTask(String liName, String name, String description){
        // Have to search tdList for list
        if (tdLists != null) {
            for (TDList tdl : tdLists) {//have to search all lists in tdLists
                if (tdl.listName.equals(liName)) {
                    if (tdl.tasks == null) {
                        tdl.tasks = new ArrayList<Task>();
                    }
                    tdl.tasks.add(new Task(name, description));
                }
            }
        } else {
            System.out.println("List name entered cannot be found.");
        }
    }

    // Needs list name where task is, and task name.
    protected void removeTask(String liName, String name){
        // Have to search tdList for list
        if (tdLists != null) {
            for (TDList tdl : tdLists) {//have to search all lists in tdLists
                if (tdl.listName.equals(liName)) {
                    // Have to search task list for the task
                    for (Task tsk : tdl.tasks) {
                        if (tsk.taskName.equals(name)) {
                            System.out.println("Removing Task: " + tsk.taskName +
                                    " from List: " + tdl.listName);
                            tdl.tasks.remove(tsk);
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println("List name entered cannot be found.");
        }
    }

    protected void displayTasks(String liName){//not in orig scope. Added by Dave McD.
        if(loginStatus) {//user must be logged in.
            //TODO: Check for null list
            // TODO: add more output? Mess with format.
            //System.out.println("Your Tasks:");
            if (tdLists != null) {
                for (TDList tdl : tdLists) {
                    if (tdl.listName.equals(liName)) {
                        if (tdl.tasks != null) {
                            for (Task tsk : tdl.tasks) {
                                System.out.println("Task: " +
                                        tsk.taskName);
                            }
                            System.out.println("\n");
                        } else if (tdl.tasks == null) {
                            System.out.println("No tasks.\n");
                        }
                    }
                }
            } else {
                System.out.println("List name entered cannot be found.");
            }
            System.out.println("\n");
        }
    }

    protected void displayLastTask(String liName) {//not in orig scope. Added by Dave McD.
        if (tdLists != null) {
            for (TDList tdl : tdLists) {
                if (tdl.listName.equals(liName) && tdl.tasks != null) {
                    System.out.println("Task: " +
                            tdl.tasks.get(tdl.tasks.size() - 1));
                }

            }
        }

    }

    /***********************
     * Subtask functions TODO: come back to if time.
     ***********************/
    /*protected void createSubTask(String liName, String tskName, String name, String description){
        // Have to search tdList for list
        if (tdLists != null) {
            for (TDList tdl : tdLists) {//have to search all lists in tdLists
                if (tdl.listName.equals(liName)) {
                    if (tdl.tasks != null  && !tdl.tasks.isEmpty()) {
                        for(Task tsk : tdl.tasks){
                            if (tsk.taskName.equals(tskName)){
                                if (tsk.subTask == null) {
                                    tsk.subTask = new List<Subtask>();
                                }
                            }
                        }

                    }
                    tdl.tasks.add(new Task(name, description));
                }
            }
        } else {
            System.out.println("List name entered cannot be found.");
        }
    }*/

}