package unit_test_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit_test_cases.*;


public class test_cases {

	//genrate targets 
	@Test
	public void Generate_targets() {
		I_Target_Generator tg = new Target_Generator();
		String x = tg.Generate_Target();
		String y = tg.Generate_Target();
		System.out.println("X="+x + "   Y=" + y);
	}
// For Integer Check
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
		
		
//   For Range....................................................
		
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
		
		
// Calculation of X and Y  .............................................
		
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
		
// Wepone
		
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
