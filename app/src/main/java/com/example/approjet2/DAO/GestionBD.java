package com.example.approjet2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.approjet2.metier.Pays;
import com.example.approjet2.metier.Resultat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionBD {
    BDHelper bdHelper;
    SQLiteDatabase base;

    public GestionBD(Context context) {
        this.bdHelper = new BDHelper(context, "CDM", null, 1);
    }

    public void open() {
        base = bdHelper.getWritableDatabase();
    }

    public void close() {
        base.close();
    }


    public void ajoutePays(Pays unPays) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("pays", unPays.getPays());
        contentValues.put("points", unPays.getPoints());
        contentValues.put("victoire", unPays.getVictoire());
        contentValues.put("nul", unPays.getNul());
        contentValues.put("defaite", unPays.getDefaite());
        base.insert("pays", null, contentValues);

    }

    /*public void ajouteJoueur(Joueur unJoueur){
        ContentValues contentValues = new ContentValues();

    }*/
    public void ajouteResultat(Resultat unResultat) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("pays1", unResultat.getPays1());
        contentValues.put("pays2", unResultat.getPays2());
        contentValues.put("scoreEq1", unResultat.getScoreEq1());
        contentValues.put("scoreEq2", unResultat.getScoreEq2());
        contentValues.put("dateMatch", String.valueOf(unResultat.getDate()));
        base.insert("resultat", null, contentValues);

    }
 /*   public void ajouteJournee(Journee uneJournee){
        ContentValues contentValues = new ContentValues();

    }*/

    public int testBase1() {
        String req1 = "select count(*) as testPays from pays ";
        Cursor cursor1 = base.rawQuery(req1, null, null);
        cursor1.moveToFirst();

        return cursor1.getInt(0);


    }

    public int testBase2() {

        String req2 = "select count(*) as testRes from resultat ";
        Cursor cursor2 = base.rawQuery(req2, null, null);
        return cursor2.getInt(0);


    }

    public List<Pays> tablePays(){
        List<Pays> lesPays = new ArrayList<>();
        String req = "select * from pays order by pays";
        Cursor cursor = base.rawQuery(req,null,null);
        while (cursor.moveToNext()){
            String lePays = cursor.getString(0);
            int lesPoints = cursor.getInt(1);
            int laVictoire = cursor.getInt(2);
            int leNul = cursor.getInt(3);
            int laDefaite = cursor.getInt(4);
            Pays unPays = new Pays(lePays,lesPoints,laVictoire,leNul,laDefaite);
            lesPays.add(unPays);

        }
        return lesPays;



    }
    public List<Resultat> tableResultat(){


        List<Resultat> lesResultats = new ArrayList<>();
        String req = "select * from pays order by resultat";
        Cursor cursor = base.rawQuery(req,null,null);
        while (cursor.moveToNext()){
            String lePays1 = cursor.getString(0);

            int leScore1 = cursor.getInt(1);
            int leScore2 = cursor.getInt(2);
            String lePays2 = cursor.getString(3);
            String laDateSt = cursor.getString(4);
            Date laDate = new Date(laDateSt);
            Resultat unResultat = new Resultat(lePays1,lePays2,leScore1,leScore2,laDate);
            lesResultats.add(unResultat);

        }
        return lesResultats;


    }
    public void supprimPays(){
        base.delete("pays",null,null);
    }
    public void supprimRes(){
        base.delete("resultat",null,null);
    }
}
