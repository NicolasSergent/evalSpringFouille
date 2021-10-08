package com.example.evalspringfouille.services;

import com.example.evalspringfouille.repositories.ParcelleRepositorie;

public class ParcelleServiceImp implements ParcelleService {
    private ParcelleRepositorie parcelleRepositorie;

    public ParcelleServiceImp(ParcelleRepositorie parcelleRepositorie) {
        this.parcelleRepositorie=parcelleRepositorie;
    }
}
