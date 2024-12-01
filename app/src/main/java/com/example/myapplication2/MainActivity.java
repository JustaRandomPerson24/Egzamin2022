package com.example.myapplication2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int likeCount = 0;
    private TextView likeCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeCounter = findViewById(R.id.likeCounter);
        Button buttonLike = findViewById(R.id.buttonLike);
        Button buttonRemove = findViewById(R.id.buttonRemove);
        Button buttonSave = findViewById(R.id.buttonSave);

        buttonLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++;
                updateLikeCounter();
            }
        });

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likeCount > 0) {
                    likeCount--;
                    updateLikeCounter();
                }
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Dane zostały zapisane!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateLikeCounter() {
        likeCounter.setText(likeCount + " polubień");
    }
}
