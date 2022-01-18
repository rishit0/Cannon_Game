package Flow_class;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import unit_test_cases.I_Target_Generator;
import unit_test_cases.Target_Generator;




public class CannonApp {
		public static void main(String args[])
		{	
			I_Target_Generator tg = new Target_Generator();
			System.out.println();
			System.out.println("************************************** WELCOME TO CANNON GAME **************************************");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			boolean flag=true;
			do {

				String nsinput1="";
				int i=0;
				boolean shot=true;
				System.out.print("Please Enter Number of Players  : ");
				int play = Integer.parseInt(sc.next());
				String[] pl = new String[play];
				String[] name = new String[play];
				String[] x = new String[play];
				String[] y = new String[play];
				for(int k=0;k<play;k++)
				{	System.out.println("----------------------------------------------------------------------------------");
					x[k]=tg.Generate_Target();
					y[k]=tg.Generate_Target();
					System.out.print("Player "+(k+1)+" Name  : ");
					name[k]=sc.next();
					pl[k]="";
				}
				
				
				AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(App_Config.class);
				do
				{	
					
					for(int k=0;k<play;k++)
					{
						if(i%3==0 && i>0)
						{	
							System.out.println("----------------------------------------------------------------------------------");
							System.out.print("Hey! "+name[k]+", Do You Want To Use NUCLEAR SHOT or SHADOW SHOT ? [N/S] or NONE : ");
							nsinput1 = sc.next();
						}
						
						System.out.println("----------------------------------------------------------------------------------");
						System.out.println(name[k]+", You Target Coordinates are  X= "+ x[k] + "    & Y= " + y[k]);
						System.out.println("");
						System.out.print(name[k]+", Enter Angle Between [1-90]  : ");
						String angle = sc.next();
						System.out.print(name[k]+", Enter Velocity Between [1-20]  : ");
						String velocity = sc.next();
						System.out.println("----------------------------------------------------------------------------------");
						Flow_Class flow=ap.getBean(Flow_Class.class);
						pl[k] = flow.get_flow(angle, velocity, x[k], y[k],nsinput1,name[k],play,i);
						System.out.println(pl[k]);
						System.out.println("----------------------------------------------------------------------------------");
						if(pl[k]=="Enter in valid range !!!!!" || pl[k]=="Enter in Integer !!!!!")
							k--;
					}
					i++;
					for(int k=0;k<play;k++)
					{
						if(pl[k]=="Whoppie!! Target Hit ")
							{
								System.out.println(name[k]+" Taken Shots are " + i);
								System.out.println("----------------------------------------------------------------------------------");   
								shot=false;
							}
					}					
				}while(shot);
				
				System.out.println("----------------------------------------------------------------------------------");
				System.out.print("Do you want to play again ? [Y/N]  : ");
				String again = sc.next();
				if(again.equals("N")||again.equals("n"))
					flag = false;
				System.out.println("----------------------------------------------------------------------------------");
			}while(flag);
			System.out.println();
			System.out.println("Thank You For Playing Cannon game...");
		}
}