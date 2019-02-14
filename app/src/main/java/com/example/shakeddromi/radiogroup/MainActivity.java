package com.example.shakeddromi.radiogroup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup RG;
    RadioButton rb1,rb2,rb3;
    Button btn1,btn2;
    LinearLayout la1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RG=(RadioGroup) findViewById(R.id.RG);
        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        la1=(LinearLayout) findViewById(R.id.la1);
    }

    public void diff(View view) {
        if(rb1.isChecked()) {
            la1.setBackgroundColor(Color.MAGENTA);
        }
        if(rb2.isChecked()){
            la1.setBackgroundColor(Color.LTGRAY);
        }
        if(rb3.isChecked()){
            la1.setBackgroundColor(Color.CYAN);
        }
    }

    public void nor(View view) {
        la1.setBackgroundColor(Color.WHITE);
    }
}
