package Flow_class;

import unit_test_cases.*;

public class For_Multiplayer implements I_For_Multiplayer {

	private I_Check_Integer i_check_integer;
	private I_Check_Range_Angle i_check_range_angle;
	private I_Check_Range_Velocity i_check_range_velocity;
	private I_Calc_Angle i_calc_angle;
	private I_Calc_Coordinates_X i_calc_x;
	private I_Calc_Coordinates_y i_calc_y;
	private I_Hit_Check i_hit_check;
	private I_Nuclear_Shot_Check i_nuclear_shot_check;
	private I_Check_Two_Player_Co i_check_two_player_co;
	
	public For_Multiplayer(I_Check_Integer i_check_integer, I_Check_Range_Angle i_check_range_angle,
			I_Check_Range_Velocity i_check_range_velocity, I_Calc_Angle i_calc_angle, I_Calc_Coordinates_X i_calc_x,
			I_Calc_Coordinates_y i_calc_y, I_Hit_Check i_hit_check, I_Nuclear_Shot_Check i_nuclear_shot_check,I_Check_Two_Player_Co i_check_two_player_co) {
		super();
		this.i_check_integer = i_check_integer;
		this.i_check_range_angle = i_check_range_angle;
		this.i_check_range_velocity = i_check_range_velocity;
		this.i_calc_angle = i_calc_angle;
		this.i_calc_x = i_calc_x;
		this.i_calc_y = i_calc_y;
		this.i_hit_check = i_hit_check;
		this.i_nuclear_shot_check = i_nuclear_shot_check;
		this.i_check_two_player_co = i_check_two_player_co;
	}

	
	
	public String Multi_player(String target_x_1, String target_y_1, String target_x_2, String target_y_2,String angle_1, String velocity_1, String angle_2, String velocity_2, String nsinput1, String nsinput2) {

			boolean result = i_check_integer.Check_Integer(angle_1, velocity_1);
			boolean ang_range2=false,vel_range2=false,nuc_check2=false;
			boolean ang_range=false,vel_range=false,nuc_check=false;
			String ang_calc,user_x,user_y;
			boolean user_1_hit=false,user_2_hit=false;
			if(result)
				ang_range = i_check_range_angle.ValidAngleRange(angle_1);
			else
				return "Player 1!,  Enter in Integer !!!!!";
			if(ang_range)
				vel_range = i_check_range_velocity.ValidVelocityRange(velocity_1);
			if(vel_range) {
				ang_calc = i_calc_angle.Angle_in_Degree(angle_1);
				user_x = i_calc_x.Coordinate_X(ang_calc, velocity_1);
				user_y = i_calc_y.Coordinate_Y(ang_calc, velocity_1);
				if(i_hit_check.Comp_Coordinates(target_x_1, target_y_1, user_x, user_y)) 
					user_1_hit=true;
				System.out.println("====================================================================================");
				System.out.println("Player 1 shot is X = " + user_x + "  Y = " + user_y);
				System.out.println("====================================================================================");
			    if( nsinput1.equals("Y") || nsinput1.equals("y")  )
			    {
			    	nuc_check = i_nuclear_shot_check.NHitCheck( target_x_1, target_y_1, user_x, user_y);
			    	if(nuc_check) 
			    		user_1_hit=true;
			    	else
			    		user_1_hit=false;
			    }
			}
			
			boolean result2 = i_check_integer.Check_Integer(angle_2, velocity_2);
			String ang_calc2,user_x2,user_y2;
			if(result2)
				ang_range2 = i_check_range_angle.ValidAngleRange(angle_2);
			else
				return "Player 2!,   Enter in Integer !!!!!";
			if(ang_range2)
				vel_range2 = i_check_range_velocity.ValidVelocityRange(velocity_2);
			if(vel_range2) {
				ang_calc2 = i_calc_angle.Angle_in_Degree(angle_2);
				user_x2 = i_calc_x.Coordinate_X(ang_calc2, velocity_2);
				user_y2 = i_calc_y.Coordinate_Y(ang_calc2, velocity_2);
				if(i_hit_check.Comp_Coordinates(target_x_2, target_y_2, user_x2, user_y2)) 
					user_2_hit=true;
				System.out.println();
				System.out.println("====================================================================================");
				System.out.println("Player 2 shot is X = " + user_x2 + "  Y = " + user_y2);
				System.out.println("====================================================================================");
			    if( nsinput2.equals("Y") || nsinput2.equals("y")  )
			    {
			    	nuc_check2 = i_nuclear_shot_check.NHitCheck( target_x_2, target_y_2, user_x2, user_y2);
				    if(nuc_check2) 
				    	user_2_hit=true;
				    else
				    	user_2_hit=false;
			    }
			    return i_check_two_player_co.Check_Who_win(user_1_hit, user_2_hit);
				}
			return "Enter in valid range !!!!!";
		}

}
