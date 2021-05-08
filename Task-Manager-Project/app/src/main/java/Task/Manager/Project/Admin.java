/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: List Class to store to do items
 */

package Task.Manager.Project;

public class Admin extends User{
    protected boolean isAdmin;
    /***********************
     * Constructors
     *********************/

    public Admin(String email, String userName, String password,
                  boolean isAdmin){
         super(email, userName, password);
        this.isAdmin = isAdmin;
    }

    public Admin(String email, String userName, String password) {
       super(email, userName, password);
    }

    /***********************
     * Methods
     *********************/
    protected boolean approveRequests(){

        return true;
    }

    protected boolean verifyLogin(String usrName, String psWord, boolean logStat, boolean isAdmin) {
        if (usrName.equals(this.userName) &&
                psWord.equals(this.password) &&
                !logStat && this.isAdmin) {
            //correct userName, passWord and not already logged in
            this.loginStatus = true;
            /*System.out.println("Thank you, you are now logged in.\n");*/
            return true;
        } else {
            /*System.out.println("You have entered incorrect information.");*/
            return false;
        }

    }
}
