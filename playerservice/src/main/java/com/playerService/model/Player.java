package com.playerService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    //This is the model of Game We take String playerMove in parameter and return all three String accordingly

    private String playerMove;
    private String computerMove;
    String Result;
}
