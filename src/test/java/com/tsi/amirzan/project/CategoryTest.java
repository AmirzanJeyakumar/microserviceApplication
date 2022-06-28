package com.tsi.amirzan.project;

import com.tsi.amirzan.project.entity.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void testGetCategoryId() {
        Category testCategory = new Category(20,"Test");
        Assertions.assertEquals(20,testCategory.getCategory_id(),"ID not found");
    }

    @Test
    public void testSetCategoryId() {
        Category testCategory = new Category(20,"Test");
        testCategory.setCategory_id(30);
        Assertions.assertEquals(30,testCategory.getCategory_id(),"ID not changed");
    }

    @Test
    public void testGetName() {
        Category testCategory = new Category("Test");
        Assertions.assertEquals("Test",testCategory.getName(),"name not found");
    }

    @Test
    public void testSetName() {
        Category testCategory = new Category("Test");
        testCategory.setName("Test2");
        Assertions.assertEquals("Test2",testCategory.getName(),"name not changed");
    }

}
