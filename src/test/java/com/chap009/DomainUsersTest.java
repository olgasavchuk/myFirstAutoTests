package com.chap009;


import com.domainentities.User;
import org.junit.Test;
import java.util.Arrays;
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

    @Test
    public void MakeCopyOfArray(){
        String[] workdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        String[] weekDays;

        weekDays = Arrays.copyOf(workdays, 7);
        assertEquals(null, weekDays[5]);
        assertEquals(null, weekDays[6]);
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";
        assertEquals("Saturday", weekDays[5]);
        assertEquals("Sunday", weekDays[6]);

        String[] threeDays;
        threeDays = Arrays.copyOf(workdays, 3);
        assertEquals("Monday",	threeDays[0]);
        assertEquals("Tuesday",	threeDays[1]);
        assertEquals("Wednesday", threeDays[2]);

        String[] someDays;
        someDays = Arrays.copyOfRange(workdays, 1, 4);
        //Assert.copyOfRange(arrayToCopy,startIndex,endItemCount);
        // The	 startIndex	is the	first	item	in	the	array	that	you	want	to	copy.
        // The	 endItemCount	is	the	index	+	1	that	you	want	to	copy.
        //e.g.	if	I	want	to	copy items 3 to 5 inclusive	(“Wednesday”,	“Thursday”,	“Friday”),
        // then	I would	start	the	copy	from	2	(the	index	of	the	third	item),
        // and	end	the	copy on	5	(even though	the	index	of	the	fifth	item	is	4).
        assertEquals(3, someDays.length);
        assertEquals("Tuesday", someDays[0]);
        assertEquals("Wednesday", someDays[1]);
        assertEquals("Thursday", someDays[2]);

        String[] someMoreDays;
        someMoreDays = Arrays.copyOfRange(workdays, 1, 8);
        assertEquals(7, someMoreDays.length);
        assertEquals(null, someMoreDays[4]);
        assertEquals(null, someMoreDays[5]);
        assertEquals(null, someMoreDays[6]);

    }

    @Test
    public void SortArray() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        Arrays.sort(workdays);

        assertEquals("Friday", workdays[0]);
        assertEquals("Wednesday", workdays[4]);
    }

    @Test
    public void SortArrayMixedCase() {
        String[] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday" };
        Arrays.sort(workdays);

        assertEquals("Friday", workdays[0]);
        assertEquals("thursday", workdays[4]);
    }
}
