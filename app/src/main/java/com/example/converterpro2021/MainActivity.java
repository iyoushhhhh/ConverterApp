package com.example.converterpro2021;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private TextView textView2;
    private EditText editTextTextPersonName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();

                String x = editTextTextPersonName.getText().toString();
                int kg = Integer.parseInt(x);
                double pound = 2.285*kg;
                textView2.setText(pound +" lbs");

                //To clear out the field 
                editTextTextPersonName.getText().clear();




            }
        });


    }
}