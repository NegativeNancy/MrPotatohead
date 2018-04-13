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
        String checkName = checkbox.getText().toString();
        int imageId = getResources().getIdentifier(checkName, "id", getPackageName());
        if (checkbox.isChecked()){
            ImageView image = findViewById(imageId);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
        }
        else {
            ImageView image = findViewById(imageId);
            image.setVisibility(View.INVISIBLE);
        }
    }
}
