package com.example.evalspringfouille;

import com.example.evalspringfouille.repositories.ObjetRepositorie;
import com.example.evalspringfouille.repositories.ParcelleRepositorie;
import com.example.evalspringfouille.services.ObjetService;
import com.example.evalspringfouille.services.ObjetServiceImp;
import com.example.evalspringfouille.services.ParcelleService;
import com.example.evalspringfouille.services.ParcelleServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ObjetService objetService(ObjetRepositorie objetRepositorie) {
        return new ObjetServiceImp(objetRepositorie);
    }
    @Bean
    public ParcelleService parcelleService(ParcelleRepositorie parcelleRepositorie) {
        return new ParcelleServiceImp(parcelleRepositorie);
    }
}
