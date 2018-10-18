/* Mood abstract class handles the common attributes of
 * all the different mood types.
 *
 * Referenced lonelyTwitter project forked from Joshua Charles Campbell and help of TAs in labs
 */

package com.sndawson.sndawson_feelsbook;

import java.util.Date;

public abstract class Mood {

    private Date date;
    private String message;

    Mood() {
       this.date = new Date();  // initialize with current date and time
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    public abstract String getMood();

    public void setDate(Date newDate) {
        this.date = newDate;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }


}
