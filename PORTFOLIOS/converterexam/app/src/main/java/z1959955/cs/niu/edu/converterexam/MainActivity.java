package z1959955.cs.niu.edu.converterexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton ftToMetersRB, inchestToCmRB, lbsToGRB; // radio button selections
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myIntent = new Intent(MainActivity.this, SecondActivity.class);
    }

    public void selectConversion(View view) {
        // detect which method of conversion was selected
        boolean checked = ((RadioButton) view).isChecked();
        //Intent myIntent = new Intent();

        switch (view.getId()) {
            case R.id.feetToMetersRadioButton:
                if (checked) {
                    // feet to meters selected
                    myIntent.putExtra("conversionChoice", 1);
                }
                break;
            case R.id.inchesToCmRadioGroup:
                if (checked) {
                    // inchest to cm selected
                    myIntent.putExtra("conversionChoice", 2);
                }
                break;
            case R.id.poundsToGramsRadioButton:
                if(checked) {
                    // lbs to grams selected
                    myIntent.putExtra("conversionChoice", 3);
                }
                break;
        }
    }

    public void goToConversion(View view) {
        // go to second activity, keeping in mind the users selected conversion
        startActivity(myIntent);
    }
}