package unit_test_cases;
import java.lang.Math;
import java.text.DecimalFormat;
public class Calc_Angle implements I_Calc_Angle {
	public String Angle_in_Degree(String angle){
		DecimalFormat df = new DecimalFormat("#.######");

		return df.format((Integer.parseInt(angle)*(Math.PI/180)));
	}
}
