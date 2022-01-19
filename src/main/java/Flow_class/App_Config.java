package Flow_class;

import org.springframework.context.annotation.Bean;

import unit_test_cases.*;

public class App_Config {
	@Bean(name="I_Check_Integer")
	public Check_Integer_or_not create_Int_Checker() {
		return new Check_Integer_or_not();
	}
	@Bean(name="I_Check_Range_Angle")
	public Check_Range_Angle create_Range_Angle() {
		return new Check_Range_Angle();
	}
	@Bean(name="I_Check_Range_Velocity")
	public Check_Range_Velocity create_Range_Velocity() {
		return new Check_Range_Velocity();
	}
	@Bean(name="I_Calc_Angle")
	public Calc_Angle create_Calc_Angle() {
		return new Calc_Angle();
	}
	@Bean(name="I_Calc_Coordinates_X")
	public Calc_Coordinates_x create_Calc_Coordinates_x() {
		return new Calc_Coordinates_x();
	}
	@Bean(name="I_Calc_Coordinates_y")
	public Calc_Coordinates_y create_Calc_Coordinates_y() {
		return new Calc_Coordinates_y();
	}
	@Bean(name="I_Hit_Check")
	public Hit_Check creat_Hit_Check() {
		return new Hit_Check();
	}
	@Bean(name="I_Nuclear_Shot_Check")
	public Nuclear_Shot_Check create_Nuclear_Shot_Check()
	{
		return new Nuclear_Shot_Check();
	}
	@Bean(name="I_Check_Two_Player_Co")
	public Check_Two_Player_Co create_Check_Two_Player_Co()
	{
		return new Check_Two_Player_Co();
	}
	@Bean(name="I_Flying_Shot")
	public Flying_Shot create_Flying_Shot()
	{
		return new Flying_Shot();
	}

	
	
	@Bean(name="I_Flow_Class")
	public Flow_Class creatFizzBuzz_flow_test()
	{
		return new Flow_Class(create_Int_Checker(),create_Range_Angle(),create_Range_Velocity(),create_Calc_Angle(),create_Calc_Coordinates_x(),create_Calc_Coordinates_y(),creat_Hit_Check(),create_Nuclear_Shot_Check(),create_Flying_Shot());
	}
	@Bean(name="I_For_Multiplayer")
	public For_Multiplayer creatFor_Multiplayer()
	{
		return new For_Multiplayer(create_Int_Checker(),create_Range_Angle(),create_Range_Velocity(),create_Calc_Angle(),create_Calc_Coordinates_x(),create_Calc_Coordinates_y(),creat_Hit_Check(),create_Nuclear_Shot_Check(),create_Check_Two_Player_Co());
	}
}
