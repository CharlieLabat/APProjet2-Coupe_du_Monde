package com.example.approjet2.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.approjet2.metier.Pays;
import com.example.approjet2.metier.Resultat;

public class GestionBD {
    BDHelper bdHelper;
    SQLiteDatabase base;

    public GestionBD(Context context) {
        this.bdHelper = new BDHelper(context,"CDM",null,1);
    }
    public void open(){
        base = bdHelper.getWritableDatabase();
    }
    public void close(){
        base.close();
    }
    public void ajoutePays(Pays unPays){

        ContentValues contentValues = new ContentValues();

    }
    /*public void ajouteJoueur(Joueur unJoueur){
        ContentValues contentValues = new ContentValues();

    }*/
    public void ajouteResultat(Resultat unResultat){
        ContentValues contentValues = new ContentValues();

    }
 /*   public void ajoutsJournee(Journee uneJournee){
        ContentValues contentValues = new ContentValues();

    }*/
}
