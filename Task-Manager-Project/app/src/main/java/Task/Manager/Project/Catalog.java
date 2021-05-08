/*
 * Name: Dave McDonald
 * Task Manager Project
 * Course: CS2263 (Spring 2021)
 * Date: April 4, 2021
 * Description: Handles input/ output, archive, etc.
 */

package Task.Manager.Project;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private final Gson gson;
    protected List<User> users; // to keep track of all users

    /***********************
     * Constructors
     * *********************/
    public Catalog() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    /***********************
     * Methods
     * *********************/
    boolean userExists(String userName){
        return this.users.contains(userName);
    }

    int findUser(String userName){// any unique id will do.
        return users.indexOf(userName);
    }

    protected void addUser(User newUser){
        users.add(newUser);
    }

    // Reads in data from json file, puts it into list of User objects
    public List<User> getUsers(String archiveFile){
        String json = "";
        try { json = Files.readString(Paths.get(archiveFile)); }
        catch (IOException ex) { ex.printStackTrace(); }

        if(json.isBlank()){
            return new ArrayList();
        }else{//read from file
            Type listType = new TypeToken<ArrayList<User>>() {}.getType();
            return gson.fromJson(json, listType);
        }

    }

    public void archiveUsers(String archiveFile, List<User> users){
        String json = gson.toJson(users);

        //writes out to file
        try { Files.writeString(Paths.get(archiveFile), json); }
        catch (IOException ex) { ex.printStackTrace(); }
    }

}
