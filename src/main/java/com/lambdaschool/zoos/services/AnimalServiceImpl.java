package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    AnimalRepository animalRepository;

    @Override
    public List<Animal> findAll()
    {
        List<Animal> list = new ArrayList<>();
        animalRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
