package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Calc_Coordinates_x_test {
	
	//For X...............
		@Test
		public void Given_Angle_Velocity_1_1_Get_X_1() {
			//Given :- I am a User
			//When :- I enter a angle 0.017453 & velocity 1
			I_Calc_Coordinates_X co = new Calc_Coordinates_x();
			String x = co.Coordinate_X("0.017453","1");
			//Then :- I get back coordinates x=1 (with Roundoff)
			assertEquals("1",x);
		}
		
		@Test
		public void Given_Angle_Velocity_45_1_Get_X_1() {
			//Given :- I am a User
			//When :- I enter a angle 0.785398 & velocity 1
			I_Calc_Coordinates_X co = new Calc_Coordinates_x();
			String x = co.Coordinate_X("0.785398","1");
			//Then :- I get back coordinates x=1 (with Roundoff)
			assertEquals("1",x);
		}
		
		@Test
		public void Given_Angle_Velocity_45_10_Get_X_7() {
			//Given :- I am a User
			//When :- I enter a angle 0.785398 & velocity 10
			I_Calc_Coordinates_X co = new Calc_Coordinates_x();
			String x = co.Coordinate_X("0.785398","10");
			//Then :- I get back coordinates x=7 (with Roundoff)
			assertEquals("7",x);
		}
	
}
