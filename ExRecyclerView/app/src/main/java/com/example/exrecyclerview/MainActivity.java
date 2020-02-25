package com.example.exrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String [] array_noms = {"Pere", "Sara", "Teresa", "Jaume"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button llistarUsuaris = findViewById(R.id.btnLlistar);
        llistarUsuaris.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToLlistarUsuaris();
            }
        });

    }

    private void goToLlistarUsuaris(){
        Intent llistaUsuaris = new Intent (this, Llistar.class);
        llistaUsuaris.putExtra("array_noms", array_noms);

        startActivity(llistaUsuaris);
    }
}
