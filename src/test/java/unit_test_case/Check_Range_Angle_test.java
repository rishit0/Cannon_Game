package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Check_Range_Angle_test {
	
	//For Angle
		@Test
		public void Given_Angle_Range_0_Get_False() {
			
			//Given :  I am User
			
			//When : I enter  angle 0
			I_Check_Range_Angle cra=new Check_Range_Angle();
			boolean result = cra.ValidAngleRange("0");
			
			//Then : I get back False.
			assertEquals(false,result);
		}
		
		@Test
		public void Given_Angle_Range_91_Get_False() {
			
			//Given :  I am User
			
			//When : I enter  angle 91
			I_Check_Range_Angle cra=new Check_Range_Angle();
			boolean result = cra.ValidAngleRange("91");
			
			//Then : I get back False.
			assertEquals(false,result);
		}
		
		@Test
		public void Given_Angle_Range_1_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  angle 1
			I_Check_Range_Angle cra=new Check_Range_Angle();
			boolean result = cra.ValidAngleRange("1");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
		
		@Test
		public void Given_Angle_Range_2_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  angle 2
			I_Check_Range_Angle cra=new Check_Range_Angle();
			boolean result = cra.ValidAngleRange("2");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
		
		@Test
		public void Given_Angle_Range_45_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  angle 45
			I_Check_Range_Angle cra=new Check_Range_Angle();
			boolean result = cra.ValidAngleRange("45");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
		
		@Test
		public void Given_Angle_Range_90_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  angle 90
			I_Check_Range_Angle cra=new Check_Range_Angle();
			boolean result = cra.ValidAngleRange("90");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
	
}
