package com.example.exam.dao;

import com.example.exam.model.Ville;

import java.util.ArrayList;
import java.util.List;

public class MemoryVilleDao  implements  VilleDao{
    private List<Ville> villes;


    public MemoryVilleDao() {
        villes = new ArrayList<>();
        villes.add(new Ville("Rabat",2,4,8,15));
        villes.add(new Ville("Casa",2.5,4.5,9,15));
        villes.add(new Ville("Fes",3,4.5,8,15));
        villes.add(new Ville("Autre",1,3,7,12));
    }

     @Override
    public List<Ville> getVilles() {
        return villes;
    }

    @Override
    public Ville addVille(Ville ville) {
        for (Ville v:villes)
            if(ville.getNom().equals(v.getNom()))
                return null;

        villes.add(ville);
        return ville;
    }

    @Override
    public Ville updateVille(Ville ville) {
        for (Ville v:villes)
            if(ville.getNom().equals(v.getNom())) {
                v = ville;
                return ville;
            }
        return null;
    }

    @Override
    public boolean deleteVille(String nom) {
        for (Ville v:villes)
            if(nom.equals(v.getNom())) {
                villes.remove(v);
                return true;
            }
        return false;
    }

    @Override
    public Ville getVille(String nom) {
        for (Ville v:villes)
            if(nom.equals(v.getNom())) {
                return v;
            }
        return null;
    }
}
