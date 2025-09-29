package com.generation.templatedefinitivo.controllers;

import com.generation.templatedefinitivo.dtos.VolontarioOutputDto;
import com.generation.templatedefinitivo.services.VolontarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api")
public class VolontarioController
{
    @Autowired
    VolontarioService serv;

    @GetMapping("volontario")
    public VolontarioOutputDto dammiVolontario()
    {
        return serv.scegliVolontario();
    }

    @GetMapping("volontario/{id}")
    public void conferma(@PathVariable UUID id)
    {
        serv.confermaVolontario(id);
    }

    @GetMapping("candidati")
    public List<VolontarioOutputDto> dammiListaCandidati()
    {
        return serv.listaPossibiliVolontari();
    }
}
