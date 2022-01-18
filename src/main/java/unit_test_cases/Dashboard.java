package unit_test_cases;

import org.apache.commons.io.input.ReversedLinesFileReader;
import java.io.*;
import java.nio.charset.Charset;



public class Dashboard implements I_Dashboard{
//String name, String counter, String result implements I_Dashboard 

	public void Display_Dashboard(String name,int user, int counter, String result,String mode) {
		try {
			FileWriter fileW = new FileWriter("C:\\Users\\rishit.prajapati\\Downloads\\Cannon_Game\\Cannon_Game_1.O\\Cannon_Game\\Dashboard.txt",true);
			int i=0,j=0;
			
			fileW.write("\n"+"Name :- "+name+" ||  Shot :- "+(counter+1)+" ||  Result :- "+result);
//			while((i=fileR.read())!=(-1))
//			{
//				System.out.print((char)i);
//			}
			fileW.close();
			if(mode=="show") {
				File fileR = new File("C:\\Users\\rishit.prajapati\\Downloads\\Cannon_Game\\Cannon_Game_1.O\\Cannon_Game\\Dashboard.txt");
				ReversedLinesFileReader reader = new ReversedLinesFileReader(fileR, Charset.forName("utf-8"));
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("Dashboard");
				System.out.println("");
				while(j<user) {
					System.out.println(reader.readLine());
					j++;
				}
				System.out.println("----------------------------------------------------------------------------------");
			}
			
		}catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
