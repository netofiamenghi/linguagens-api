package com.ghitecnologia.linguagensapi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
@NoArgsConstructor
public class Linguagem {

    @Id
    @Getter
    private String id;

    @Getter
    private String title;

    @Getter
    private String image;

    @Getter
    private int ranking;

}