package edu.rutgers.rumad.rumadworkshopone.completed;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.rutgers.rumad.rumadworkshopone.R;

// import statement for the r file of this app. 
// "the build of your app that accesses all declared resources "

public class MainActivityCompleted extends ActionBarActivity {
    // create global null pointers to all of the resources that we will use in this activity
    Button red,blue,next;
    EditText input;
    TextView output;
    Context ctx;

    @Override  // on the creation of this context, create the content views, initialize instances and set content view from R.java
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ctx is set. ctx is a pointer to the current rendered context on the Android device.
        ctx = this;
        // red button pointer
        red = (Button)findViewById(R.id.redBtn);
        // blue button pointer
        blue = (Button)findViewById(R.id.blueBtn);
        //  next button pointer
        next = (Button)findViewById(R.id.nextBtn);
        // input where we take in a string 
        input = (EditText)findViewById(R.id.inputField);
        // output where text will be displayed
        output = (TextView)findViewById(R.id.outputView);

        String inputText = input.getText().toString();

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = input.getText().toString();
                /* Fills in the currently empty text of output
                 var "inputText" */
                output.setText(inputText);
                /* Now make the color red like css */
                output.setTextColor(Color.RED);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sort of like listen for buttons, then do this
                String inputText = input.getText().toString();
                output.setText(inputText);
                output.setTextColor(Color.BLUE);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intent listener, when the NEXT button is clicked, initialize our new intent
                Intent intent = new Intent(ctx,SecondActivityCompleted.class);
                // now start our new activity because our previous intent was initialized
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_completed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
