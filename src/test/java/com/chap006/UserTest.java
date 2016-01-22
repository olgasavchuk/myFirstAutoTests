package com.chap006;

import com.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword() {
        User user = new User();

        // try to change the class field
        user.username = "username2";

        //how to use public class field
        assertEquals("default user name expected", "username", user.username); //false
        assertEquals("default user name expected", "username2", user.username); //true

        //how to get an access to private class field
        assertEquals("default password name expected", "password", user.getPassword());

    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin","pA55w0rD");

        assertEquals("default user name expected", "admin", user.username); //false
        assertEquals("default password name expected", "pA55w0rD", user.getPassword());


    }

    @Test
    public void canSetPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("default password name expected", "PaZZwor6", user.getPassword());
    }
}
