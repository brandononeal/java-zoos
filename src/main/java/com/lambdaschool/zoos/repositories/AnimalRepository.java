package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.models.ZooAnimalsCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    @Query(value = "SELECT a.animalid, a.animaltype, count(z.zooid) as countzoos FROM animals a LEFT JOIN zooanimals z ON a.animalid = z.animalid GROUP BY a.animaltype",
        nativeQuery = true)
    List<ZooAnimalsCount> countZooAnimals();
}
