package com.example.approjet2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.approjet2.DAO.GestionBD;
import com.example.approjet2.metier.Pays;
import com.example.approjet2.support.PaysAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PaysActivity extends AppCompatActivity {
    List<Pays> lesPays = new ArrayList<Pays>();
    GestionBD bd = new GestionBD(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pays_view);
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager layoutManager;
      /*  Pays pays1 = new Pays("France",4,1,1,1 );
        Pays pays2 = new Pays("USA",15,3,0,1 );
        Pays pays3 = new Pays("Luxembourg",4,2,1,0 );
        lesPays.add(pays1);
        lesPays.add(pays2);
        lesPays.add(pays3);*/
      //  Log.i("List","Affichage du tableau : "+lesPays);
        bd.open();

        lancerDonnee();
        adapter = new PaysAdapter(lesPays);
        recyclerView = findViewById(R.id.listPays);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);






    }

    private void lancerDonnee() {
        if (bd.testBase1() == 0){
            String fichier = lecteurJSON();
            insertPays(fichier);
        }
        else{
            lesPays = bd.tablePays();
        }
    }

    private void insertPays(String fichier) {
        Pays unPays = null;
        String lePays;
               int lesPoints, laVictoire, leNul, laDefaite;
        JSONArray tableJSONPays = null;
        JSONObject elementPays, objJSON;
        if (fichier!=null){
            try {
                objJSON = new JSONObject(fichier);
                tableJSONPays = objJSON.getJSONArray("pays");
                for (int i=0 ;i<tableJSONPays.length();i++){
                    elementPays = (JSONObject) tableJSONPays.get(i);
                    lePays = elementPays.getString("pays");
                    lesPoints = elementPays.getInt("points");
                    laVictoire = elementPays.getInt("victoire");
                    leNul = elementPays.getInt("nul");
                    laDefaite = elementPays.getInt("victoire");
                    unPays = new Pays(lePays,lesPoints,laVictoire,leNul,laDefaite);
                    lesPays.add(unPays);
                    bd.ajoutePays(unPays);
                }
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private String lecteurJSON() {
        StringBuilder builder = new StringBuilder();
        String ligne = null;
        BufferedReader lecteur = null;
        lecteur = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.lespays)));
        try {
            while((ligne=lecteur.readLine())!=null){
                builder.append(ligne).append("\n");
            }
            lecteur.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return builder.toString();
    }
}