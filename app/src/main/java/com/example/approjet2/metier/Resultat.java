package com.example.approjet2.metier;

import java.util.Date;

public class Resultat {
    String pays1;
    String pays2;
    int scoreEq1;
    int scoreEq2;
    Date date;

    public Resultat(String pays1, String pays2, int scoreEq1, int scoreEq2, Date date) {
        this.pays1 = pays1;
        this.pays2 = pays2;
        this.scoreEq1 = scoreEq1;
        this.scoreEq2 = scoreEq2;
        this.date = date;
    }

    public int getScoreEq1() {
        return scoreEq1;
    }

    public void setScoreEq1(int scoreEq1) {
        this.scoreEq1 = scoreEq1;
    }

    public int getScoreEq2() {
        return scoreEq2;
    }

    public void setScoreEq2(int scoreEq2) {
        this.scoreEq2 = scoreEq2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPays1() {
        return pays1;
    }

    public void setPays1(String pays1) {
        this.pays1 = pays1;
    }

    public String getPays2() {
        return pays2;
    }

    public void setPays2(String pays2) {
        this.pays2 = pays2;
    }
}
