package com.generation.templatedefinitivo.model.repositories;

import com.generation.templatedefinitivo.model.entities.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface MyEntityRepository extends JpaRepository<MyEntity, UUID>
{
    //findById lettura singola
    //findAll  lettura completa
    //save -> UPSERT insert/update in base a se entità esiste già su db o no
    //delete

    //metodo nominale
    List<MyEntity> findAllByMyNumberBetween(Double min, Double max);

    @Query("SELECT e FROM MyEntity e WHERE e.myText like %:testo% and e.myNumber>=:min")
    List<MyEntity> nomeArbitrario(String testo,Double min);

    @Query("SELECT max(e.myNumber) FROM MyEntity e")
    Double numeroMassimo();
}
