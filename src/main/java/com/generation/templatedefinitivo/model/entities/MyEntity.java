package com.generation.templatedefinitivo.model.entities;

import com.generation.templatedefinitivo.model.enums.MyEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//crea in automatico tabella nel db con stesso nome
//della classe e salva/leggi direttamente da li gli oggetti
//tramite le repository
@Entity
@Getter
@Setter
public class MyEntity extends BaseEntity
{
    @NotNull @NotBlank //controlli di validità
    private String myText;
    @NotNull @Min(10) @Max(90)
    private Double myNumber;

    //lui salva nel db il valore testuale
    @Enumerated(EnumType.STRING)
    @NotNull
    private MyEnum enumeratedValue;
                    //quando leggi entità riempi lista in automatico
    @ElementCollection(fetch = FetchType.EAGER) //Per ogni lista di """PRIMITIVI"""
    private List<String> textList;

    //mappedBy -> nome della proprietà relazionale
    //dall'altro lato
    @OneToOne(mappedBy = "entityReference",fetch = FetchType.EAGER)
    private EntityOneR oneToOneReference;

    @OneToMany(mappedBy = "myFather",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<EntityChildR> myChildren = new HashSet<>();

    public void addChild(EntityChildR child)
    {
        myChildren.add(child);
        child.setMyFather(this);
    }

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "myPeers")
    private Set<EntityManyToManyR> myPeers = new HashSet<>();

}
