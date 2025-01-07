package gym.project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class suggestion_instructor {
	public static final Logger logger = Logger.getLogger(suggestion_instructor.class.getName());
     public String msg;
	public static List<String>suggesion=new ArrayList<String>();
	public static List<String>feed_back=new ArrayList<String>();
	public static List<String>helthwellnessarticles=new ArrayList<String>();
	
	
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
			 logger.info(e);
		 }	
		 msg="wellnsess shown";
	 }
	
	public void show_feedback() {
		for(String e:feed_back) {
			 logger.info(e);
		 }	
		 msg="feedback shown";
	 }
	
	public void show_helthwellnessarticles() {
		for(String e:helthwellnessarticles) {
			 logger.info(e);
		 }	
		 msg="helthwellnessarticles shown";
	 }
	
	
	public void approve_wellnessarticles_fromInstructor() {
		logger.info("Approved");
		 msg="the instructor suggestions were approved"; 
	 }
	
	public void reject_wellnessarticles_fromInstructor() {
		logger.info("rejected");
		 msg="the instructor suggestions were rejected";
	 
	 }
	
	public void approve_helthwellnessarticles() {
		logger.info("Approved");
		 msg="the helth wellness articleswere approved";
		 
	 }
	
	
}
