package com.ism.Repository.Memory;

import java.util.ArrayList;

import com.ism.Domain.Etudiant;
import com.ism.Repository.IEtudiantRepository;

public class EtudiantRepository implements IEtudiantRepository {

    //1 . declare un attribut de la classe qu'on veut injecter
    private DataBaseMemory db;
    //2.    on inject dans le constructeur comme on a l'habitude de le faire avec la surcharge 
    public EtudiantRepository(DataBaseMemory db){
        this.db = db;
    }

    @Override
    public boolean insert(Etudiant etudiant) {
       this.db.etudiants.add(etudiant);
       return  true;
    }

    @Override
    public ArrayList<Etudiant> findAll() {
       return new ArrayList<>(this.db.etudiants);
    }
    
}
