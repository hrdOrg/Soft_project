package gym2025_project;
import gym2025_project.Admin;
import gym2025_project.activity;
import gym2025_project.User;
import gym2025_project.sign_in;
import java.util.*;
public class main {

	public static void main(String[] args) {
	sign_in sign=new sign_in();
	 User R=new User();
    R.set_username("rama");
	R.set_age(21); 
	R.set_numbphone("09765464");
	R.set_pass("1311");
	R.set_type("pending instructor");
	R.set_email("rama@gmail.com");
	
	 User R2=new User();
	    R2.set_username("dania");
		R2.set_age(21); 
		R2.set_numbphone("0999765464");
		R2.set_pass("1111");
		R2.set_type("inactive client");
		R2.set_email("dania@gmail.com");
		
		
			 User R3=new User();
		    R3.set_username("masa");
			R3.set_age(22); 
			R3.set_numbphone("09763364");
			R3.set_pass("2511");
			R3.set_type("active client");
			R3.set_email("masa@gmail.com");
			
			 User R4=new User();
			    R4.set_username("tala");
				R4.set_age(19); 
				R4.set_numbphone("0900765464");
				R4.set_pass("66111");
				R4.set_type("active client");
				R4.set_email("tala@gmail.com");
				
		
	Admin m=new Admin();
	m.creat_account(R);
	 System.out.println(m.msg);
	m.creat_account(R2);
	 System.out.println(m.msg);
		m.creat_account(R3);
	System.out.println(m.msg);
	m.creat_account(R4);
	System.out.println(m.msg);
	/*
	activity U1=new activity();
	U1.Set_logins(5);
	U1.set_useremail("rama@gmial.com");
	U1.set_programenroll(3);
	
	activity U2=new activity();
	U2.Set_logins(7);
	U2.set_useremail("dania@gmial.com");
	U2.set_programenroll(4);
	
	activity U3=new activity();
	U3.Set_logins(2);
	U3.set_useremail("masa@gmial.com");
	U3.set_programenroll(3);
	
	activity U4=new activity();
	U4.Set_logins(1);
	U4.set_useremail("tala@gmial.com");
	U4.set_programenroll(4);
	
	activity U5=new activity();
	U5.Set_logins(5);
	U5.set_useremail("heba@gmial.com");
	U5.set_programenroll(3);
	m.add_user_activity(U1);
	m.add_user_activity(U2);
	m.add_user_activity(U3);
	m.add_user_activity(U4);
	
	m.view_user_activity("tala@gmial.com");
	System.out.println(m.msg);
	sign.sign_in("haya@gmail.com","123hh", m);
	//m.viewOverallStatistics();
	 * 
	System.out.println(m.msg);
	subscription_instructor ss=new subscription_instructor();
	subscribtion_client cc=new subscribtion_client();
	
	ss.set_useremail("rama@gmail.com");
	ss.set_salary("10000$");
	
	cc.set_useremail("dania@gmial.com");
	cc.set_typeSub("monthly");
	cc.setsxpires("1/19/2025");
	
	m.add_SubscriptionplanForinstructor(ss);
	System.out.println(m.msg);
	m.add_SubscriptionplanForClient(cc);
	System.out.println(m.msg);
	
	m.delete_SubscriptionplanForClient("dania@gmial.com");
	System.out.println(m.msg);
	m.delete_SubscriptionplanForinstructor("rama@gmail.com");
	System.out.println(m.msg);
	m.delete_SubscriptionplanForinstructor("rama@gmail.com");
	System.out.println(m.msg);
	for(subscribtion_client sc:m.subsc_clients) {
		m.show_subscriptionPlanForClient(sc);
	
		*/
	/*
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter name of client you want to send massege for he");
	String name=scanner.nextLine();
	
	client_msg cm=new client_msg();
	cm.set_name(name);
	System.out.println(cm.get_name());
	
	for(User u:m.client) {
		if (name.equals(u.get_username())) {
			cm.set_email(u.get_email());
			System.out.println("enter massege you want to send");
			String msg=scanner.nextLine();
			cm.send_massege_to_client(msg);
			
			System.out.println("done");
		}
	}
	for(String h:cm.msgsent){
		System.out.println(h);
	}
	*/

	//f.calculateBMI();
	//f.updateWeight(65.3);
	//f.completeSession();
	//f.displayProgress();
	//f.calculateBMI();
	//m.report_progress(f);
	/*
	program p=new program();
	program p1=new program();
	program p2=new program();
	p.set_titel("stringlifts");
	p.set_duration("one month");
	p.set_level("easy");
	p.set_goals("losse 5kg");
	p.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
	p.set_price("50 NIS");
	System.out.println("befor:"+p.status);
	p1.set_titel("Yoga Basics"); 
	p1.set_duration("month");
	p1.set_level("easy");
	p1.set_goals("losse 10kg");
	p1.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
	p1.set_price("100 NIS");
	
	p2.set_titel("Janbaz Basics"); 
	p2.set_duration("three month");
	p2.set_level("middle");
	p2.set_goals("losse 8kg");
	p2.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
	p2.set_price("150 NIS");
	
	System.out.println(R.get_username());
	UserFitnessProgram f=new UserFitnessProgram();
	f.set_name(R);
	//f.set_age(23);
	f.set_programName(p);
	f.set_gender("F");
	f.set_completedSessions(5);
	f.set_totalSessions(5);
	f.set_fitnessGoal("i want to arrive to normal wheight");
	f.set_hight(1.67);
	f.set_weight(80);
	f.updateStatusprogram(p);
	//f.displayProgress();
	System.out.println("after:"+p.status);
	UserFitnessProgram f2=new UserFitnessProgram();
	//m.most_papularprogram(null);
	m.report_progress(f2);
	System.out.println(m.msg);
	
	*/
	sign.sign_in("heba@gmail.com","1111",m);

	m.creat_account(R);
	System.out.println(m.msg);
	
	m.approve_instructor("rama@gmail.com");
	System.out.println(m.msg);
}

}	