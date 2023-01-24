package com.example.approjet2.support;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.approjet2.R;
import com.example.approjet2.metier.Pays;
import com.example.approjet2.metier.Resultat;

import java.util.ArrayList;
import java.util.List;

public class ResultatAdapter extends RecyclerView.Adapter {


    List<Resultat> lesResultats = new ArrayList<Resultat>();

    public ResultatAdapter(List<Resultat> lesResultats) {
        this.lesResultats = lesResultats;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());;
        View view = inflater.inflate(R.layout.resultat_section,parent,false);
        return new ResultatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Resultat leResultat = lesResultats.get(position);
        ((ResultatViewHolder) holder).remplirViewHolder(leResultat,position);
    }

    @Override
    public int getItemCount() {
        if (lesResultats != null){
            return lesResultats.size();
        }
        else {
            return 0;
        }
    }
}
