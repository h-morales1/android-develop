package z1959955.cs.niu.edu.converterexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    int userSelection;
    EditText userInput;
    TextView displayResult, titleTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent currentIntent = getIntent();
        userSelection = currentIntent.getIntExtra("conversionChoice", 1);

        displayResult = findViewById(R.id.resultDisplayTV); // display resulting conversion
        userInput = findViewById(R.id.userInputET); // user input in ET
        titleTV = findViewById(R.id.titleTV); // the title for conversion

        switch (userSelection) {
            case 1: titleTV.setText(R.string.feet_label); break;
            case 2: titleTV.setText(R.string.inches_label); break;
            case 3: titleTV.setText(R.string.pounds_label); break;
        }
    }

    public void goBack(View view) {
        // on Go Back button click, return to mainActivity
        finish();
    }

    public void processConversion(float toConv) {
        // detect which method of conversion was selected and apply proper formula
        float result;
        switch (userSelection) {
            case 1:
                result = (toConv * 0.3048f);
                break; // feet to meters
            case 2:
                result = (toConv * 2.54f);
                break; // inches to cm
            case 3:
                result = (toConv * 453.592f);
                break; // lbs to g
        }
        displayResult.setText(); // set the result TV TODO
    }

    public void doCalc(View view) {
        // on button click Perform Conversion
        // get the user input
        String uInput = userInput.getText().toString();
        float toConvert = Float.parseFloat(uInput); // convert string to float
        processConversion(toConvert); // call function to process conversion;
    }
}