package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Hit_Check_test {
	// Hit Or Not Hit ............................................................................
			@Test
			public void Given_X1_Y1_Get_True_for_X1_Y1() {

				//Given :  I have a game that presents a user with a target with x,y coordinates (1,1)
				
				//When : I enter coodinates 1,1
				I_Hit_Check hc = new Hit_Check();
				boolean result = hc.Comp_Coordinates("1","1","1","1");
				
				//Then : i hit target
				assertEquals(true, result);
			}
			
			@Test
			public void Given_X7_Y7_Get_True_for_X1_Y10() {

				//Given :  I have a game that presents a user with a target with x,y coordinates (7,7)
				
				//When : I enter coodinates 1,10
				I_Hit_Check hc = new Hit_Check();
				boolean result = hc.Comp_Coordinates("7","7","1","10");
				
				//Then : i did not hit target
				assertEquals(false, result);
			}
			
			@Test
			public void Given_X7_Y7_Get_True_for_X7_Y7() {

				//Given :  I have a game that presents a user with a target with x,y coordinates (7,7)
				
				//When : I enter coodinates 7,7
				I_Hit_Check hc = new Hit_Check();
				boolean result = hc.Comp_Coordinates("7","7","7","7");
				
				//Then : i hit target
				assertEquals(true, result);
			}
			
			@Test
			public void Given_X2_Y3_Get_True_for_X3_Y2() {

				//Given :  I have a game that presents a user with a target with x,y coordinates (2,3)
				
				//When : I enter coodinates 3,2
				I_Hit_Check hc = new Hit_Check();
				boolean result = hc.Comp_Coordinates("2","3","3","2");
				
				//Then : i did not hit target
				assertEquals(false, result);
			}

}
