package com.example.approjet2.metier;

public class Pays {
    String ville;
    int points;


    public Pays(String ville, int points) {
        this.ville = ville;
        this.points = points;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
