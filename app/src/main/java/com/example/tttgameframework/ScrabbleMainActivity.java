package com.example.tttgameframework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.tttgameframework.GameFramework.GameMainActivity;

public class ScrabbleMainActivity extends GameMainActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Step 1: Find the object of elements to interact
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("Test!!");

        View runTestButton = (View) findViewById(R.id.runTestButton);

        //Step 2: Set up listeners for the objects

        runTestButton.setOnClickListener(new View.OnClickListener() {
            //3 what to do with a click
            public void onClick(View v) {
                editText.setText("");
                //first
                ScrabbleGameState firstInstance = new ScrabbleGameState();
                //second
                ScrabbleGameState secondInstance = new ScrabbleGameState(firstInstance);
                //secondInstance.exchangeLetter(1);

                //print the states
                editText.setText(firstInstance.toString() + secondInstance.toString());


            }
        });
    }
*/

}