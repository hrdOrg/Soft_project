package gym2025_project;

import java.util.ArrayList;

public class suggestion_instructor {
     public String msg;
	public static ArrayList<String>suggesion=new ArrayList<String>();
	public static ArrayList<String>feed_back=new ArrayList<String>();
	public static ArrayList<String>helthwellnessarticles=new ArrayList<String>();
	
	
	public void add_suggesion(String sg) {
		suggesion.add(sg);
	}
	public void add_feedback_instruc(String s) {
		feed_back.add(s);
	}
	public void add_helthwellnessarticles(String g) {
		helthwellnessarticles.add(g);
	}
	
	public void show_wellnessarticles_fromInstructor() {
		 for(String e:suggesion) {
			 System.out.println(e);
		 }	
		 msg="wellnsess shown";
	 }
	
	public void show_feedback() {
		for(String e:feed_back) {
			 System.out.println(e);
		 }	
		 msg="feedback shown";
	 }
	
	public void show_helthwellnessarticles() {
		for(String e:helthwellnessarticles) {
			 System.out.println(e);
		 }	
		 msg="helthwellnessarticles shown";
	 }
	
	
	public void approve_wellnessarticles_fromInstructor() {
		System.out.println("Approved");
		 msg="the instructor suggestions were approved"; 
	 }
	
	public void reject_wellnessarticles_fromInstructor() {
		System.out.println("rejected");
		 msg="the instructor suggestions were rejected";
	 
	 }
	
	public void approve_helthwellnessarticles() {
		System.out.println("Approved");
		 msg="the helth wellness articleswere approved";
		 
	 }
	
	
}
