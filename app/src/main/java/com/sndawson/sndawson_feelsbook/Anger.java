/* Anger is a type of Mood, returns anger specific
 * values.
 *
 */

package com.sndawson.sndawson_feelsbook;

public class Anger extends Mood {

    Anger () {
        super();
    }

    @Override
    public String getMood() {
        return "Anger";
    }

}
