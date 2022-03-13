package com.kata.gameoflife.domain.generation.services;


import com.kata.gameoflife.domain.generation.Generation;

import java.util.Objects;

public class GenerationDomainService {

    private static GenerationDomainService instance;

    private GenerationDomainService() {}

    static public GenerationDomainService getInstance() {
        if (Objects.isNull(instance)) {
            instance = new GenerationDomainService();
        }

        return instance;
    }


    public Generation getNextGeneration(Generation generation) {
        return generation;
    }
}
