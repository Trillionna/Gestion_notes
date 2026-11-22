package com.ism.Domain;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Etudiant {
    private String matricule;
    private String nomComplet;
    private LocalDate dateNaissance;
    private ArrayList<Note> notes;
}
