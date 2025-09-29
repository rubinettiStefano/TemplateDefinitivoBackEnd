package com.generation.templatedefinitivo.model.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Volontario extends BaseEntity
{

    private String nome,cognome;
    private int numeroDiVolteChiamato;

    public void aggiungiChiamata()
    {
        numeroDiVolteChiamato++;
    }
    public Volontario(String nome,String cognome,int numeroDiVolteChiamato)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.numeroDiVolteChiamato=numeroDiVolteChiamato;
    }
}
