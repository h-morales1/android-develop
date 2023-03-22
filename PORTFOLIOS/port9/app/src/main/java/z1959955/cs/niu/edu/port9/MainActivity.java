package z1959955.cs.niu.edu.port9;

import static android.media.session.PlaybackState.ACTION_PLAY;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ukButton, drumButton;
    MediaPlayer mplayer; // handle playing sounds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ukButton = findViewById(R.id.ukBTN); // uke button
        drumButton = findViewById(R.id.drumBTN); // drum button

        ukButton.setText(R.string.ukulele_play_string); // set proper strings at start of app
        drumButton.setText(R.string.drums_play_string);
    }

    public void playUke(View view) {
        // handle play / pause for the uke

        //check if media player is playing
        if(mplayer.isPlaying()) {
            //if playing
            mplayer.pause();// pause player if it is playing
            //change button label to play
            ukButton.setText(R.string.ukulele_play_string);

        } else {
            // play sound since it is not already playing
            mplayer = MediaPlayer.create(this, R.raw.ukulele);
            mplayer.start();// start playing
            // change button label to pause
            ukButton.setText(R.string.ukulele_pause_string);
        }
    }

    public void playDrum(View view) {
        // handle play / pause for the drums

        //check if media player is playing
        if(mplayer.isPlaying()) {
            //if playing
            mplayer.pause();// pause player if it is playing
            // change drum button label to play
            drumButton.setText(R.string.drums_play_string);
        } else {
            // play sound since it is not already playing
            mplayer = MediaPlayer.create(this, R.raw.drums);
            mplayer.start();// start playing
            // change drum button label to pause
            drumButton.setText(R.string.drums_pause_string);
        }
    }
}