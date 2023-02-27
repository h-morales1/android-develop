package z1959955.cs.niu.edu.portfolio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    RadioButton beefPattyRB, turkeyRB, veggieRB;
    CheckBox baconCB;
    RadioButton noCheeseRB, cheddarRB, mozzarellaRB;
    SeekBar specialSauceSB;
    Burger userBurger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userBurger = new Burger();
    }

    public void onClickPattyRB(View view) { // on click of first radiobutton group, which patty to use
        boolean checked = ((RadioButton) view).isChecked();

        // check which radio button from the group was checked
        switch(view.getId()) {
            case R.id.beefPattyRB:
                if(checked) {
                    // apply beef patty calories
                    userBurger.setBPattyBeef();
                }
                break;
            case R.id.turkeyPattyRB:
                if(checked) {
                    // apply turkey patty calories
                    userBurger.setBPattyTurkey();
                }
                break;
            case R.id.veggiePattyRB:
                if(checked) {
                    // apply veggie patty calories
                    userBurger.setBPattyVeggie();
                }
                break;
        }
    }

    public void onBaconCbx(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            //
        }
    }
}