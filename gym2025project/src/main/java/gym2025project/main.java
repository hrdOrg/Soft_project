package gym2025project;
import java.util.Scanner;

public class main {
	
	public static instructor N =new instructor();
	public static Admin A=new Admin();
	public static client_msg M=new client_msg();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User R3=new User();
	    R3.set_username("masa");
		R3.set_age(22); 
		R3.set_numbphone("09763364");
		R3.set_pass("2511");
		R3.set_type("active client");
		R3.set_email("masa@gmail.com");
		A.creat_account(R3);
		
		User R2=new User();
	    R2.set_username("zenat");
		R2.set_age(25); 
		R2.set_numbphone("09763333");
		R2.set_pass("2524");
		R2.set_type("active client");
		R2.set_email("zenat@gmail.com");
		A.creat_account(R2);
		
		while(true) {
		
		System.out.println("Welcome to instructor page ^_^");
		   System.out.println("1. Creat  fitness program ");
		   System.out.println("2. show  fitness program ");
		   System.out.println("3. Delete  fitness program ");
		   System.out.println("4. Update  fitness program ");
		   System.out.println("5. Set schedules for group sessions");
		   System.out.println("6. Show schedules for group sessions");
		   
		   System.out.println("7. Send massege to client");
		   System.out.println("8. Send feedback to client");
		   
		   System.out.println("9. Add User fitness program ");
		   System.out.println("10. Show List of user fitness program ");
		   System.out.println("11. Show complete session of client ");
		   System.out.println("12. Update client weight ");
		   System.out.println("13. Calculating body mass index (BMI) ");
		   System.out.println("14. If the program's meetings end, change its status ");
		   System.out.println("15. Send motivation to client");
		   System.out.println("16. Send reminders or recommendations to client ");
		   
		   System.out.println("17. Notify clients about changes to program schedules ");
		   System.out.println("18. Announce new programs to clients ");
		   System.out.println("19. Notify clients about special offers ");
		
		   System.out.println("20. exit ");
		   System.out.println("enter the transaction number you want --->");
		   Scanner scanner=new Scanner(System.in);
		   int number=scanner.nextInt();
		   
		   switch(number) {
		   
		   case 1:{
			   program p=new program();
				
	            System.out.println("Enter program titel:");
	            scanner.nextLine();
	            String titel = scanner.nextLine();
	            p.set_titel(titel);

	            System.out.println("Enter duration of program:");
	            String duration = scanner.nextLine();
	            p.set_duration(duration);

	            System.out.println("Enter difficulty level to program:");
	           // scanner.nextLine();
	            String level = scanner.nextLine();
	            p.set_level(level);

	            System.out.println("Enter goals to prgram:");
	            String goals = scanner.nextLine();
	            p.set_goals(goals);

	            System.out.println("Enter price for program:");
	            String price = scanner.nextLine();
	            p.set_price(price);
	            
	            System.out.println("Enter link for program:");
	            String link = scanner.nextLine();
	            p.set_link(link);

	 
			 N.creat_program(p);			
			   
		   }
		   break;   
		   case 2:{
			   for(program pp: N.programList) {
					System.out.println("program titel:"+pp.get_titel());
					 System.out.println("program duration:"+pp.get_duration());
					 System.out.println("program goals:"+pp.get_goals());
					 System.out.println("program difficulty level:"+pp.get_level());
					 System.out.println("program link:"+pp.get_link());
					 System.out.println("program price:"+pp.get_price());
				 
			   
		   }
		   }
		   break;
		   
		   case 3:{
			   
			   System.out.println("enter titel of program that you want to delet it");
				 scanner.nextLine();
				 String l = scanner.nextLine();
				 N.delete_program(l);
			   
		   }
		   break;
		   case 4:{

                 System.out.println("a_ i want to update titel");
				 System.out.println("b_ i want to update duration");
				 System.out.println("c_ i want to update difficulty level");
				 System.out.println("d_ i want to update goals");
				 System.out.println("e_ i want to update price");
				 System.out.println("f_ i want to update link");
				 System.out.println("enter char you want update : ");
				 scanner.nextLine();
				 String update=scanner.nextLine();
				 switch(update) {
				 
				 case "a":{
					  System.out.println("Enter the titel of the program you want to update:");
					    String Nn = scanner.nextLine();
					    boolean userFound = false;

					    for (program p : N.programList) {
					        if (p.get_titel().equals(Nn)) {
					            System.out.println("Enter new titel:");
					            String NA = scanner.nextLine();
					            p.set_titel(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this program titel not found.");
					    }
					}
					break;
					
					
				    case "b":{
				    	  System.out.println("Enter the titel of the program you want to update:");
						    String Nn = scanner.nextLine();
						    boolean userFound = false;

						    for (program p : N.programList) {
						        if (p.get_titel().equals(Nn)) {
						            System.out.println("Enter new duration:");
						            String NA = scanner.nextLine();
						            p.set_duration(NA);
						            userFound = true;
						            break;
						        }
						    }

						    if (!userFound) {
						        System.out.println("User with this program titel not found.");
						    }
					 
				       }
				      break;
				      
				      
				 case "c":{
					  System.out.println("Enter the titel of the program you want to update:");
					    String Nn = scanner.nextLine();
					    boolean userFound = false;

					    for (program p : N.programList) {
					        if (p.get_titel().equals(Nn)) {
					            System.out.println("Enter new difficulty level:");
					            String NA = scanner.nextLine();
					            p.set_level(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this program titel not found.");
					    }
					 
				    }
				 break;
				 
				 
                 case "d":{
                	  System.out.println("Enter the titel of the program you want to update:");
					    String Nn = scanner.nextLine();
					    boolean userFound = false;

					    for (program p : N.programList) {
					        if (p.get_titel().equals(Nn)) {
					            System.out.println("Enter new goals:");
					            String NA = scanner.nextLine();
					            p.set_goals(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this program titel not found.");
					    }
					 
				 }
				 break;
				 
				 
                 case "e":{
                	  System.out.println("Enter the titel of the program you want to update:");
					    String Nn = scanner.nextLine();
					    boolean userFound = false;

					    for (program p : N.programList) {
					        if (p.get_titel().equals(Nn)) {
					            System.out.println("Enter new price:");
					            String NA = scanner.nextLine();
					            p.set_price(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this program titel not found.");
					    }
					 
				 }
				 break;
				 
				 
               case "f":{
            	   System.out.println("Enter the titel of the program you want to update:");
				    String Nn = scanner.nextLine();
				    boolean userFound = false;

				    for (program p : N.programList) {
				        if (p.get_titel().equals(Nn)) {
				            System.out.println("Enter new link:");
				            String NA = scanner.nextLine();
				            p.set_link(NA);
				            userFound = true;
				            break;
				        }
				    }

				    if (!userFound) {
				        System.out.println("User with this program titel not found.");
				    }
					 
				 }
				 break;
				 }
		   }
		   break;
		   
		   case 5:{
			   schedule s=new schedule();
				
	            System.out.println("Enter schedule titel:");
	            scanner.nextLine();
	            String titel = scanner.nextLine();
	            s.set_titel(titel);

	            System.out.println("Enter schedule date:");
	            String datee = scanner.nextLine();
	            s.set_date(datee);

	            System.out.println("Enter time of schedule:");
	            String timee = scanner.nextLine();
	            s.set_time(timee);

	            System.out.println("Enter type for schedule:");
	            String typee = scanner.nextLine();
	            s.set_type(typee);
	            
	            System.out.println("Enter type for meeting place:");
	            String placee = scanner.nextLine();
	            s.set_place(placee);
	            
	            N.set_schedule(s);
			   
		   }
		   break;
		   
		   
		   case 6:{
			   
			   for(schedule ss: N.scheduleList) {
				   
					System.out.println("titel of schedule:"+ss.get_titel());
					 System.out.println("date of schedule:"+ss.get_date());
					 System.out.println("time of schedule:"+ss.get_time());
					 System.out.println("type of schedule:"+ss.get_type());
					 System.out.println("meeting place of schedule:"+ss.get_place());
					 
			   }
			   
		   }
		   break;
		   case 7:{
			   System.out.println("enter email of user that you want to send msg for him:");
			   scanner.nextLine();
			   String msgg=scanner.nextLine();
			   for(User u:A.client) {
				   if(u.get_email().equals(msgg)) {
					   M.set_name(u.get_username());
					   M.set_email(msgg);
					   System.out.println("enter msg that you want sent to client:");
					   String Msgg=scanner.nextLine();
					   M.send_massege_to_client(Msgg);
					   System.out.println("msg sent >_<");
				   }
				   else {
					   System.out.println("User not found");
				   }
			   }
			   
			   
		   }
		   break;
		   case 8:{
			   System.out.println("enter email of user that you want to send feedback for him:");
			   scanner.nextLine();
			   String ff=scanner.nextLine();
			   for(User u:A.client) {
				   if(u.get_email().equals(ff)) {
					   M.set_name(u.get_username());
					   M.set_email(ff);
					   System.out.println("enter feedback that you want sent to client:");
					   String Msgg=scanner.nextLine();
					   M.send_feedback_to_client(Msgg);
					   System.out.println("feedback sent >_<");
				   }
				   else {
					   System.out.println("User not found");
				   }
			   }
			   
		   }
		   break;
		   case 9:{
			   
			   UserFitnessProgram F=new UserFitnessProgram();
			   System.out.println("enter name of user that you want to add user fitness program:");
			   scanner.nextLine();
			   String name=scanner.nextLine();
			   System.out.println("enter titel of program you want to track user progress on:");
			   String namee=scanner.nextLine();
			   boolean user=false;
			   boolean program=false;
			   
			   for(User u:A.client) {
				   if(u.get_username().equals(name)) {
					  user=true;
					  F.set_name(u);
					  
				   }
				  // else 
					  // System.out.println("User not found");
				   
			   }
			   for(program p:N.programList) {
				   if(p.get_titel().equals(namee)) {
					   program=true;
					   F.set_programName(p);
					   
				   }
				   else {
					   System.out.println("program not found"); 
				   }
			   }
			   
			   if(program && user) {
					
		            System.out.println("Enter gender of client:");
		            String gender = scanner.nextLine();
		            F.set_gender(gender);

		            System.out.println("Enter weight of client:");
		            double weight = scanner.nextDouble();
		            F.set_weight(weight);

		            System.out.println("Enter height of client:");
		            double height = scanner.nextDouble();
		            F.set_hight(height);

		            System.out.println("Enter fitness Goal:");
		            scanner.next();
		            String goals = scanner.nextLine();
		            F.set_fitnessGoal(goals);

		            System.out.println("Enter total Sessions:");
		            int total = scanner.nextInt();
		            F.set_totalSessions(total);
		            
		            System.out.println("Enter completed Sessions:");
		            int complete = scanner.nextInt();
		            F.set_completedSessions(complete);
		           
                   N.add_userFatnessProgram(F);
                   
			
			   }
			   
		   }
		   break;
		   case 10:{
			   
			   for(UserFitnessProgram f: N.useFitnessProgram) {
					System.out.println("gender of client:"+f.get_gender());
					 System.out.println("weight of client:"+f.get_weight());
					 System.out.println("height of client:"+f.get_height());
					 System.out.println("fitness Goal:"+f.get_fitnessGoal());
					 System.out.println("total Sessions:"+f.get_totalSessions());
					 System.out.println("completed Sessions:"+f.get_completedSessions());
				 
			   
		   }
			   
			
			   
		   }
		   break;
		   case 11:{
			   
			   
			   System.out.println("enter name of user that you want to show complete session:");
			   scanner.nextLine();
			   String name=scanner.nextLine();
			   
		  
			   for(UserFitnessProgram pp:N.useFitnessProgram) {
				   if(pp.get_name().equals(name)) {
					  
					  pp.completeSession();
					  
				   }
				  
			   }
			   
			   
		   }
		   break;
		   case 12:{
			   
			   
			   System.out.println("enter name of user that you want to update weight:");
			   scanner.nextLine();
			   String name=scanner.nextLine();
			   
		  
			   for(UserFitnessProgram pp:N.useFitnessProgram) {
				   if(pp.get_name().equals(name)) {
					   System.out.println("enter new weight:");
					   double d=scanner.nextDouble();
					   pp.updateWeight(d);
					 
				   }
				   
			   }
			   
		   }
		   break;
		   case 13:{
			   
			   
			   System.out.println("enter name of user that you want to calculate BMI:");
			   scanner.nextLine();
			   String name=scanner.nextLine();
			   
		  
			   for(UserFitnessProgram pp:N.useFitnessProgram) {
				   if(pp.get_name().equals(name)) {
					  
					  double d=pp.calculateBMI();
					  System.out.println("BMI="+d);
					  
				   }
				  
			   }
			   
		   }
		   break;
		   case 14:{
			   
			   System.out.println("enter name of user that you want to update Status program:");
			   scanner.nextLine();
			   String name=scanner.nextLine();
			   
		  
			   for(UserFitnessProgram pp:N.useFitnessProgram) {
				   if(pp.get_name().equals(name)) {
					  
					  for(program p:N.programList) {
						  if(p.get_titel().equals(pp.get_programName())) {
							  pp.updateStatusprogram(p);
							  System.out.println(p.status);
						  }
					  }
					  
				   }
				 
			   }
			   
			   
			   
		   }
		   break;
		   case 15:{
			   
			   System.out.println("enter email of user that you want to send motivation for him:");
			   scanner.nextLine();
			   String msgg=scanner.nextLine();
			   for(User u:A.client) {
				   if(u.get_email().equals(msgg)) {
					   M.set_name(u.get_username());
					   M.set_email(msgg);
					   System.out.println("enter motivation that you want sent to client:");
					   String Msgg=scanner.nextLine();
					   M.send_motivation_to_client(Msgg);
					   System.out.println("motivation sent >_<");
				   }
				   else {
					   System.out.println("User not found");
				   }
			   }
			   
		   }
		   break;
		   case 16:{
			   
			   System.out.println("enter email of user that you want to send reminders or recommendations to client:");
			   scanner.nextLine();
			   String msgg=scanner.nextLine();
			   for(User u:A.client) {
				   if(u.get_email().equals(msgg)) {
					   M.set_name(u.get_username());
					   M.set_email(msgg);
					   System.out.println("enter reminders or recommendations to client that you want sent to client:");
					   String Msgg=scanner.nextLine();
					   M.set_Notification(Msgg);
					   System.out.println("reminders or recommendations to client sent >_<");
				   }
				   else {
					   System.out.println("User not found");
				   }
			   }
			   
		   }
		   break;
		   case 17:{
			   
			   N.scheduleChange();
			   
		   }
		   break;
           case 18:{
        	   
        	   N.Newschedule();
			   
		   }
		   break;
           case 19:{
        	   
        	   N.scheduleChange();
			   
		   }
		   break;
		   
           case 20:{
        	   
           }
           
		   break;
		   
		   }
		   
		   }
		   
	}	   

}

