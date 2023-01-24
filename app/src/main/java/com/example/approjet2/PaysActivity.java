package com.example.approjet2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.approjet2.metier.Pays;
import com.example.approjet2.support.PaysAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaysActivity extends AppCompatActivity {
    List<Pays> lesPays = new ArrayList<Pays>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pays_view);
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager layoutManager;
        Pays pays1 = new Pays("France",4,1,1,1 );
        Pays pays2 = new Pays("USA",15,3,0,1 );
        Pays pays3 = new Pays("Luxembourg",4,2,1,0 );
        lesPays.add(pays1);
        lesPays.add(pays2);
        lesPays.add(pays3);
      //  Log.i("List","Affichage du tableau : "+lesPays);
        adapter = new PaysAdapter(lesPays);
        recyclerView = findViewById(R.id.listPays);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);






    }
}