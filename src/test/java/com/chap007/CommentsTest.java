package com.chap007;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommentsTest {

    /**
     * this is the comments JavaDoc
     */

    @Test
    public void checkingComments() {

        boolean truthy = true;
        assertTrue(truthy);
    }

    @Test
    public void checkBoolean() {
        boolean falsey = Boolean.FALSE;
        assertFalse(falsey);
    }
}
