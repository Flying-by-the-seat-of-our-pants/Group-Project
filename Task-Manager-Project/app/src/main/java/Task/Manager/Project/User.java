/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: User Class to store data about indiv. user.
 */

package Task.Manager.Project;

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
    public User(){/*intentionally empty*/};

    public User(String email, String userName, String password,
                boolean loginStatus, List<TDList> tdLists /*, Date registerDate, int userID*/) {
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
            System.out.println("Thank you, you are now logged in.\n");
            return true;
        } else {
            System.out.println("You have entered incorrect information.");
            return false;
        }

    }

    protected void displayLists(){//not in orig scope. Added by Dave McD.
        if(loginStatus) {//user must be logged in.
         //TODO: Check for null list
            // TODO: add more output? Mess with format.
            System.out.println("Your Lists:");
            for (TDList tdl : tdLists) {
                System.out.println("List:" +
                        tdl.listName);
                for(Task tsk : tdl.tasks) {
                    System.out.println("\tTask: " +
                            tsk.taskName);
                    //TODO: May be an issue in here.
                }
                //System.out.println("\n");
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

    //TODO: add functionality to add tasks here.
    protected void createList(String name, String description){
        //TDList td = new TDList(name, description);
        tdLists.add(new TDList(name, description));
    }

    protected void register(){

    }

    protected void createSubList(){

    }

    protected void createNewTask(){

    }

}