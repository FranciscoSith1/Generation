package com.generation.services;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;


@Service
public class AutoService {
    @Autowired
    AutoRepository autoRepository;

    public void guardarAuto(@Valid Auto auto) {
        autoRepository.save(auto);
    }

    public List<Auto> findAll() {
        return  autoRepository.findAll();
    }
}
