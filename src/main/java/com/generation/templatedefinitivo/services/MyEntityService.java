package com.generation.templatedefinitivo.services;

import com.generation.templatedefinitivo.dtos.InputDtoMyEntity;
import com.generation.templatedefinitivo.dtos.OutputDtoMyEntity;
import com.generation.templatedefinitivo.model.entities.MyEntity;
import com.generation.templatedefinitivo.model.repositories.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//sia beanizzabile, sia istanziato in automatico per essere Autowirato
//contiene metodi di utilità per l'entità stessa
//in particolare permette lettura dto scrittura da db tramite
//dto effettuando lui la conversione

//oltre che @Component
@Service
public class MyEntityService
{

    @Autowired
    MyEntityRepository repo;

    public List<OutputDtoMyEntity> findAllAsDtos()
    {
        return repo.findAll().stream().map(dto -> convertToDto(dto)).toList();
    }

    public void saveWithDtoInput(InputDtoMyEntity dto)
    {
        MyEntity e = convertToEntity(dto);
        repo.save(e);
    }

    private OutputDtoMyEntity convertToDto(MyEntity e)
    {
        OutputDtoMyEntity res = new OutputDtoMyEntity();
        res.setId(e.getId());
        res.setMyNumber(e.getMyNumber());
        res.setTextList(e.getTextList());
        res.setMyText(e.getMyText());
        res.setEnumeratedValue(e.getEnumeratedValue());

        return res;
    }

    private MyEntity convertToEntity(InputDtoMyEntity dto)
    {
        MyEntity res = new MyEntity();
        res.setMyNumber(dto.getMyNumber());
        res.setTextList(dto.getTextList());
        res.setMyText(dto.getMyText());
        res.setEnumeratedValue(dto.getEnumeratedValue());

        return res;
    }
}
