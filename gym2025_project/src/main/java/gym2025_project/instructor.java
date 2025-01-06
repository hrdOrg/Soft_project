package gym2025_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class instructor {
	public String msg;
	public static ArrayList<program> programList=new ArrayList<program>();
	public static ArrayList<schedule> scheduleList=new ArrayList<schedule>();
	public static ArrayList<String> Notification=new ArrayList<String>();
    public static ArrayList<UserFitnessProgram> useFitnessProgram=new ArrayList<UserFitnessProgram>();
    Scanner scanner=new Scanner(System.in);
	
	public void add_userFatnessProgram(UserFitnessProgram u) {
		useFitnessProgram.add(u);
	}
	
	
	public void update_project(String d,String c) {
		 boolean userFound = false;
	    for (program p : programList) {
	        if (p.get_titel().equals(d)) {
	        	
	        	if(c.equals("duration")) {
	        		  System.out.println("Enter new duration:");
			            String NA = scanner.nextLine();
			            p.set_duration(NA);
		            msg="duration updated";
		        	}
	            
	        	else if(c.equals("level")) {
	        		 System.out.println("Enter new difficulty level:");
			            String NA = scanner.nextLine();
			            p.set_level(NA);
		            msg="level updated";
		        	}
	            
	        	else if(c.equals("goals")) {
	        		 System.out.println("Enter new goals:");
			            String NA = scanner.nextLine();
			            p.set_goals(NA);
		            msg="goals updated";
		        	}
	            
	        	
	        	
	        	else if(c.equals("price")) {
	        		 System.out.println("Enter new price:");
			            String NA = scanner.nextLine();
			            p.set_price(NA);
		            msg="price updated";
		        	}
	        	else if(c.equals("link")) {
	        		   System.out.println("Enter new link:");
			            String NA = scanner.nextLine();
			            p.set_link(NA);
		            msg="link updated";
		        	}
	                        
	            userFound = true;
	           
	        }
	    }

	    if (!userFound) {
	        System.out.println("program titel not found.");
	        msg="program titel not found.";
	    }
	}
	
	
	public boolean program_exists (program P1) {
		boolean exsist=false;
		for(program p:programList) {
			if(p.get_titel().equals(P1.get_titel())) {
			exsist=true;
			}	
		}
		
	return exsist;
		
	}
	
	public boolean miss_info(program p) {
		boolean miss=false;
		if (p.get_titel().equals("")) {
			System.out.println("program titel is required. Please enter a program titel.");
			miss=true;
		}
		if (p.get_duration().equals("")) {
			System.out.println("duration is required. Please enter a duration.");
			miss=true;
		}
		if(p.get_level().equals("")) {
			System.out.println(" difficulty level is required. Please enter a difficulty level.");
			miss=true;
		}
	    if(p.get_goals().equals("")) {
	    	System.out.println(" goals is required. Please enter a goals.");
			miss=true;
	    }
	    if(p.get_link().equals("")) {
	    	System.out.println(" video tutorial or image or document is required. Please enter a video tutorial or image or document");
			miss=true;
	    }
	  
	    return miss;
	}
	

	
	public void creat_program(program p) {
		if(!(miss_info(p))){
		if(!program_exists(p)) {
		programList.add(p);
		msg="program added";
		System.out.println("program added");
		}
		
		else {
			msg="program already added";
			System.out.println("program already added");
		}
		
	 }
		else {
			msg="we canot creat program becouse miss information";
			System.out.println("we canot creat program becouse miss information");
		}
	}
	
	public void delete_program(String tit) {
	    msg = "program not found we cannot delete";
	    

	    Iterator<program> programListIterator = programList.iterator();
	    while (programListIterator .hasNext()) {
	        if (programListIterator .next().get_titel().equals(tit)) {
	        	programListIterator .remove();
	            msg = "program deleted";
	            System.out.println("program deleted");
	        }
	    }

	 
	}
	
	public void set_schedule(schedule s) {
		boolean exsist=false;
		for(program p:programList) {
			if(p.get_titel().equals(s.get_titel())) {
			exsist=true;
			}	
		}
		
		if(exsist) {
			scheduleList.add(s);
			msg="schedule added";
			System.out.println("schedule added");
		}
		
		else {
			msg="schedule not added";
		    System.out.println("schedule not added");
		}
		
	}
	
	
	public void scheduleChange() {
		
		String Noti="The schedule has changed, check your schedule.";
		Notification.add(Noti);
		msg="Notification sent for client to check your schedule";
		

	}
	
	public void Newschedule() {
		
		String Noti="New schedules are available, see what's new!";
		Notification.add(Noti);
		msg="Notification sent for client to see what's new! ";
		

	}
	
	
	public void special_offers() {
		
		String Noti="New special offers are available, don't miss them!";
		Notification.add(Noti);
		msg="Notification sent for client to show new special offers";
		

	}
	
	
	
	

}

