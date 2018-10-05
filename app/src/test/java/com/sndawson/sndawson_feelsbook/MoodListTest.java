package com.sndawson.sndawson_feelsbook;

import junit.framework.TestCase;
import java.util.Collection;

public class MoodListTest extends TestCase {

    public void testEmptyMoodList() {
        MoodList moodList = new MoodList();
        assertTrue("Empty mood list", moodList.size() == 0);
    }

    public void testAddMoodList() {
        MoodList moodList = new MoodList();
        Mood testMood = new Joy();
        moodList.addMood(testMood);
        assertTrue("Mood list size", moodList.size() == 1);
        assertTrue("Test mood not found", moodList.contains(testMood));
    }

    public void testRemoveMood() {
        MoodList moodList = new MoodList();
        Mood testMood = new Love();
        moodList.addMood(testMood);
        assertTrue("Mood list size not big enough", moodList.size() == 1);
        assertTrue("Test mood not found", moodList.contains(testMood));
        moodList.removeMood(testMood);
        assertTrue("Mood list size too small", moodList.size() == 0);
        assertFalse("Test mood found", moodList.contains(testMood));
    }
}
