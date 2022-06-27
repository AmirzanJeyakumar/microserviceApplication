package com.tsi.amirzan.project.service;

import com.tsi.amirzan.project.entity.Category;
import java.util.List;

public interface CategoryService {

    public List<Category> findAll();

    public Category findById(int category_id);
}
