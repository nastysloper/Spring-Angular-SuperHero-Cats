package com.nastysloper.service;

import com.nastysloper.model.Cat;

import java.util.List;
import java.util.Optional;

public interface CatService {

    Optional<Cat> findById(Long id);

    Optional<Cat> findByName(String name);

    List<Cat> findAllCats();

    Cat createNewCat(Cat cat);

    Optional<Cat> deleteCat(Long id);

    Cat updateCat(Cat cat);

    boolean catExists(Cat cat);
}
