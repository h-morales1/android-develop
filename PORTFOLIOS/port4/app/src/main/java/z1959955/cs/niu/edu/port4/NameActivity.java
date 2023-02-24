package z1959955.cs.niu.edu.port4;
/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Portfolio #4 part 2
    Due Date: 02/24/23
 */
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {
    EditText nameET; // hold name entered by user

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        nameET = findViewById(R.id.nameEditText);
    }

    public void returnName(View view) {
        // pass the name entered back to MainActivity when button pressed

        Intent nameResultIntent = new Intent(); // intent to place data into

        nameResultIntent.putExtra("resultName",nameET.getText().toString()); // get data from EditText
        setResult(Activity.RESULT_OK, nameResultIntent); // place data into intent
        finish();
    }
}