/* Joy is a type of Mood, returns joy specific
 * values.
 *
 */

package com.sndawson.sndawson_feelsbook;

public class Joy extends Mood {

    Joy () {
        super();
    }

    @Override
    public String getMood() {
        return "Joy";
    }

}