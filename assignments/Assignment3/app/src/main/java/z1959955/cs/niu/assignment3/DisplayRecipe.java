package z1959955.cs.niu.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Assignment 3
    Due Date: 03/10/23
 */
public class DisplayRecipe extends AppCompatActivity {

    int spinnerPOS; // spinner selection passed from mainactivity

    TextView recipeTextTV, recipeTitleTV; // scroll view holding recipe text


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_recipe);

        Intent currentIntent = getIntent();
        spinnerPOS = currentIntent.getIntExtra("recipe",1);

        recipeTitleTV = findViewById(R.id.recipeTitleTV);

        recipeTextTV = findViewById(R.id.recipeTV); // text in scrollview displaying recipe
        setProperRecipe(spinnerPOS); // show proper recipe in textview
    }

    public void goBack(View view) { // go back to main activity on button click
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
    }

    public void setProperRecipe(int pos) { // set the proper text in text view depending on spinner selection
        switch (pos) {
            case 0: recipeTextTV.setText(R.string.appletart_recipe); recipeTitleTV.setText(R.string.apple_tart_title); break; // set proper title for each recipe
            case 1: recipeTextTV.setText(R.string.kaiserschmarrn_recipe); recipeTitleTV.setText(R.string.kaiserschmarrn_title); break;
            case 2: recipeTextTV.setText(R.string.keylimepie_recipe); recipeTitleTV.setText(R.string.keylimepie_title); break;
            case 3: recipeTextTV.setText(R.string.lemonbar_recipe); recipeTitleTV.setText(R.string.lemon_bars_title); break;
            case 4: recipeTextTV.setText(R.string.lemoniceboxpie_recipe); recipeTitleTV.setText(R.string.lemoniceboxpie_title); break;
        }
    }
}