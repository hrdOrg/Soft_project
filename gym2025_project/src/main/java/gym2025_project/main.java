package gym2025_project;
import gym2025_project.Admin;

import gym2025_project.activity;
import gym2025_project.User;
import gym2025_project.sign_in;
import java.util.*;
/*
public class main {
	
	public static Admin A=new Admin();
	public static instructor N=new instructor();
	public static suggestion_instructor sg=new  suggestion_instructor();
	public static client_msg M=new  client_msg();
	public static void instructor_menu() {
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
			
			   System.out.println("20.  add suggesion for admin ");
			   System.out.println("21. add feedback for admin");
			   System.out.println("22.  add helth whelness for admin");
			   
			   System.out.println("23. exit ");
			   
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
	        	   System.out.println("add siggesion for amin:");
				   scanner.nextLine();
				   String msgg=scanner.nextLine();
				   sg.add_suggesion(msgg);
	           }
	           
			   break;
	           case 21:{
	           	   System.out.println("add feedback for admian:");
	        				   scanner.nextLine();
	        				   String msgg=scanner.nextLine();
	        				   sg.add_feedback_instruc(msgg);
	           }
	          case 22:{
	        	  System.out.println("add helthwhelness for admian:");
				   scanner.nextLine();
				   String msgg=scanner.nextLine();
				   sg.add_helthwellnessarticles(msgg);
	          }
	          case 23:{
	        	  apply_sign_in.sign_in(A);
	          }
			   }
			   
			   }
	}
public static void client_menu() {
	
	 Scanner scanner = new Scanner(System.in);
     client client = new client(); // Create an instance of the client class
     int choice;
     while(true) {
	  System.out.println("\n=== Client Menu ===");
      System.out.println("1. Set Name");
      System.out.println("2. Get Name");
      System.out.println("3. Set Age");
      System.out.println("4. Get Age");
      System.out.println("5. Set Gender");
      System.out.println("6. Get Gender");
      System.out.println("7. Set Height");
      System.out.println("8. Get Height");
      System.out.println("9. Set Weight");
      System.out.println("10. Get Weight");
      System.out.println("11. Add Fitness Goal");
      System.out.println("12. View Fitness Goal");
      System.out.println("13. Delete Fitness Goal");
      System.out.println("14. Add Dietary Preference");
      System.out.println("15. View Dietary Preference");
      System.out.println("16. Delete Dietary Preference");
      System.out.println("17. Add Achievement");
      System.out.println("18. View Achievements");
      System.out.println("19. Delete Achievement");
      System.out.println("20. Calculate BMI");
      System.out.println("21. Exit");
      System.out.print("Enter your choice: ");

      
          choice = scanner.nextInt();
          scanner.nextLine(); // Consume newline character

          switch (choice) {
              case 1:
                  System.out.print("Enter Name: ");
                  String name = scanner.nextLine();
                  client.setName(name);
                  System.out.println("Name set successfully.");
                  break;
              case 2:
              	System.out.println("Name is:"+ client.getName());
              	break;
              case 3:
                  System.out.print("Enter Age: ");
                  int age = scanner.nextInt();
                  client.setAge(age);
                  System.out.println("Age set successfully.");
                  break;
              case 4:
              	System.out.println("Age is:"+client.getAge());
              	break;
              case 5:
                  System.out.print("Enter Gender: ");
                  String gender = scanner.next();
                  client.setGender(gender);
                  System.out.println("Gender set successfully.");
                  break;
              case 6:
              	System.out.println("Gender is:"+client.getGender());
              	break;
              case 7:
                  System.out.print("Enter Height: ");
                  double height = scanner.nextDouble();
                  client.setHight(height);
                  System.out.println("Height set successfully.");
                  break;
              case 8:
              	System.out.println("Height is:"+client.getHeight());
              	break;
              case 9:
                  System.out.print("Enter Weight: ");
                  double weight = scanner.nextDouble();
                  client.setWeight(weight);
                  System.out.println("Weight set successfully.");
                  break;
              case 10:
              	System.out.println("Weight is:"+client.getWeight());	
              	break;
              case 11:
                  System.out.print("Enter Fitness Goal: ");
                  String fitnessGoal = scanner.nextLine();
                  client.addFittnessGoals(fitnessGoal);
                  break;
              case 12:
              	System.out.println("Fittness Goals:"+client.getFittnessGoals());
              	break;
              case 13:
                  System.out.print("Enter Fitness Goal to Delete: ");
                  String goalToDelete = scanner.nextLine();
                  client.deleteFittnessGoals(goalToDelete);
                  break;
              case 14:
                  System.out.print("Enter Dietary Preference: ");
                  String dietary = scanner.nextLine();
                  client.addDietary(dietary);
                  break;
              case 15:
              	System.out.println("Dietary Preference: "+client.getDietary());
              	break;
              case 16:
                  System.out.print("Enter Dietary Preference to Delete: ");
                  String dietaryToDelete = scanner.nextLine();
                  client.deleteDietary(dietaryToDelete);
                  break;
              case 17:
                  System.out.print("Enter Achievement: ");
                  String achievement = scanner.nextLine();
                  client.addAchievements(achievement);
                  break;
              case 18:
                  System.out.println("Achievements: " + client.getAchievements());
                  break;
              case 19:
                  System.out.print("Enter Achievement to Delete: ");
                  String achievementToDelete = scanner.nextLine();
                  client.delAchievements(achievementToDelete);
                  break;
              case 20:
                  client.calBMI();
                  System.out.println("Your BMI: " + client.getBMI());
                  break;
              case 21:
            	  apply_sign_in.sign_in(A);
              default:
                  System.out.println("Invalid choice. Please try again.");
          }

      }

      
  }

	
public static void admin_menu() {
	
	   
		while(true) {
			 System.out.println("welcome to admin's page ^_^");
			   System.out.println("1. creat account");
			   System.out.println("2. show list of registered client");
			   System.out.println("3. show list of registered instructor");
			   System.out.println("4. delete account");
			   System.out.println("5. update account");
			   System.out.println("6. Approve new instructor registrations");
			   System.out.println("7. add user activity");
			   System.out.println("8. view_user_activity");
			   System.out.println("9. viewOverallStatistics");
			   System.out.println("10. register a user in a specific program");
			   System.out.println("11. View statistics on the most popular programs by enrollment");
			   System.out.println("12. Generate reports on attendance, and client progress");
			   System.out.println("13. Track active and completed programs");
			   System.out.println("14. show wellness  articles tips or recipes from Instructor");
			   System.out.println("15. approve wellness  articles tips or recipes from Instructor");
			   System.out.println("16. reject wellness  articles tips or recipes from Instructor");
			   System.out.println("17. show articles or tips shared on health and wellness");
			   System.out.println("18.  Approve articles or tips shared on health and wellness");
			   System.out.println("19. show feedback from instructor");
			   System.out.println("20. add_Subscription plan For Client");
			   System.out.println("21. add_Subscription plan For instructor");
			   System.out.println("22. delete_Subscription plan For Client");
			   System.out.println("23. delete_Subscription plan For instructor");
			   System.out.println("24. show_subscription Plan For Client");
			   System.out.println("25. show_subscription Plan For instructor");
			   System.out.println("26. exit");
			  
			   System.out.println("enter the transaction number you want --->");
			   Scanner scanner=new Scanner(System.in);
			    int num=scanner.nextInt();
			    switch(num) {
			 case 1:{
				 User u=new User();	
		           A.fill_info(u);
				A.creat_account(u);
		
				break;
			 }
			 
			 case 2:{
				 
					for(User uu: A.client) {
					System.out.println(uu.get_username());
					 System.out.println(uu.get_email());
					 System.out.println(uu.get_numbphone());
					 System.out.println(uu.get_pass());
					 System.out.println(uu.get_type());
					 System.out.println(uu.get_age());
				 }
					break;
			 }
			 case 3: {
				 
					for(User uu: A.instructor) {
					System.out.println(uu.get_username());
					 System.out.println(uu.get_email());
					 System.out.println(uu.get_numbphone());
					 System.out.println(uu.get_pass());
					 System.out.println(uu.get_type());
					 System.out.println(uu.get_age());
				 }
					break;
			 }
			 case 4:{
				 System.out.println("enter number of account that you want to delet it");
				 scanner.nextLine();
				 String n = scanner.nextLine();
				 A.delete_account(n);
			 }
			 case 5:{
				 System.out.println("enter number of account that you want to update it");
				 scanner.nextLine();
				 String f = scanner.nextLine();
				 System.out.println("enter the field you want to update");	
				 String w = scanner.nextLine();
				 A.update(f, w);	 
				 
			 }
			 break;
				 
			 case 6 :{
				 System.out.println("Enter the email of instructor that you want to approve them:");
				  scanner.nextLine();
				    String N = scanner.nextLine();
				    A.approve_instructor(N);
			 }
			break;
			
			 case 7:{
				 activity ac=new activity();
					
				 

		            System.out.println("Enter username for active client: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		              for(User u:A.client) {
		            	  if(u.get_email().equals(nameee)) {
		            		  if(u.get_type().equals("active client")){
		            			  ac.set_useremail(nameee);
		            			   System.out.println("Enter number of logins ");
		       		                 int nu=scanner.nextInt();
		       		                 ac.Set_logins(nu);
		       		              System.out.println("Enter number of program enrollment ");
		       		                 int nun=scanner.nextInt();
		       		                 ac.set_programenroll(nun);
		       		                 
		       		              System.out.println("user_activity added");
		            		  }
		            	  }
		            	  else   
		            		  System.out.println("user not found");
		              }
		              
		              A.add_user_activity(ac);          
			 }
			 break;
			 case 8:{
				 System.out.println("Enter username for active client: ");
		            scanner.nextLine();
		            String naeee = scanner.nextLine(); 
		            A.view_user_activity(naeee);
			 }
			 break;
			 
			 case 9:{
				A.viewOverallStatistics(); 
			 }
			 break;
			 case 10:{
				 User r=new User();
				 program p=new program();
				 System.out.println("Enter name of user that you want to regester them in program");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		            for(User u:A.client) {
		            	if(u.get_username().equals(nameee)) {
		            		r=u;
		            	}
		            	else
		            		System.out.println("user not found");
		            }
		            System.out.println("Enter titel of the program");
		            String nae = scanner.nextLine();
		            for(program o:N.programList) {
		            	if(o.get_titel().equals(nae)) {
		            		p=o;
		            	}
		            	else
		            		System.out.println("program not found");
		            }
		         
		       A.rgestration(r, p);     
			 }
			 break;
			 case 11:{
				 String papular=A.most_papularprogram(N.programList);
				 System.out.println("most papular program :"+papular);
			 }
			 break;
	
			 case 12: {
				    UserFitnessProgram f = null;
				    System.out.println("Enter name of user that you want to generate a report for:");
				    scanner.nextLine();
				    String neee = scanner.nextLine();

				    boolean found = false;
				    for (UserFitnessProgram l : N.useFitnessProgram) {
				        if (l.get_name().equals(neee)) {
				            f = l;
				            A.report_progress(f);
				            found = true;
				            break;
				        }
				    }

				    if (!found) {
				        System.out.println("User not found");
				    }
				}
			 break;
			 case 13:{
				A.trackProgram(N.programList);
			 }
			 break;
			 case 14:{
			  sg.show_wellnessarticles_fromInstructor();	 
			 }
			 break;
			 case 15:{
				 sg.approve_wellnessarticles_fromInstructor();
			 }
			 break;
			 case 16:{
				  sg.reject_wellnessarticles_fromInstructor();
			 }
			 break;
			 case 17:{
				 sg.show_helthwellnessarticles();
			 }
			 break;
			 case 18:{
				sg.approve_wellnessarticles_fromInstructor(); 
			 }
			 break;
			 case 19:{
				 sg.show_feedback();
			 }
			 break;
			 case 20:{
				 subscribtion_client sc=new subscribtion_client();
					
				
		            System.out.println("Enter useremail forsubscribtion plan for client: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		              for(User u:A.client) {
		            	  if(u.get_email().equals(nameee)) {
		            		  if(u.get_type().equals("active client")||u.get_type().equals("inactive client")){
		            			sc.set_useremail(nameee);
		            			   System.out.println("Enter type of subscription ");
		            			   String type_subc = scanner.nextLine();
		            			   sc.set_typeSub(type_subc);
		       		              System.out.println("Enter subsciription expires ");
		       		           String expire_subc = scanner.nextLine();
	            			   sc.setsxpires(expire_subc); 
		       		                 
		       		              System.out.println("user sub added");
		            		  }
		            	  }
		            	  else   
		            		  System.out.println("user not found");
		              }
		              
		             A.add_SubscriptionplanForClient(sc);         
			 }
			 
			 break;
			 case 21:{
				 subscription_instructor si=new subscription_instructor();
					
					
		            System.out.println("Enter useremail forsubscribtion plan for instructor: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		              for(User u:A.instructor) {
		            	  if(u.get_email().equals(nameee)) {
		            		  if(u.get_type().equals("pending instructor")){
		            			si.set_useremail(nameee);
		            			   System.out.println("Entersalary of instructor ");
		            			   String salary_subc = scanner.nextLine();
		            			   si.set_salary(salary_subc);
		       		            
		       		                 
		       		              System.out.println("user sub added");
		            		  }
		            	  }
		            	  else   
		            		  System.out.println("user not found");
		              }
		              
		             A.add_SubscriptionplanForinstructor(si); 
			 }
			 break;
			 case 22:{

		            System.out.println("Enter useremail for delete subscribtion plan for client: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		            A.delete_SubscriptionplanForClient(nameee);
			 }
			 break;
			 case 23:{
				   System.out.println("Enter useremail for delete subscribtion plan for instructor: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		           A.delete_SubscriptionplanForinstructor(nameee);
			 }
			 break;
			 case 24: {
				 subscribtion_client sc=new  subscribtion_client();
			    System.out.println("Enter useremail for show subscribtion plan for client: ");
	            scanner.nextLine();
	            String nameee = scanner.nextLine();
	            for( subscribtion_client c:A.subsc_clients) {
	            	if(c.get_email().equals(nameee)) {
	            		sc=c;
	            	}
	            	else
	            		System.out.println("not found");
	            		
	            }
				A.show_subscriptionPlanForClient(sc); 
				 
			 }
			 break;
			 case 25:{
				 subscription_instructor si=new subscription_instructor();
				    System.out.println("Enter useremail for show subscribtion plan for instructor: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		            for(  subscription_instructor i:A.subsc_instructor) {
		            	if(i.get_name().equals(nameee)) {
		            		si=i;
		            	}
		            	else
		            		System.out.println("not found");
		            		
		            }
				A.show_subscriptionPlanForinstructor(si);;
			 }
			 break;
			 case 26:{
				 apply_sign_in.sign_in(A);
			 }
			 break;
			 
			 } 
			 
			 
		}
}

	public static void main(String[] args) {
		
		program Q=new program();
		
		
		Q.set_titel("stringlifts");
		Q.set_duration("one month");
		Q.set_level("easy");
		Q.set_goals("losse 5kg");
		Q.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		Q.set_price("50 NIS");
		N.creat_program(Q);
		
	    User R3=new User();
	    R3.set_username("masa");
		R3.set_age(22); 
		R3.set_numbphone("09763364");
		R3.set_pass("2511");
		R3.set_type("active client");
		R3.set_email("masa@gmail.com");
		A.creat_account(R3);
		
		 User R4=new User();
		    R4.set_username("jamela");
			R4.set_age(27); 
			R4.set_numbphone("09799364");
			R4.set_pass("4444");
			R4.set_type("pending instructor");
			R4.set_email("jamela@gmail.com");
			A.creat_account(R4);
		UserFitnessProgram f=new UserFitnessProgram();
		f.set_name(R3);
		f.set_programName(Q);
		f.set_gender("F");
		f.set_completedSessions(5);
		f.set_totalSessions(5);
		f.set_fitnessGoal("loose 5Kg");
		f.set_hight(1.67);
		f.set_weight(80);
		
		N.add_userFatnessProgram(f);
		apply_sign_in.sign_in(A);
	System.out.println(A.msg);
	}
	 
	 }
*/