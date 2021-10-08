package com.example.evalspringfouille.repositories;

import com.example.evalspringfouille.models.Parcelle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelleRepositorie extends JpaRepository<Parcelle,Integer> {
}
