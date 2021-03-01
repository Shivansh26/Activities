package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtB;
    private Button btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtB = findViewById(R.id.txtB);
        btnB = findViewById(R.id.btnB);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityC();
            }
        });

    }

    public void startActivityC(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
}