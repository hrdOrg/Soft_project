package gym2025project;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		instructor n=new instructor();
		program p=new program();
		program p1=new program();
		schedule s=new schedule();
		
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
		
		
		s.set_date("1-1-2025");
		s.set_titel("Yoga Basics");
		s.set_type("Online");
		s.set_place("https://example.com/session" );
		s.set_time("5PM");
		
		
		n.creat_program(p);
		System.out.println(n.msg);
		
		n.creat_program(p1);
		System.out.println(n.msg);
		
		n.delete_program("stringlifts");
		System.out.println(n.msg);
		
		n.delete_program("dania");
		System.out.println(n.msg);
		
		n.set_schedule(s);
		System.out.println(n.msg);
		
		n.scheduleChange();
		System.out.println(n.msg);
		n.Newschedule();
		System.out.println(n.msg);
		n.scheduleChange();
		System.out.println(n.msg);
		
		
		
		
	}

}
