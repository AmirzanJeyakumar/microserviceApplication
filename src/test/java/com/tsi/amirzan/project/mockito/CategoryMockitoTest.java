package com.tsi.amirzan.project.mockito;

import com.tsi.amirzan.project.controller.CategoryController;
import com.tsi.amirzan.project.entity.Category;
import com.tsi.amirzan.project.service.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CategoryMockitoTest {

    @Mock
    private CategoryController categoryController;
    @Mock
    private CategoryService categoryService;

    @BeforeEach
    void setup(){
        categoryService = mock(CategoryService.class);

        categoryController = new CategoryController(categoryService);

    }

    @Test
    public void getAllCategory(){

        Category testCategory = new Category(20,"Test");
        List<Category> categoryList = new ArrayList<Category>();
        categoryList.add(testCategory);

        when(categoryService.findAll()).thenReturn(categoryList);
        List<Category> expected = categoryList;
        List<Category> actual = categoryController.findAll();
        Assertions.assertEquals(expected,actual,"The list is incorrect");

    }

    @Test
    public void getCategoryById(){
        Category testCategory = new Category(20,"Test");

        when(categoryService.findById(20)).thenReturn(testCategory);
        Category expected = testCategory;
        Category actual = categoryController.findById(20);
        Assertions.assertEquals(expected,actual,"category not found");

    }

}
