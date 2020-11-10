package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
//    Long countByZoos(Zoo zoo);
}
