package com.playerService.service;


import com.playerService.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Objects;

@Service
public class PlayerServiceImpl {

    @Autowired
    private RestTemplate restTemplate;


    //this is the Main function that return us player object
    //I use rest template for calling other microservice
    public Player createMove(String playerMove){

            Player player = new Player();
            player.setPlayerMove(playerMove);
            String computerMove = restTemplate.getForObject("http://localhost:8002/computer/move" , String.class);
            player.setComputerMove(computerMove);
            String ans = evaluateMove(playerMove ,computerMove);
            player.setResult(ans);
            return player;
    }

    //This is the logic of Rock , paper and scissor Game
    public String evaluateMove(String playerMove ,String computerMove){

          String result = "";

          if(playerMove == null){
              return "Player Move can't be null please Enter(Rock, Paper , or Scissor)";
          }
          if(playerMove.equals(computerMove)){
             result = "It's a tie!";
          }
          else if(playerMove.equals("Rock")){
              if(computerMove.equals("Paper")){
                  result = "Computer win!";
              }
              else if(computerMove.equals("Scissor")){
                  result = "Player win!";
              }
          }
          else if(playerMove.equals("Paper")){
            if(computerMove.equals("Rock")){
                result = "Player win!";
            }
            else if(computerMove.equals("Scissor")){
                result = "Computer win!";
            }
          }
          else if(playerMove.equals("Scissor")){
            if(computerMove.equals("Paper")){
                result = "Player win!";
            }
            else if(computerMove.equals("Rock")){
                result = "Computer win!";
            }
          }
          else{
              result = "You entered a wrong move, please Enter(Rock, Paper or Scissor)";
          }
          return result;
    }

}
