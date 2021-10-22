package unit_test_cases;

import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Target_Generator implements I_Target_Generator {

	public String Generate_Target() {
		int randomNum = ThreadLocalRandom.current().nextInt(1,11);
		return Integer.toString(randomNum);
	}

}
