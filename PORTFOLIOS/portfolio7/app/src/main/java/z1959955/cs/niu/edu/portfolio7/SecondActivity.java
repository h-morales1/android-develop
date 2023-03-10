package z1959955.cs.niu.edu.portfolio7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Portfolio #7
    Due Date: 03/10/23
 */

public class SecondActivity extends AppCompatActivity {

    static final String MA_TAG = "APPLE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        String create_str = getString(R.string.create_msg);

        Toast.makeText(this, create_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, create_str);

    }


    @Override
    protected void onStart() { //overriding onStart()
        super.onStart();

        String start_str = getString(R.string.start_msg2);

        Toast.makeText(this, start_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, start_str);
    } // end onStart

    @Override
    protected void onResume() { //overriding onResume()
        super.onResume();
        String resume_str = getString(R.string.resume_msg2);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    } // end onResume


    @Override
    protected void onPause() { //overriding onPause()
        super.onPause();
        String resume_str = getString(R.string.pause_msg2);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }


    @Override
    protected void onStop() { //overriding onStop()
        super.onStop();

        String resume_str = getString(R.string.stop_msg2);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }


    @Override
    protected void onRestart() { // overriding onRestart()
        super.onRestart();
        String resume_str = getString(R.string.restart_msg2);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }

    @Override
    protected void onDestroy() { // overriding onDestroy()
        super.onDestroy();
        String resume_str = getString(R.string.destroy_msg2);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }

    public void goBack(View view) {
        finish(); // go back to mainActivity
    }

}