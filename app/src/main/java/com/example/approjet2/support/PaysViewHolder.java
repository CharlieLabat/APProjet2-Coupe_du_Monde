package com.example.approjet2.support;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.approjet2.R;
import com.example.approjet2.metier.Pays;

public class PaysViewHolder extends RecyclerView.ViewHolder {
    private final TextView idPays;
    private final TextView idPoints;
    private final TextView idVictoire;
    private final TextView idNul;
    private final TextView idDefaite;

    public PaysViewHolder(@NonNull View view) {
        super(view);
        idPays = view.findViewById(R.id.idPays);
        idPoints = view.findViewById(R.id.idPoints);
        idVictoire = view.findViewById(R.id.idVictoire);
        idNul = view.findViewById(R.id.idNul);
        idDefaite = view.findViewById(R.id.idDefaite);

    }
    public void remplirViewHolder(Pays lePays, int position ){
        String unPays = (position+1)+"  "+lePays.getPays();
        String desPoints = Integer.toString(lePays.getPoints()) ;
        String uneVictoire = Integer.toString(lePays.getVictoire());
        String unNul = Integer.toString( lePays.getNul());
        String uneDefaite = Integer.toString(lePays.getDefaite()) ;
        //Log.i("ViewHolder","Postion du clic : "+position);
        idPays.setText(unPays);
        idPoints.setText(desPoints);
        idVictoire.setText(uneVictoire);
        idNul.setText(unNul);
        idDefaite.setText(uneDefaite);
    }
}
