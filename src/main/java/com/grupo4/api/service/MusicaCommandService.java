package com.grupo4.api.service;

import com.grupo4.api.model.Musica;
import com.grupo4.api.repository.MusicaRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaCommandService {

    private final MusicaRepository musicaRepository;

    public MusicaCommandService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> getAll() {
        return musicaRepository.getMusica();
    }

    public Musica getById(long id) {
        return musicaRepository.getMusicaById(id);
    }
}
