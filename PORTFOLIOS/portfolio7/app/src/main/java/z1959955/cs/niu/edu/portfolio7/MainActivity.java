package z1959955.cs.niu.edu.portfolio7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String MA_TAG = "APPLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String create_str = getString(R.string.create_msg);

        Toast.makeText(this, create_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, create_str);

    } // end onCreate()


    @Override
    protected void onStart() {
        super.onStart();

        String start_str = getString(R.string.start_msg);

        Toast.makeText(this, start_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, start_str);
    } // end onStart

    @Override
    protected void onResume() {
        super.onResume();
        String resume_str = getString(R.string.resume_msg);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    } // end onResume


    @Override
    protected void onPause() {
        super.onPause();
        String resume_str = getString(R.string.pause_msg);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }


    @Override
    protected void onStop() {
        super.onStop();

        String resume_str = getString(R.string.stop_msg);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        String resume_str = getString(R.string.restart_msg);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String resume_str = getString(R.string.destroy_msg);

        Toast.makeText(this, resume_str, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, resume_str);
    }

    public void doSecond(View view) {
        //
        Intent secondActIntent = new Intent(this, SecondActivity.class);
        startActivity(secondActIntent);
    }

} // end MainActivity class