package com.example.approjet2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.approjet2.metier.Resultat;
import com.example.approjet2.support.ResultatAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResultatActivity extends AppCompatActivity {

    List<Resultat> lesResultats = new ArrayList<Resultat>();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultat_view);
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager layoutManager;
        Resultat res1 = new Resultat(7,5,new Date());
        Resultat res2 = new Resultat(2,5,new Date());
        Resultat res3 = new Resultat(2,6,new Date());
        lesResultats.add(res1);
        lesResultats.add(res2);
        lesResultats.add(res3);
        adapter = new ResultatAdapter(lesResultats);
        recyclerView = findViewById(R.id.listRes);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



    }
}
