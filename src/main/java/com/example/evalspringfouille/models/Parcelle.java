package com.example.evalspringfouille.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Parcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;
    @Column(name = "longueur")
    private int longueur;
    @Column(name = "largeur")
    private int largeur;

    @ManyToOne
    @JoinColumn(name = "objet_numero",nullable = false)
    private Objet objet;
}
