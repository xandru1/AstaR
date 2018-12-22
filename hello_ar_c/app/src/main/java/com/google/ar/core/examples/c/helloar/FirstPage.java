package com.google.ar.core.examples.c.helloar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(this::startHelloAR);
    }

    private void startHelloAR(View view) {
        startActivity(new Intent(this, HelloArActivity.class));
    }
}
