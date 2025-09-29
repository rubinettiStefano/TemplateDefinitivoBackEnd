package com.generation.templatedefinitivo.dtos;

import com.generation.templatedefinitivo.model.enums.MyEnum;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
//come mostro la mia entità al mondo esterno quando vuole leggerla
public class OutputDtoMyEntity
{
    private UUID id;
    private String myText;
    private Double myNumber;
    private MyEnum enumeratedValue;
    private List<String> textList;
}
