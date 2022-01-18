package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.I_Flying_Shot;
import unit_test_cases.Flying_Shot;

public class Flying_Shot_test {
	@Test
	public void Given_X1_Y2_Get_False_for_X2_Y1() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (1,2)
		
		//When : I enter coordinates 2,1
		I_Flying_Shot hc = new Flying_Shot();
		boolean result = hc.Shadow("1","2","2","1");
		
		//Then : i hit target
		assertEquals(false, result);
	}
	@Test
	public void Given_X1_Y2_Get_False_for_X1_Y1() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (1,2)
		
		//When : I enter coordinates 1,1
		I_Flying_Shot hc = new Flying_Shot();
		boolean result = hc.Shadow("1","2","1","1");
		
		//Then :  hit target
		assertEquals(true, result);
	}
	
	@Test
	public void Given_X5_Y5_Get_False_for_X4_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,4)
		
		//When : I enter coordinates 5,5
		I_Flying_Shot hc = new Flying_Shot();
		boolean result = hc.Shadow("5","5","4","4");
		
		//Then : hit target
		assertEquals(false, result);
	}
	@Test
	public void Given_X6_Y8_Get_False_for_X6_Y6() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (6,6)
		
		//When : I enter coordinates 6,8
		I_Flying_Shot hc = new Flying_Shot();
		boolean result = hc.Shadow("6","8","6","6");
		
		//Then :  hit target
		assertEquals(false, result);
	}
	
	@Test
	public void Given_X7_Y1_Get_False_for_X4_Y4() {

		//Given :  I have a game that presents a user with a target with x,y coordinates (4,4)
		
		//When : I enter coordinates 7,1
		I_Flying_Shot hc = new Flying_Shot();
		boolean result = hc.Shadow("7","1","4","4");
		
		//Then :  hit target
		assertEquals(false, result);
	}
}
