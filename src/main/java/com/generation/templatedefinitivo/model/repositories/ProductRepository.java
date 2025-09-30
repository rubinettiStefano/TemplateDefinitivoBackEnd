package com.generation.templatedefinitivo.model.repositories;

import com.generation.templatedefinitivo.model.entities.Product;
import com.generation.templatedefinitivo.model.entities.Volontario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
