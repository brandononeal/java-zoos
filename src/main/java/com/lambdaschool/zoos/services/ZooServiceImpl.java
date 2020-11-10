package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "zooService")
public class ZooServiceImpl implements ZooService
{
    @Autowired
    private ZooRepository zooRepository;

    @Override
    public List<Zoo> findAll()
    {
        List<Zoo> list = new ArrayList<>();
        zooRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findById(long zooid)
    {
        return zooRepository.findById(zooid)
            .orElseThrow(() -> new EntityNotFoundException("Zoo ID " + zooid + " Not Found"));
    }
}
