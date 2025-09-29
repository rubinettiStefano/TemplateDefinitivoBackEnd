package com.generation.templatedefinitivo.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EntityOneR extends BaseEntity
{

    //proprietà sue
    private String myValue;

    @OneToOne(fetch = FetchType.EAGER)
    private MyEntity entityReference;
}
