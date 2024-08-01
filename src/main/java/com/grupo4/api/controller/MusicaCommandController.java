package com.grupo4.api.controller;

import com.grupo4.api.model.Musica;
import com.grupo4.api.service.MusicaCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musica")
public class MusicaCommandController {

    private final MusicaCommandService service;

    @Autowired
    public MusicaCommandController(MusicaCommandService service) {
        this.service = service;
    }

    @GetMapping
    public List<Musica> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Musica getById(@PathVariable long id) {
        return service.getById(id);
    }

    @GetMapping("/song")
    public String getBySong() {
        return "Cancion 1";
    }
}