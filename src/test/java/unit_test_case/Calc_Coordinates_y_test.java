package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;

public class Calc_Coordinates_y_test {
	
	//For Y...............
		@Test
		public void Given_Angle_Velocity_1_1_Get_Y_1() {
			//Given :- I am a User
			//When :- I enter a angle 0.017453 & velocity 1
			I_Calc_Coordinates_y co = new Calc_Coordinates_y();
			String y = co.Coordinate_Y("0.017453","1");
			//Then :- I get back coordinates y=0 (with Roundoff)
			assertEquals("0",y);
		}
				
		@Test
		public void Given_Angle_Velocity_45_1_Get_Y_1() {
			//Given :- I am a User
			//When :- I enter a angle 0.785398 & velocity 1
			I_Calc_Coordinates_y co = new Calc_Coordinates_y();
			String y = co.Coordinate_Y("0.785398","1");
			//Then :- I get back coordinates y=1 (with Roundoff)
			assertEquals("1",y);
		}
				
		@Test
		public void Given_Angle_Velocity_45_10_Get_Y_7() {
			//Given :- I am a User
			//When :- I enter a angle 0.785398 & velocity 10
			I_Calc_Coordinates_y co = new Calc_Coordinates_y();
			String y = co.Coordinate_Y("0.785398","10");
			//Then :- I get back coordinates y=7 (with Roundoff)
			assertEquals("7",y);
		}
				

}
