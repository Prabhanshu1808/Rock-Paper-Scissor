package com.playerService;


import com.playerService.service.PlayerServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PlayerSerivceApplicationTests {

	@Autowired
	private PlayerServiceImpl playerService;

	@Test
	void testWinning(){
        String result = "Player win!";
		String first = "Rock";
		String second = "Scissor";
		Assertions.assertEquals(result , playerService.evaluateMove(first , second));
	}

	@Test
	void testLosing(){
		String result = "Computer win!";
		String first = "Rock";
		String second = "Paper";
		Assertions.assertEquals(result , playerService.evaluateMove(first , second));
	}

	@Test
	void testTie(){
		String result = "It's a tie!";
		String first = "Rock";
		String second = "Rock";
		Assertions.assertEquals(result , playerService.evaluateMove(first , second));
	}

}
