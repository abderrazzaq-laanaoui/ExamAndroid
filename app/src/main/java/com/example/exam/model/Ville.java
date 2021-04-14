package com.example.exam.model;

public class Ville {
    private String nom;
    private double PrixT1;
    private double PrixT2;
    private double PrixT3;
    private double PrixT4;

    public Ville(String nom, double prixT1, double prixT2, double prixT3, double prixT4) {
        this.nom = nom;
        PrixT1 = prixT1;
        PrixT2 = prixT2;
        PrixT3 = prixT3;
        PrixT4 = prixT4;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixT1() {
        return PrixT1;
    }

    public void setPrixT1(double prixT1) {
        PrixT1 = prixT1;
    }

    public double getPrixT2() {
        return PrixT2;
    }

    public void setPrixT2(double prixT2) {
        PrixT2 = prixT2;
    }

    public double getPrixT3() {
        return PrixT3;
    }

    public void setPrixT3(double prixT3) {
        PrixT3 = prixT3;
    }

    public double getPrixT4() {
        return PrixT4;
    }

    public void setPrixT4(double prixT4) {
        PrixT4 = prixT4;
    }
}

