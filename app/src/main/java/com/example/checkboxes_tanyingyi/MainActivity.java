package com.example.checkboxes_tanyingyi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void selectItem(View view){
        boolean checked = ((CheckBox)view). isChecked();
            switch (view.getId()){
                case R.id.chocolate_check_box:

                if(checked)
                {selection.add("Chocolate syrup");}
                else{
                    selection.remove("Chocolate syrup");
                }
                break;
                case R.id.sprinkles_check_box:

                    if(checked)
                    {selection.add("Sprinkles");}
                    else{
                        selection.remove("Sprinkles");
                    }
                    break;
                case R.id.nuts_check_box:

                    if(checked)
                    {selection.add("Crushed nuts");}
                    else{
                        selection.remove("Crushed nuts");
                    }
                    break;
                case R.id.cherries_check_box:

                    if(checked)
                    {selection.add("Cherries");}
                    else{
                        selection.remove("Cherries");
                    }
                    break;
                case R.id.oreo_check_box:

                    if(checked)
                    {selection.add("Oreo cookie crumbles");}
                    else{
                        selection.remove("Oreo cookie crumbles");
                    }
                    break;

        }
    }

    public void showToast(View view){

            Toast toast = Toast.makeText(this, "Topping : " + selection.toString(),
                    Toast.LENGTH_SHORT);

            toast.show();


    }
}