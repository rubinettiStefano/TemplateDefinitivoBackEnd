package com.generation.templatedefinitivo.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//Non creare tabella, ma usala solo per ereditarietà
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
}
