package com.example.approjet2.support;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.approjet2.R;
import com.example.approjet2.metier.Pays;

import java.util.ArrayList;
import java.util.List;

public class PaysAdapter extends RecyclerView.Adapter {
    List<Pays> lesPays = new ArrayList<Pays>();

    public PaysAdapter(List<Pays> lesPays) {
        this.lesPays = lesPays;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.pays_section,parent,false);
        return new PaysViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
