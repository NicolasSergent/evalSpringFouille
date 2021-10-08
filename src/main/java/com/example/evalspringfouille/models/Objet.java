package com.example.evalspringfouille.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Objet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;
    @Column(name = "designation")
    private String designation;
    @Column(name = "categorie")
    private String categorie;
    @Column(name = "completude")
    private String completude;
    @Column(name = "conservation")
    private String conservation;
    @Column(name = "date_decouverte")
    private String dateDecouverte;

    //Pas eu le temps de finir
    // @OneToOne()
    //@JoinColumn(name = "numero_objet",referencedColumnName = "numero")
    //private Parcelle parcelle;
}


