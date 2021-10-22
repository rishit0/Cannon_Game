package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Check_Integer_test {
	// For Angle............
		@Test 
		public void Given_Angle_1_Get_True() {
			//Given :  I am User
			
			//When : I enter angle 1
			I_Check_Integer cint=new Check_Integer_or_not();
			boolean result = cint.Check_Integer("1","1");
			
			//Then : I get back True.
			assertEquals(true,result);
		}
		
		@Test 
		public void Given_Angle_one_Get_False() {
			//Given :  I am User
			
			//When : I enter angle one
			I_Check_Integer cint=new Check_Integer_or_not();
			boolean result = cint.Check_Integer("one","1");
			
			//Then : I get back false.
			assertEquals(false,result);
		}
		
		
		// For Velocity............
			@Test 
			public void Given_Velocity_1_Get_True() {
				//Given :  I am User
				
				//When : I enter velocity 1
				I_Check_Integer cint=new Check_Integer_or_not();
				boolean result = cint.Check_Integer("3","4");
				
				//Then : I get back True.
				assertEquals(true,result);
			}
			
			@Test 
			public void Given_Velocity_one_Get_False() {
				//Given :  I am User
				
				//When : I enter Velocity one
				I_Check_Integer cint=new Check_Integer_or_not();
				boolean result = cint.Check_Integer("1","one");
				
				//Then : I get back false.
				assertEquals(false,result);
			}
			
		
}
