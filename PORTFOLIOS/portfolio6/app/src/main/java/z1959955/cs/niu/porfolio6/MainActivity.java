package z1959955.cs.niu.porfolio6;
/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Portfolio #6
    Due Date: 03/03/23
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView characterImgV; // image view for character
    TextView characterNameTV, characterQuoteTV;

    CharacterInfo characters; // use to get quotes and names for characters

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterImgV = findViewById(R.id.characterImageView);

        characterNameTV = findViewById(R.id.nameTextView); // character name textview
        characterQuoteTV = findViewById(R.id.quoteTextView); // character quote textview
        characters = new CharacterInfo(); // holds character quotes
    }

    public void revealCharacter(View view) {
        // show information for each respective character on button click
        switch (view.getId()) { // check id of the button pressed
            case R.id.character1button:
                // set info according to button pressed
                characterImgV.setImageResource(characters.image_id[0]);
                characterNameTV.setText(characters.character_name[0]);
                characterQuoteTV.setText(characters.character_quote[0]);
                break;
            case R.id.character2button:
                characterImgV.setImageResource(characters.image_id[1]);
                characterNameTV.setText(characters.character_name[1]);
                characterQuoteTV.setText(characters.character_quote[1]);
                break;
            case R.id.character3button:
                characterImgV.setImageResource(characters.image_id[2]);
                characterNameTV.setText(characters.character_name[2]);
                characterQuoteTV.setText(characters.character_quote[2]);
                break;
            case R.id.character4button:
                characterImgV.setImageResource(characters.image_id[3]);
                characterNameTV.setText(characters.character_name[3]);
                characterQuoteTV.setText(characters.character_quote[3]);
                break;
            case R.id.character5button:
                characterImgV.setImageResource(characters.image_id[4]);
                characterNameTV.setText(characters.character_name[4]);
                characterQuoteTV.setText(characters.character_quote[4]);
                break;
            case R.id.character6button:
                characterImgV.setImageResource(characters.image_id[5]);
                characterNameTV.setText(characters.character_name[5]);
                characterQuoteTV.setText(characters.character_quote[5]);
                break;
        } // end of switch statement

        characterImgV.setVisibility(View.VISIBLE); // set image view visibility
        characterNameTV.setVisibility(View.VISIBLE); // set name TV visibility
        characterQuoteTV.setVisibility(View.VISIBLE); // set quote visibility
    } // end of revealCharacter()
} // end of MainActivity class
