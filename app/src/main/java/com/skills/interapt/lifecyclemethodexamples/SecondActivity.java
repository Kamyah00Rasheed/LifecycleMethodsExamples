package com.skills.interapt.lifecyclemethodexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button finishButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        finishButton = findViewById(R.id.finish_button);
        setListener();
    }

    private void setListener() {
        //Sets listener for finishButton only
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This will close thise activity and take us back to the MainActivity.
                finish();

            }
        });
    }


}
