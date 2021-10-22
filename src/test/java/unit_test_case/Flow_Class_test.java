package unit_test_case;

import static org.mockito.BDDMockito.given;

import static org.mockito.BDDMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import Flow_class.Flow_Class;
import Flow_class.I_Flow_Class;
import unit_test_cases.*;

@RunWith(MockitoJUnitRunner.class)
public class Flow_Class_test {
	@Mock
	I_Check_Integer i_check_integer;
	
	@Mock
	I_Check_Range_Angle i_check_range_angle;
	
	@Mock
	I_Check_Range_Velocity i_check_range_velocity;
	
	@Mock
	I_Calc_Angle i_calc_angle;
	
	@Mock
	I_Calc_Coordinates_X i_calc_x;
	
	@Mock
	I_Calc_Coordinates_y i_calc_y;
	
	@Mock
	I_Hit_Check i_hit_check;
	
	@Mock
	I_Nuclear_Shot_Check i_nuclear_shot;
	
	@Test
	public void Flow_1_1_For_Integer_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle 1 & Velocity 1
		given(i_check_integer.Check_Integer("1","1")).willReturn(true);
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("1", "1","7","7","N");
		
		//Then :- Check_integer function called one time.
		verify(i_check_integer,times(1)).Check_Integer("1", "1");
	}
	
	
	@Test
	public void Flow_1_1_For_range_angle_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle 1 & Velocity 1
		given(i_check_integer.Check_Integer("1","1")).willReturn(true);
		given(i_check_range_angle.ValidAngleRange("1")).willReturn(true);
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("1", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_check_range_angle,times(1)).ValidAngleRange("1");
	}
	
	@Test
	public void Flow_1_1_For_range_velocity_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle 1 & Velocity 1
		given(i_check_integer.Check_Integer("1","1")).willReturn(true);
		given(i_check_range_angle.ValidAngleRange("1")).willReturn(true);         
		given(i_check_range_velocity.ValidVelocityRange("1")).willReturn(true);
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("1", "1","7","7","N");
		
		//Then :- ValidVelocityRange function called one time.
		verify(i_check_range_velocity,times(1)).ValidVelocityRange("1");
	}
	
	@Test
	public void Flow_1_1_For_calc_angle_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle 1 & Velocity 1
		given(i_check_integer.Check_Integer("1","1")).willReturn(true);
		given(i_check_range_angle.ValidAngleRange("1")).willReturn(true);         
		given(i_check_range_velocity.ValidVelocityRange("1")).willReturn(true);
		given(i_calc_angle.Angle_in_Degree("1")).willReturn("0.017453");
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("1", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_calc_angle,times(1)).Angle_in_Degree("1");
	}
	
	@Test
	public void Flow_1_1_For_X_coodinate_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle 1 & Velocity 1
		given(i_check_integer.Check_Integer("1","1")).willReturn(true);
		given(i_check_range_angle.ValidAngleRange("1")).willReturn(true);         
		given(i_check_range_velocity.ValidVelocityRange("1")).willReturn(true);
		given(i_calc_angle.Angle_in_Degree("1")).willReturn("0.017453");
		given(i_calc_x.Coordinate_X("0.017453", "1")).willReturn("1");
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("1", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_calc_x,times(1)).Coordinate_X("0.017453", "1");
	}
	
	@Test
	public void Flow_1_1_For_Y_coodinate_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle 1 & Velocity 1
		given(i_check_integer.Check_Integer("1","1")).willReturn(true);
		given(i_check_range_angle.ValidAngleRange("1")).willReturn(true);         
		given(i_check_range_velocity.ValidVelocityRange("1")).willReturn(true);
		given(i_calc_angle.Angle_in_Degree("1")).willReturn("0.017453");
		given(i_calc_y.Coordinate_Y("0.017453", "1")).willReturn("0");
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("1", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_calc_y,times(1)).Coordinate_Y("0.017453", "1");
	}
	
	@Test
	public void Flow_1_1_For_Hit_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle 1 & Velocity 1
		given(i_check_integer.Check_Integer("1","1")).willReturn(true);
		given(i_check_range_angle.ValidAngleRange("1")).willReturn(true);         
		given(i_check_range_velocity.ValidVelocityRange("1")).willReturn(true);
		given(i_calc_angle.Angle_in_Degree("1")).willReturn("0.017453");
		given(i_hit_check.Comp_Coordinates("7", "7", "1", "0")).willReturn(false);
		given(i_calc_x.Coordinate_X("0.017453", "1")).willReturn("1");
		given(i_calc_y.Coordinate_Y("0.017453", "1")).willReturn("0");
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("1", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_hit_check,times(1)).Comp_Coordinates("7", "7", "1", "0");
	}
	
	@Test
	public void Flow_one_1_For_Integer_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle one & Velocity 1
		given(i_check_integer.Check_Integer("one","1")).willReturn(true);
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("one", "1","7","7","N");
		
		//Then :- Check_integer function called one time.
		verify(i_check_integer,times(1)).Check_Integer("one", "1");
	}
	
	
	@Test
	public void Flow_one_1_For_range_angle_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle one & Velocity 1
		given(i_check_integer.Check_Integer("one","1")).willReturn(false);   
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("one", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_check_range_angle,times(0)).ValidAngleRange("one");
	}
	
	@Test
	public void Flow_one_1_For_range_velocity_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle one & Velocity 1
		given(i_check_integer.Check_Integer("one","1")).willReturn(false);          
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("one ", "1","7","7","N");
		
		//Then :- ValidVelocityRange function called one time.
		verify(i_check_range_velocity,times(0)).ValidVelocityRange("1");
	}
	
	@Test
	public void Flow_one_1_For_calc_angle_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle one & Velocity 1
		given(i_check_integer.Check_Integer("one","1")).willReturn(false);  
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("one", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_calc_angle,times(0)).Angle_in_Degree("1");
	}
	
	@Test
	public void Flow_one_1_For_X_coodinate_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle one & Velocity 1
		given(i_check_integer.Check_Integer("one","1")).willReturn(false);  
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("one", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_calc_x,times(0)).Coordinate_X("0.017453", "1");
	}
	
	@Test
	public void Flow_one_1_For_Y_coodinate_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle one & Velocity 1
		given(i_check_integer.Check_Integer("one","1")).willReturn(false);  
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("one", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_calc_y,times(0)).Coordinate_Y("0.017453", "1");
	}
	
	@Test
	public void Flow_one_1_For_Hit_check_called_once() {
		//Given :- I am user ( X = 7 , Y=7 ).
		//When :- I enter angle one & Velocity 1
		given(i_check_integer.Check_Integer("one","1")).willReturn(false);  
		I_Flow_Class one = new Flow_Class(i_check_integer,i_check_range_angle,i_check_range_velocity,i_calc_angle,i_calc_x,i_calc_y,i_hit_check,i_nuclear_shot);
		one.get_flow("one", "1","7","7","N");
		
		//Then :- ValidAngleRange function called one time.
		verify(i_hit_check,times(0)).Comp_Coordinates("7", "7", "1", "0");
	}
	        

}
