/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: User Class to store data about indiv. user.
 */

package Task.Manager.Project;

public class User {

    protected String email;
    protected String userName;
    protected String password;
    protected boolean loginStatus = false; //default = f TODO: this was string on class dig.
    //private Date registerDate;
    //private int userID; // unique ID for every user?

    /***********************
     * Constructors
     * *********************/
    public User(String email, String userName, String password,
                boolean loginStatus/*, Date registerDate, int userID*/) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.loginStatus = loginStatus;
        /*this.registerDate = registerDate;
        this.userID = userID; //TODO: get rid of this?*/
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

   /* private Date getRegisterDate() {
        return registerDate;
    }

    private int getUserID() {
        return userID;
    }*/

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

    /*private void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    private void setUserID(int userID) {
        this.userID = userID;
    }*/

    /***********************
     * Methods
     * *********************/
    protected boolean verifyLogin(String usrName, String psWord, boolean logStat) {
        if (usrName.equals(this.userName) &&
                psWord.equals(this.password) &&
                !logStat) {
            //correct userName, passWord and not already logged in
            this.loginStatus = true;
            System.out.println("Thank you, you are now logged in.");
            return true;
        } else {
            System.out.println("You have entered incorrect information.");
            return false;
        }

    }

    protected void register(){

    }

    protected void createNewList(){

    }

    protected void createNewTask(){

    }

}