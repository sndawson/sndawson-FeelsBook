/* Surprise is a type of Mood, returns surprise specific
 * values.
 *
 */

package com.sndawson.sndawson_feelsbook;

public class Surprise extends Mood {

    Surprise () {
        super();
    }

    @Override
    public String getMood() {
        return "Surprise";
    }

}
