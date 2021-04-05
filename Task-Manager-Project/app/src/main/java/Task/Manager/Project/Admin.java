/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: List Class to store to do items
 */

package Task.Manager.Project;

public class Admin extends User{
    /***********************
     * Constructors
     *********************/

    public Admin(String email, String userName, String password,
                boolean loginStatus/*, Date registerDate, int userID*/){
         super(email, userName, password, loginStatus);
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

}
