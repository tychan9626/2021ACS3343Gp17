import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testHumanPlayer {

	//Test case INTE0601: Create a new player without any value assigned to test toString() function.
	@Test
	public void testHumanPlayer_humanPlayerNULL_toString() {
		HumanPlayer humanPlayer = new HumanPlayer();
		String expectResult = "{ name= }\n"
				+ " ,play={\n"
				+ "currentCombination={ \n"
				+ "combination{\n"
				+ "cardNo=0, \n"
				+ "}, \n"
				+ "}\n"
				+ "previousCombination={ \n"
				+ "combination{\n"
				+ "cardNo=0, \n"
				+ "}, \n"
				+ "}\n"
				+ " } \n"
				+ "";
		String actualResult = humanPlayer.toString();
		assertEquals(expectResult, actualResult);
	}
	
	//Test case INTE0602: Create a new player with all required information, print out its information.
	@Test
	public void testHumanPlayer_humanPlayerWITHDATA_toString() {
		Hand hand = new Hand();
		Play play = new Play();
		String name = "Jack";
		SortStrategy sortStrategy = new BubbleSort();
		HumanPlayer humanPlayer = new HumanPlayer(hand, play, name, sortStrategy);
		String expectResult = "{ name=Jack }\n"
				+ " ,play={\n"
				+ "currentCombination={ \n"
				+ "combination{\n"
				+ "cardNo=0, \n"
				+ "}, \n"
				+ "}\n"
				+ "previousCombination={ \n"
				+ "combination{\n"
				+ "cardNo=0, \n"
				+ "}, \n"
				+ "}\n"
				+ " } \n"
				+ "";
		String actualResult = humanPlayer.toString();
		assertEquals(expectResult, actualResult);
	}

} 
