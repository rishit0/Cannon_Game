package unit_test_cases;

public class Nuclear_Shot_Check implements I_Nuclear_Shot_Check {
	public boolean NHitCheck(String Target_x,String Target_y,String x,String y)
	{
		int X=Integer.parseInt(x);
		int Y=Integer.parseInt(y);
		int Target_X=Integer.parseInt(Target_x); 
		int Target_Y=Integer.parseInt(Target_y); 
		int XUL=Target_X+2, XLL=Target_X-2,YUL=Target_Y+2,YLL=Target_Y-2;
		if((X<=XUL && X>=XLL) && (Y<=YUL && Y>=YLL))
				return true;
		return false;
	}
}
