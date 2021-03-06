package com.nastysloper.service;

import com.nastysloper.model.Cat;

import java.util.ArrayList;

public interface CatService {

    Cat findById(Long id);

    Cat findByName(String name);

    ArrayList<Cat> findAllCats();

    void saveCat(Cat cat);

    void deleteCatById(Long id);

    void updateCat(Cat cat);
}
