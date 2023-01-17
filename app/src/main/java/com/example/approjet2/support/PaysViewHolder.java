package com.example.approjet2.support;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.approjet2.R;

public class PaysViewHolder extends RecyclerView.ViewHolder {
    private final TextView idPays;
    public PaysViewHolder(@NonNull View view) {
        super(view);
        idPays = view.findViewById(R.id.idPays);

    }
    public void remplirViewHolder(String leNomPays, int lesPoints, int laVictoire, int leNul, int laDefaite){
        idPays.setText(leNomPays);
        idPays.setText(lesPoints);
        idPays.setText(laVictoire);
        idPays.setText(leNul);
        idPays.setText(laDefaite);
    }
}
