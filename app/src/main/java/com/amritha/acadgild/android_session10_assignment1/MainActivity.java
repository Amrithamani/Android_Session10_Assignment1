package com.amritha.acadgild.android_session10_assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Defining EditText and Button

    EditText addText;
    Button clickSubmit;

    /**
     * Called when the activity is first created.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get EditText object from xml

        addText = (EditText) findViewById(R.id.addText);

        // Get Button object from xml

        clickSubmit = (Button) findViewById(R.id.clickSubmit);

    }

    //when button is pressed, this method will call another sendData method

    public void SelectFragment(View view) {

        sendData();//calls sendData method

    }

    private void sendData() {

        // Create an instance of myFragment
        SimpleAddition myFragment = new SimpleAddition();

        // Add the fragment to the 'fragment1' LinearLayout
        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragment1, myFragment).commit();

        // Get TextView object from xml
        TextView nameFragTxt = (TextView) findViewById(R.id.nameText);

        //Assigning the String value to nameFragTxt
        nameFragTxt.setText(addText.getText().toString());

    }

}
