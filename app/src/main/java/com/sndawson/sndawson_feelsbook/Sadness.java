/* Sadness is a type of Mood, returns sadness specific
 * values.
 *
 */

package com.sndawson.sndawson_feelsbook;

public class Sadness extends Mood {

    Sadness () {
        super();
    }

    @Override
    public String getMood() {
        return "Sadness";
    }

}
