package com.tsi.amirzan.project.controller;
import java.util.List;

import com.tsi.amirzan.project.entity.Film;
import com.tsi.amirzan.project.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/film")
    public List<Film> findAll() {
        return filmService.findAll();
    }

    @GetMapping("/film/{film_id}")
    public Film findById(@PathVariable int film_id) {
        return filmService.findById(film_id);
    }

    @DeleteMapping("/film/{film_id}")
    public String deleteById(@PathVariable int film_id) {
        return filmService.deleteById(film_id) + " Film(s) delete from the database";
    }

    @PostMapping("/film")
    public String save(@RequestBody Film film) {
        return filmService.save(film) + " Film(s) saved successfully";
    }

    @PutMapping("/film/{film_id}")
    public String update(@RequestBody Film film, @PathVariable int film_id) {
        return filmService.update(film, film_id) + " Film(s) updated successfully";
    }
}