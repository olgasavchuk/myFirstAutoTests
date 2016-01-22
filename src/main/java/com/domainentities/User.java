package com.domainentities;

public class User {

    public String username;
    private String password;

    /*
    public User() {

        username = "username";
        password = "password";
    }
    */

    // to avoid the duplicates usage in the user() constructor use the following constructor

    public User() {
        this("username","password"); //!!! call constructor with arguments from the constructor without any arguments
    }


    public User(String aUsername, String password) {
        username = aUsername;
        this.password = password; //this keyword usage if the construction parameter is the same with the class field
    }

    /*
    public String getUsername() {
        return username;
    }
    */

    // getter - the function that allows to get an access to the private class field
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
