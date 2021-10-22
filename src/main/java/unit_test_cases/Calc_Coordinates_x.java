package unit_test_cases;

import java.text.DecimalFormat;

public class Calc_Coordinates_x implements I_Calc_Coordinates_X{
	public String Coordinate_X(String angle,String velocity)
	{
		DecimalFormat df = new DecimalFormat("#");
		return df.format(Math.cos(Double.parseDouble(angle))*(Integer.parseInt(velocity)));
	}
}
