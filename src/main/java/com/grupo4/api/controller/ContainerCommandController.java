package com.grupo4.api.controller;

import com.grupo4.api.model.Container;
import com.grupo4.api.model.Musica;
import com.grupo4.api.service.ContainerCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/containers")
public class ContainerCommandController {

    private final ContainerCommandService service;

    @Autowired
    public ContainerCommandController(ContainerCommandService service) {
        this.service = service;
    }

    @GetMapping
    public List<Musica> getAllContainers() {
        return service.getAllContainers();
    }

    @GetMapping("/{id}")
    public Musica getContainerById(@PathVariable long id) {
        return service.getContainerById(id);
    }

    @PostMapping
    public Container createContainer(@RequestBody Container container) {
        return service.createContainer(container);
    }

    @DeleteMapping("/{id}")
    public void deleteContainer(@PathVariable String id) {
        service.deleteContainer(id);
    }
}