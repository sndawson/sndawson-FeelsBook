package com.sndawson.sndawson_feelsbook;

import junit.framework.TestCase;
import java.util.Collection;

public class MoodListTest extends TestCase {

    public void testEmptyMoodList() {
        MoodList moodList = new MoodList();
        Collection<Mood> moods = moodList.getMoods();
        assertTrue("Empty mood list", moods.size() == 0);
    }

    public void testAddMoodList() {
        MoodList moodList = new MoodList();
        Mood testMood = new Love();
        moodList.addMood(testMood);
        Collection<Mood> moods = moodList.getMoods();
        assertTrue("Mood list size", moods.size() == 1);
        assertTrue("Test mood not found", moods.contains(testMood));
    }

    public void testRemoveMood() {
        MoodList moodList = new MoodList();
        Mood testMood = new Love();
        moodList.addMood(testMood);
        Collection<Mood> moods = moodList.getMoods();
        assertTrue("Mood list size not big enough", moods.size() == 1);
        assertTrue("Test mood not found", moods.contains(testMood));
        moodList.removeMood(testMood);
        moods = moodList.getMoods();
        assertTrue("Mood list size too small", moods.size() == 0);
        assertFalse("Test mood found", moods.contains(testMood));
    }
}
