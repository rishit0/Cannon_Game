package unit_test_cases;

import java.text.DecimalFormat;

public class Calc_Coordinates_y implements I_Calc_Coordinates_y {
	public String Coordinate_Y(String angle,String velocity)
	{
		DecimalFormat df = new DecimalFormat("#");
		return df.format(Math.sin(Double.parseDouble(angle))*(Integer.parseInt(velocity)));
	}
}
