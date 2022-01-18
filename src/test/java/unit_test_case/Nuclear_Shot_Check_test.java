package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Nuclear_Shot_Check_test {
	@Test
	public void Given_X1_Y1_Get_False_for_X4_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,4)
		
		//When : I enter coordinates 1,1
		I_Nuclear_Shot_Check hc = new Nuclear_Shot_Check();
		boolean result = hc.NHitCheck("1","1","4","4");
		
		//Then : i hit target
		assertEquals(false, result);
	}
	@Test
	public void Given_X2_Y3_Get_False_for_X4_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,4)
		
		//When : I enter coordinates 2,3
		I_Nuclear_Shot_Check hc = new Nuclear_Shot_Check();
		boolean result = hc.NHitCheck("2","3","4","4");
		
		//Then :  hit target
		assertEquals(true, result);
	}
	
	@Test
	public void Given_X8_Y6_Get_False_for_X4_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,4)
		
		//When : I enter coordinates 8,6
		I_Nuclear_Shot_Check hc = new Nuclear_Shot_Check();
		boolean result = hc.NHitCheck("8","6","4","4");
		
		//Then : hit target
		assertEquals(false, result);
	}
	@Test
	public void Given_X6_Y8_Get_False_for_X4_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,4)
		
		//When : I enter coordinates 6,8
		I_Nuclear_Shot_Check hc = new Nuclear_Shot_Check();
		boolean result = hc.NHitCheck("6","8","4","4");
		
		//Then :  hit target
		assertEquals(false, result);
	}
	
	@Test
	public void Given_X7_Y1_Get_False_for_X4_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,4)
		
		//When : I enter coordinates 7,1
		I_Nuclear_Shot_Check hc = new Nuclear_Shot_Check();
		boolean result = hc.NHitCheck("7","1","4","4");
		
		//Then :  hit target
		assertEquals(false, result);
	}
	
	
}
