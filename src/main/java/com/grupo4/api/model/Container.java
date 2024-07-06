package com.grupo4.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Container {
    private String id;
    private String name;
    private String status;
}