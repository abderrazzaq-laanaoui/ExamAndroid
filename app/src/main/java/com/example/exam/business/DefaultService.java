package com.example.exam.business;

import com.example.exam.dao.MemoryVilleDao;
import com.example.exam.dao.VilleDao;
import com.example.exam.model.Ville;

import java.util.ArrayList;
import java.util.List;

public class DefaultService implements Services{
    VilleDao dao ;
    public DefaultService() {
        dao = new MemoryVilleDao();
    }

    @Override
    public int CalculerMontant(double quantity, Ville ville){
        double total = 0;
        double[] maxTranche =new double[]{6,12,20};
        while (quantity>0){
            total+=0;

        }

        return 0;
    }

    @Override
    public List<String> getVillesNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Ville v :dao.getVilles()){
            names.add(v.getNom());
        }
        return names;
    }

    @Override
    public Ville GetVilleByName(String name) {
        return dao.getVille(name);
    }
}
