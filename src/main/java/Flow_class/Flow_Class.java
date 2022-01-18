package Flow_class;

import unit_test_cases.*;

public class Flow_Class implements I_Flow_Class {
	private I_Check_Integer i_check_integer;
	private I_Check_Range_Angle i_check_range_angle;
	private I_Check_Range_Velocity i_check_range_velocity;
	private I_Calc_Angle i_calc_angle;
	private I_Calc_Coordinates_X i_calc_x;
	private I_Calc_Coordinates_y i_calc_y;
	private I_Hit_Check i_hit_check;
	private I_Nuclear_Shot_Check i_nuclear_shot_check;
	private I_Flying_Shot i_flying_shot;
	private I_Dashboard i_dashboard;
	public Flow_Class(I_Check_Integer i_check_integer,
			I_Check_Range_Angle i_check_range_angle, I_Check_Range_Velocity i_check_range_velocity,
			I_Calc_Angle i_calc_angle, I_Calc_Coordinates_X i_calc_x, I_Calc_Coordinates_y i_calc_y,
			I_Hit_Check i_hit_check,I_Nuclear_Shot_Check i_nuclear_shot_check,I_Flying_Shot i_flying_shot,I_Dashboard i_dashboard) {
		this.i_check_integer = i_check_integer;
		this.i_check_range_angle = i_check_range_angle;
		this.i_check_range_velocity = i_check_range_velocity;
		this.i_calc_angle = i_calc_angle;
		this.i_calc_x = i_calc_x;
		this.i_calc_y = i_calc_y;
		this.i_hit_check = i_hit_check;
		this.i_nuclear_shot_check=i_nuclear_shot_check;
		this.i_flying_shot=i_flying_shot;
		this.i_dashboard=i_dashboard;
	}
	
	public String get_flow(String angle,String velocity,String target_x,String target_y,String nsinput,String name,int user,int counter) {
		
		boolean result = i_check_integer.Check_Integer(angle, velocity);
		boolean ang_range=false,vel_range=false,nuc_check=false;
		String ang_calc,user_x,user_y;
		if(result)
			ang_range = i_check_range_angle.ValidAngleRange(angle);
		else
			return "Enter in Integer !!!!!";
		if(ang_range)
			vel_range = i_check_range_velocity.ValidVelocityRange(velocity);
		if(vel_range) {
			ang_calc = i_calc_angle.Angle_in_Degree(angle);
			user_x = i_calc_x.Coordinate_X(ang_calc, velocity);
			user_y = i_calc_y.Coordinate_Y(ang_calc, velocity);
			if(i_hit_check.Comp_Coordinates(target_x, target_y, user_x, user_y)) {
				i_dashboard.Display_Dashboard(name, user, counter, "Win", "show");
				return "Whoppie!! Target Hit ";
			}
			System.out.println();
			System.out.println("Your shot is X = " + user_x + "  Y = " + user_y);
			
		    if( nsinput.equals("N") || nsinput.equals("n")  )
		    	nuc_check = i_nuclear_shot_check.NHitCheck( target_x, target_y, user_x, user_y);
		    if( nsinput.equals("S") || nsinput.equals("s")  )
		    	nuc_check = i_flying_shot.Shadow( target_x, target_y, user_x, user_y);
		    if(nuc_check) 
		    {	i_dashboard.Display_Dashboard(name, user, counter, "Win", "show");
				return "Whoppie!! Target Hit ";
			}
		    i_dashboard.Display_Dashboard(name, user, counter, "Lose", "");
			return "Take another Shot!!!";
			}
		
		return "Enter in valid range !!!!!";
	}
}
