package gym2025_project;

import java.util.ArrayList;
import java.util.Iterator;

public class instructor {
	public String msg;
	public static ArrayList<program> programList=new ArrayList<program>();
	public static ArrayList<schedule> scheduleList=new ArrayList<schedule>();
	public static ArrayList<String> Notification=new ArrayList<String>();
	
	
	
	public boolean program_exists (program P1) {
		boolean exsist=false;
		for(program p:programList) {
			if(p.get_titel()==P1.get_titel()) {
			exsist=true;
			}	
		}
		
	return exsist;
		
	}
	
	public boolean miss_info(program p) {
		boolean miss=false;
		if (p.get_titel()==null) {
			System.out.println("program titel is required. Please enter a program titel.");
			miss=true;
		}
		if (p.get_duration()==null) {
			System.out.println("duration is required. Please enter a duration.");
			miss=true;
		}
		if(p.get_level()==null) {
			System.out.println(" difficulty level is required. Please enter a difficulty level.");
			miss=true;
		}
	    if(p.get_goals()==null) {
	    	System.out.println(" goals is required. Please enter a goals.");
			miss=true;
	    }
	    if(p.get_link()==null) {
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
		}
		
		else {
			msg="program already added";
		}
		
	 }
		else 
			msg="we canot creat program becouse miss information";
	}
	
	public void delete_program(String tit) {
	    msg = "program not found we cannot delete";

	    Iterator<program> programListIterator = programList.iterator();
	    while (programListIterator .hasNext()) {
	        if (programListIterator .next().get_titel().equals(tit)) {
	        	programListIterator .remove();
	            msg = "program deleted";
	        }
	    }

	 
	}
	
	public void set_schedule(schedule s) {
		boolean exsist=false;
		for(program p:programList) {
			if(p.get_titel()==s.get_titel()) {
			exsist=true;
			}	
		}
		
		if(exsist) {
			scheduleList.add(s);
			msg="schedule added";
		}
		
		else 
			msg="schedule not added";
		
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
