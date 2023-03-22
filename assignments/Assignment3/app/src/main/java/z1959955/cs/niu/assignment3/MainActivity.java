package z1959955.cs.niu.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Assignment 3
    Due Date: 03/10/23
 */
public class MainActivity extends AppCompatActivity {

    Spinner recipesSPN; // spinner to hold all recipes

    ArrayAdapter<CharSequence> recipesAdapter; // adapter to hold recipes from strings.xml

    ImageView recipeImage; // image view for recipe drawable

    Recipes recipes;

    int chosenRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipesSPN = findViewById(R.id.recipeSPN); // spinner for recipes

        recipesAdapter = ArrayAdapter.createFromResource(this, R.array.recipe_names, android.R.layout.simple_spinner_item); // fill recipesAdapter with strings from strings.xml
        recipesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        recipesSPN.setAdapter(recipesAdapter);

        recipeImage = findViewById(R.id.recipeIMV);

        recipesSPN.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                // an item was selected
                setRecipeImage(pos); // set the recipe thumbnail
                chosenRecipe = pos; // save selection position to use to display the recipe

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // nothing was selected
            }
        });

    }

    public void displayRecipe(View view) {
        // onClick display the proper recipe chosen from the spinner
        Intent recipeIntent = new Intent(MainActivity.this, DisplayRecipe.class);
        switch (chosenRecipe) { // send selection from spinner to display proper recipe
            case 0: recipeIntent.putExtra("recipe",0); break;
            case 1: recipeIntent.putExtra("recipe",1); break;
            case 2: recipeIntent.putExtra("recipe",2); break;
            case 3: recipeIntent.putExtra("recipe",3); break;
            case 4: recipeIntent.putExtra("recipe",4); break;
        }
        startActivity(recipeIntent);
    }

    public void setRecipeImage(int pos) {
        switch (pos) { // set selection from spinner to display proper recipe
            case 0: recipeImage.setImageResource(recipes.image_id[0]); ; break;
            case 1: recipeImage.setImageResource(recipes.image_id[1]); break;
            case 2: recipeImage.setImageResource(recipes.image_id[2]); break;
            case 3: recipeImage.setImageResource(recipes.image_id[3]); break;
            case 4: recipeImage.setImageResource(recipes.image_id[4]); break;
        }
    }

}
