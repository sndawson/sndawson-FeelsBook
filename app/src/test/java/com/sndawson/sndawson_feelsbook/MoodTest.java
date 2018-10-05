/* https://developer.android.com/training/testing/unit-testing/local-unit-tests#java */

package com.sndawson.sndawson_feelsbook;

import junit.framework.TestCase;

public class MoodTest extends TestCase {

    public void testMoodType() {
        Love love = new Love();
        assertTrue("Wrong type", love.getMood().equals("Love"));
        assertFalse("Wrong type", love.getMood().equals("Joy"));

    }

    public void testMoodMessage() {
        Love love = new Love();
        String testMessage = "Test message.";
        love.setMessage(testMessage);
        assertTrue("Message does not match", testMessage.equals(love.getMessage()));
    }

}
