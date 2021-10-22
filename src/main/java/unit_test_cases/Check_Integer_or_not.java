package unit_test_cases;


public class Check_Integer_or_not implements I_Check_Integer{
	public boolean Check_Integer(String angle,String velocity) 
	{		
		if( angle.matches("\\d+") && velocity.matches("\\d+"))
			return true;
		return false;
    }	
}