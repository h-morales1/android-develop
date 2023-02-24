package z1959955.cs.niu.edu.port4;

/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Portfolio #4 part 2
    Due Date: 02/24/23
 */
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayTV = findViewById(R.id.displayTextView);
    }

    //activity result launcher
    ActivityResultLauncher<Intent> activityLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            // do something with the resulting name
            if(result.getResultCode() == Activity.RESULT_OK) {
                // operation was successful
                Intent nameData = result.getData();
                // do something with the resulting name
                String resultingName = nameData.getStringExtra("resultName"); // retrieve name
                displayTV.setText(resultingName); // set name in display text view
            }
        }
    });

    public void getName(View view) {
        // go to another activity, expecting a name as a result

        // create intent to go to NameActivity to get a name
        Intent nameIntent = new Intent(MainActivity.this, NameActivity.class);

        //start activity for a result
        //startActivityForResult(nameIntent,2);
        activityLauncher.launch(nameIntent);
    }
}