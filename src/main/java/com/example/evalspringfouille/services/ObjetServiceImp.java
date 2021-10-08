package com.example.evalspringfouille.services;

import com.example.evalspringfouille.models.Objet;
import com.example.evalspringfouille.repositories.ObjetRepositorie;


import java.util.List;

public class ObjetServiceImp implements ObjetService {
    private ObjetRepositorie objetRepositorie;

    public ObjetServiceImp(ObjetRepositorie objetRepositorie) {
        this.objetRepositorie=objetRepositorie;
    }

    public List<Objet> findAll() {
        return this.objetRepositorie.findAll();
    }
    public Objet save(Objet objet) {
        return this.objetRepositorie.save(objet);
    }

    public Objet findById(Integer numero) {
        return this.objetRepositorie.findById(numero).orElseThrow(null);
    }
    public Objet change( Integer numero, String designation, String categorie, String completude, String conservation, String dateDecouverte)
    {
        Objet objetModifier= this.findById(numero);
        if(designation!=null){
            objetModifier.setDesignation(designation);
        }
        if(categorie!=null){
            objetModifier.setCategorie(categorie);
        }
        if(completude!=null){
            objetModifier.setCompletude(completude);
        }
        if(conservation!=null){
            objetModifier.setConservation(conservation);
        }
        if(dateDecouverte!=null){
            objetModifier.setDateDecouverte(dateDecouverte);
        }
        return this.objetRepositorie.save(objetModifier);
    }
    public void deleteById(Integer numero) {
         this.objetRepositorie.deleteById(numero);
    }

    public Objet update(Objet objet){
        return  this.objetRepositorie.save(objet);
    }
}
