package com.iset.service_offreEmploi.controllers;

import com.iset.service_offreEmploi.dao.OffreRepository;
import com.iset.service_offreEmploi.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Offres")
public class RestOffres {
    @Autowired
    OffreRepository offreRepository;
    @GetMapping
    public List<Offre> getAll() {
        return offreRepository.findAll();
    }
    @GetMapping("/{uid}")
    public Offre getbyid(@PathVariable Long uid ) {
        return offreRepository.findById(uid).get();
    }

    @PostMapping
    public Offre saveoffre(@RequestBody Offre newoffre) {
        return offreRepository.save(newoffre);
    }

    @DeleteMapping("/{id}")
    public String deleteoffre(@PathVariable Long id) {
        offreRepository.deleteById(id);
        return "Offre supprimée";
    }
}
