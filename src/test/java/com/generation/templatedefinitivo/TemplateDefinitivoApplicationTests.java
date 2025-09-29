package com.generation.templatedefinitivo;

import com.generation.templatedefinitivo.model.entities.MyEntity;
import com.generation.templatedefinitivo.model.enums.MyEnum;
import com.generation.templatedefinitivo.model.repositories.MyEntityRepository;
import com.generation.templatedefinitivo.services.MyEntityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class TemplateDefinitivoApplicationTests {

    //richiede a Spring un oggetto del tipo della proprietà
    //da collegare in automatico
    @Autowired
    MyEntityRepository repo;


    @Test
    void contextLoads()
    {
       MyEntity m = repo.findById(UUID.fromString("5ebc672a-906d-4e46-9f30-804551c24906")).get();

        System.out.println(m.getMyText());
    }

}
