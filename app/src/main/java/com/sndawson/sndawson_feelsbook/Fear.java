/* Fear is a type of Mood, returns fear specific
 * values.
 *
 */

package com.sndawson.sndawson_feelsbook;

public class Fear extends Mood {

    Fear () {
        super();
    }

    @Override
    public String getMood() {
        return "Fear";
    }

}
