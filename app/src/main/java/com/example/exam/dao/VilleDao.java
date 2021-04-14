package com.example.exam.dao;

import com.example.exam.model.Ville;

import java.util.List;

public interface VilleDao {
    public Ville addVille(Ville ville);
    public Ville updateVille(Ville ville);
    public boolean deleteVille(String nom);
    public Ville getVille(String nom);
    public List<Ville> getVilles();
}
