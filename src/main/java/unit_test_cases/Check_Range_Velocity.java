package unit_test_cases;

public class Check_Range_Velocity implements I_Check_Range_Velocity{
	public boolean ValidVelocityRange(String value) {
		if(Integer.parseInt(value)>0 && Integer.parseInt(value)<=20)
				return true;
		return false;
	}
}
