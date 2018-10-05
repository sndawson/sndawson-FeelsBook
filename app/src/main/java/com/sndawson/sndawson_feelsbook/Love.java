/* Love is a type of Mood, returns love specific
 * values.
 *
 */

package com.sndawson.sndawson_feelsbook;

public class Love extends Mood {

    Love () {
        super();
    }

    @Override
    public String getMood() {
        return "Love";
    }

}
