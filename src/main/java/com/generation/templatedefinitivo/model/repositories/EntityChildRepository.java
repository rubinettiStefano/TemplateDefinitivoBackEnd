package com.generation.templatedefinitivo.model.repositories;

import com.generation.templatedefinitivo.model.entities.EntityChildR;
import com.generation.templatedefinitivo.model.entities.EntityOneR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityChildRepository extends JpaRepository<EntityChildR, UUID> {
}
