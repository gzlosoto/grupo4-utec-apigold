package com.grupo4.api.service;

import com.grupo4.api.model.Container;
import com.grupo4.api.model.Musica;
import com.grupo4.api.repository.MockContainerRepository;
import com.grupo4.api.repository.MusicaRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerCommandService {

    private final MockContainerRepository repository;
    private final MusicaRepository musicaRepository;

    public ContainerCommandService(MockContainerRepository repository, 
    						MusicaRepository musicaRepository) {
        this.repository = repository;
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> getAllContainers() {
        return musicaRepository.getMusica();
    }

    public Musica getContainerById(long id) {
        return musicaRepository.getMusicaById(id);
    }

    public Container createContainer(Container container) {
        return repository.save(container);
    }

    public void deleteContainer(String id) {
        repository.deleteById(id);
    }
}
