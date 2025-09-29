package com.generation.templatedefinitivo.model.repositories;

import com.generation.templatedefinitivo.model.entities.EntityManyToManyR;
import com.generation.templatedefinitivo.model.entities.EntityOneR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityNNRepository extends JpaRepository<EntityManyToManyR, UUID> {
}
