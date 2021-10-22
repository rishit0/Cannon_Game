package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Check_Range_Velocity_test {

	// For Velocity
		@Test
		public void Given_Velocity_Range_0_Get_False() {
			
			//Given :  I am User
			
			//When : I enter  Velocity 0
			I_Check_Range_Velocity cra=new Check_Range_Velocity();
			boolean result = cra.ValidVelocityRange("0");
			
			//Then : I get back False.
			assertEquals(false,result);
		}
		
		@Test
		public void Given_Velocity_Range_21_Get_False() {
			
			//Given :  I am User
			
			//When : I enter  Velocity 21
			I_Check_Range_Velocity cra=new Check_Range_Velocity();
			boolean result = cra.ValidVelocityRange("21");
			
			//Then : I get back False.
			assertEquals(false,result);
		}
		
		@Test
		public void Given_Velocity_Range_1_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  Velocity 1
			I_Check_Range_Velocity cra=new Check_Range_Velocity();
			boolean result = cra.ValidVelocityRange("1");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
		
		@Test
		public void Given_Velocity_Range_2_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  Velocity 2
			I_Check_Range_Velocity cra=new Check_Range_Velocity();
			boolean result = cra.ValidVelocityRange("2");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
		
		@Test
		public void Given_Velocity_Range_10_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  Velocity 10
			I_Check_Range_Velocity cra=new Check_Range_Velocity();
			boolean result = cra.ValidVelocityRange("10");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
		
		@Test
		public void Given_Velocity_Range_20_Get_True() {
			
			//Given :  I am User
			
			//When : I enter  Velocity 20
			I_Check_Range_Velocity cra=new Check_Range_Velocity();
			boolean result = cra.ValidVelocityRange("20");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
}
