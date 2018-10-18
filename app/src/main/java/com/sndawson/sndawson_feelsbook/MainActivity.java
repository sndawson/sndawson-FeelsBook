/*  sndawson-FeelsBook: records feelings quickly
    Copyright (C) 2018  Shawna Dawson sndawson@ualberta.ca

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package com.sndawson.sndawson_feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void viewMoodHistory(View view) {
        Intent intent = new Intent(this, MoodHistoryActivity.class);
        startActivity(intent);
    }

    public void addMood(View view) {
        //Toast.makeText(this, "Mood Added", Toast.LENGTH_LONG);

        Intent intent = new Intent (this, EditMoodActivity.class);
        startActivity(intent);
    }

    /*public void addMood() {
        Toast.makeText(this, "Mood Added", Toast.LENGTH_SHORT);
    }*/
}
