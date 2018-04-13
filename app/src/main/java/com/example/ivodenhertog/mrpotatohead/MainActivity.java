// MainActivity.java
//
// Ivo den Hertog
//
// This file handles the logic of displaying to correct view.

package com.example.ivodenhertog.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        // Get name of checkbox.
        String checkName = checkbox.getText().toString();
        // Use name of checkbox to find the correct image id.
        int imageId = getResources().getIdentifier(checkName, "id", getPackageName());
        // Use imageId to change visibility of the ImageView based on checkbox state.
        ImageView image = findViewById(imageId);
        if (checkbox.isChecked()){
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
