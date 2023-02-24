package com.example.seconddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHight = findViewById(R.id.hight);
        Button button = findViewById(R.id.btnSubmit);
        TextView textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float hight = Float.parseFloat(String.valueOf(editTextHight.getText()))  / 100;
                float weight = Float.parseFloat(String.valueOf(editTextWeight.getText()));
                float bmi =weight/(hight * hight);
                textView.setText(String.valueOf(bmi));
            }
        });

    }
}