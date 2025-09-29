package com.generation.templatedefinitivo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VolontarioOutputDto
{

    public VolontarioOutputDto(String nominativo)
    {
        this.nominativo=nominativo;
    }

    private UUID id;
    private String nominativo;
}
