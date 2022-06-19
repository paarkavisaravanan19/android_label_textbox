package com.example.label_textbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e=findViewById(R.id.number);
        TextView t1=findViewById(R.id.text);
        Editable s =e.getText();
        Button b1=findViewById(R.id.even_checker);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText(s);
            }
        });

    }
}