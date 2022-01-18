package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.I_Dashboard;
import unit_test_cases.Dashboard;

public class Dashboard_test {
	@Test
	public void Given_X1_Y1_Get_False_for_X1_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (1,4)
		
		//When : I enter coordinates 1,1
		I_Dashboard hc = new Dashboard();
		hc.Display_Dashboard("A", 5, 1, "Lose", "");
		
		//Then : I Lose the game
	}
	@Test
	public void Given_X1_Y4_Get_False_for_X1_Y1_print() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (1,4)
		
		//When : I enter coordinates 1,4
		I_Dashboard hc = new Dashboard();
		hc.Display_Dashboard("A", 1, 1, "Win", "show");
		
		//Then : I Win the Game.
	}
	@Test
	public void Given_X7_Y3_Get_False_for_X7_Y3() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (7,3)
		
		//When : I enter coordinates 7,3
		I_Dashboard hc = new Dashboard();
		hc.Display_Dashboard("Ab", 2, 1, "Lose", "");
		
		//Then : I Lose the game
	}
	@Test
	public void Given_X5_Y4_Get_False_for_X4_Y5_print() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,5)
		
		//When : I enter coordinates 5,4
		I_Dashboard hc = new Dashboard();
		hc.Display_Dashboard("Abc", 2, 1, "Win", "show");
		
		//Then : I Win the Game.
	}
}
