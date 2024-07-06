package com.grupo4.api.service;

import com.grupo4.api.model.Container;
import com.grupo4.api.repository.ContainerRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerCommandService {

    private final ContainerRepository containerRepository;

    public ContainerCommandService(ContainerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }

    public List<Container> getAll() {
        return containerRepository.getContainer();
    }

    public Container getById(long id) {
        return containerRepository.getContainerById(id);
    }
}
