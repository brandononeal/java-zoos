package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController
{
    @Autowired
    private AnimalService animalService;

    // http://localhost:2019/animals/count
    @GetMapping(value = "/count",
        produces = "application/json")
    public ResponseEntity<?> listAnimalsWithZooCount()
    {
        List<Animal> animalList = animalService.findAll();
        return new ResponseEntity<>(animalList, HttpStatus.OK);
    }
}
