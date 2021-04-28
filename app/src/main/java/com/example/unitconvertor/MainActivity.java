package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView2;
    private EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hi,event listener is working", Toast.LENGTH_SHORT).show();
               String s =  editTextTextPersonName.getText().toString();
               int kg = Integer.parseInt(s);
               double pound = kg * 2.205;
               textView2.setText("The corresponding value of pounds is " + pound);

            }
        });
    }
}