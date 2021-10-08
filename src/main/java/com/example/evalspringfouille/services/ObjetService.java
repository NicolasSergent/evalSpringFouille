package com.example.evalspringfouille.services;

import com.example.evalspringfouille.models.Objet;

import java.util.List;
// cette interface me permet d'injecter mes fonctions depuis ObjetService
public interface ObjetService {
    void deleteById(Integer numero);
    Objet findById(Integer numero);
    public Objet update(Objet objet);
    public Objet change( Integer numero, String designation, String categorie, String completude, String conservation, String dateDecouverte);
    Objet save(Objet objet);
    List<Objet> findAll();
}

