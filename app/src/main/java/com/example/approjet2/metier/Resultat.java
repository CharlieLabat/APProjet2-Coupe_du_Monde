package com.example.approjet2.metier;

import java.util.Date;

public class Resultat {
    int scoreEq1;
    int scoreEq2;
    Date date;

    public Resultat(int scoreEq1, int scoreEq2, Date date) {
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
}
