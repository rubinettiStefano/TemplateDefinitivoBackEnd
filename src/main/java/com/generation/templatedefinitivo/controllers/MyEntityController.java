package com.generation.templatedefinitivo.controllers;

import com.generation.templatedefinitivo.dtos.InputDtoMyEntity;
import com.generation.templatedefinitivo.dtos.OutputDtoMyEntity;
import com.generation.templatedefinitivo.services.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//COSA IL MONDO ESTERNO PUÒ FARE E COME LO PUÒ FARE

//Client -> Utilizzatore di servizi forniti da un server
//Il Client comunica con il controller tramite HTTP
//Client manda request, controller produce e manda indietro response

//A quali request rispondere e come

//base_url=localhost:8080
//controller_uri -> uri prefisso a tutti gli uri specificati nei singoli metodi
//ogni metodo specifica il suo uri

@RestController
@RequestMapping("/api/myentities")//nome entità plurale
public class MyEntityController
{

    //get all
    //get by id
    //insert
    //update
    //delete

    @Autowired
    MyEntityService serv;

    //richiamabile tramite request http del client con url completo + verbo specificato
    //url_completo = base_url/controller_uri/metodo_uri
    //localhost:8080/api/myentities
    //se fosse stato   @GetMapping("paperino")
    //localhost:8080/api/myentities/paperino

    //ogni metodo determina una funzionalità, come accedervi, cosa produce
    //cosa si aspetta in input

    //come accedere: request http
    // url   - localhost:8080/api/myentities
    // verbo - GET

    //cosa produce:
    //JSON contenente una Lista di Output DTO

    //input: NIENTE
    @GetMapping
    public List<OutputDtoMyEntity> getAll()
    {
        return serv.findAllAsDtos();
    }


    //come accedere: request http
    // url   - localhost:8080/api/myentities
    // verbo - POST

    //cosa produce:
    //NIENTE, ma fa il lavoro di salvataggio su db

    //input: JSON CON I CAMPI SPECIFICATI NEL DTO InputDtoMyEntity
    @PostMapping
    public void save(@RequestBody InputDtoMyEntity dto)
    {
        serv.saveWithDtoInput(dto);
    }
}
