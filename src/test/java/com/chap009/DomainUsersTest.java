package com.chap009;


import com.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class DomainUsersTest {

    @Test
    public void CreateUsers(){
        System.out.println("\nCreateUsers method stats here...");
        User[] users = new User[3];

        users[0] = new User("user0","pass0");
        users[1] = new User("user1","pass1");
        users[2] = new User("user2","pass2");

        assertEquals("pass1", users[1].getPassword());
        assertEquals("user2", users[2].getUsername());

        for(User person : users) {
                        System.out.println(person.getUsername());
        }
    }

    @Test
    public void CreateHundredUsers() {
        System.out.println("\nCreateHundredUsers method stats here...");
        User[] users = new User[10];

        for (int userIndex = 0; userIndex < users.length; userIndex++) {
            int userId = userIndex +1;
            users[userIndex] = new User("user" + userId, "pass" + userId);
        }

        for (User people : users) {
            System.out.println(people.getUsername() + " " + people.getPassword());
        }

        int peopleIndex = 1;
        for (User people : users){
            assertEquals("user"+peopleIndex, people.getUsername());
            assertEquals("pass"+peopleIndex, people.getPassword());
            peopleIndex++;
        }

        assertEquals(peopleIndex,11);
        System.out.print("Life is great!");
    }
}
