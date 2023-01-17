package com.example.approjet2.metier;

public class Pays {
    String ville; // Ville de l'équipe
    int points; // Nombre de points d'un match
    int victoire; // Nombre de victoire
    int nul;  // Nombre de victoire
    int defaite;  // Nombre de victoire


    public Pays(String ville, int points, int victoire, int nul, int defaite) {
        this.ville = ville;
        this.points = points;
        this.victoire = victoire;
        this.nul = nul;
        this.defaite = defaite;
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
