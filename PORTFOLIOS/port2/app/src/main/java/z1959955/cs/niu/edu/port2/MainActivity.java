package z1959955.cs.niu.edu.port2;

/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Portfolio 2
    Due date: 02/08/23
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TipCalculator tipCalculator;

    private NumberFormat money;

    private EditText billEt, tipPercEt;

    private TextView tipTV, totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect the input and output fields to the xml fields
        billEt = findViewById(R.id.billEditText);
        tipPercEt = findViewById(R.id.tipPercentEditText);
        tipTV = findViewById(R.id.tipTextView);
        totalTV = findViewById(R.id.totalTextView);

        //create the tip calculator obj
        tipCalculator = new TipCalculator(0.27f, 123.45f);

        //create the formatting for dollar amounts
        money = NumberFormat.getCurrencyInstance();


        //create a custom textwatcher obj
        TextChangeHandler textChangeHandler = new TextChangeHandler();

        //attach the custom textwatcher to the edit text fields
        billEt.addTextChangedListener(textChangeHandler);
        tipPercEt.addTextChangedListener(textChangeHandler);

    }//end of onCreate

    //method to calculate the tip amount and total amount
    public void calculate() {
        String billString = billEt.getText().toString(), tipPercString = tipPercEt.getText().toString();

        //check that both edit text fields have info. if not, exit
        if(billString.matches("") || tipPercString.matches("")) {
            return;
        }

        //at this point, there is data in both fields
        // try to convert to numeric value and do the calculations
        try {
            float billAmt = Float.parseFloat(billString);
            int tipPerc = Integer.parseInt(tipPercString);

            // update the tip percentage and bill amount in the TipCalculator obj
            tipCalculator.setTip(tipPerc * 0.01f);
            tipCalculator.setBill(billAmt);

            //update the fields with the tip amount and total amount
            tipTV.setText(money.format(tipCalculator.calculateTip()));
            totalTV.setText(money.format(tipCalculator.calculateTotal()));
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, "Data is Invalid", Toast.LENGTH_LONG).show();

        }

    }//end of calculate


    //custom textWatcher
    public class TextChangeHandler implements TextWatcher {
        @Override
        public void afterTextChanged(Editable s) {
            calculate(); // calculate the tip and final amount

        }// end after

        @Override
        public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

        }//end before

        @Override
        public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

        }//end onTextChanged
    }//end textChangeHandler

}// end of MainActivity