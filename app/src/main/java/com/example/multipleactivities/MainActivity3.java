package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView txtC;
    private Button btnC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtC = findViewById(R.id.txtC);
        btnC = findViewById(R.id.btnC);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityA();
            }
        });
    }
    public void startActivityA(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    //@Override
//    protected void onPause() {
//        super.onPause();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
}