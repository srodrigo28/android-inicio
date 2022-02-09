package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnSegundaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSegundaActivity = findViewById(R.id.btn_segunda_activity);

        /*** navegando entre telas
        btnSegundaActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SegundaActivity.class));
        });
         */


    }
}