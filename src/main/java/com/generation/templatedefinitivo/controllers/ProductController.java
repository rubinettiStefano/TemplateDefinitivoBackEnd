package com.generation.templatedefinitivo.controllers;

import com.generation.templatedefinitivo.dtos.OutputProductDto;
import com.generation.templatedefinitivo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController
{

    @Autowired
    ProductService serv;

    @GetMapping
    public List<OutputProductDto> getAll()
    {
        return serv.findAllAsDtos();
    }
}
