package com.tsi.amirzan.project.controller;

import com.tsi.amirzan.project.entity.FilmActor;
import com.tsi.amirzan.project.service.FilmActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class FilmActorController {

    @Autowired
    private FilmActorService filmActorService;


    public FilmActorController(FilmActorService filmActorService) {

        this.filmActorService = filmActorService;
    }


    @GetMapping("/film_actor")
    public List<FilmActor> findAll() {
        return filmActorService.findAll();
    }
}
