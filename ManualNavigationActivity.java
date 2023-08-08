package com.example.splashsplash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ManualNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        Button navigateButton = findViewById(R.id.btnNavigate);

        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextActivity();
            }
        });
    }

    private void openNextActivity() {
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
        finish();
    }
}
