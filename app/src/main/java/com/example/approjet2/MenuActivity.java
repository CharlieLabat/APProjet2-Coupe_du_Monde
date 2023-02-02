package com.example.approjet2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_view);
        TextView opPays = findViewById(R.id.idEquipe);
        TextView opResJour = findViewById(R.id.idResJour);
        opPays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laListPays = new Intent(view.getContext(),PaysActivity.class);
                startActivity(laListPays);
            }
        });
        opResJour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laResDuJour = new Intent(view.getContext(),ResultatActivity.class);
                Log.i("Lien", "Titre cliqué");
                startActivity(laResDuJour);
            }
        });

    }
}
