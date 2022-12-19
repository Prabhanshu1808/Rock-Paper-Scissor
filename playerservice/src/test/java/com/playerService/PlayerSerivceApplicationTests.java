package com.playerService;


import com.playerService.service.PlayerServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest
@ContextConfiguration(classes = PlayerSerivceApplication.class)
class PlayerSerivceApplicationTests {

	private PlayerServiceImpl playerService;

	@Test
	void ContextLoads(){

	}

	@Test
	public void testWinning(){
        String result = "You win!";
		String first = "Rock";
		String second = "Scissor";

		assert(result).equals(playerService.evaluateMove(first , second));


	}

}
