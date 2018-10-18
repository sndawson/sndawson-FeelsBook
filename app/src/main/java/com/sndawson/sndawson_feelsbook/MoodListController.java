package com.sndawson.sndawson_feelsbook;

public class MoodListController {

    // Lazy singleton
    private static MoodList moodList = null;
    static public MoodList getMoodList() {
        if (moodList == null) {
            moodList = new MoodList();
        }
        return moodList;
    }
}
