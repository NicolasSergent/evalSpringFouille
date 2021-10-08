package com.example.evalspringfouille.controllers;

import com.example.evalspringfouille.models.Objet;
import com.example.evalspringfouille.services.ObjetService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("fouille")
public class ObjetController {
    private ObjetService objetService;

    public ObjetController(ObjetService objetService) {
        this.objetService = objetService;
    }

    // me permet d'afficher tous les objets de ma liste
    @GetMapping
    public List<Objet> findAll(){
        return this.objetService.findAll();
    }

    // me permet de creer un objet un put dans ma base
    @PostMapping
    public Objet save(@RequestBody Objet objet){
        return this.objetService.save(objet);
    }

    // me permet d'afficher un objet par son numero via un get dans ma base
    @GetMapping("{numero}")
    public Objet findById(@PathVariable Integer numero){
        return this.objetService.findById(numero);}
    //me permet de delete un objet par son id via un put dans ma base
    @PutMapping("{numero}")
    public void deleteById(Integer numero) {
        this.objetService.deleteById(numero);
    }
    //me permet de changer une valeur dans mon objet
    @PatchMapping
    public Objet change(Objet objet)
    {
        return this.objetService.save(objet);
    }
}
