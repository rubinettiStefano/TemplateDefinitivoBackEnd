package com.generation.templatedefinitivo.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class EntityManyToManyR extends BaseEntity
{
    private LocalDate myDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "ent1_to_ent2",
            joinColumns = @JoinColumn(name = "my_id"),
            inverseJoinColumns = @JoinColumn(name = "other_id")

    )
    private Set<MyEntity> myPeers = new HashSet<>();
}
