package unit_test_cases;

public class Check_Two_Player_Co implements I_Check_Two_Player_Co {
	
	public String Check_Who_win(boolean user_1, boolean user_2) {
		if(user_1==true && user_2==true)
			return "  It's Tie  !...";
		if(user_1==true)
			return "Wow!  Player 1 Won !...";
		if(user_2==true)
			return "Wow!  Player 2 Won !...";
		return "Take another Shot!!!";
	}

}
