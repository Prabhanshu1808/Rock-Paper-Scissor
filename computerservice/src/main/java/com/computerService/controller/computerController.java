package com.computerService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/computer")
public class computerController {

    //This is the controller for Computer Move
    //I create one Array of String
    //makeMove() function that generate random number and return new move every time;


    private String[] moves = {"Rock" , "Paper" , "Scissor"};

    //The Url of this microservice for call the computer controller  is "http://localhost:8002/computer/move";
    @GetMapping("/move")
    public String makeMove(){
        return moves[new Random().nextInt(moves.length)];
    }


}
