/* MoodList is a collection of all the user's
 * mood entries.
 */

package com.sndawson.sndawson_feelsbook;

import java.util.ArrayList;
import java.util.Collection;

public class MoodList {

    private ArrayList<Mood> moodList;

    public MoodList() {
        moodList = new ArrayList<Mood>();
    }

    public Collection<Mood> getMoods() {
        return this.moodList;
    }

    public void addMood(Mood newMood) {
        moodList.add(newMood);
    }

    public void removeMood(Mood mood) {
        moodList.remove(mood);
    }
}
