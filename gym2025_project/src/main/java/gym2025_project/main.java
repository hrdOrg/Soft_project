package gym2025_project;
import gym2025_project.Admin;

import gym2025_project.activity;
import gym2025_project.User;
import gym2025_project.sign_in;
import java.util.*;

public class main {
	
	public static Admin A=new Admin();
	public static instructor N=new instructor();
	public static suggestion_instructor sg=new  suggestion_instructor();
	
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
			   System.out.println("26. back");
			   System.out.println("enter the transaction number you want --->");
			Scanner scanner=new Scanner(System.in);
			 int num=scanner.nextInt();
			 switch(num) {
			 case 1:{
				 User u=new User();
			

		            System.out.println("Enter your username: ");
		            scanner.nextLine();
		            String nameee = scanner.nextLine();
		            u.set_username(nameee);

		            System.out.println("Enter your age: ");
		            int age = scanner.nextInt();
		            u.set_age(age);

		            System.out.println("Enter your email: ");
		            scanner.nextLine();
		            String emailll = scanner.nextLine();
		            u.set_email(emailll);

		            System.out.println("Enter your password: ");
		            String pass = scanner.nextLine();
		            u.set_pass(pass);

		            System.out.println("Enter your phone number: ");
		            String number = scanner.nextLine();
		            u.set_numbphone(number);

		            System.out.println("Enter your type: ");
		            String type = scanner.nextLine();
		            u.set_type(type);
		 
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
				 System.out.println("5.1 i want to update username");
				 System.out.println("5.2 i want to update email");
				 System.out.println("5.3 i want to update pass");
				 System.out.println("5.4 i want to update phonenum");
				 System.out.println("5.5 i want to update age");
				 System.out.println("5.6 i want to update type");
				 System.out.println("enter number you want---->");
				 int mm=scanner.nextInt();
				 switch(mm) {
				 
				 case 1:{
					  System.out.println("Enter the phone number of the user you want to update:");
					  scanner.nextLine();
					    String N = scanner.nextLine();
					    boolean userFound = false;

					    for (User u : A.client) {
					        if (u.get_numbphone().equals(N)) {
					            System.out.println("Enter new username:");
					            String NA = scanner.nextLine();
					            u.set_username(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        for (User m : A.instructor) {
					            if (m.get_numbphone().equals(N)) {
					                System.out.println("Enter new username:");
					                String NA = scanner.nextLine();
					                m.set_username(NA);
					                userFound = true;
					                break;
					            }
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this phone number not found.");
					    }
					}
					break;
				
				 case 2:{
					 System.out.println("Enter the phone number of the user you want to update:");
					  scanner.nextLine();
					    String N = scanner.nextLine();
					    boolean userFound = false;

					    for (User u : A.client) {
					        if (u.get_numbphone().equals(N)) {
					            System.out.println("Enter new email:");
					            String NA = scanner.nextLine();
					            u.set_email(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        for (User m : A.instructor) {
					            if (m.get_numbphone().equals(N)) {
					                System.out.println("Enter new email:");
					                String NA = scanner.nextLine();
					                m.set_email(NA);
					                userFound = true;
					                break;
					            }
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this phone number not found.");
					    }
					}
				 
				 break;
				 
				 case 3:{
					 System.out.println("Enter the phone number of the user you want to update:");
					  scanner.nextLine();
					    String N = scanner.nextLine();
					    boolean userFound = false;

					    for (User u : A.client) {
					        if (u.get_numbphone().equals(N)) {
					            System.out.println("Enter new pass:");
					            String NA = scanner.nextLine();
					            u.set_pass(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        for (User m : A.instructor) {
					            if (m.get_numbphone().equals(N)) {
					                System.out.println("Enter new pass:");
					                String NA = scanner.nextLine();
					                m.set_pass(NA);
					                userFound = true;
					                break;
					            }
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this phone number not found.");
					    }
					}
				  
				 
				 break;
				 
				 case 4:{
					 System.out.println("Enter the phone number of the user you want to update:");
					  scanner.nextLine();
					    String N = scanner.nextLine();
					    boolean userFound = false;

					    for (User u : A.client) {
					        if (u.get_numbphone().equals(N)) {
					            System.out.println("Enter new phone number :");
					            String NA = scanner.nextLine();
					            u.set_numbphone(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        for (User m : A.instructor) {
					            if (m.get_numbphone().equals(N)) {
					                System.out.println("Enter new phone number:");
					                String NA = scanner.nextLine();         
					                m.set_numbphone(NA);
					                userFound = true;
					                break;
					            }
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this phone number not found.");
					    }
					}
				  
				 
				 break; 
				 
				 case 5:{
					 System.out.println("Enter the phone number of the user you want to update:");
					  scanner.nextLine();
					    String N = scanner.nextLine();
					    boolean userFound = false;

					    for (User u : A.client) {
					        if (u.get_numbphone().equals(N)) {
					            System.out.println("Enter new age:");
					            int NA = scanner.nextInt();
					            u.set_age(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        for (User m : A.instructor) {
					            if (m.get_numbphone().equals(N)) {
					                System.out.println("Enter new age:");
					                int NA = scanner.nextInt();
						            m.set_age(NA);
					                userFound = true;
					                break;
					            }
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this phone number not found.");
					    }
					}
				  
				 }
			 }
				 break; 
				 
				 
				 case 6:{
					 
					 System.out.println("Enter the phone number of the user you want to update:");
					  scanner.nextLine();
					    String N = scanner.nextLine();
					    boolean userFound = false;

					    for (User u : A.client) {
					        if (u.get_numbphone().equals(N)) {
					            System.out.println("Enter new type:");
					            String NA = scanner.nextLine();
					            u.set_type(NA);
					            userFound = true;
					            break;
					        }
					    }

					    if (!userFound) {
					        for (User m : A.instructor) {
					            if (m.get_numbphone().equals(N)) {
					                System.out.println("Enter new type:");
					                String NA = scanner.nextLine();
						            m.set_type(NA);
					                userFound = true;
					                break;
					            }
					        }
					    }

					    if (!userFound) {
					        System.out.println("User with this phone number not found.");
					    }
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
		
		
   Scanner scanner=new Scanner(System.in);   
	sign_in s=new sign_in();	
	System.out.println("Sign in page --->");
	System.out.println("Enter your username");
	String nameuser=scanner.nextLine();
	System.out.println("Enter your password");
	String passsuser=scanner.nextLine();
	s.set_username(nameuser);
	s.set_pass(passsuser);
	s.sign_in(nameuser,passsuser, A);
	
	
	
	 if(A.msg.equals("Admin logged in successfully")) {
		 admin_menu();
	
	 }
	
	 else if(A.msg.equals("Wrong pass_A. Try again")) {
		 System.out.println("Enter your password");
			 passsuser=scanner.nextLine();
			s.set_username(nameuser);
			s.set_pass(passsuser);
			s.sign_in(nameuser,passsuser, A);
			 if(A.msg.equals("Admin logged in successfully")) {
				 admin_menu();
				
				 }
	 }
	 
	 else if(A.msg.equals("Wrong email_A. Try again")) {
		 System.out.println("Enter your username");
		  nameuser=scanner.nextLine();
			s.set_username(nameuser);
			s.set_pass(passsuser);
			s.sign_in(nameuser,passsuser, A);
			 if(A.msg.equals("Admin logged in successfully")) {
				 admin_menu();
				
				 }
	 }

	}
	 
	 
	 
	 }
