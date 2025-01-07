package gym.project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class client {
	public static final Logger logger = Logger.getLogger(client.class.getName());
	public String msg=null;
	private Integer age;
	private String name;
	private String gender;
	private double weight;
	private double BMI;
	private double height;
	private int attendance; 
	private String bodyMass;
	public static final String R="there is no program with this requirements";
	
	private List<String> fittnessGoals = new ArrayList<String>();
	private List<String> dietary = new ArrayList<String>();
	private List<String> restrictions = new ArrayList<String>();
	private List<program> clientP = new ArrayList<program>();
	private List<String> achievements = new ArrayList<String>();
	
	public client() {
		
	}
	
	public client(int a, String n, String g,double w, double h) {
		this.age=a;
		this.gender=g;
		this.name=n;
		this.setHight(h);;
		this.weight=w;
		
	}
	////////////////////////
	public void setAttendance(int a) {
		this.attendance=a;
		
	}
	
	public int getAttendance() {
		msg="this is your attendance";
		return this.attendance;
		
	}
	
	public void setGender(String g) {
		this.gender=g;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setName(String a) {
		this.name=a;
	}
	
	public String getName() {
		return this.name;
	}
	//////////////////////////////////////
	public void addAchievements(String A) {
		if(!this.achievements.contains(A)) {
			this.achievements.add(A);
			logger.info("the achievement is added");
		}
		else logger.info("you have this achievement already");
	}
	
	public List<String> getAchievements(){
		if (this.achievements.isEmpty()) {
			logger.info("there is no achievements");
			return null;
		}
		else {
			msg="this is your Achievements";
			return this.achievements;
			}
	}
	////////////////////////////////////////////
	public void delAchievements(String A) {
		if(this.achievements.contains(A)) {
			this.achievements.remove(A);
			logger.info("the achievement is deleted");
		}
		else logger.info("the achievement is not on your list in the first place");
		
	}
	
	public void setWeight(double w) {
		msg="set weight";
		this.weight=w;
	}
	
	public double getWeight() {
		msg="this is your weight";
		return this.weight;
	}
	
	public void setHight(double h) {
		if (h>100 && h<300) {
			h/=100;
			this.height=h;
			logger.info("the program has automatically converts the hight from centimeters to metes");
			msg="set hight";
		}
		if(h<3 && h>1) {
			this.height=h;
			msg="set hight";
		}
		else logger.info("the hight is invalid");
	} 

	public double getHeight() {
		return this.height;
	}
	
	public void calBMI(){
		this.BMI=this.weight/(this.height*this.height);//the height in meters
		msg="BMI is calculated";
	}
	
	public double getBMI() {
		return this.BMI;
	}
	//////////////////////////////////////////////
	
	public String BMImeaning() {
		calBMI();
		if (this.BMI<18.5)
			this.bodyMass="underweight";
		else if(this.BMI<25)
			this.bodyMass="healthy weight";
		else if(this.BMI<30)
			this.bodyMass="overweight";
		else if(this.BMI<35)
			this.bodyMass="obese";
			else bodyMass="extremely obese";
		return bodyMass;
	}
	/////////////////////////////////////////////
	public void setAge(int a) {
		this.age=a;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void addFittnessGoals(String fit) {
		if(!this.fittnessGoals.contains(fit)) {
			this.fittnessGoals.add(fit);
			logger.info("the goal is added");
			msg="the goal is add";
		}
		else logger.info("you have this goal already");
	}
	
	public void deleteFittnessGoals(String fit) {
		if(this.fittnessGoals.contains(fit)) {
			this.fittnessGoals.remove(fit);
			logger.info("the goal is deleted");
		}
		else logger.info("the goal is not on your list in the first place");
	}
	
	public List<String> getFittnessGoals(){
		if (this.fittnessGoals.isEmpty()) {
			logger.info("there is no Fittness Goals");
			msg="there is no fittness goal";
			return null;
		}
		else { 
			msg="this is fittness goal";
			return this.fittnessGoals;
			}
	}
	
	public void addDietary(String diet) {
		if(!this.dietary.contains(diet)) {
			this.dietary.add(diet);
			logger.info("this dietary reference is added");
			msg="the dietary is add";
		}
		else logger.info("you have this dietary reference already");
	}
	
	public void deleteDietary (String diet) {
		if(this.dietary.contains(diet)) {
			this.dietary.remove(diet);
			logger.info("this dietary reference is deleted");
		}
		else logger.info("the dietary reference is not on your list in the first place");
	}
	
	public List<String> getDietary(){
		if (this.dietary.isEmpty()) {
			logger.info("there is no dietary");
			msg="there is no dietary";
			return null;
		}
		else { 
			msg="get dietary";
			return this.dietary;
			}
	}
	
	public void addRestrictions(String res) {
		if(!this.restrictions.contains(res)) {
			this.restrictions.add(res);
			logger.info("the restriction is added");
			msg="the restriction is add";
		}
		else logger.info("you have this restriction already");
	}
	
	public void deleteRestrictions(String res) {
		if(this.restrictions.contains(res)) {
			this.restrictions.remove(res);
			logger.info("the restriction is deleted");
			msg="the restriction is deleted";
		}
		else logger.info("the restriction is not on your list in the first place");
	}
	
	public List<String> getRestrictions(){
		if (this.restrictions.isEmpty()) {
			logger.info("there is no Restrictions");
			return null;
		}
		else {
			msg="this is our restriction";
			return this.restrictions;
		}
	}
	
	public List<program> filterD(String n ,List<program> P) {
		List <program> filterdP=new ArrayList<program>();
		for(program h:P) {
			if (h.get_level().equals(n)) {
				filterdP.add(h);
				msg="the program is added(difficulty)" ;
				logger.info(msg);
			}
		}
		if (filterdP.isEmpty()) {
		
			msg="there is no program with this requirement";
			logger.info(R);}
		
		return filterdP;
	}
	
	public List<program> filterF(String n,List<program> P) {
		
		List <program> filterdP=new ArrayList<program>();
		for (program h :P) {
			if (h.get_goals().equals(n)) {
				filterdP.add(h);
				msg="the program is added(focus area) " ;
				logger.info(msg);
			}
		}
		if (filterdP.isEmpty()) {
			msg=R;
			logger.info(R);}
		return filterdP;
		
	}
	///////////////////////////////////////
	public List<program> filters(String F,String D,List<program> P) {
		List <program> filterdP=new ArrayList<program>();
		/*
		for (program h:P) {
			
			if (h.get_goals().equals(F)) {
				if(h.get_level().equals(D)) {
				filterdP.add(h);
				msg="the program is added(focus area&difficulty) " ;
				logger.info(msg);
				}
			}
		}
		*/
		filterdP = filterF(F,P);
		filterdP = filterD(D,filterdP);
		msg="your are in filters";
		if (filterdP.isEmpty()) {
			msg=R;
			logger.info(R);}
		return filterdP;
		
	}
	
	public void schedulesView() {
		
		logger.info("all the programs yoru enrolled in");
		 
			 for (program h:this.clientP) {
				 logger.info(h.get_titel()+": "+h.get_duration());
				 msg="schedulesView";
			 }
			
	}
	
	public List<program> getprograms(){
		msg="this is your programs";
		return clientP;
	}
	
	public void enroll(program p) {
		if(!this.clientP.contains(p)) {
			this.clientP.add(p);
			logger.info("the program is added");
			msg="the program is enrolled";
		}
		else logger.info("you have this program already");
			
	}
	
	public void delProgram(program P) {
		if(clientP.contains(P)) {
			clientP.remove(P);
			logger.info("the program is deleted");
			msg="the program is deleted";
		}
		else logger.info("you are not enrolled in this program in the first place");

	}
	
	
	
}
