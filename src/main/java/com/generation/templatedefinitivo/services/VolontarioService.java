package com.generation.templatedefinitivo.services;

import com.generation.templatedefinitivo.dtos.VolontarioOutputDto;
import com.generation.templatedefinitivo.model.entities.Volontario;
import com.generation.templatedefinitivo.model.repositories.VolontarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VolontarioService {

    @Autowired
    VolontarioRepo repo;


    public VolontarioOutputDto scegliVolontario() {

        List<Volontario> possibiliCandidati = getPossibiliCandidati();

        Volontario v = possibiliCandidati.get((int) (Math.random() * possibiliCandidati.size()));

        return new VolontarioOutputDto(v.getId(),v.getNome() + " " + v.getCognome());
    }

    public void confermaVolontario(UUID id)
    {
        Volontario v = repo.findById(id).get();
        v.aggiungiChiamata();
        repo.save(v);
    }

    private List<Volontario> getPossibiliCandidati()
    {
        List<Volontario> tutti = repo.findAll();
        int numMin = tutti.stream().mapToInt(v -> v.getNumeroDiVolteChiamato()).min().getAsInt();
        int numMax = tutti.stream().mapToInt(v -> v.getNumeroDiVolteChiamato()).max().getAsInt();

        return tutti.stream().filter(v -> v.getNumeroDiVolteChiamato() == numMin).toList();

    }
    public List<VolontarioOutputDto> listaPossibiliVolontari() {

       return getPossibiliCandidati().stream().map(v->new VolontarioOutputDto(v.getId(),v.getNome() + " " + v.getCognome())).toList();


    }
}