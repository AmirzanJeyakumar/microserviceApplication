package com.tsi.amirzan.project.controller;


import com.tsi.amirzan.project.entity.Category;
import com.tsi.amirzan.project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){

        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/category/{category_id}")
    public Category findById(@PathVariable int category_id) {
        return categoryService.findById(category_id);
    }


}
