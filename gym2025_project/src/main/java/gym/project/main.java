package gym.project;
import java.util.*;
import java.util.logging.Logger;

/*

public class main {
	
	
	public static final Logger logger = Logger.getLogger(main.class.getName());
	
	public static Admin A=new Admin();
	public static instructor N=new instructor();
	public static suggestion_instructor sg=new  suggestion_instructor();
	public static client_msg M=new  client_msg();
	public static void instructor_menu() {
		while(true) {
			
			logger.info("Welcome to instructor page ^_^");
			   logger.info("1. Creat  fitness program ");
			   logger.info("2. show  fitness program ");
			   logger.info("3. Delete  fitness program ");
			   logger.info("4. Update  fitness program ");
			   logger.info("5. Set schedules for group sessions");
			   logger.info("6. Show schedules for group sessions");
			   
			   logger.info("7. Send massege to client");
			   logger.info("8. Send feedback to client");
			   
			   logger.info("9. Add User fitness program ");
			   logger.info("10. Show List of user fitness program ");
			   logger.info("11. Show complete session of client ");
			   logger.info("12. Update client weight ");
			   logger.info("13. Calculating body mass index (BMI) ");
			   logger.info("14. If the program's meetings end, change its status ");
			   logger.info("15. Send motivation to client");
			   logger.info("16. Send reminders or recommendations to client ");
			   
			   logger.info("17. Notify clients about changes to program schedules ");
			   logger.info("18. Announce new programs to clients ");
			   logger.info("19. Notify clients about special offers ");
			
			   logger.info("20.  add suggesion for admin ");
			   logger.info("21. add feedback for admin");
			   logger.info("22.  add helth whelness for admin");
			   
			   logger.info("23. exit ");
			   
			   logger.info("enter the transaction number you want --->");
			   Scanner scanner=new Scanner(System.in);
			   int number=scanner.nextInt();
			   
			   switch(number) {
			   
			   case 1:{
				   program p=new program();
					
		            logger.info("Enter program titel:");
		            scanner.nextLine();
		            String titel = scanner.nextLine();
		            p.set_titel(titel);

		            logger.info("Enter duration of program:");
		            String duration = scanner.nextLine();
		            p.set_duration(duration);

		            logger.info("Enter difficulty level to program:");
		           // scanner.nextLine();
		            String level = scanner.nextLine();
		            p.set_level(level);

		            logger.info("Enter goals to prgram:");
		            String goals = scanner.nextLine();
		            p.set_goals(goals);

		            logger.info("Enter price for program:");
		            String price = scanner.nextLine();
		            p.set_price(price);
		            
		            logger.info("Enter link for program:");
		            String link = scanner.nextLine();
		            p.set_link(link);

		 
				 N.creat_program(p);			
				   
			   }
			   break;   
			   case 2:{
				   for(program pp: N.programList) {
						logger.info("program titel:"+pp.get_titel());
						 logger.info("program duration:"+pp.get_duration());
						 logger.info("program goals:"+pp.get_goals());
						 logger.info("program difficulty level:"+pp.get_level());
						 logger.info("program link:"+pp.get_link());
						 logger.info("program price:"+pp.get_price());
					 
				   
			   }
			   }
			   break;
			   
			   case 3:{
				   
				   logger.info("enter titel of program that you want to delet it");
					 scanner.nextLine();
					 String l = scanner.nextLine();
					 N.delete_program(l);
				   
			   }
			   break;
			   case 4:{
				   logger.info("enter the titel of program that you want to update it");
					 scanner.nextLine();
					 String f = scanner.nextLine();
					 logger.info("enter the field you want to update");	
					 String w = scanner.nextLine();
					 N.update_project(f, w);
			   }
			   break;
			   
			   case 5:{
				   schedule s=new schedule();
					
		            logger.info("Enter schedule titel:");
		            scanner.nextLine();
		            String titel = scanner.nextLine();
		            s.set_titel(titel);

		            logger.info("Enter schedule date:");
		            String datee = scanner.nextLine();
		            s.set_date(datee);

		            logger.info("Enter time of schedule:");
		            String timee = scanner.nextLine();
		            s.set_time(timee);

		            logger.info("Enter type for schedule:");
		            String typee = scanner.nextLine();
		            s.set_type(typee);
		            
		            logger.info("Enter type for meeting place:");
		            String placee = scanner.nextLine();
		            s.set_place(placee);
		            
		            N.set_schedule(s);
				   
			   }
			   break;
			   
			   
			   case 6:{
				   
				   for(schedule ss: N.scheduleList) {
					   
						logger.info("titel of schedule:"+ss.get_titel());
						 logger.info("date of schedule:"+ss.get_date());
						 logger.info("time of schedule:"+ss.get_time());
						 logger.info("type of schedule:"+ss.get_type());
						 logger.info("meeting place of schedule:"+ss.get_place());
						 
				   }
				   
			   }
			   break;
			   case 7:{
				   logger.info("enter email of user that you want to send msg for him:");
				   scanner.nextLine();
				   String msgg=scanner.nextLine();
				   for(User u:A.client) {
					   if(u.get_email().equals(msgg)) {
						   M.set_name(u.get_username());
						   M.set_email(msgg);
						   logger.info("enter msg that you want sent to client:");
						   String Msgg=scanner.nextLine();
						   M.send_massege_to_client(Msgg);
						   logger.info("msg sent >_<");
					   }
					   else {
						   logger.info("User not found");
					   }
				   }
				   
				   
			   }
			   break;
			   case 8:{
				   logger.info("enter email of user that you want to send feedback for him:");
				   scanner.nextLine();
				   String ff=scanner.nextLine();
				   for(User u:A.client) {
					   if(u.get_email().equals(ff)) {
						   M.set_name(u.get_username());
						   M.set_email(ff);
						   logger.info("enter feedback that you want sent to client:");
						   String Msgg=scanner.nextLine();
						   M.send_feedback_to_client(Msgg);
						   logger.info("feedback sent >_<");
					   }
					   else {
						   logger.info("User not found");
					   }
				   }
				   
			   }
			   break;
			   case 9:{
				   
				   UserFitnessProgram F=new UserFitnessProgram();
				   logger.info("enter name of user that you want to add user fitness program:");
				   scanner.nextLine();
				   String name=scanner.nextLine();
				   logger.info("enter titel of program you want to track user progress on:");
				   String namee=scanner.nextLine();
				   boolean user=false;
				   boolean program=false;
				   
				   for(User u:A.client) {
					   if(u.get_username().equals(name)) {
						  user=true;
						  F.set_name(u);
						  
					   }
					  // else 
						  // logger.info("User not found");
					   
				   }
				   for(program p:N.programList) {
					   if(p.get_titel().equals(namee)) {
						   program=true;
						   F.set_programName(p);
						   
					   }
					   else {
						   logger.info("program not found"); 
					   }
				   }
				   
				   if(program && user) {
						
			            logger.info("Enter gender of client:");
			            String gender = scanner.nextLine();
			            F.set_gender(gender);

			            logger.info("Enter weight of client:");
			            double weight = scanner.nextDouble();
			            F.set_weight(weight);

			            logger.info("Enter height of client:");
			            double height = scanner.nextDouble();
			            F.set_hight(height);

			            logger.info("Enter fitness Goal:");
			            scanner.next();
			            String goals = scanner.nextLine();
			            F.set_fitnessGoal(goals);

			            logger.info("Enter total Sessions:");
			            int total = scanner.nextInt();
			            F.set_totalSessions(total);
			            
			            logger.info("Enter completed Sessions:");
			            int complete = scanner.nextInt();
			            F.set_completedSessions(complete);
			           
	                   N.add_userFatnessProgram(F);
	                   
				
				   }
				   
			   }
			   break;
			   case 10:{
				   
				   for(UserFitnessProgram f: N.useFitnessProgram) {
						logger.info("gender of client:"+f.get_gender());
						 logger.info("weight of client:"+f.get_weight());
						 logger.info("height of client:"+f.get_height());
						 logger.info("fitness Goal:"+f.get_fitnessGoal());
						 logger.info("total Sessions:"+f.get_totalSessions());
						 logger.info("completed Sessions:"+f.get_completedSessions());
					 
				   
			   }
				   
				
				   
			   }
			   break;
			   case 11:{
				   
				   
				   logger.info("enter name of user that you want to show complete session:");
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
				   
				   
				   logger.info("enter name of user that you want to update weight:");
				   scanner.nextLine();
				   String name=scanner.nextLine();
				   
			  
				   for(UserFitnessProgram pp:N.useFitnessProgram) {
					   if(pp.get_name().equals(name)) {
						   logger.info("enter new weight:");
						   double d=scanner.nextDouble();
						   pp.updateWeight(d);
						 
					   }
					   
				   }
				   
			   }
			   break;
			   case 13:{
				   
				   
				   logger.info("enter name of user that you want to calculate BMI:");
				   scanner.nextLine();
				   String name=scanner.nextLine();
				   
			  
				   for(UserFitnessProgram pp:N.useFitnessProgram) {
					   if(pp.get_name().equals(name)) {
						  
						  double d=pp.calculateBMI();
						  logger.info("BMI="+d);
						  
					   }
					  
				   }
				   
			   }
			   break;
			   case 14:{
				   
				   logger.info("enter name of user that you want to update Status program:");
				   scanner.nextLine();
				   String name=scanner.nextLine();
				   
			  
				   for(UserFitnessProgram pp:N.useFitnessProgram) {
					   if(pp.get_name().equals(name)) {
						  
						  for(program p:N.programList) {
							  if(p.get_titel().equals(pp.get_programName())) {
								  pp.updateStatusprogram(p);
								  logger.info(p.status);
							  }
						  }
						  
					   }
					 
				   }
				   
				   
				   
			   }
			   break;
			   case 15:{
				   
				   logger.info("enter email of user that you want to send motivation for him:");
				   scanner.nextLine();
				   String msgg=scanner.nextLine();
				   for(User u:A.client) {
					   if(u.get_email().equals(msgg)) {
						   M.set_name(u.get_username());
						   M.set_email(msgg);
						   logger.info("enter motivation that you want sent to client:");
						   String Msgg=scanner.nextLine();
						   M.send_motivation_to_client(Msgg);
						   logger.info("motivation sent >_<");
					   }
					   else {
						   logger.info("User not found");
					   }
				   }
				   
			   }
			   break;
			   case 16:{
				   
				   logger.info("enter email of user that you want to send reminders or recommendations to client:");
				   scanner.nextLine();
				   String msgg=scanner.nextLine();
				   for(User u:A.client) {
					   if(u.get_email().equals(msgg)) {
						   M.set_name(u.get_username());
						   M.set_email(msgg);
						   logger.info("enter reminders or recommendations to client that you want sent to client:");
						   String Msgg=scanner.nextLine();
						   M.set_Notification(Msgg);
						   logger.info("reminders or recommendations to client sent >_<");
					   }
					   else {
						   logger.info("User not found");
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
	        	   logger.info("add siggesion for amin:");
				   scanner.nextLine();
				   String msgg=scanner.nextLine();
				   sg.add_suggesion(msgg);
	           }
	           
			   break;
	           case 21:{
	           	   logger.info("add feedback for admian:");
	        				   scanner.nextLine();
	        				   String msgg=scanner.nextLine();
	        				   sg.add_feedback_instruc(msgg);
	           }
	          case 22:{
	        	  logger.info("add helthwhelness for admian:");
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
	  logger.info("\n=== Client Menu ===");
      logger.info("1. Set Name");
      logger.info("2. Get Name");
      logger.info("3. Set Age");
      logger.info("4. Get Age");
      logger.info("5. Set Gender");
      logger.info("6. Get Gender");
      logger.info("7. Set Height");
      logger.info("8. Get Height");
      logger.info("9. Set Weight");
      logger.info("10. Get Weight");
      logger.info("11. Add Fitness Goal");
      logger.info("12. View Fitness Goal");
      logger.info("13. Delete Fitness Goal");
      logger.info("14. Add Dietary Preference");
      logger.info("15. View Dietary Preference");
      logger.info("16. Delete Dietary Preference");
      logger.info("17. Add Achievement");
      logger.info("18. View Achievements");
      logger.info("19. Delete Achievement");
      logger.info("20. Calculate BMI");
      logger.info("21. Exit");
      System.out.print("Enter your choice: ");

      
          choice = scanner.nextInt();
          scanner.nextLine(); // Consume newline character

          switch (choice) {
              case 1:
                  System.out.print("Enter Name: ");
                  String name = scanner.nextLine();
                  client.setName(name);
                  logger.info("Name set successfully.");
                  break;
              case 2:
              	logger.info("Name is:"+ client.getName());
              	break;
              case 3:
                  System.out.print("Enter Age: ");
                  int age = scanner.nextInt();
                  client.setAge(age);
                  logger.info("Age set successfully.");
                  break;
              case 4:
              	logger.info("Age is:"+client.getAge());
              	break;
              case 5:
                  System.out.print("Enter Gender: ");
                  String gender = scanner.next();
                  client.setGender(gender);
                  logger.info("Gender set successfully.");
                  break;
              case 6:
              	logger.info("Gender is:"+client.getGender());
              	break;
              case 7:
                  System.out.print("Enter Height: ");
                  double height = scanner.nextDouble();
                  client.setHight(height);
                  logger.info("Height set successfully.");
                  break;
              case 8:
              	logger.info("Height is:"+client.getHeight());
              	break;
              case 9:
                  System.out.print("Enter Weight: ");
                  double weight = scanner.nextDouble();
                  client.setWeight(weight);
                  logger.info("Weight set successfully.");
                  break;
              case 10:
              	logger.info("Weight is:"+client.getWeight());	
              	break;
              case 11:
                  System.out.print("Enter Fitness Goal: ");
                  String fitnessGoal = scanner.nextLine();
                  client.addFittnessGoals(fitnessGoal);
                  break;
              case 12:
              	logger.info("Fittness Goals:"+client.getFittnessGoals());
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
              	logger.info("Dietary Preference: "+client.getDietary());
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
                  logger.info("Achievements: " + client.getAchievements());
                  break;
              case 19:
                  System.out.print("Enter Achievement to Delete: ");
                  String achievementToDelete = scanner.nextLine();
                  client.delAchievements(achievementToDelete);
                  break;
              case 20:
                  client.calBMI();
                  logger.info("Your BMI: " + client.getBMI());
                  break;
              case 21:
            	  apply_sign_in.sign_in(A);
              default:
                  logger.info("Invalid choice. Please try again.");
          }

      }

      
  }

	
public static void admin_menu() {
	
	   
		while(true) {
			 logger.info("welcome to admin's page ^_^");
			   logger.info("1. creat account");
			   logger.info("2. show list of registered client");
			   logger.info("3. show list of registered instructor");
			   logger.info("4. delete account");
			   logger.info("5. update account");
			   logger.info("6. Approve new instructor registrations");
			   logger.info("7. add user activity");
			   logger.info("8. view_user_activity");
			   logger.info("9. viewOverallStatistics");
			   logger.info("10. register a user in a specific program");
			   logger.info("11. View statistics on the most popular programs by enrollment");
			   logger.info("12. Generate reports on attendance, and client progress");
			   logger.info("13. Track active and completed programs");
			   logger.info("14. show wellness  articles tips or recipes from Instructor");
			   logger.info("15. approve wellness  articles tips or recipes from Instructor");
			   logger.info("16. reject wellness  articles tips or recipes from Instructor");
			   logger.info("17. show articles or tips shared on health and wellness");
			   logger.info("18.  Approve articles or tips shared on health and wellness");
			   logger.info("19. show feedback from instructor");
			   logger.info("20. add_Subscription plan For Client");
			   logger.info("21. add_Subscription plan For instructor");
			   logger.info("22. delete_Subscription plan For Client");
			   logger.info("23. delete_Subscription plan For instructor");
			   logger.info("24. show_subscription Plan For Client");
			   logger.info("25. show_subscription Plan For instructor");
			   logger.info("26. exit");
			  
			   logger.info("enter the transaction number you want --->");
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
					logger.info(uu.get_username());
					 logger.info(uu.get_email());
					 logger.info(uu.get_numbphone());
					 logger.info(uu.get_pass());
					 logger.info(uu.get_type());
					 System.out.println(uu.get_age());
				 }
					break;
			 }
			 case 3: {
				 
					for(User uu: A.instructor) {
					logger.info(uu.get_username());
					 logger.info(uu.get_email());
					 logger.info(uu.get_numbphone());
					 logger.info(uu.get_pass());
					 logger.info(uu.get_type());
					 System.out.println(uu.get_age());
				 }
					break;
			 }
			 case 4:{
				 logger.info("enter number of account that you want to delet it");
				 scanner.nextLine();
				 String n = scanner.nextLine();
				 A.delete_account(n);
			 }
			 case 5:{
				 logger.info("enter number of account that you want to update it");
				 scanner.nextLine();
				 String f = scanner.nextLine();
				 logger.info("enter the field you want to update");	
				 String w = scanner.nextLine();
				 A.update(f, w);	 
				 
			 }
			 break;
				 
			 case 6 :{
				 logger.info("Enter the email of instructor that you want to approve them:");
				  scanner.nextLine();
				    String N = scanner.nextLine();
				    A.approve_instructor(N);
			 }
			break;
			
			 case 7:{
				 activity ac=new activity();
					
				 

		            logger.info("Enter username for active client: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		              for(User u:A.client) {
		            	  if(u.get_email().equals(nameee)) {
		            		  if(u.get_type().equals("active client")){
		            			  ac.set_useremail(nameee);
		            			   logger.info("Enter number of logins ");
		       		                 int nu=scanner.nextInt();
		       		                 ac.Set_logins(nu);
		       		              logger.info("Enter number of program enrollment ");
		       		                 int nun=scanner.nextInt();
		       		                 ac.set_programenroll(nun);
		       		                 
		       		              logger.info("user_activity added");
		            		  }
		            	  }
		            	  else   
		            		  logger.info("user not found");
		              }
		              
		              A.add_user_activity(ac);          
			 }
			 break;
			 case 8:{
				 logger.info("Enter username for active client: ");
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
				 logger.info("Enter name of user that you want to regester them in program");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		            for(User u:A.client) {
		            	if(u.get_username().equals(nameee)) {
		            		r=u;
		            	}
		            	else
		            		logger.info("user not found");
		            }
		            logger.info("Enter titel of the program");
		            String nae = scanner.nextLine();
		            for(program o:N.programList) {
		            	if(o.get_titel().equals(nae)) {
		            		p=o;
		            	}
		            	else
		            		logger.info("program not found");
		            }
		         
		       A.rgestration(r, p);     
			 }
			 break;
			 case 11:{
				 String papular=A.most_papularprogram(N.programList);
				 logger.info("most papular program :"+papular);
			 }
			 break;
	
			 case 12: {
				    UserFitnessProgram f = null;
				    logger.info("Enter name of user that you want to generate a report for:");
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
				        logger.info("User not found");
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
					
				
		            logger.info("Enter useremail forsubscribtion plan for client: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		              for(User u:A.client) {
		            	  if(u.get_email().equals(nameee)) {
		            		  if(u.get_type().equals("active client")||u.get_type().equals("inactive client")){
		            			sc.set_useremail(nameee);
		            			   logger.info("Enter type of subscription ");
		            			   String type_subc = scanner.nextLine();
		            			   sc.set_typeSub(type_subc);
		       		              logger.info("Enter subsciription expires ");
		       		           String expire_subc = scanner.nextLine();
	            			   sc.setsxpires(expire_subc); 
		       		                 
		       		              logger.info("user sub added");
		            		  }
		            	  }
		            	  else   
		            		  logger.info("user not found");
		              }
		              
		             A.add_SubscriptionplanForClient(sc);         
			 }
			 
			 break;
			 case 21:{
				 subscription_instructor si=new subscription_instructor();
					
					
		            logger.info("Enter useremail forsubscribtion plan for instructor: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		              for(User u:A.instructor) {
		            	  if(u.get_email().equals(nameee)) {
		            		  if(u.get_type().equals("pending instructor")){
		            			si.set_useremail(nameee);
		            			   logger.info("Entersalary of instructor ");
		            			   String salary_subc = scanner.nextLine();
		            			   si.set_salary(salary_subc);
		       		            
		       		                 
		       		              logger.info("user sub added");
		            		  }
		            	  }
		            	  else   
		            		  logger.info("user not found");
		              }
		              
		             A.add_SubscriptionplanForinstructor(si); 
			 }
			 break;
			 case 22:{

		            logger.info("Enter useremail for delete subscribtion plan for client: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		            A.delete_SubscriptionplanForClient(nameee);
			 }
			 break;
			 case 23:{
				   logger.info("Enter useremail for delete subscribtion plan for instructor: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		           A.delete_SubscriptionplanForinstructor(nameee);
			 }
			 break;
			 case 24: {
				 subscribtion_client sc=new  subscribtion_client();
			    logger.info("Enter useremail for show subscribtion plan for client: ");
	            scanner.nextLine();
	            String nameee = scanner.nextLine();
	            for( subscribtion_client c:A.subsc_clients) {
	            	if(c.get_email().equals(nameee)) {
	            		sc=c;
	            	}
	            	else
	            		logger.info("not found");
	            		
	            }
				A.show_subscriptionPlanForClient(sc); 
				 
			 }
			 break;
			 case 25:{
				 subscription_instructor si=new subscription_instructor();
				    logger.info("Enter useremail for show subscribtion plan for instructor: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		            for(  subscription_instructor i:A.subsc_instructor) {
		            	if(i.get_name().equals(nameee)) {
		            		si=i;
		            	}
		            	else
		            		logger.info("not found");
		            		
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
		
	   logger.info(A.msg);
	}
	 
	 }

*/
