package com.example.odyssey.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.odyssey.R;

public class InstructionScreen extends AppCompatActivity {
    private ImageButton start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction_screen);
        start = findViewById(R.id.instructionButton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InstructionScreen.this, ConfigScreen.class);
                startActivity(intent);
            }
        });
    }

}