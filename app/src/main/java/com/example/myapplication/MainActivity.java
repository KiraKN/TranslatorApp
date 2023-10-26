package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText textIn;
    private TextView textOut;
    private Button button;

    private Map<String, String> fiRu;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textIn = findViewById(R.id.inputText);
        textOut = findViewById(R.id.outputText);
        button = findViewById(R.id.button);

        fiRu = new HashMap<>();
        dataInital();

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            text = textIn.getText().toString();
            textOut.setText(fiRu.get(text));
            if (fiRu.get(text) == null) {
                textOut.setText("В словаре такого слова не нашлось");
            }
        }
    };
    public void dataInital() {
        fiRu.put("minä", "я");
        fiRu.put("sinä", "ты");
        fiRu.put("nän", "он");
        fiRu.put("nän", "она");
        fiRu.put("me", "мы");
        fiRu.put("he", "они");
        fiRu.put("se", "оно");
    }
}