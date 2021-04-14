package com.example.exam.business;

import com.example.exam.model.Ville;

import java.util.List;

public interface Services {
    public int CalculerMontant(double quantity, Ville ville);
    public List<String> getVillesNames();
    public Ville GetVilleByName(String name);
}
