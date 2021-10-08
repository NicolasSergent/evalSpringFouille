package com.example.evalspringfouille.controllers;

import com.example.evalspringfouille.services.ObjetService;
import com.example.evalspringfouille.services.ParcelleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("parcelle")
public class ParcelleController {
    private ParcelleService parcelleService;

    public ParcelleController(ParcelleService parcelleService) {
        this.parcelleService = parcelleService;
    }
}
