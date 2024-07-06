package com.grupo4.api.repository;

import com.grupo4.api.model.Container;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class MockContainerRepository {

    private final List<Container> containers = new ArrayList<>();

    public MockContainerRepository() {
        // Datos mock iniciales
        containers.add(new Container("1", "Container A", "Active"));
        containers.add(new Container("2", "Container B", "Inactive"));
    }

    public List<Container> findAll() {
        return new ArrayList<>(containers);
    }

    public Optional<Container> findById(String id) {
        return containers.stream()
                .filter(container -> container.getId().equals(id))
                .findFirst();
    }

    public Container save(Container container) {
        container.setId(UUID.randomUUID().toString());
        containers.add(container);
        return container;
    }

    public void deleteById(String id) {
        containers.removeIf(container -> container.getId().equals(id));
    }
}
