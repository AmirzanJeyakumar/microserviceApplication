package com.tsi.amirzan.project.controller;

import com.tsi.amirzan.project.entity.FilmCategory;
import com.tsi.amirzan.project.service.FilmCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public class FilmCategoryController {

    @Autowired
    private FilmCategoryService filmCategoryService;


    public FilmCategoryController(FilmCategoryService filmCategoryService) {

        this.filmCategoryService = filmCategoryService;
    }

    @GetMapping("/film_category")
    public List<FilmCategory> findAll() {
        return filmCategoryService.findAll();
    }
}
