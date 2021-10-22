package unit_test_cases;

public class Hit_Check implements I_Hit_Check {

	public boolean Comp_Coordinates(String target_x, String target_y, String user_x, String user_y) {
		if(Integer.parseInt(target_x)==Integer.parseInt(user_x) && Integer.parseInt(target_y)==Integer.parseInt(user_y))
			return true;
		return false;
	}

}
