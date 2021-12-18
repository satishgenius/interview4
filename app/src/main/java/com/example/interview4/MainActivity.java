package com.example.interview4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b,c;
    TextView b1,c1;
    Button b2,c2;
    Button a1;
    TextView a2;
    String s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.editTextTextPersonName1);
        a2 = findViewById(R.id.textView1);
        a1  =findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b=findViewById(R.id.editTextTextPersonName2);
        b1= findViewById(R.id.textView2);
        c1 =findViewById(R.id.textView3);
        c2 = findViewById(R.id.button3);
        c =findViewById(R.id.editTextTextPersonName3);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3 =c.getText().toString();
                c1.setText(s3);
                Toast.makeText(MainActivity.this, "2 is displayed", Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 =b.getText().toString();
                b1.setText(s2);
                Toast.makeText(MainActivity.this, "2 is displayed", Toast.LENGTH_SHORT).show();

            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 =a.getText().toString();
                a2.setText(s1);
                Toast.makeText(MainActivity.this, "1 is displayed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}