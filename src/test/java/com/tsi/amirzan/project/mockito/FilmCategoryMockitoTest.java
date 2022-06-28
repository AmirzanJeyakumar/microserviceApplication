package com.tsi.amirzan.project.mockito;



import com.tsi.amirzan.project.controller.FilmCategoryController;
import com.tsi.amirzan.project.entity.FilmCategory;
import com.tsi.amirzan.project.service.FilmCategoryService;
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
public class FilmCategoryMockitoTest {

    @Mock
    private FilmCategoryController filmCategoryController;
    @Mock
    private FilmCategoryService filmCategoryService;

    @BeforeEach
    void setup(){
        filmCategoryService = mock(FilmCategoryService.class);

        filmCategoryController = new FilmCategoryController(filmCategoryService);

    }

    @Test
    public void getAllFilmCategory(){

        FilmCategory testFilmCategory = new FilmCategory(1,1);
        List<FilmCategory> filmCategoryList = new ArrayList<>();
        filmCategoryList.add(testFilmCategory);

        when(filmCategoryService.findAll()).thenReturn(filmCategoryList);
        List<FilmCategory> actual = filmCategoryController.findAll();
        Assertions.assertEquals(filmCategoryList,actual,"The list is incorrect");

    }
}
