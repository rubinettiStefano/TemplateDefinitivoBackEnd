package com.generation.templatedefinitivo.services;

import com.generation.templatedefinitivo.dtos.OutputDtoMyEntity;
import com.generation.templatedefinitivo.dtos.OutputProductDto;
import com.generation.templatedefinitivo.model.entities.MyEntity;
import com.generation.templatedefinitivo.model.entities.Product;
import com.generation.templatedefinitivo.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepository repo;

    public List<OutputProductDto> findAllAsDtos()
    {
       return repo.findAll().stream().map(p->convertToDto(p)).toList();
    }

    private OutputProductDto convertToDto(Product e)
    {
        OutputProductDto res = new OutputProductDto();
        res.setId(e.getId());
          res.setName(e.getName());
          res.setPrice(e.getPrice());

        return res;
    }
}
