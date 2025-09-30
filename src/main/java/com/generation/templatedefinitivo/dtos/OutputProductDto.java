package com.generation.templatedefinitivo.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OutputProductDto
{
    private UUID id;
    private String name;
    private Double price;
}
