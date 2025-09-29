package com.generation.templatedefinitivo.dtos;

import com.generation.templatedefinitivo.model.enums.MyEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
//legato alle post/put
public class InputDtoMyEntity
{
    private String myText;
    private Double myNumber;
    private MyEnum enumeratedValue;
    private List<String> textList;
}

//  {
//          "myText": "franco",
//          "myNumber": 12.12,
//          "enumeratedValue": "VAL_THREE",
//          "textList": [
//          "qui",
//          "quo",
//          "qua"
//          ]
//  }