package com.playerService.controller;

import com.playerService.model.Player;
import com.playerService.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class playerController {

    @Autowired
    private PlayerServiceImpl playerService;

    // This controller is accepting this
    @GetMapping("/")
    public String start(){
        return "Hello Start the Game";
    }


    @PostMapping(value = "/move" )
    public Player getMove(@RequestBody Player playerMove){
        return playerService.createMove(playerMove.getPlayerMove());
    }
}
