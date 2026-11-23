package com.ism.Repository.Memory;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;

import com.ism.Domain.Etudiant;

public class DataBaseMemory {
    public ArrayList<Etudiant> etudiants = new ArrayList<>();
    

    //singleton 
    private DataBaseMemory(){

    }

    private static  DataBaseMemory instance = null;

    public DataBaseMemory getInstance(){
        if(instance == null){
            instance = new DataBaseMemory();
        }
        return instance;
    }
}
