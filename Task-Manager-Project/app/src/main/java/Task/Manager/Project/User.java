package Task.Manager.Project;

import java.util.Date;

public class User {

    private String email;
    private String userName;
    private String password;
    private String loginStatus; //TODO: should this be bool?
    private Date registerDate;
    private int userID; // unique ID for every user?

    /***********************
     * Constructors
     * *********************/
    public User(String email, String userName, String password,
                String loginStatus, Date registerDate, int userID) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.loginStatus = loginStatus;
        this.registerDate = registerDate;
        this.userID = userID;
    }

    public User(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    /***********************
     * Getters
     * *********************/
    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public int getUserID() {
        return userID;
    }

    /***********************
     * Setters
     * *********************/
    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
