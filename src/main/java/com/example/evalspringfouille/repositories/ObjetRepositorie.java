package com.example.evalspringfouille.repositories;

import com.example.evalspringfouille.models.Objet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjetRepositorie extends JpaRepository<Objet,Integer> {
}
