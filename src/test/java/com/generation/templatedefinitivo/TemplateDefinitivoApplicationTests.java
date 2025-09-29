package com.generation.templatedefinitivo;

import com.generation.templatedefinitivo.model.entities.MyEntity;
import com.generation.templatedefinitivo.model.entities.Volontario;
import com.generation.templatedefinitivo.model.enums.MyEnum;
import com.generation.templatedefinitivo.model.repositories.MyEntityRepository;
import com.generation.templatedefinitivo.model.repositories.VolontarioRepo;
import com.generation.templatedefinitivo.services.MyEntityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class TemplateDefinitivoApplicationTests {

    //richiede a Spring un oggetto del tipo della proprietà
    //da collegare in automatico
    @Autowired
    VolontarioRepo repo;


    @Test
    void contextLoads()
    {
        List<Volontario> volontari = List.of(
                new Volontario("Manuel", "Boles", 0),
                new Volontario("Laura", "Autiero", 0),
                new Volontario("Janitha", "Silva", 0),
                new Volontario("Gabriel", "Raffaele", 0),
                new Volontario("Pier Francesco", "Milani", 0),
                new Volontario("Fabio", "Foglieni", 0),
                new Volontario("Mattia", "Cuomo", 0),
                new Volontario("Federica", "Amati", 0),
                new Volontario("Carlo", "Mosini", 0),
                new Volontario("Marco", "Pelliccioni", 0),
                new Volontario("Thilan", "Jayasuriya", 0),
                new Volontario("Simone", "Brusa", 0),
                new Volontario("Mattia", "Conforto", 0),
                new Volontario("Nina", "Rossi", 0),
                new Volontario("Daniele", "Prioletta", 0),
                new Volontario("Flavia", "Agostinelli", 0),
                new Volontario("Riccardo", "Zazza", 0),
                new Volontario("Matteo", "De Moro", 0),
                new Volontario("Davide", "Berardi", 0),
                new Volontario("Alice", "Quintili", 0),
                new Volontario("Jasmine", "Giamberardino", 0),
                new Volontario("Giuseppe", "Soldano", 0),
                new Volontario("Thomas", "Youssef", 0),
                new Volontario("Alberto", "Malambri", 0)
        );

        repo.saveAll(volontari);
    }

}
