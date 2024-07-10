package com.grupo4.api.controller;

import com.grupo4.api.model.Container;
import com.grupo4.api.service.ContainerCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/container")
public class ContainerCommandController {

    private final ContainerCommandService service;

    @Autowired
    public ContainerCommandController(ContainerCommandService service) {
        this.service = service;
    }

    @CrossOrigin
    @GetMapping
    public List<Container> getAll() {
        return service.getAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Container getById(@PathVariable long id) {
        return service.getById(id);
    }
}