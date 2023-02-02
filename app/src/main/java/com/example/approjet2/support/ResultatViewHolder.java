package com.example.approjet2.support;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.approjet2.R;
import com.example.approjet2.metier.Resultat;

public class ResultatViewHolder extends RecyclerView.ViewHolder {
    private final TextView idPays1;
    private final TextView idPays2;
    private final TextView idPaysScore1;
    private final TextView idPaysScore2;



    public ResultatViewHolder(@NonNull View view) {
        super(view);
        idPays1 = view.findViewById(R.id.idPays1);
        idPays2 = view.findViewById(R.id.idPays2);
        idPaysScore1 = view.findViewById(R.id.idPaysScore1);
        idPaysScore2 = view.findViewById(R.id.idPaysScore2);

    }

    public void remplirViewHolder(Resultat leResultat, int position) {
        String unPays1 = "FRA";
        String unPays2 = "USA";
        String unScore1 = " "+leResultat.getScoreEq1();
        String unScore2 = leResultat.getScoreEq2()+" ";

        idPays1.setText(unPays1);
        idPays2.setText(unPays2);
        idPaysScore1.setText(unScore1);
        idPaysScore2.setText(unScore2);

    }
}
