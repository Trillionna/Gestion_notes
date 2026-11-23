package com.ism.Repository;

import java.util.ArrayList;

import com.ism.Domain.Etudiant;

public interface IEtudiantRepository {
    boolean insert(Etudiant etudiant);
    ArrayList<Etudiant> findAll();
}
