package com.generation.templatedefinitivo.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EntityChildR extends BaseEntity
{
    private Integer myNumberValue;

    @ManyToOne(fetch = FetchType.EAGER)
    private MyEntity myFather;
}
