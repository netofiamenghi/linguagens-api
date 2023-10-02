package com.ghitecnologia.linguagensapi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Linguagem {

    @Getter
    private String title;

    @Getter
    private String image;

    @Getter
    private int ranking;
}