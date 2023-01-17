package com.example.approjet2.metier;

public class Pays {
    String pays; // Ville de l'équipe
    int points; // Nombre de points d'un match
    int victoire; // Nombre de victoire
    int nul;  // Nombre de victoire
    int defaite;  // Nombre de victoire


    public Pays(String pays, int points, int victoire, int nul, int defaite) {
        this.pays = pays;
        this.points = points;
        this.victoire = victoire;
        this.nul = nul;
        this.defaite = defaite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getVictoire() {
        return victoire;
    }

    public void setVictoire(int victoire) {
        this.victoire = victoire;
    }

    public int getNul() {
        return nul;
    }

    public void setNul(int nul) {
        this.nul = nul;
    }

    public int getDefaite() {
        return defaite;
    }

    public void setDefaite(int defaite) {
        this.defaite = defaite;
    }
}
