package gym2025_project;

import java.util.Scanner;

public class apply_sign_in {
public static void sign_in(Admin A) {
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
			 main.admin_menu();
		
		 }
		
		 else if(A.msg.equals("Wrong pass_A. Try again")) {
			 System.out.println("Enter your password");
				 passsuser=scanner.nextLine();
				s.set_username(nameuser);
				s.set_pass(passsuser);
				s.sign_in(nameuser,passsuser, A);
				 if(A.msg.equals("Admin logged in successfully")) {
					 main.admin_menu();
					
					 }
		 }
		 
		 else if(A.msg.equals("Wrong email_A. Try again")) {
			 System.out.println("Enter your username");
			  nameuser=scanner.nextLine();
				s.set_username(nameuser);
				s.set_pass(passsuser);
				s.sign_in(nameuser,passsuser, A);
				 if(A.msg.equals("Admin logged in successfully")) {
					 main.admin_menu();
					
					 }
		 }
//====================================================================================================================			
		 else if(A.msg.equals("client logged in successfully")) {
			 main.client_menu();
		
		 }
		
		 else if(A.msg.equals("Wrong pass_c. Try again")) {
			 System.out.println("Enter your password");
				 passsuser=scanner.nextLine();
				s.set_username(nameuser);
				s.set_pass(passsuser);
				s.sign_in(nameuser,passsuser, A);
				 if(A.msg.equals("client logged in successfully")) {
					 main.client_menu();
					 }
		 }
		 
		 else if(A.msg.equals("Wrong email_c. Try again")) {
			 System.out.println("Enter your username");
			  nameuser=scanner.nextLine();
				s.set_username(nameuser);
				s.set_pass(passsuser);
				s.sign_in(nameuser,passsuser, A);
				 if(A.msg.equals("client logged in successfully")) {
					 main.client_menu();
					
					 }
		 }
	//========================================================================================================================================	 
		 else if(A.msg.equals("instructor logged in successfully")) {
			 main.instructor_menu();
		
		 }
		
		 else if(A.msg.equals("Wrong pass_I. Try again")) {
			 System.out.println("Enter your password");
				 passsuser=scanner.nextLine();
				s.set_username(nameuser);
				s.set_pass(passsuser);
				s.sign_in(nameuser,passsuser, A);
				 if(A.msg.equals("instructor logged in successfully")) {
					 main.instructor_menu();
					 }
		 }
		 
		 else if(A.msg.equals("Wrong email_I. Try again")) {
			 System.out.println("Enter your username");
			  nameuser=scanner.nextLine();
				s.set_username(nameuser);
				s.set_pass(passsuser);
				s.sign_in(nameuser,passsuser, A);
				 if(A.msg.equals("instructor logged in successfully")) {
					 main.instructor_menu();
					
					 }
		 }



}
}
