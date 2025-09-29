package com.generation.templatedefinitivo.dtos;

import com.generation.templatedefinitivo.model.entities.EntityOneR;
import com.generation.templatedefinitivo.model.enums.MyEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
//come mostro la mia entità al mondo esterno quando vuole leggerla
public class OutputConFigliDtoMyEntity
{
    private UUID id;
    private String myText;
    private Double myNumber;
    private MyEnum enumeratedValue;
    private List<String> textList;
    private List<EntityOneR> figlioli;
}
