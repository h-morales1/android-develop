package z1959955.cs.niu.edu.myapplication;

/*
    Herbert Morales
    z1959955 niunt.niu.edu
    CSCI-322-MSTR

    Assignment 1 - Show Hello World by default, once button is clicked, change text in textview
    to show Goodbye!, toggle between both messages as clicked.
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Boolean changed = false; // boolean used to keep track of message change
    private TextView changeTextTV; // text view to change
    private Button changeTextBTN; // button used to change text

    //private CheckBox baconCB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextTV = findViewById(R.id.helloWorldTextView);
        changeTextBTN = findViewById(R.id.changeTextButton);
        /*
        // change text in changeTextTV if changeTextBTN is pressed
        changeTextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!changed) {
                    // button clicked so display Goodbye!
                    changeTextTV.setText(R.string.changedText2);
                    changed = true;
                } else {
                    // button clicked after displaying Goodbye so display Hello World!
                    changeTextTV.setText(R.string.changedText1);
                    changed = false;
                }
            } // end of onClick()
        }); // end of setOnClickListener()
*/
        //attach a named listener to the radio group
        //baconCB.setOncClickListener(baconListener)
    } // end of onCreate()

    /*private View.OnClickListener baconListener = new View.OnClickListener() {
        @overide
        public void onClick(View view) {
            if (((CheckBox) view).isChecked()) {

            }
        }
    };

    private void onCheckedChanged(RadioGroup group, int checkedId) {

    }*/

} // end of MainActivity class