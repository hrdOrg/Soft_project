package gym2025project;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//UserFitnessProgram f=new UserFitnessProgram();

		
		//schedule s=new schedule();
		/*UserFitnessProgram f=new UserFitnessProgram();
		f.set_name("sara");
		f.set_age(23);
		f.set_programName("stringlifts");
		f.set_gender("F");
		f.set_completedSessions(5);
		f.set_totalSessions(5);
		f.set_fitnessGoal("loose 5Kg");
		f.set_hight(1.67);
		f.set_weight(80);
		f.calculateBMI();
		f.updateWeight(65.3);
		f.completeSession();
		f.displayProgress();
		f.calculateBMI();
		*/
		
		/*s.set_date("1-1-2025");
		s.set_titel("Yoga Basics");
		s.set_type("Online");
		s.set_place("https://example.com/session" );
		s.set_time("5PM");*/
		
		instructor n=new instructor();
		program p=new program();
		program p1=new program();
		program p2=new program();
		Admin A=new Admin();
		
		p.set_titel("stringlifts");
		p.set_duration("one month");
		p.set_level("easy");
		p.set_goals("losse 5kg");
		p.set_link("https://www.youtube.com/watch?v=IdjDjxNn9ws");
		p.set_price("50 NIS");
		
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
		
				
		
		n.creat_program(p);
		System.out.println(n.msg);
		
		n.creat_program(p1);
		System.out.println(n.msg);
		
		n.creat_program(p2);
		System.out.println(n.msg);
		
		for(program pr:n.programList) {
			
			System.out.println(pr.get_titel());
		}
		
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
		
		A.creat_account(R);
		A.creat_account(R2);
		A.creat_account(R3);
		A.creat_account(R4);
		
		A.rgestration(R, p1);
		A.rgestration(R2, p1);
		A.rgestration(R3, p2);
		
		String pup =A.most_papularprogram(n.programList);
		System.out.println(pup);
		
		
		
		/*n.delete_program("stringlifts");
		System.out.println(n.msg);
		
		n.delete_program("dania");
		System.out.println(n.msg);*/
		
		//n.set_schedule(s);
		//System.out.println(n.msg);
		
		//n.scheduleChange();
		//System.out.println(n.msg);
		//n.Newschedule();
		//System.out.println(n.msg);
		//n.scheduleChange();
		//System.out.println(n.msg);
		
		
		
		
	}

}
