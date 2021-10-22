package unit_test_cases;

public class Check_Range_Angle implements I_Check_Range_Angle{
	public boolean ValidAngleRange(String value) {
		if(Integer.parseInt(value)>0 && Integer.parseInt(value)<=90)
				return true;
		return false;
	}
}
