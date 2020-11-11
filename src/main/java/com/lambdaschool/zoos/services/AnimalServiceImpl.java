package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.ZooAnimalsCount;
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
    public List<ZooAnimalsCount> countZooAnimals()
    {
       List<ZooAnimalsCount> animalList = new ArrayList<>();
       animalRepository.countZooAnimals().iterator().forEachRemaining(animalList::add);
       return animalList;
    }
}
