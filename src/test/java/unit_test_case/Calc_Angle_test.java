package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Calc_Angle_test {

	// Angle Calc
	
			@Test
			public void Given_Angle_1_Get_Degree() {
				
				//Given :  I am User
				
				//When : I enter  Angle 1
				I_Calc_Angle calcA=new Calc_Angle();
				String result = calcA.Angle_in_Degree("1");
				
				//Then : I get back 0.017453
				assertEquals("0.017453",result);
			}
			
			@Test
			public void Given_Angle_2_Get_Degree() {
				
				//Given :  I am User
				
				//When : I enter  Angle 2
				I_Calc_Angle calcA=new Calc_Angle();
				String result = calcA.Angle_in_Degree("2");
				
				//Then : I get back 0.034907
				assertEquals("0.034907",result);
			}
			
			@Test
			public void Given_Angle_45_Get_Degree() {
				
				//Given :  I am User
				
				//When : I enter  Angle 45
				I_Calc_Angle calcA=new Calc_Angle();
				String result = calcA.Angle_in_Degree("45");
				
				//Then : I get back 0.785398
				assertEquals("0.785398",result);
			}
			
			@Test
			public void Given_Angle_90_Get_Degree() {
				
				//Given :  I am User
				
				//When : I enter  Angle 90
				I_Calc_Angle calcA=new Calc_Angle();
				String result = calcA.Angle_in_Degree("90");
				
				//Then : I get back 1.570796
				assertEquals("1.570796",result);
			}

		
}
