package com.example.approjet2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.approjet2.DAO.GestionBD;
import com.example.approjet2.metier.Resultat;
import com.example.approjet2.support.ResultatAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResultatActivity extends AppCompatActivity {

    List<Resultat> lesResultats = new ArrayList<Resultat>();
    private TextView idJour;
    private TextView idDate;
    GestionBD bd = new GestionBD(this);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultat_view);
        idJour = findViewById(R.id.idJour);
        idDate = findViewById(R.id.idDate);

        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager layoutManager;
        Resultat res1 = new Resultat("FRA","USA",7,5,new Date());
        Resultat res2 = new Resultat("GER","ANG",2,5,new Date());
        Resultat res3 = new Resultat("ESP","POR",2,6,new Date());
        lesResultats.add(res1);
        lesResultats.add(res2);
        lesResultats.add(res3);
        String uneDate ="("+res1.getDate()+")" ;
        String uneJournee =": "+1;
        idDate.setText(uneDate);
        idJour.setText(uneJournee);

        adapter = new ResultatAdapter(lesResultats);
        recyclerView = findViewById(R.id.listRes);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



    }
}
