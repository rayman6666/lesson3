package ru.mirea.komaristyi.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String time = intent.getStringExtra("time");

        textView.setText("Квадрат значения 12 составляет: " + (12 * 12) + ", а текущее время " + time);
    }
}