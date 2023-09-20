package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button middle_btn=findViewById(R.id.Middle_btn);
        //onclick

        super.findViewById(R.id.Left_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast=Toast.makeText(getApplicationContext(),"Hello Toast",Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

        middle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=findViewById(R.id.textView);
                Integer counter=Integer.parseInt(tv.getText().toString());
                counter++;
                tv.setText(counter.toString());
            }
        });

    }
}