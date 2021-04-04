/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: Users Class to store data for all users
 */

package Task.Manager.Project;

import java.util.List;

public class Users {
    List<Users> usersList;

    /***********************
     * Constructors
     * *********************/
    public Users() {// intentionally empty.
    }

    public Users(List<Users> usersList) {
        this.usersList = usersList;
    }

    /***********************
     * Getters
     * *********************/
    public List<Users> getUsersList() {
        return usersList;

    }

    /***********************
     * Methods
     * *********************/
//TODO: need: search(), insert(), getUsers(): Iterator
    boolean userExists(String userName){
        if(this.usersList.contains(userName)){
            return true;
        }
        else return false;
    }

    int findUser(String userName){// any unique id will do.
        /*if(this.userExists(userName)){*/
            //returns -1 if not found
            return usersList.indexOf(userName);

        /*}
        else{
            return -1;
        }*/
    }
}
