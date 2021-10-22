package Flow_class;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import unit_test_cases.I_Target_Generator;
import unit_test_cases.Target_Generator;

public class CannonApp {
		public static void main(String args[])
		{	System.out.println();
			System.out.println("----------Game-------------   ");
			boolean flag=true;
			do {
				I_Target_Generator tg = new Target_Generator();
				String x = tg.Generate_Target();
				String y = tg.Generate_Target();
				System.out.println("");
				String result="",nsinput="";
				int i=1;
				System.out.println("====================================================================================");
				Scanner sc = new Scanner(System.in);
				do
				{	
					System.out.println("Target coordinates are  X= "+ x + "    & Y= " + y);
					System.out.println("");
					System.out.println("Enter Angle between [1-90]");
					String angle = sc.next();
					
					System.out.println("Enter Velocity between [1-20]  ");
					String velocity = sc.next();
					
					AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(App_Config.class);
					
					Flow_Class flow=ap.getBean(Flow_Class.class);
					
					result = flow.get_flow(angle, velocity, x, y,nsinput);
					System.out.println();
					if(result=="Take another Shot!!!")
						System.out.println("Oops you missed the target !!");
					System.out.println();
					
					System.out.println(result);
					System.out.println("");
					System.out.println("====================================================================================");
					if(result=="Take another Shot!!!") {
						i++;
						if(((i%3)-1) == 0 )
						{
							System.out.println("Hey! Do you want to use NUCLEAR SHOT ? [Y/N]");
							nsinput = sc.next();
							System.out.println("====================================================================================");
						}
					}
				}while(result=="Take another Shot!!!" || result=="Enter in Integer !!!!!" || result=="Enter in valid range !!!!!");
				System.out.println("Taken Shots are " + i);
				System.out.println("====================================================================================");
				System.out.println("Do you want to play again ? [Y/N]");
				String again = sc.next();
				if(again.equals("N")||again.equals("n"))
					flag = false;
				System.out.println("====================================================================================");
			}while(flag);
			System.out.println();
			System.out.println("Thank you for playing Cannon game...");
		}
}