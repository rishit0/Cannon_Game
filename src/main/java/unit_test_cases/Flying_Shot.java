package unit_test_cases;

public class Flying_Shot implements I_Flying_Shot {

	@Override
	public boolean Shadow(String Target_x, String Target_y, String x, String y) 
	{
			int X=Integer.parseInt(x);
			int Y=Integer.parseInt(y);
			int Target_X=Integer.parseInt(Target_x); 
			int Target_Y=Integer.parseInt(Target_y); 
			int XUL=Target_X+1, XLL=Target_X-1,YUL=Target_Y+1,YLL=Target_Y-1;
			if(Target_X==X)
				if(Y==YUL || Y==YLL)
					return true;
			if(Target_Y==Y)
				if(X==XUL || X==XLL)
					return true;
			return false;
		}
}