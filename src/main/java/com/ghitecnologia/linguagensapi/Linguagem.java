package com.ghitecnologia.linguagensapi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
@NoArgsConstructor
@Getter
public class Linguagem {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;
}